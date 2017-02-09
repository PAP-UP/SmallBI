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
	public static int addUsuarioSaiku(String login, String senha){
		
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("username", login);
			jsonObject.put("email", login);
			jsonObject.put("password", senha);
			List<String> roles = new ArrayList<>();
			roles.add(login);
			jsonObject.put("roles", roles);
		} catch (JSONException e1) {
			e1.printStackTrace();
		}		
		
		System.out.println(jsonObject);
		
		String url = "http://localhost:8080/saiku/rest/saiku/admin/users/";
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost httpPost = new HttpPost(url);

		try {
			StringEntity stringEntity = new StringEntity(jsonObject.toString());
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
