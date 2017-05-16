package br.com.smallbi.util;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class ClassMapper {

	/**
	 * Metodo que faz o mapeamento de todas as classes a partir de um json
	 * @param json
	 * @param className
	 * @return
	 */
	public static String map(String json, String className){
		
		switch (className) {
			case "Cliente":
				try {
					JSONObject jsonObject = new JSONObject(json);
					
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
				} catch (JSONException e) {
						return ("Não foi possível mapear o json"
								+ "verifique a integridade do objeto!");
				}
			return ("OK");
				
			case "Usuario":
				break;
			default:
				break;
		}
		
		return "";
	}
	
}
