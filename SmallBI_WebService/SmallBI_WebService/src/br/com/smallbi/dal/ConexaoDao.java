package br.com.smallbi.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoDao {

	private static Connection getConexao(String banco){
		String usuario = "postgres"; 
		String senha = "postgres";
		String driver = "org.postgresql.Driver";
		String endereco = "localhost/";
		
		String url = "jdbc:postgresql://" + endereco;
		if(banco != null && !banco.equals("")){
			url += formatarString(banco);  
		}
				
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, usuario, senha);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static boolean criarDatabase(String cliente, Integer id){
		try{
			String nomeBanco = "cliente_" + cliente + "_id_" + id;
			String sql = "CREATE DATABASE " + formatarString(nomeBanco);
			Connection connection = getConexao(null);
			Statement statement = connection.createStatement();
			statement.executeUpdate(sql);
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static boolean salvarScript(String cliente, Integer id, String script){
		
		String banco = "cliente_" + cliente + "_id_" + id;
		try{
			Connection connection = getConexao(banco);
			Statement statement = connection.createStatement();
			statement.executeUpdate(script);
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
    private static String formatarString(String str) {
        String strFormatada = str.toLowerCase();
        strFormatada = strFormatada.replaceAll(" ", "_");
        return strFormatada;
    }
}
