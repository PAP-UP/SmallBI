package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    public static String banco = null;
    public static String driver = null;
    public static String usuario = null;
    public static String senha = null;
    private static Connection con = null;
    
    public static Connection getConexao(String driver, String banco, String usuario, String senha){
            try {
                Class.forName(driver);
                fecharConexao();
                con = DriverManager.getConnection(banco, usuario, senha);
            } catch (ClassNotFoundException ex) {
                System.out.println("Não encontrou o driver: " + ex.getMessage());
            } catch (SQLException ex) {
                System.out.println("Erro na conexão: " + ex.getMessage());
            }
        return con;
    }
    
    public static void fecharConexao(){
        con = null;
    }
    
    public static PreparedStatement getPreparedStatement(String sql){       
        try {
            return con.prepareStatement(sql);
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
        return null;
    }
    
    public static ResultSet getResultSet(String sql){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
