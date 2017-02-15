package business;

import model.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ImportarDb {
    
    public ArrayList<String> setarVariaveisConexao(String sgbdSelecionado, String usuario, String senha, 
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
    
    public Connection checkConexao(){
        return Conexao.checkConnection();
    }
    
    public void desconectar(){
        Conexao.fecharConexao();
    }
    
    public ArrayList<String> getDataType(String nomeTabela, String sgbdSelecionado){
        switch(sgbdSelecionado){
                case "PostgreSQL":
                    return carregarLista("SELECT data_type FROM information_schema.columns WHERE table_name = '" + nomeTabela + "'");
                case "MySQL":
                    return carregarLista("SELECT data_type FROM information_schema.columns WHERE TABLE_name = '" + nomeTabela + "'");
                case "SQL Server":
                    return carregarLista("SELECT DATA_TYPE FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '"+ nomeTabela + "';");
            }        
        return null;
    }   
    
    private ArrayList<String> getBancos(String sql){
        ResultSet rs = Conexao.getResultSet(sql);
        ArrayList<String> bancos = new ArrayList<>();        
        try {
            while(rs.next()){
                bancos.add(rs.getString(1));
            }
            return bancos;
        } catch (SQLException ex) {
            Logger.getLogger(ImportarDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<String> getTables(String sgbd, String bancoSelecionado, String usuario, 
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
    
    private ArrayList<String> carregarLista(String query){
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
                Logger.getLogger(ImportarDb.class.getName()).log(Level.SEVERE, null, ex);
            }
        return tabelas;
    }
    
    public JTable consultarTabelaDefault(String tabela){
        String script = "SELECT * FROM " + tabela;
        JTable jTable = new JTable();
        jTable.setModel(consultarTabela(script));
        return jTable;
    }
    
    public JTable consultarTabelaPersonalisada(String scriptPersonalisado){
        
        DefaultTableModel dtm = consultarTabela(scriptPersonalisado);
        if(dtm != null){
            JTable jTable = new JTable();
            jTable.setModel(dtm);
            return jTable;
        }
        return null;
    }
    
    private DefaultTableModel consultarTabela(String scriptParametro ){
        
        ResultSet rs = Conexao.getResultSet(scriptParametro);
        
        if(rs == null){
            return null;
        }else{
            try {            
                ResultSetMetaData rsmd = rs.getMetaData();
                int numColunas = rsmd.getColumnCount();
                DefaultTableModel modelo = new DefaultTableModel();
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
                Logger.getLogger(ImportarDb.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    public String transformarTipo(String tipoBanco, String sgbdSelecionado){
        System.out.println(tipoBanco);
        switch(sgbdSelecionado){
            case "PostgreSQL":
                switch(tipoBanco){
                    case "smallint":
                        return "Inteiro";
                    case "integer":
                        return "Inteiro";
                    case "bigint":
                        return "Inteiro";
                    case "decimal":
                        return "Real";
                    case "numeric":
                        return "Real";
                    case "real":
                        return "Real";
                    case "double precision":
                        return "Real";
                    case "money":
                        return "Real";
                    case "varchar":
                        return "Texto";
                    case "character":
                        return "Caractere";
                    case "char":
                        return "Caractere";
                    case "text":
                        return "Caractere";
                    case "character varying":
                        return "Texto";
                    case "date":
                        return "Data dd-MM-yyyy";
                    default:
                        return "Texto";
                }//switch postgres
            case "MySQL":
                switch(tipoBanco){
                    case "tinyint":
                        return "Inteiro";
                    case "smallint":
                        return "Inteiro";
                    case "mediumint":
                        return "Inteiro";
                    case "int":
                        return "Inteiro";
                    case "bigint":
                        return "Inteiro";
                    case "decimal":
                        return "Real";
                    case "float":
                        return "Real";
                    case "double":
                        return "Real";
                    case "bit":
                        return "V/F";
                    case "char":
                        return "Caractere";
                    case "varchar":
                        return "Texto";
                    default:
                        return "Texto";                    
                }//swtich mysql
            case "SQL Server":
                switch(tipoBanco){
                    
                }//switch sqlserver
                break;
        }//switch SGBD
        return null;
    }
}