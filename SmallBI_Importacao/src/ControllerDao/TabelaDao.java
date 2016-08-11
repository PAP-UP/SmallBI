package ControllerDao;

import Model.Conexao;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TabelaDao {

    public String incluir(JTable tbl, String nomeTabela, String chavePrimaria,
            List<JComboBox> listaCbxTiposParametro) {

//        boolean sqlDeCraicaoDaTabelaExecutado = criarTabela(tbl, nomeTabela, chavePrimaria, 
//                listaCbxTiposParametro);        
//        if (sqlDeCraicaoDaTabelaExecutado) {
//            boolean sqlDePreenchimentoExecutado = preencherTabela(tbl, nomeTabela, listaCbxTiposParametro);
//            if (sqlDePreenchimentoExecutado) {
//                return "Tabela salva com sucesso!";
//            } else {
//                return "Erro ao preencher tabela";
//            }
//        } else {
//            return "Erro ao criar tabela";
//        }
        
        String sqlCreate = criarTabela(tbl, nomeTabela, chavePrimaria,listaCbxTiposParametro);
        String sqlInsert = preencherTabela(tbl, nomeTabela, listaCbxTiposParametro);
        return salvarQuerySQL(sqlCreate, sqlInsert, nomeTabela);
        //return "Tabela salva com sucesso!";
        //return "Criar método de criação do txt";
    }
    
    private String salvarQuerySQL(String sqlCreate, String sqlInsert, String nomeTabela){
        
        JFileChooser jfc = new JFileChooser();        
        jfc.showSaveDialog(null);     
        File file = jfc.getSelectedFile();
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(sqlCreate + "\n" + sqlInsert);
            bw.flush();
            bw.close();
            return "Script salvo com sucesso!";
        } catch (IOException ex) {
            //Logger.getLogger(TabelaDao.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao salvar script!";
        }
    }

    private String criarTabela(JTable tbl, String nomeTabela, String chavePrimaria,
            List<JComboBox> listaCbxTiposParametro) {
        
        String sql = "CREATE TABLE " + retirarEspacos(nomeTabela) + " (";
        JComboBox cbx;

        for (int coluna = 0; coluna < tbl.getColumnCount(); coluna++) {
            
            sql += retirarEspacos(tbl.getColumnName(coluna));

            cbx = listaCbxTiposParametro.get(coluna);

            String tipoSQL = transformarOpcaoEmTipoDeVariavelSQL(cbx.getSelectedItem().toString());

            if (coluna != (tbl.getColumnCount() - 1)) {

                if (tbl.getColumnName(coluna).equals(chavePrimaria)) {
                    sql += " " + tipoSQL + " PRIMARY KEY NOT NULL,";
                } else {
                    sql += " " + tipoSQL + ",";
                }

            } else {
                sql += " " + tipoSQL + ");";
            }

        }
        System.out.println("Print: " + sql);
        return sql;
        //boolean sqlCreateExecutado = executarQuerySql(sql);
        //return sqlCreateExecutado;
    }
    
    private String retirarEspacos(String str){
            return str.replaceAll(" ","_");
    }

    private String preencherTabela(JTable tbl, String nomeTabela, List<JComboBox> listaCbxTiposParametro) {

        
        String sql = "INSERT INTO " + retirarEspacos(nomeTabela) + " (";
        JComboBox cbx;

        for (int coluna = 0; coluna < tbl.getColumnCount(); coluna++) {
            
            if (coluna != tbl.getColumnCount() - 1) {
                sql += retirarEspacos(tbl.getColumnName(coluna)) + ",";
            } else {
                sql += retirarEspacos(tbl.getColumnName(coluna));
            }
        }

        sql += ") VALUES ";

        for (int linha = 0; linha < tbl.getRowCount(); linha++) {
            
            sql += "(";
            
            for (int coluna = 0; coluna < tbl.getColumnCount(); coluna++) {

                cbx = listaCbxTiposParametro.get(coluna);
                String tipoSQL = transformarOpcaoEmTipoDeVariavelSQL(cbx.getSelectedItem().toString());

                switch (tipoSQL) {
                    case "BIT":
                        sql += "'" + tbl.getValueAt(linha, coluna).toString() + "'";
                        break;
                    case "INTEGER":
                        sql += tbl.getValueAt(linha, coluna).toString();
                        break;
                    case "DECIMAL":
                        sql += tbl.getValueAt(linha, coluna).toString();
                        break;
                    case "CHAR(1)":
                        sql += "'" + tbl.getValueAt(linha, coluna).toString() + "'";
                        break;
                    case "DATE":
                        sql += "'" + tbl.getValueAt(linha, coluna).toString() + "'";
                        break;
                    default:
                        sql += "'" + tbl.getValueAt(linha, coluna).toString() + "'";
                        break;
                }

                if (coluna != tbl.getColumnCount() - 1) {
                    sql += ",";
                }
            }
            if(linha != tbl.getRowCount() - 1){
                sql += "),";
            }
        }
        sql += ");";
        System.out.println(sql);
        //boolean sqlInsertExecutado = executarQuerySql(sql);
        //return sqlInsertExecutado;
        return sql;
    }

    private boolean executarQuerySql(String sql) {
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            pst.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    private String transformarOpcaoEmTipoDeVariavelSQL(String itemSelecionado) {
        switch (itemSelecionado) {
            case "Texto":
                return "VARCHAR(" + Util.TratarArquivos.tamanhoCampoVarchar + ')';
            case "V/F":
                return "BIT";
            case "Inteiro":
                return "INTEGER";
            case "Real":
                return "DECIMAL";
            case "Caractere":
                return "CHAR(1)";
            case "Data dd-MM-yyyy":
                return "DATE";
            case "Data MM-dd-yyyy":
                return "DATE";
        }
        return "";
    }
}
