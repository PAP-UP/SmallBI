/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Dimensao;
import model.GrupoMetrica;
import model.Metrica;
import model.TabelaImportada;
import static view.FormAssistenteModelagem.*;
import view.percorrerAbas.PercorrerAbasFormAssistenteModelagem;
/**
 *
 * @author deynesonborba
 */
public class GerenciarMetricas {
    public static List<GrupoMetrica> grupoMetricasModeladas = new ArrayList<>();
    public static List<GrupoMetrica> grupoMetricasSalvas = new ArrayList<>();

    public static void adicionarMetrica(){
        if(txtNomeMetrica.getText() != null && !txtNomeMetrica.getText().equals("")){
            if(txtNomeMetrica.getText().length() < 25){
                if(!cbxTabelaMetrica.getSelectedItem().toString().equals("Selecione")){
                   if(!cbxColunaMetrica.getSelectedItem().toString().equals("Selecione")){

                       Metrica metrica = new Metrica();
                       metrica.setNome(Util.formatarString(txtNomeMetrica.getText()));
                       metrica.setColuna(cbxColunaMetrica.getSelectedItem().toString());
                       metrica.setAgregador(cbxAgregadorMetrica.getSelectedItem().toString());
                       metrica.setFormato(cbxFormatoMetrica.getSelectedItem().toString());        

                       GrupoMetrica gm = getGrupoUsandoMesmaTabela(cbxTabelaMetrica.getSelectedItem().toString());
                       if(gm == null){
                           gm = new GrupoMetrica();
                           gm.setNome("Grupo_" + metrica.getNome());
                           gm.setTabela(cbxTabelaMetrica.getSelectedItem().toString());

                           List<Metrica> metricas = new ArrayList<>();            
                           metricas.add(metrica);
                           gm.setMetricas(metricas);

                           grupoMetricasModeladas.add(gm);
                       }else{
                           List<Metrica> metricas = gm.getMetricas();
                           metricas.add(metrica);
                           gm.setMetricas(metricas);

                           grupoMetricasModeladas.set(grupoMetricasModeladas.indexOf(gm), gm);
                       }
                       atualizarListaMetricas();
                       jTabbedPane_Metricas.setSelectedIndex(1);                    
                   }else{
                       JOptionPane.showMessageDialog(null, "Defina uma coluna!");
                   }
               }else{
                   JOptionPane.showMessageDialog(null, "Defina uma tabela!");
               }   
            }else{
                JOptionPane.showMessageDialog(null, "O nome não pode conter mais do que 25 letras");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Defina um nome para a métrica!");
        }
    }    
    
    public static GrupoMetrica getGrupoUsandoMesmaTabela(String tabSelecionada){
        for(GrupoMetrica gm : grupoMetricasModeladas){
            if(gm.getTabela().equals(tabSelecionada)){
                return gm;
            }
        }
        return null;
    }    
    
    public static void atualizarListaMetricas(){
        painelListaMetricas.removeAll();
        for(GrupoMetrica gm : grupoMetricasModeladas){
            List<Metrica> metricas = gm.getMetricas();
            for(Metrica m : metricas){
                JCheckBox checkBox = new JCheckBox();
                checkBox.setText(m.getNome());
//                checkBox.setText("Métrica: " + m.getNome());
                checkBox.setSelected(true);
                JLabel label = new JLabel();
                label.setText("Métrica: ");
                painelListaMetricas.add(label);
                painelListaMetricas.add(checkBox);
            }
        }
        painelListaMetricas.setLayout(new BoxLayout(painelListaMetricas, BoxLayout.Y_AXIS));
        painelListaMetricas.updateUI();
    }    
    
    public static void salvarMetricas(){
        Component[] components = painelListaMetricas.getComponents();
        if(components.length > 0){            
            int qtdMetriSelec = 0;
            for(Component c : components){
                if(c instanceof JCheckBox){
                    JCheckBox checkBox = (JCheckBox) c;
                    
                    if(!checkBox.isSelected()){
                        delMetricaByName(checkBox.getText());
                    }else{
                       Metrica m = getMetricaModeladaByName(checkBox.getText());
                       if(!metricaJaSalva(m.getNome())){
                            GrupoMetrica gmModelado = getGrupoMetricaModeladoByMetricas(m.getNome());
                            GrupoMetrica gmJaSalvo = getGrupoMetricaJaSalvo(gmModelado.getNome());
                            if(gmJaSalvo == null){
                                 GrupoMetrica newGm = new GrupoMetrica();
                                 newGm.setNome(gmModelado.getNome());
                                 newGm.setTabela(gmModelado.getTabela());
                                 List<Metrica> metricas = new ArrayList<>();
                                 metricas.add(m);
                                 newGm.setMetricas(metricas);
                                 grupoMetricasSalvas.add(newGm);
                             }else{
                                 gmJaSalvo.getMetricas().add(m);
                                 grupoMetricasSalvas.set(grupoMetricasSalvas.indexOf(gmJaSalvo), gmJaSalvo);
                             }
                        }
                       qtdMetriSelec++;
                    }
                }
            }
            
            if(qtdMetriSelec > 0){                 
                if(tabelasImportadas.size() > 1){
                    PercorrerAbasFormAssistenteModelagem.modelMetriToAddRel();
                }else{
                    gerarSchemaXml();
                    PercorrerAbasFormAssistenteModelagem.modelMetriToCuboPreview();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Adicione ao menos uma métrica ao cubo!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Adicione ao menos uma métrica ao cubo!");
        }
    }    
    
    private static boolean metricaJaSalva(String nomeMetricaModelada){
        for(GrupoMetrica gm : grupoMetricasSalvas){
            for(Metrica m : gm.getMetricas()){
                if(m.getNome().equals(nomeMetricaModelada))
                    return true;
            }
        }
        return false;
    }
    
    private static GrupoMetrica getGrupoMetricaJaSalvo(String nomeGrupoModelado){
        for(GrupoMetrica gm : grupoMetricasSalvas){
            if(gm.getNome().equals(nomeGrupoModelado))
                return gm;
        }
        return null;
    }
    
    private static GrupoMetrica getGrupoMetricaModeladoByMetricas(String nomeMetrica){
        for(GrupoMetrica gm : grupoMetricasModeladas){
            for(Metrica m : gm.getMetricas()){
                if(m.getNome().equals(nomeMetrica))
                    return gm;
            }
        }
        return null;
    }
    
    private static Metrica getMetricaModeladaByName(String nomeMetrica){
        for(GrupoMetrica gm : grupoMetricasModeladas){
            for(Metrica m : gm.getMetricas()){
                if(m.getNome().equals(nomeMetrica))
                    return m;
            }
        }        
        return null;
    }
    
    //Foi colocado a assinatura boolean apenas para quebrar o For quando remover a métrica indesejada;
    private static boolean delMetricaByName(String nome){
        for(GrupoMetrica gm : grupoMetricasSalvas){
            List<Metrica> metricas = gm.getMetricas();
            for(Metrica m : metricas){
                if(m.getNome().equals(nome)){
                    metricas.remove(m);
                    return true;
                }
            }
        }
        return false;
    }    
    
    public static void carregarAgregadoresModelMetri(){
        cbxAgregadorMetrica.removeAllItems();
        cbxAgregadorMetrica.addItem("count");
        cbxAgregadorMetrica.addItem("sum");
        cbxAgregadorMetrica.addItem("avg");
        cbxAgregadorMetrica.addItem("max");
    }
    
    public static void carregarFormatosModelMetri(){
        cbxFormatoMetrica.removeAllItems();
        cbxFormatoMetrica.addItem("Standard");
        cbxFormatoMetrica.addItem("#,###.00");
    }
    
    public static void carregarCbxColunasMetrica(){
        cbxColunaMetrica.removeAllItems();
        cbxColunaMetrica.addItem("Selecione");
        
        JTable jTable = tabelaFato.getjTable();
        for(int i = 0; i < jTable.getColumnCount(); i++){            
            cbxColunaMetrica.addItem(jTable.getColumnName(i));
        }
//        Dimensao dimSelecionada = new Dimensao();
//        for(Dimensao d : GerenciarDimensoes.dimensoesSalvas){
//            if(cbxTabelaMetrica.getSelectedItem() != null &&
//                    cbxTabelaMetrica.getSelectedItem().toString().equals(d.getTabela())){
//                dimSelecionada = d;
//            }
//        }
//        
//        if(dimSelecionada.getAtributos() != null){
//            for(String atr : dimSelecionada.getAtributos()){
//                cbxColunaMetrica.addItem(atr);
//            }
//        }
    }    
    
    public static void carregarTabelasMetricas(){
        //Carregar Tabelas para serem utilizadas na gestão de metricas.
        //Validação com DeafultComboBoxModel para não haver redundância de tabelas
        //cbxTabelaMetrica.addItem("Selecione");
//        for(Dimensao d : dimensoesSalvas){
//            if(((DefaultComboBoxModel)cbxTabelaMetrica.getModel()).getIndexOf(d.getTabela()) < 0)
//                cbxTabelaMetrica.addItem(d.getTabela());
//        }
//        cbxTabelaMetrica.setSelectedIndex(0);

        /**
         * Adiciona apenas a tabela que foi escolhida como fato
         */
        for(TabelaImportada tabImp : tabelasImportadas){
            if(tabImp.isIsTabFato())
                cbxTabelaMetrica.addItem(tabImp.getNomeTabela());
        }
    }    
    
    public static void modelMetriToAddRel(){
        if(grupoMetricasSalvas.size() > 0){
            if(tabelasImportadas.size() > 1){
                PercorrerAbasFormAssistenteModelagem.modelMetriToAddRel();            
            }else{
                PercorrerAbasFormAssistenteModelagem.modelMetriToCuboPreview();
                gerarSchemaXml();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Adicione ao menos uma métrica ao cubo!");
        }
    }    
    
    public static void limparAbaAddMetrica(){
        txtNomeMetrica.setText("");
        
        cbxTabelaMetrica.removeAllItems();
        //cbxTabelaMetrica.addItem("Selecione");
        
        cbxColunaMetrica.removeAllItems();
        //cbxColunaMetrica.addItem("Selecione");
        
        GerenciarMetricas.carregarTabelasMetricas();
        
        jTabbedPane_Metricas.setSelectedIndex(0);
    }    
}
