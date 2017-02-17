package br.com.smallbi.rest;

import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import br.com.smallbi.business.UsuarioBusiness;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/autenticar")
public class AutenticacaoWebService {

	/*@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String autenticarUsuario(String json) throws JSONException{
		JSONObject jsonObject = new JSONObject(json);
		String login = jsonObject.getString("login");
		String senha = jsonObject.getString("senha");
		
		return new UsuarioBusiness().validarLogin(login, senha);
	}*/
}
