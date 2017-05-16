package br.com.smallbi.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class ClassMapper {

	/**
	 * Metodo que valida os atributos do json para todas as classes
	 * @param json
	 * @param className
	 * @return
	 */
	public static String validadeJson(String json, String className){
		
		JSONObject jsonObject;
		try {
			jsonObject = new JSONObject(json);
		} catch (JSONException e) {
			e.printStackTrace();
			return ("Não foi possível mapear o json"
					+ "verifique a integridade do objeto!");
		}
		
		switch (className) {
			case "br.com.smallbi.entity.Cliente":
				if(jsonObject.isNull("razaoSocial"))
					return ("O campo Razão Social é obrigatório!");
				
				if(jsonObject.isNull("nomeFantasia"))
					return ("O campo Nome Fantasia é obrigatório!!");
					
				if(jsonObject.isNull("cnpj"))
					return ("O campo CNPJ é obrigatório!");
				
				if(jsonObject.isNull("ie"))
					return ("O campo Inscrição Estadual é obrigatório!");
				
				if(jsonObject.isNull("idRamoAtividade"))
					return ("O campo Ramo de Atividade é obrigatório!");
				
				if(jsonObject.isNull("idFormaPagamento"))
					return ("O campo Forma de Pagamento é obrigatório!");
				
				if(jsonObject.isNull("idPlano"))
					return ("O campo Plano é obrigatório!");
				
				return ("OK");
				
			case "br.com.smallbi.entity.Usuario":
				if(jsonObject.isNull("nome"))
					return "O campo Nome é obrigatório";
				
				if(jsonObject.isNull("cpf"))
					return "O campo CPF é obrigatório!";
				
				if(jsonObject.isNull("rg"))
					return "O campo RG é obrigatório";
				
				if(jsonObject.isNull("idCliente"))
					return "O campo idCliente é obrigatório";//Notificacao para ambiente de dev
				
				if(jsonObject.isNull("idFuncao"))
					return "O campo Função é obrigatório!";
				
				if(jsonObject.isNull("login"))
					return "O campo Login é obrigatório!";
				else{
					String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
							+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
					Pattern pattern = Pattern.compile(regex);
					try {
						Matcher matcher = pattern.matcher(jsonObject.getString("login"));
						boolean match = matcher.matches();
						if(!match)
							return "Email inválido!";
					} catch (JSONException e) {
						e.printStackTrace();
					}
				}
				
				if(jsonObject.isNull("senha"))
					return "O campo Senha é obrigatório!";
				
				if(jsonObject.isNull("idPerfil"))
					return "O campo Perfil é obrigatório!";
				
				return ("OK");
			default:
				break;
		}		
		return "";
	}
	
}
