package view.percorrerAbas;

import javax.swing.table.DefaultTableModel;
import view.FormPrincipal;
import static view.FormPrincipal.painelAbas;

public class PercorrerAbasFormPrincipal extends FormPrincipal{
    
    public static void abaIniToAbaTipoImport(){
        painelAbas.setSelectedIndex(1);
        painelAbas.setEnabledAt(0, false);
        painelAbas.setEnabledAt(1, true);
    }
    
    public static void abaTipoImportToAbaIni(){
        painelAbas.setSelectedIndex(0);
        painelAbas.setEnabledAt(1, false);
        painelAbas.setEnabledAt(0, true);        
    }
    
    public static void abaTipoImportToAbaImportArq(){
        painelAbas.setSelectedIndex(2);
        painelAbas.setEnabledAt(1, false);
        painelAbas.setEnabledAt(2, true);
        importandoDeArquivo = true;
    }
    
    public static void abaTipoImportToConexBanco(){
        painelAbas.setSelectedIndex(3);
        painelAbas.setEnabledAt(1, false);
        painelAbas.setEnabledAt(3, true);       
        importandoDeArquivo = false;
    }
    
    public static void abaImportArqToAbaTipoImport(){
        painelAbas.setSelectedIndex(1);
        painelAbas.setEnabledAt(2, false);
        painelAbas.setEnabledAt(1, true);         
    }
    
    public static void abaImportArqToTabPreview(){
        painelAbas.setSelectedIndex(5);
        painelAbas.setEnabledAt(5, true);
        painelAbas.setEnabledAt(2,false);
    }
    
    public static void abaConexBancoToAbaTipoImport(){
        painelAbas.setSelectedIndex(1);
        painelAbas.setEnabledAt(3, false);
        painelAbas.setEnabledAt(1, true);
    }
    
    public static void abaConexBancoToAbaConsulBanco(){
        painelAbas.setSelectedIndex(4);
        painelAbas.setEnabledAt(4,true);
        painelAbas.setEnabledAt(3,false);        
    }    
    
    public static void abaConsulBancoToAbaConexBanco(){
        painelAbas.setSelectedIndex(3);
        painelAbas.setEnabledAt(4, false);
        painelAbas.setEnabledAt(3, true); 
    }
    
    public static void abaConsulBancoToAbaTabPreview(){
        painelAbas.setSelectedIndex(5);
        painelAbas.setEnabledAt(4,false);
        painelAbas.setEnabledAt(5,true);
    }
    
    public static void abaTabPreviewToAbaTipoImport(){
        DefaultTableModel modelo = (DefaultTableModel) tblTabPrev.getModel();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);        
        painelAbas.setSelectedIndex(1);
        painelAbas.setEnabledAt(5, false);
        painelAbas.setEnabledAt(1, true);             
    }
    
    public static void importarMaisDados(){
        DefaultTableModel modelo = (DefaultTableModel) tblTabPrev.getModel();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);  
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
