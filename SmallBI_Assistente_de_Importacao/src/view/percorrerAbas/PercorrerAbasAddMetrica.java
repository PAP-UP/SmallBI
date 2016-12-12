package view.percorrerAbas;

import view.FormAddMetrica;

public class PercorrerAbasAddMetrica extends FormAddMetrica{

    public static void grupoMetriToMetricas(){
        painelAbas.setEnabledAt(0, false);
        painelAbas.setEnabledAt(1, true);
        painelAbas.setSelectedIndex(1);
    }
    
    public static void metricasToGrupoMetri(){
        painelAbas.setEnabledAt(1, false);
        painelAbas.setEnabledAt(0, true);
        painelAbas.setSelectedIndex(0);
    }
    
    public static void metricasToPreview(){
        painelAbas.setEnabledAt(1, false);
        painelAbas.setEnabledAt(2, true);
        painelAbas.setSelectedIndex(2);        
    }
    
    public static void previewToMetricas(){
        painelAbas.setEnabledAt(2, false);
        painelAbas.setEnabledAt(1, true);
        painelAbas.setSelectedIndex(1);
    }
}
