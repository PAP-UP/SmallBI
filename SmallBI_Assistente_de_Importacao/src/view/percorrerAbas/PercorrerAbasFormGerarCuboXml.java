package view.percorrerAbas;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import view.FormGerarCuboXml;

public class PercorrerAbasFormGerarCuboXml extends FormGerarCuboXml{
    
    public static void DesativarAbasInicio(){
        for(int i = 0; i < jtpPainelAbas.getComponentCount(); i++){
            jtpPainelAbas.setEnabledAt(i, false);
        }
        jtpPainelAbas.setEnabledAt(0, true);
    }
    
    public static void ModelMetriToSaveCube(){
        jtpPainelAbas.setSelectedIndex(3);
        jtpPainelAbas.setEnabledAt(2, false);
        jtpPainelAbas.setEnabledAt(3, true);
    }

    public static void ModelMetriToModelDim(){
        jtpPainelAbas.setSelectedIndex(1);
        jtpPainelAbas.setEnabledAt(2, false);
        jtpPainelAbas.setEnabledAt(1, true);
    }    
    
    public static void ModelDimToSaveTab(){
        jtpPainelAbas.setSelectedIndex(0);
        jtpPainelAbas.setEnabledAt(1, false);
        jtpPainelAbas.setEnabledAt(0, true);
    }    
    
    public static void AbaModelDimToModelMetri(){
        jtpPainelAbas.setSelectedIndex(2);
        jtpPainelAbas.setEnabledAt(1, false);
        jtpPainelAbas.setEnabledAt(2, true);
    }    
    
    public static void SaveTabToModelDim(){
        jtpPainelAbas.setSelectedIndex(1);
        jtpPainelAbas.setEnabledAt(0, false);
        jtpPainelAbas.setEnabledAt(1, true);
    }     
    
    public PercorrerAbasFormGerarCuboXml(JTable tbl, List<JComboBox> listaCbxTiposParametro) {
        super(tbl, listaCbxTiposParametro);
    }    
}
