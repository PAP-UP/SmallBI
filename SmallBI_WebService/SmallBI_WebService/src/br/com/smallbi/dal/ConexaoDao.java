package br.com.smallbi.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoDao {

	private static Connection getConexao(){
		String usuario = "postgres"; 
		String senha = "postgres";
		String driver = "org.postgresql.Driver";
		String endereco = "localhost/";
		//String porta = "5432";
		String banco = "jdbc:postgresql://" + endereco;
		
		try {
			Class.forName(driver);
			return DriverManager.getConnection(banco, usuario, senha);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void criarDatabase(String cliente, Integer id){
		try{
			String sql = "CREATE DATABASE cliente_" + cliente + "_id_" + id;
			Connection connection = getConexao();
			Statement statement = connection.createStatement();
			statement.executeQuery(sql);
			System.out.println("Banco criado com sucesso!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
