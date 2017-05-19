package business;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import org.apache.poi.ss.usermodel.DataFormat;

public class GerarScriptSql {
    
    public static List<String> scripts = new ArrayList<>();
    public static String scriptSqlTabelaPivot;
        
    public String salvarTabelaPivot(JTable tbl, String nomeTabela, String chavePrimaria,
            List<JComboBox> listaCbxTiposParametro){
        
        scriptSqlTabelaPivot = criarTabela(tbl, nomeTabela, chavePrimaria, listaCbxTiposParametro) + "\n" +
                preencherTabela(tbl, nomeTabela, listaCbxTiposParametro);
        
//        salvarQuerySQL(nomeTabela);
        scripts.add(scriptSqlTabelaPivot);
                
        return "Tabela salva com sucesso!";
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
            
            /**
             * Obtem as colunas da tabela
             */
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

            /**
             * Insere os registros
             */
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
                            //Obtem data da tabela
                            String dataFromTab = tbl.getValueAt(linha, coluna).toString();
                            
                            //Transforma em tipo Date e valida todos os formatos
                            Date dt = convertStringToDate(dataFromTab);

                            //Formata para MM-dd-yyyy
                            SimpleDateFormat sdfFinal = new SimpleDateFormat("yyyy-MM-dd");
                            String dtFinal = sdfFinal.format(dt);

                            sql += "'" + dtFinal + "'";
                            //sql += "'" + tbl.getValueAt(linha, coluna).toString() + "'";
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
    
    /**
     * Converte data da celula para variavel do tipo Date
     * @param dataFromTab
     * @return 
     */
    private Date convertStringToDate(String dataFromTab){
        Date dt = new Date();
        SimpleDateFormat sdf;
        try{
            sdf = new SimpleDateFormat("dd/MM/yyyy");
            dt = sdf.parse(dataFromTab); 
            return dt;
        }catch(Exception e){
            System.out.println("Erro ao converter tipo date para dd/MM/yyyy");
        }

//        try{
//            sdf = new SimpleDateFormat("MM-dd-yyyy");
//            dt = sdf.parse(dataFromTab);
//            return dt;
//        }catch(Exception e){
//            System.out.println("Erro ao converter tipo date para MM-dd-yyyy");
//        }

        try{
            sdf = new SimpleDateFormat("yyyy-MM-dd");
            dt = sdf.parse(dataFromTab);
            return dt;
        }catch(Exception e){
            System.out.println("Erro ao converter tipo date para yyyy-MM-dd");
        }

//        try{
//            sdf = new SimpleDateFormat("dd-MM-yyyy");
//            dt = sdf.parse(dataFromTab);
//            return dt;
//        }catch(Exception e){
//            System.out.println("Erro ao converter tipo date para dd-MM-yyyy");
//        }         
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
            case "Data yyyy-MM-dd":
                return "DATE";     
            case "Data dd/MM/yyyy":
                return "DATE";
        }
        return "";
    }
    
    public void salvarQuerySQL(String nomeTabela){
        
//        JFileChooser jfc = new JFileChooser();        
//        jfc.showSaveDialog(null);     
//        File file = jfc.getSelectedFile();
        //File file = new File("/home/deynesonborba/files-to-test-saiku/cubes-scripts-generated/" + formatarString(nomeTabela) + ".sql");
        File file = new File(System.getProperty("user.home") + 
                System.getProperty("file.separator") +
                "files-to-test-saiku" +
                System.getProperty("file.separator") +
                "cubes-scripts-generated"+
                System.getProperty("file.separator") + 
                formatarString(nomeTabela) + ".sql");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(String sql : scripts){
                bw.write(sql);
                bw.write("\n");
            }
            
            bw.flush();
            bw.close();
            System.out.println("Script salvo");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
