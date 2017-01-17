package view.percorrerAbas;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import view.FormGerarCuboXml;

public class PercorrerAbasFormGerarCuboXml extends FormGerarCuboXml{
    
    public static void desativarAbasInicio(){
        for(int i = 0; i < jtpPainelAbas.getComponentCount(); i++){
            jtpPainelAbas.setEnabledAt(i, false);
        }
        jtpPainelAbas.setEnabledAt(0, true);
    }
  
    public static void nomeCuboToModelDim(){
        jtpPainelAbas.setSelectedIndex(1);
        jtpPainelAbas.setEnabledAt(1, true);
        jtpPainelAbas.setEnabledAt(0, false);        
    }
    
    public static void modelDimToNomeCubo(){
        jtpPainelAbas.setSelectedIndex(0);
        jtpPainelAbas.setEnabledAt(0, true);
        jtpPainelAbas.setEnabledAt(1, false);        
    }
        
    public static void modelDimToModelMetri(){
        jtpPainelAbas.setSelectedIndex(2);
        jtpPainelAbas.setEnabledAt(2, true);
        jtpPainelAbas.setEnabledAt(1, false);         
    }
    
    public static void modelMetriToModelDim(){
        jtpPainelAbas.setSelectedIndex(1);
        jtpPainelAbas.setEnabledAt(1, true);
        jtpPainelAbas.setEnabledAt(2, false);        
    }
    
    public static void modelMetriToAddRel(){
        jtpPainelAbas.setSelectedIndex(3);
        jtpPainelAbas.setEnabledAt(3, true);
        jtpPainelAbas.setEnabledAt(2, false);  
    }
    
    public static void addRelToModelMetri(){
        jtpPainelAbas.setSelectedIndex(2);
        jtpPainelAbas.setEnabledAt(2, true);
        jtpPainelAbas.setEnabledAt(3, false);         
    }
        
    public static void addRelToCuboPreview(){
        jtpPainelAbas.setSelectedIndex(4);
        jtpPainelAbas.setEnabledAt(4, true);
        jtpPainelAbas.setEnabledAt(3, false);        
    }
    
    public static void cuboPrevToAddRel(){
        jtpPainelAbas.setSelectedIndex(3);
        jtpPainelAbas.setEnabledAt(3, true);
        jtpPainelAbas.setEnabledAt(4, false);         
    }
    
    public PercorrerAbasFormGerarCuboXml(JTable tbl, List<JComboBox> listaCbxTiposParametro) {
        super();
    }    
}
