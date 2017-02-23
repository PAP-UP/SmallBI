package br.com.smallbi.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import br.com.smallbi.business.UsuarioBusiness;
import br.com.smallbi.entity.Usuario;

public class Util {

	public static Date getDate(){
		Calendar calendar = new GregorianCalendar();
		return calendar.getTime();
	}
	
	public static String formatDate(Date date){
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return format.format(date);
	}
	
    public static String makePasswordHash(String password, String salt) {
        try {
            String saltedAndHashed = password + "," + salt;
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(saltedAndHashed.getBytes());
            BASE64Encoder encoder = new BASE64Encoder();
            byte hashedBytes[] = (new String(digest.digest(), "UTF-8")).getBytes();
            return encoder.encode(hashedBytes) + "," + salt;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 is not available", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 unavailable?  Not a chance", e);
        }
    }
    
    public static Usuario validateLogin(String username, String password){
    	Usuario usuario = new UsuarioBusiness().getByUsername(username);
    	
    	if(usuario == null){
    		System.out.println("Usuário não existe no banco de dados.");
    		return null;
    	}else{        	
        	if(!usuario.getSenha().equals(password)){
        		return null;
        	}
    	}
    	
    	
    	
    	/*String hashedAndSalted = usuario.getSenha();    	
    	String salt = hashedAndSalted.split(",")[1];
    	
    	if(!hashedAndSalted.equals(makePasswordHash(password, salt))){
    		System.out.println("A senha informada não corresponde ao usuário.");
    		return null;
    	} */   	
    	return usuario;
    }
    
    public static boolean saveSchemaInSaiku(Integer idCliente, String schemaName, String schema){
    	
    	File clienteDir = new File("/datasources/id_" + idCliente);
    	if(!clienteDir.exists()){    		
    		try{
    			clienteDir.mkdir();
    		}catch(SecurityException se){
    			se.printStackTrace();
    			return false;
    		}
    	}
    	
		File fileMdx = new File(clienteDir.getAbsolutePath() + "/" + schemaName + ".xml");
		try{
			FileWriter fw = new FileWriter(fileMdx);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(schema);
			bw.flush();
			bw.close();
			return true;
		}catch(IOException ex){
			ex.printStackTrace();
			return false;
		}
    }
}
