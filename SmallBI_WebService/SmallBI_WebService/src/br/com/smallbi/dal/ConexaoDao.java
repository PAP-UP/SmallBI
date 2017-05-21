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
			//statement.executeUpdate(script);
			statement.executeUpdate(script);
			System.out.println("Script executado: " + script);
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	/**
	 * Obtem o tamanho do banco de dados do cliente
	 * @param idCliente
	 * @return
	 */
	public static float getTamanhoBancoCliente(Integer idCliente){
		String banco = "id_" + idCliente;
		Connection connection = getConexao(banco);
		Statement statement;
		try {
			statement = connection.createStatement();
			String query = "SELECT pg_database_size('" + banco + "');";			
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()){
				float fTamBd = resultSet.getFloat("pg_database_size");
				return fTamBd / 1000 / 1000;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		return 0;
	}
	
	/**
	 * Obtem o tamanho do cubo conforme as tabelas que ele usa
	 * @param idCliente
	 * @param tabelasCubo
	 * @return
	 */
	public static float getTamanhoCubo(Integer idCliente, List<String> tabelasCubo){
		String banco = "id_" + idCliente;
		Connection connection = getConexao(banco);
		
		float tamCubo = 0;
		try{
			Statement statement = connection.createStatement();
			for(String tab : tabelasCubo){
				
				//String query = "SELECT pg_size_pretty(pg_relation_size('" + tab + "'));";
				String query = "SELECT pg_relation_size('" + tab + "');";
				ResultSet resultSet = statement.executeQuery(query);
				while(resultSet.next()){					
					float fTamCubo = resultSet.getFloat("pg_relation_size");
					tamCubo += fTamCubo;
				}
			}
			return tamCubo / 1000 / 1000;
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
