package view.percorrerAbas;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import view.FormAssistenteModelagem;

public class PercorrerAbasFormAssistenteModelagem extends FormAssistenteModelagem{
    
    private static final int ABA_NOME_CUBO = 0;
    private static final int ABA_MODELAGEM_DIMENSOES = 1;
    private static final int ABA_MODELAGEM_METRICAS = 2;
    private static final int ABA_CUBO_PREVIEW = 3;
    
    public static void desativarAbasInicio(){
        for(int i = 0; i < lbl.getComponentCount(); i++){
            lbl.setEnabledAt(i, false);
        }
        lbl.setEnabledAt(0, true);
    }
  
    public static void nomeCuboToModelDim(){
        lbl.setSelectedIndex(ABA_MODELAGEM_DIMENSOES);
        lbl.setEnabledAt(ABA_MODELAGEM_DIMENSOES, true);
        lbl.setEnabledAt(ABA_NOME_CUBO, false);        
    }
    
    public static void modelDimToNomeCubo(){
        lbl.setSelectedIndex(ABA_NOME_CUBO);
        lbl.setEnabledAt(ABA_NOME_CUBO, true);
        lbl.setEnabledAt(ABA_MODELAGEM_DIMENSOES, false);        
    }
        
    public static void modelDimToModelMetri(){
        lbl.setSelectedIndex(ABA_MODELAGEM_METRICAS);
        lbl.setEnabledAt(ABA_MODELAGEM_METRICAS, true);
        lbl.setEnabledAt(ABA_MODELAGEM_DIMENSOES, false);         
    }
    
    public static void modelMetriToModelDim(){
        lbl.setSelectedIndex(ABA_MODELAGEM_DIMENSOES);
        lbl.setEnabledAt(ABA_MODELAGEM_DIMENSOES, true);
        lbl.setEnabledAt(ABA_MODELAGEM_METRICAS, false);        
    }
    
    public static void modelMetriToCuboPreview(){
        lbl.setSelectedIndex(ABA_CUBO_PREVIEW);
        lbl.setEnabledAt(ABA_CUBO_PREVIEW, true);
        lbl.setEnabledAt(ABA_MODELAGEM_METRICAS, false);
    }
    
    public static void cuboPreviwToModelMetri(){
        lbl.setSelectedIndex(ABA_MODELAGEM_METRICAS);
        lbl.setEnabledAt(ABA_MODELAGEM_METRICAS, true);
        lbl.setEnabledAt(ABA_CUBO_PREVIEW, false);         
    }
    
    public PercorrerAbasFormAssistenteModelagem(JTable tbl, List<JComboBox> listaCbxTiposParametro) {
        super();
    }    
}
