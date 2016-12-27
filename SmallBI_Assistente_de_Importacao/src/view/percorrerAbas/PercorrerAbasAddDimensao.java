package view.percorrerAbas;

import javax.swing.JTable;
import view.FormAddDimensao;

public class PercorrerAbasAddDimensao extends FormAddDimensao{
    
    public static void desativarAbasInicio(){
        painelAbas.setEnabledAt(1, false);
        painelAbas.setEnabledAt(2, false);
    }
    
    public static void tabelaToAtributos(){
        painelAbas.setEnabledAt(0, false);
        painelAbas.setEnabledAt(1, true);
        painelAbas.setSelectedIndex(1);
    }
    
    public static void atributosToTabela(){
        painelAbas.setEnabledAt(1, false);
        painelAbas.setEnabledAt(0, true);
        painelAbas.setSelectedIndex(0);        
    }
    
    public static void atributosToNomeChave(){
        painelAbas.setEnabledAt(1, false);
        painelAbas.setEnabledAt(2, true);   
        painelAbas.setSelectedIndex(2);
    }
    
    public static void nomeChaveToAtributos(){
        painelAbas.setEnabledAt(1, true);
        painelAbas.setEnabledAt(2, false);
        painelAbas.setSelectedIndex(1);
    }
    
    public PercorrerAbasAddDimensao(JTable tabelaPivot, String nomeTabelaPivot) {
        super();
    }    
}
