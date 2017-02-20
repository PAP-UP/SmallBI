package br.com.smallbi.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

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
	
	public static boolean criarDatabaseCliente(String cliente, Integer id){
		String nomeBanco = "id_" + id;
		try{
			String sql = "CREATE DATABASE " + formatarString(nomeBanco);
			Connection connection = getConexao(null);
			Statement statement = connection.createStatement();
			statement.executeUpdate(sql);
		}catch (Exception e) {
			e.printStackTrace();
			try {
				Connection connection = getConexao(null);
				Statement statement;
				statement = connection.createStatement();
				statement.executeUpdate("DROP DATABASE " + nomeBanco);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return false;
		}
		return true;
	}
	
	public static boolean salvarScriptCubo(Integer idCliente, String script){
		
		String banco = "id_" + idCliente;
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
	
	public static Integer getTamanhoBancoCliente(Integer idCliente){
		String banco = "id_" + idCliente;
		Connection connection = getConexao(banco);
		Statement statement;
		try {
			statement = connection.createStatement();
			String query = "SELECT pg_size_pretty(pg_database_size('" + banco + "'));";
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()){
				String strTamBd = (String) resultSet.getObject("pg_size_pretty");
				strTamBd = strTamBd.replace("MB", "");
				strTamBd = strTamBd.replace("kB", "");
				strTamBd = strTamBd.replace("bytes", "");
				strTamBd = strTamBd.replace(" ", "");
				return Integer.parseInt(strTamBd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		return 0;
	}
	
	public static Integer getTamanhoCubo(Integer idCliente, List<String> tabelasCubo){
		String banco = "id_" + idCliente;
		Connection connection = getConexao(banco);
		
		Integer tamCubo = 0;
		try{
			Statement statement = connection.createStatement();
			for(String tab : tabelasCubo){
				//SELECT pg_size_pretty(pg_relation_size('table_name')); 
				String query = "SELECT pg_size_pretty(pg_relation_size('" + tab + "'));";
				ResultSet resultSet = statement.executeQuery(query);
				while(resultSet.next()){
//					tamCubo += (Integer) resultSet.getObject("pg_size_pretty");		
					String sTamCubo = (String) resultSet.getObject("pg_size_pretty");
					sTamCubo = sTamCubo.replace("MB", "");
					sTamCubo = sTamCubo.replace("kB", "");
					sTamCubo = sTamCubo.replace("bytes", "");
					sTamCubo = sTamCubo.replace(" ", "");
					tamCubo += Integer.parseInt(sTamCubo);
				}
			}
			return tamCubo;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
    private static String formatarString(String str) {
        String strFormatada = str.toLowerCase();
        strFormatada = strFormatada.replaceAll(" ", "_");
        strFormatada = strFormatada.replaceAll("-", "_");
        return strFormatada;
    }
}
