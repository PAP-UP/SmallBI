package view.percorrerAbas;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import view.FormAssistenteModelagem;

public class PercorrerAbasFormAssistenteModelagem extends FormAssistenteModelagem{
    
    public static void desativarAbasInicio(){
        for(int i = 0; i < lbl.getComponentCount(); i++){
            lbl.setEnabledAt(i, false);
        }
        lbl.setEnabledAt(0, true);
    }
  
    public static void nomeCuboToModelDim(){
        lbl.setSelectedIndex(1);
        lbl.setEnabledAt(1, true);
        lbl.setEnabledAt(0, false);        
    }
    
    public static void modelDimToNomeCubo(){
        lbl.setSelectedIndex(0);
        lbl.setEnabledAt(0, true);
        lbl.setEnabledAt(1, false);        
    }
        
    public static void modelDimToModelMetri(){
        lbl.setSelectedIndex(2);
        lbl.setEnabledAt(2, true);
        lbl.setEnabledAt(1, false);         
    }
    
    public static void modelMetriToModelDim(){
        lbl.setSelectedIndex(1);
        lbl.setEnabledAt(1, true);
        lbl.setEnabledAt(2, false);        
    }
    
    public static void modelMetriToAddRel(){
        lbl.setSelectedIndex(3);
        lbl.setEnabledAt(3, true);
        lbl.setEnabledAt(2, false);  
    }
    
    public static void modelMetriToCuboPreview(){
        lbl.setSelectedIndex(4);
        lbl.setEnabledAt(4, true);
        lbl.setEnabledAt(2, false);
    }
    
    public static void addRelToModelMetri(){
        lbl.setSelectedIndex(2);
        lbl.setEnabledAt(2, true);
        lbl.setEnabledAt(3, false);         
    }
        
    public static void addRelToCuboPreview(){
        lbl.setSelectedIndex(4);
        lbl.setEnabledAt(4, true);
        lbl.setEnabledAt(3, false);        
    }
    
    public static void cuboPrevToAddRel(){
        lbl.setSelectedIndex(3);
        lbl.setEnabledAt(3, true);
        lbl.setEnabledAt(4, false);         
    }
    
    public static void cuboPreviewToModelMetri(){
        lbl.setSelectedIndex(2);
        lbl.setEnabledAt(2, true);
        lbl.setEnabledAt(4, false);
    }
    
    public PercorrerAbasFormAssistenteModelagem(JTable tbl, List<JComboBox> listaCbxTiposParametro) {
        super();
    }    
}
