package view.percorrerAbas;

import javax.swing.JTable;
import view.FormAddDimensao;

public class PercorrerAbasAddDimensao extends FormAddDimensao{
    
    public static void DesativarAbasInicio(){
        painelAbas.setEnabledAt(1, false);
    }
    
    public static void AtributosToNomeChave(){
        painelAbas.setSelectedIndex(1);
        painelAbas.setEnabledAt(1, true);        
    }
        
    public static void AbaAtriToAbaNomeChave(){
        painelAbas.setEnabledAt(0, false);
        painelAbas.setEnabledAt(1, true);
        painelAbas.setSelectedIndex(1);
    }
    
    public static void NomeChaveToAtributos(){
        painelAbas.setEnabledAt(0, true);
        painelAbas.setEnabledAt(1, false);
        painelAbas.setSelectedIndex(0);
    }
    
    public PercorrerAbasAddDimensao(JTable tabelaPivot, String nomeTabelaPivot) {
        super(tabelaPivot, nomeTabelaPivot);
    }    
}
