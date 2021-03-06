package br.com.smallbi.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 * Classe que faz toda integração com a API do Saiku
 * @author deynesonborba
 *
 */
public class SaikuConnection {

	/**
	 * Adiciona usuario ao Saiku atraves da API
	 * @param login
	 * @param senha
	 * @param idCliente
	 * @return {@link Integer} codigo de resposta do servidor
	 */
	public static int addUsuarioSaiku(String login, String senha, Integer idCliente){
		
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("username", login);
			jsonObject.put("email", login);
			jsonObject.put("password", senha);
			
			//Removido permissoes de cubo
			//List<String> roles = new ArrayList<>();
			//roles.add(login);
			//roles.add("role_id_" + idCliente);
			//jsonObject.put("roles", roles);
		} catch (JSONException e1) {
			e1.printStackTrace();
		}		
		
		System.out.println(jsonObject);
		String url = "http://backend.smallbi.com.br:28080/saiku/rest/saiku/admin/users/";
		//String url = "http://localhost:8080/saiku/rest/saiku/admin/users/";
		return sendToSaikuApi(url, jsonObject.toString());
	}
	
	/**
	 * Envia a string de conexao para API do Saiku
	 * @param idCliente
	 * @param nomeSchema
	 * @return {@link Integer} codigo de resposta do servidor
	 * @throws JSONException
	 */
	public static int addDatasourceSaiku(Integer idCliente, 
			String nomeSchema) throws JSONException{
		
		String connection = new String();
		String endereco = "localhost/";
		//Montar conexão:
		connection = "type=OLAP\n" 
				+ "name=" + nomeSchema + "\n" 
				+ "driver=mondrian.olap4j.MondrianOlap4jDriver\n" 
				+ "location=jdbc:mondrian:Jdbc=jdbc:postgresql://" + endereco + "id_" + idCliente + ";"	
				+ "Catalog=/datasources/" + "id_" + idCliente + "/" + nomeSchema + ".xml;" 
				+ "JdbcDrivers=org.postgresql.Driver;\n"	
				+ "username=postgres\n"	
				+ "password=postgres\n"
				+ "security.enabled=true\n"
				+ "security.type=lookup\n";
				//+ "security.mapping="
				//+ "ROLE_USER=No Access;"
				//+ "role_id_" + idCliente + "=access_id_" + idCliente;
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("connectionname", nomeSchema);
		jsonObject.put("advanced", connection);
		
		//String url = "http://localhost:8080/saiku/rest/saiku/admin/datasources/";
		String url = "http://backend.smallbi.com.br:28080/saiku/rest/saiku/admin/datasources/";
		 
		return sendToSaikuApi(url, jsonObject.toString());
	}
	
	@SuppressWarnings("deprecation")
	private static int sendToSaikuApi(String url, String json){
	
		//---------------------------------------------------
		//Por algum motivo, este método que antes funcionava agora só retorna erro 400 bad request
		//---------------------------------------------------
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost httpPost = new HttpPost(url);

		try {
			StringEntity stringEntity = new StringEntity(json);
			httpPost.setEntity(stringEntity);
			httpPost.setHeader("Content-Type", "application/json");
			
			httpPost.setHeader(BasicScheme.authenticate(new UsernamePasswordCredentials("admin","admin"),
					"UTF-8",false));		
			
			System.out.println(httpPost);
			HttpResponse response = httpClient.execute(httpPost);
			System.out.println("Response: " + response.toString());
			return response.getStatusLine().getStatusCode();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * Salva o XML no servidor no diretorio /datasources/id_+idCLiente
	 * @param idCliente
	 * @param schemaName
	 * @param schema
	 * @return {@link Boolean}
	 */
    public static boolean saveSchemaInSaikuServer(Integer idCliente, String schemaName, String schema){
    	
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
