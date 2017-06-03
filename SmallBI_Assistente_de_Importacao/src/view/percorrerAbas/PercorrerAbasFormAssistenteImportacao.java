package view.percorrerAbas;

import javax.swing.table.DefaultTableModel;
import view.FormAssistenteImportacao;
import static view.FormAssistenteImportacao.painelAbas;

public class PercorrerAbasFormAssistenteImportacao extends FormAssistenteImportacao{
    
    private static final int ABA_TIPO_DE_IMPORTACAO = 0;
    private static final int ABA_ARQUIVO = 1;
    private static final int ABA_CONEXAO_BANCO = 2;
    private static final int ABA_CONSULTAR_BANCO = 3;
    private static final int ABA_VISUALIZACAO_DATABELA = 4;
    
//    public static void abaIniToAbaTipoImport(){
//        painelAbas.setSelectedIndex(1);
//        painelAbas.setEnabledAt(0, false);
//        painelAbas.setEnabledAt(1, true);
//    }
    
//    public static void abaTipoImportToAbaIni(){
//        painelAbas.setSelectedIndex(0);
//        painelAbas.setEnabledAt(1, false);
//        painelAbas.setEnabledAt(0, true);        
//    }
    
    public static void abaTipoImportToAbaImportArq(){
        painelAbas.setSelectedIndex(ABA_ARQUIVO);
        painelAbas.setEnabledAt(ABA_ARQUIVO, true);
        painelAbas.setEnabledAt(ABA_TIPO_DE_IMPORTACAO, false);
        importandoDeArquivo = true;
    }
    
    public static void abaTipoImportToConexBanco(){
        painelAbas.setSelectedIndex(ABA_CONEXAO_BANCO);
        painelAbas.setEnabledAt(ABA_CONEXAO_BANCO, true);       
        painelAbas.setEnabledAt(ABA_TIPO_DE_IMPORTACAO, false);
        importandoDeArquivo = false;
    }
    
    public static void abaImportArqToAbaTipoImport(){
        painelAbas.setSelectedIndex(ABA_TIPO_DE_IMPORTACAO);
        painelAbas.setEnabledAt(ABA_TIPO_DE_IMPORTACAO, true);         
        painelAbas.setEnabledAt(ABA_ARQUIVO, false);
    }
    
    public static void abaImportArqToTabPreview(){
        painelAbas.setSelectedIndex(ABA_VISUALIZACAO_DATABELA);
        painelAbas.setEnabledAt(ABA_VISUALIZACAO_DATABELA, true);
        painelAbas.setEnabledAt(ABA_ARQUIVO,false);
    }
    
    public static void abaConexBancoToAbaTipoImport(){
        painelAbas.setSelectedIndex(ABA_TIPO_DE_IMPORTACAO);
        painelAbas.setEnabledAt(ABA_TIPO_DE_IMPORTACAO, true);
        painelAbas.setEnabledAt(ABA_CONEXAO_BANCO, false);
    }
    
    public static void abaConexBancoToAbaConsulBanco(){
        painelAbas.setSelectedIndex(ABA_CONSULTAR_BANCO);
        painelAbas.setEnabledAt(ABA_CONSULTAR_BANCO,true);
        painelAbas.setEnabledAt(ABA_CONEXAO_BANCO,false);        
    }    
    
    public static void abaConsulBancoToAbaConexBanco(){
        painelAbas.setSelectedIndex(ABA_CONEXAO_BANCO);
        painelAbas.setEnabledAt(ABA_CONEXAO_BANCO, true); 
        painelAbas.setEnabledAt(ABA_CONSULTAR_BANCO, false);
    }
    
    public static void abaConsulBancoToAbaTabPreview(){
        painelAbas.setSelectedIndex(ABA_VISUALIZACAO_DATABELA);
        painelAbas.setEnabledAt(ABA_VISUALIZACAO_DATABELA,true);
        painelAbas.setEnabledAt(ABA_CONSULTAR_BANCO,false);
    }
    
    public static void abaTabPreviewToAbaTipoImport(){        
        painelAbas.setSelectedIndex(ABA_TIPO_DE_IMPORTACAO);
        painelAbas.setEnabledAt(ABA_TIPO_DE_IMPORTACAO, true);   
        painelAbas.setEnabledAt(ABA_VISUALIZACAO_DATABELA, false);
        btnAbaTabPrev_GerarCuboXml.setEnabled(false);
        btnAbaTabPrev_SalvarTabela.setEnabled(false);
    }
    
    public static void desativarAbasNoInicio(){
        painelAbas.setEnabledAt(ABA_ARQUIVO, false);
        painelAbas.setEnabledAt(ABA_CONEXAO_BANCO, false);
        painelAbas.setEnabledAt(ABA_CONSULTAR_BANCO, false);
        painelAbas.setEnabledAt(ABA_VISUALIZACAO_DATABELA, false);
    }
}
