package br.com.smallbi.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


public class SaikuConnection {

	@SuppressWarnings("deprecation")
	public static int addUsuarioSaiku(String login, String senha, String cliente, Integer idCliente){
		
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("username", login);
			jsonObject.put("email", login);
			jsonObject.put("password", senha);
			List<String> roles = new ArrayList<>();
			//roles.add(login);
			roles.add("cliente_" + cliente + "_id_" + idCliente);
			jsonObject.put("roles", roles);
		} catch (JSONException e1) {
			e1.printStackTrace();
		}		
		
		System.out.println(jsonObject);
		//http://backend.smallbi.com.br:28080/
		//http://localhost:8080/
		String url = "http://backend.smallbi.com.br:28080/saiku/rest/saiku/admin/users/";
//		String url = "http://localhost:8080/saiku/rest/saiku/admin/users/";
		return sendToSaiku(url, jsonObject.toString());
	}
	
	public static int addDatasourceSaiku(Integer idCliente, 
			String nomeSchema) throws JSONException{
		
		String connection = new String();
		String endereco = "localhost/";
		//Montar conexão:
		connection = "type=OLAP\n" + "name=" + nomeSchema + "\n" + "driver=mondrian.olap4j.MondrianOlap4jDriver\n" + "location=jdbc:mondrian:Jdbc=jdbc:postgresql://" + endereco + "id_" + idCliente + ";"	+ "Catalog=/datasources/" + "id_" + idCliente + "/" + nomeSchema + ".xml;" + "JdbcDrivers=org.postgresql.Driver;\n"	+ "username=postgres\n"	+ "password=postgres\n"	+ "security.enabled=false\n";
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("connectionname", nomeSchema);
		jsonObject.put("advanced", connection);
		
		//String url = "http://localhost:8080/saiku/rest/saiku/admin/datasources/";
		String url = "http://backend.smallbi.com.br:28080/saiku/rest/saiku/adimin/datasources/";
		return sendToSaiku(url, jsonObject.toString());
	}
	
	@SuppressWarnings("deprecation")
	private static int sendToSaiku(String url, String json){
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost httpPost = new HttpPost(url);

		try {
			StringEntity stringEntity = new StringEntity(json);
			httpPost.setEntity(stringEntity);
			httpPost.setHeader("Content-Type", "application/json");
			httpPost.setHeader(BasicScheme.authenticate(new UsernamePasswordCredentials("admin","admin"),
					"UTF-8", false));		
			
			HttpResponse response = httpClient.execute(httpPost);
			System.out.println("Response: " + response.toString());
			return response.getStatusLine().getStatusCode();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
