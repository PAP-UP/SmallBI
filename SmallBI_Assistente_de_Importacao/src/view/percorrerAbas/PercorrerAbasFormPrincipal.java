package view.percorrerAbas;

import view.FormPrincipal;
import static view.FormPrincipal.painelAbas;

public class PercorrerAbasFormPrincipal extends FormPrincipal{
    
    public static void AbaIniToAbaTipoImport(){
        painelAbas.setSelectedIndex(1);
        painelAbas.setEnabledAt(0, false);
        painelAbas.setEnabledAt(1, true);
    }
    
    public static void AbaTipoImportToAbaIni(){
        painelAbas.setSelectedIndex(0);
        painelAbas.setEnabledAt(1, false);
        painelAbas.setEnabledAt(0, true);        
    }
    
    public static void AbaTipoImportToAbaImportArq(){
        painelAbas.setSelectedIndex(2);
        painelAbas.setEnabledAt(1, false);
        painelAbas.setEnabledAt(2, true);
        importandoDeArquivo = true;
    }
    
    public static void AbaTipoImportToConexBanco(){
        painelAbas.setSelectedIndex(3);
        painelAbas.setEnabledAt(1, false);
        painelAbas.setEnabledAt(3, true);       
        importandoDeArquivo = false;
    }
    
    public static void AbaImportArqToAbaTipoImport(){
        painelAbas.setSelectedIndex(1);
        painelAbas.setEnabledAt(2, false);
        painelAbas.setEnabledAt(1, true);         
    }
    
    public static void AbaImportArqToTabPreview(){
        painelAbas.setSelectedIndex(5);
        painelAbas.setEnabledAt(5, true);
        painelAbas.setEnabledAt(2,false);
    }
    
    public static void AbaConexBancoToAbaTipoImport(){
        painelAbas.setSelectedIndex(1);
        painelAbas.setEnabledAt(3, false);
        painelAbas.setEnabledAt(1, true);
    }
    
    public static void AbaConexBancoToAbaConsulBanco(){
        painelAbas.setSelectedIndex(4);
        painelAbas.setEnabledAt(4,true);
        painelAbas.setEnabledAt(3,false);        
    }    
    
    public static void AbaConsulBancoToAbaConexBanco(){
        painelAbas.setSelectedIndex(3);
        painelAbas.setEnabledAt(4, false);
        painelAbas.setEnabledAt(3, true); 
    }
    
    public static void AbaConsulBancoToAbaTabPreview(){
        painelAbas.setSelectedIndex(5);
        painelAbas.setEnabledAt(4,false);
        painelAbas.setEnabledAt(5,true);
    }
    
    public static void AbaTabPreviewToAbaTipoImport(){
        painelAbas.setSelectedIndex(1);
        painelAbas.setEnabledAt(5, false);
        painelAbas.setEnabledAt(1, true);             
    }
    
    public static void importarMaisDados(){
        painelAbas.setSelectedIndex(1);
        painelAbas.setEnabledAt(1, true);
        btnAbaTabPrev_GerarCuboXml.setEnabled(false);
    }
    
    public static void desativarAbasNoInicio(){
        painelAbas.setEnabledAt(1, false);
        painelAbas.setEnabledAt(2, false);
        painelAbas.setEnabledAt(3, false);
        painelAbas.setEnabledAt(4, false);
        painelAbas.setEnabledAt(5, false);
    }
}
