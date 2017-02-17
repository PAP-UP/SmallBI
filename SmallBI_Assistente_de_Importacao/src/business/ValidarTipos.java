package business;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import view.FormAssistenteImportacao;
import static view.FormAssistenteImportacao.painelAbaTabPrev_CbxTiposVariaveis;

public class ValidarTipos {
    public static int tamanhoCampoVarchar = 0;
    
    public static String validarTipagemDosCampos(JTable tblArquivo, List<JComboBox> listaDeCbx) {

        int coluna = 0;
        String msg = new String();
        String strValorCampo = new String();
        boolean erro = true;

        try {
            for (JComboBox cbx : listaDeCbx) {
                for (int linha = 0; linha < tblArquivo.getRowCount(); linha++) {

                    erro = true;
                    msg = "Erro ao definir tipo de dado: \nColuna: " + tblArquivo.getColumnName(coluna)
                            + "\nLinha: " + linha;

                    if(tblArquivo.getModel().getValueAt(linha, coluna) != null){
                        strValorCampo = tblArquivo.getModel().getValueAt(linha, coluna).toString();
                    }else{
                        strValorCampo = " ";
                    }
                    
                    switch (cbx.getModel().getSelectedItem().toString()) {
                        case "Selecione":
                            return msg = "Selecione o tipo dos dados da coluna "
                                    + tblArquivo.getColumnName(coluna);

                        case "Texto":
                            String s = strValorCampo;
                            if (s.length() > tamanhoCampoVarchar) {
                                tamanhoCampoVarchar = s.length();
                            }
                            erro = false;
                            break;

                        case "V/F":
                            if(strValorCampo.equals(" ")){
                                erro = false;
                            }else{
                                if (strValorCampo.equals("true") || strValorCampo.equals("false")) {
                                    erro = false;
                                }
                            }                                
                            break;

                        case "Inteiro":
                            if(strValorCampo.equals(" ")){
                                erro = false;
                            }else{
                                Integer inteiro = new Integer(strValorCampo);
                                erro = false;
                            }                                
                            break;

                        case "Real":
                            if(strValorCampo.equals(" ")){
                                erro = false;
                            }else{
                                Float real = new Float(strValorCampo);
                                erro = false;
                            }
                            break;

                        case "Caractere":
                            if(strValorCampo.equals(" ")){
                                erro = false;
                            }else{
                                if (strValorCampo.length() == 1) {
                                    CharSequence c = tblArquivo.getModel().getValueAt(linha, coluna).
                                        toString();
                                    erro = false;
                                } else {
                                    erro = true;
                                }
                            }
                            break;

                        case "Data dd-MM-yyyy":
                            if(strValorCampo.equals(" ")){
                               erro = false; 
                            }else{
                                if (strValorCampo.length() > 0) {
                                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                                    sdf.setLenient(false);
                                    try {
                                        sdf.parse(strValorCampo);
                                        erro = false;
                                    } catch (Exception e) {
                                        erro = true;
                                    }   
                                }
                            }                                
                            break;

                        case "Data MM-dd-yyyy":
                            if(strValorCampo.equals(" ")){
                                erro = false;
                            }else{
                                if (strValorCampo.length() > 0) {
                                    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
                                    sdf.setLenient(false);
                                    try {
                                        sdf.parse(strValorCampo);
                                        erro = false;
                                    } catch (Exception e) {
                                        erro = true;
                                    }
                                }
                            }                                
                            break;
                            
                        case "Data yyyy-MM-dd":
                            if(strValorCampo.equals(" ")){
                                erro = false;
                            }else{
                                if(strValorCampo.length() > 0){
                                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                                    sdf.setLenient(false);
                                    try{
                                        sdf.parse(strValorCampo);
                                        erro = false;
                                    }catch(Exception e){
                                        erro = true;
                                    }
                                }
                            }
                            
                        case "Não importar":
                            erro = false;
                            break;
                    }
                    if (erro) {
                        return msg;
                    }
                }
                coluna++;
            }
            return msg = "Campos validados com sucesso!";
        } catch (Exception e) {
            return msg;
        }
    }
    
    public static void removerColunasIndesejadas(JTable jtable, List<JComboBox> listaDeCbx){
        int qtdCbxParaRemover = 0;
        for(JComboBox cbx : listaDeCbx){
            System.out.println(cbx.getSelectedItem().toString());
            if(cbx.getSelectedItem().toString().equals("Não importar")){
                int index = listaDeCbx.indexOf(cbx);
                TableColumn column = jtable.getColumnModel().getColumn(index);
                jtable.removeColumn(column);
                qtdCbxParaRemover++;
                cbx.setSelectedIndex(0);
            }
        }
        
        for(int i = 0; i < qtdCbxParaRemover; i++){
            painelAbaTabPrev_CbxTiposVariaveis.remove(i);
            listaDeCbx.remove(i);
            painelAbaTabPrev_CbxTiposVariaveis.updateUI();
        }
        
    }
    
    private static void atualizarComboBoxTiposArquivo(List<JComboBox> listaCbx){
        painelAbaTabPrev_CbxTiposVariaveis.removeAll();
        for(int i = 0; i < listaCbx.size(); i++){
            JComboBox cbx = new JComboBox();
            cbx.addItem("Texto");
            cbx.addItem("V/F");
            cbx.addItem("Inteiro");
            cbx.addItem("Real");
            cbx.addItem("Caractere");
            cbx.addItem("Data dd-MM-yyyy");            
            cbx.addItem("Data MM-dd-yyyy");
            cbx.addItem("Data yyyy-MM-dd");
            cbx.addItem("Não importar");
            painelAbaTabPrev_CbxTiposVariaveis.add(cbx);
        }
        painelAbaTabPrev_CbxTiposVariaveis.updateUI();
    }
}
