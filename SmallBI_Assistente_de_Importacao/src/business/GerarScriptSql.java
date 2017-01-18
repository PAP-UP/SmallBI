package business;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class GerarScriptSql {
    
    private static List<String> scripts = new ArrayList<>();
    public static String scriptSqlTabelaPivot;
        
    public String salvarTabelaPivot(JTable tbl, String nomeTabela, String chavePrimaria,
            List<JComboBox> listaCbxTiposParametro){
        
        scriptSqlTabelaPivot = criarTabela(tbl, nomeTabela, chavePrimaria, listaCbxTiposParametro) + "\n" +
                preencherTabela(tbl, nomeTabela, listaCbxTiposParametro);
        
//        salvarQuerySQL(nomeTabela);
        scripts.add(scriptSqlTabelaPivot);
                
        return "Script salvo com sucesso!";
    }

    private String criarTabela(JTable tbl, String nomeTabela, String chavePrimaria,
            List<JComboBox> listaCbxTiposParametro) {
        
        try{
            String sql = "CREATE TABLE " + formatarString(nomeTabela) + " (";
            JComboBox cbx;

            for (int coluna = 0; coluna < tbl.getColumnCount(); coluna++) {
                sql += formatarString(tbl.getColumnName(coluna));
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
            return sql;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    private String formatarString(String str) {
        String strFormatada = str.toLowerCase();
        strFormatada = strFormatada.replaceAll(" ", "_");
        return strFormatada;
    }

    private String preencherTabela(JTable tbl, String nomeTabela, 
            List<JComboBox> listaCbxTiposParametro) {
        
        try{
            String sql = "INSERT INTO " + formatarString(nomeTabela) + " (";
            JComboBox cbx;

            for (int coluna = 0; coluna < tbl.getColumnCount(); coluna++) {
                if (coluna != tbl.getColumnCount() - 1) {
                    sql += formatarString(tbl.getColumnName(coluna)) + ",";
                } else {
                    sql += formatarString(tbl.getColumnName(coluna));
                }
            }
            sql += ") VALUES ";

            for (int linha = 0; linha < tbl.getRowCount(); linha++) {
                
                sql += "(";
                for (int coluna = 0; coluna < tbl.getColumnCount(); coluna++) {

                    cbx = listaCbxTiposParametro.get(coluna);
                    String tipoSQL = transformarOpcaoEmTipoDeVariavelSQL(cbx.getSelectedItem().toString());
                    
                    System.out.println("Linha: " + linha + " , Valor: " + tbl.getValueAt(linha, coluna));
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
                if (linha != tbl.getRowCount() - 1) {
                    sql += "),";
                }
            }
            sql += ");";
            //System.out.println(sql);
            //boolean sqlInsertExecutado = executarQuerySql(sql);
            //return sqlInsertExecutado;
            return sql;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    private String transformarOpcaoEmTipoDeVariavelSQL(String itemSelecionado) {
        switch (itemSelecionado) {
            case "Texto":
                return "VARCHAR(" + ValidarTipos.tamanhoCampoVarchar + ')';
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
    
    public void salvarQuerySQL(String nomeTabela){
        
//        JFileChooser jfc = new JFileChooser();        
//        jfc.showSaveDialog(null);     
//        File file = jfc.getSelectedFile();
        File file = new File("~/files-to-test-saiku/cubes-scripts-generated/" + formatarString(nomeTabela) + ".sql");
        
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(String sql : scripts){
                bw.write(sql);
                bw.write("\n");
            }
            
            bw.flush();
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
