package Core;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;

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

                    //if (!strValorCampo.equals(" ")) {
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
                        }
                    //}
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
}
