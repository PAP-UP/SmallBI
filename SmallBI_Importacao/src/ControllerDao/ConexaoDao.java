package ControllerDao;

import Model.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConexaoDao {
    
    public static ArrayList<String> setarVariaveisConexao(String sgbdSelecionado, String usuario, String senha, 
            String endereco, String porta){        
        if(sgbdSelecionado != "Selecione"){
            String banco = new String();
            String driver = new String();
            Connection con = null;
            switch(sgbdSelecionado){
                case "PostgreSQL":
                    banco = "jdbc:postgresql://" + endereco + ":" + porta + "/";
                    driver = "org.postgresql.Driver";                    
                    con = Conexao.getConexao(driver, banco, usuario, senha);
                    if(con != null){
                        return getBancos("select datname from pg_database");
                    }else{
                        return null;
                    }
                case "MySQL":
                    driver = "com.mysql.jdbc.Driver";
                    banco = "jdbc:mysql://" + endereco + ":" + porta + "/";
                    con = Conexao.getConexao(driver, banco, usuario, senha);
                    if(con != null){
                        return getBancos("SHOW DATABASES");
                    }else{
                        return null;
                    }
                case "SQL Server":
                    banco = "jdbc:sqlserver://" + endereco + ":" + porta;
                    driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                    con = Conexao.getConexao(driver, banco, usuario, senha);
                    if(con != null){
                        return getBancos("SELECT name FROM sys.databases");
                    }else{
                        return null;
                    }
            }
        }
        return null;
    }
    
    public static void desconectar(){
        Conexao.fecharConexao();
    }
    
    public static ArrayList<String> getDataType(String nomeTabela, String sgbdSelecionado){
        switch(sgbdSelecionado){
                case "PostgreSQL":
                    return carregarLista("SELECT data_type FROM information_schema.columns WHERE table_name = '" + nomeTabela + "'");
                case "MySQL":
                    return carregarLista("SELECT data_type FROM information_schema.columns WHERE TABLE_name = '" + nomeTabela + "'");
                case "SQL Server":
                    return carregarLista("SELECT DATA_TYPE FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = 'Cidade';");
            }        
        return null;
    }   
    
    private static ArrayList<String> getBancos(String sql){
        ResultSet rs = Conexao.getResultSet(sql);
        ArrayList<String> bancos = new ArrayList<>();        
        try {
            while(rs.next()){
                bancos.add(rs.getString(1));
            }
            return bancos;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static ArrayList<String> getTables(String sgbd, String bancoSelecionado, String usuario, 
            String senha, String porta, String endereco){
        
        String banco = new String();
        String driver = new String();
        switch(sgbd){
            case "Selecione":
                break;
            case "PostgreSQL":
                banco = "jdbc:postgresql://" + endereco + ":" + porta + "/" + bancoSelecionado;
                driver = "org.postgresql.Driver";                    
                Conexao.getConexao(driver, banco, usuario, senha);
                return carregarLista("SELECT table_name FROM information_schema.tables WHERE table_schema = 'public';");
            case "MySQL":
                driver = "com.mysql.jdbc.Driver";
                banco = "jdbc:mysql://" + endereco + ":" + porta + "/" + bancoSelecionado;
                Conexao.getConexao(driver, banco, usuario, senha);
                return carregarLista("SHOW TABLES");
            case "SQL Server":
                banco = "jdbc:sqlserver://" + endereco + ":" + porta + ";databaseName=" + bancoSelecionado + ";";
                driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                Conexao.getConexao(driver, banco, usuario, senha);    
                //Conexao.getResultSet("USE" + bancoSelecionado);
                return carregarLista("SELECT name FROM sysobjects WHERE xtype='U'");
        }
        return null;
    }
    
    private static ArrayList<String> carregarLista(String query){
        ResultSet rs = null;
        try{
            rs = Conexao.getResultSet(query);
        }catch(Exception e){
            return null;
        }
        ArrayList<String> tabelas = new ArrayList<>();
        try {
                while(rs.next()){
                    tabelas.add(rs.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        return tabelas;
    }
    
    public static DefaultTableModel consultarTabela(String tabela, JTable tblParametro){
        
        ResultSet rs = Conexao.getResultSet("SELECT * FROM " + tabela);
        try {            
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColunas = rsmd.getColumnCount();
            DefaultTableModel modelo = (DefaultTableModel) tblParametro.getModel();
            modelo.setColumnCount(0);
            modelo.setRowCount(0);
            String linha;
            Object obj[] = null;
            
            for(int i = 1; i < numColunas + 1; i++){
                modelo.addColumn(rsmd.getColumnName(i));
            }
            
            while(rs.next()){
                linha = "";
                for(int i = 1; i < numColunas + 1; i++){
                    if(i == numColunas + 1){
                        linha += rs.getString(i);
                    }else{
                        linha += rs.getString(i) + ",";
                    }
                }
                obj = linha.split(",");
                modelo.addRow(obj);
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
