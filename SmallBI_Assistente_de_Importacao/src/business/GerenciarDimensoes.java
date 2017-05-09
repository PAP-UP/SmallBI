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
import model.TabelaImportada;

import static view.FormAssistenteModelagem.*;
import view.percorrerAbas.PercorrerAbasFormAssistenteModelagem;
/**
 *
 * @author deynesonborba
 */
public class GerenciarDimensoes {
    public static List<Dimensao> dimensoesModeladas = new ArrayList<>();
    public static List<Dimensao> dimensoesSalvas = new ArrayList<>();
    
    public static void adicionarDimensao(){
        String nomeDim = txtNomeDimensao.getText();
        String tabela = cbxTabelaDimensao.getSelectedItem().toString();
        String chave = cbxChaveDimensao.getSelectedItem().toString();
        String linkComFato = cbxLinkComFato.getSelectedItem().toString();
        
        if(nomeDim != null && !nomeDim.equals("") &&
                tabela != null && !tabela.equals("") && !tabela.equals("Selecione") &&
                    chave != null && !chave.equals("") && !chave.equals("Selecione")){
        
            if(nomeJaExistente()){
                JOptionPane.showMessageDialog(null, "Já existe uma dimensão com este nome!");
            }else{            
                List<String> atributosSelecionados = new ArrayList<>();
                Component[] components = painelListaAtributos.getComponents();
                for(Component c : components){
                    if(c instanceof JCheckBox){
                        JCheckBox checkBox = (JCheckBox) c;
                        if(checkBox.isSelected()){
                            atributosSelecionados.add(checkBox.getText());
                        }
                    }
                }

                if(atributosSelecionados.size() > 0){
                    Dimensao d = new Dimensao();
                    d.setNome(Util.formatarString(nomeDim));
                    d.setTabela(tabela);
                    d.setKey(chave);
                    d.setAtributos(atributosSelecionados);
                    d.setLinkComFato(linkComFato);

                    dimensoesModeladas.add(d);
                    atualizarListaDimensoes();
                    jTabbedPane_Dimensoes.setSelectedIndex(1);
                }else{
                    JOptionPane.showMessageDialog(null, "Selecione ao menos um atributo!");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }
    
    private static boolean nomeJaExistente(){
        for(Dimensao d : dimensoesSalvas){
            if(d.getNome().equals(txtNomeDimensao.getText())){
                return true;
            }
        }
        return false;
    }
    
    public static void atualizarListaDimensoes(){
        painelListaDimensoes.removeAll();
        for(Dimensao d : dimensoesModeladas){
            JCheckBox checkBox = new JCheckBox();
            checkBox.setText(d.getNome());
            checkBox.setSelected(true);
            JLabel label = new JLabel();
            label.setText("Dimensão: ");
            painelListaDimensoes.add(label);
            painelListaDimensoes.add(checkBox);
        }
        painelListaDimensoes.setLayout(new BoxLayout(painelListaDimensoes, BoxLayout.Y_AXIS));
        painelListaDimensoes.updateUI();
    }
    
    public static void salvarDimensoes(){
        Component[] components = painelListaDimensoes.getComponents();
        if(components.length > 0){
            
            int qtdDimSelec = 0;
            
            for(Component c : components){
                if(c instanceof JCheckBox){
                    JCheckBox checkBox = (JCheckBox) c;
                    if(!checkBox.isSelected()){
                        delDimByName(checkBox.getText());
                    }else{
                        //Deve ser selecionada pelo menos uma dimensão
                        qtdDimSelec++;
                        //Adicionar dim se não existir ja
                        if(!verificarSeJaExisteNaLista(checkBox.getText())){
                            dimensoesSalvas.add(getDimensaoModelada(checkBox.getText()));
                        }
                    }
                }
            }
            
            if(qtdDimSelec > 0){
                GerenciarMetricas.carregarTabelasMetricas();
                PercorrerAbasFormAssistenteModelagem.modelDimToModelMetri();
            }else{
                JOptionPane.showMessageDialog(null, "Adicione ao menos uma dimensão ao cubo!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Adicione ao menos uma dimensão ao cubo!");
        }
    }
    
    private static boolean delDimByName(String nomeDim){
        for(Dimensao d : dimensoesSalvas){
            if(d.getNome().equals(nomeDim)){
                dimensoesSalvas.remove(d);
                return true;
            }
        }
        return false;
    }    
    
    private static boolean verificarSeJaExisteNaLista(String nome){
        for(Dimensao d : dimensoesSalvas){
            if(d.getNome().equals(nome))
                return true;
        }
        return false;
    }    
    
    private static Dimensao getDimensaoModelada(String nome){
        for(Dimensao d : dimensoesModeladas){
            if(d.getNome().equals(nome))
                return d;
        }
        return null;
    }    
    
    public static void limparAbaAddDimensao(){
        painelListaAtributos.removeAll();
        jcbSelecTodos.setSelected(false);
        jcbSelecTodos.setEnabled(false);
        txtNomeDimensao.setText("");

        cbxChaveDimensao.removeAllItems();
        //cbxChaveDimensao.addItem("Selecione");        
        
        cbxTabelaDimensao.removeAllItems();
        //cbxTabelaDimensao.addItem("Selecione");

        carregarTabelasModelDim();
        
        jTabbedPane_Dimensoes.setSelectedIndex(0);
    }    
    
    /**
     * Carrega as tabelas que não foram escolhidas como fato
     */
    public static void carregarTabelasModelDim(){
        cbxTabelaDimensao.removeAllItems();
        for(TabelaImportada t : tabelasImportadas){
            if(!t.isIsTabFato())
                cbxTabelaDimensao.addItem(t.getNomeTabela());
        }
    }    
    
    public static void modelDimToModelMetri(){
        if(dimensoesSalvas.size() > 0){
            PercorrerAbasFormAssistenteModelagem.modelDimToModelMetri();
        }else{
            JOptionPane.showMessageDialog(null, "Adicione ao menos uma dimensão ao cubo!");
        }
    }    
    
    public static void getTabSelecionada(){
        //Validação dos itens do comboBox...
        //Existe pois no momento que se chama o método cbx.removeAllItens()...
        //O compilador passa por aqui...
        if(cbxTabelaDimensao.getSelectedItem() != null &&
                !cbxTabelaDimensao.getSelectedItem().equals("Selecione")){
            TabelaImportada tabSelecionada = new TabelaImportada();
            for(TabelaImportada t : tabelasImportadas){
                if(t.getNomeTabela().equals(cbxTabelaDimensao.getSelectedItem().toString())){
                    tabSelecionada = t;
                }
            }
            carregarAtributosModelDim(tabSelecionada);
            carregarChavesModelDim(tabSelecionada);
        }
    }    
    
    private static void carregarChavesModelDim(TabelaImportada tabSelecionada){
        cbxChaveDimensao.removeAllItems();
        cbxChaveDimensao.addItem("Selecione");
        JTable jTable = tabSelecionada.getjTable();
        for(int i = 0; i < jTable.getColumnCount(); i++){
            cbxChaveDimensao.addItem(jTable.getColumnName(i));
        }
        cbxChaveDimensao.updateUI();
    }
    
    private static void carregarAtributosModelDim(TabelaImportada tabSelecionada){
        painelListaAtributos.removeAll();
        JTable jTable = tabSelecionada.getjTable();
        for(int i = 0; i < jTable.getColumnCount(); i++){
            JCheckBox checkBox = new JCheckBox();
            checkBox.setText(jTable.getColumnName(i));
            checkBox.setEnabled(false);
            painelListaAtributos.add(checkBox);
        }
        painelListaAtributos.setLayout(new BoxLayout(painelListaAtributos, BoxLayout.Y_AXIS));
        painelListaAtributos.updateUI();
    }    
    
    public static void selecionarTodosAtributos(){
        Component[] components = painelListaAtributos.getComponents();
        if(jcbSelecTodos.isSelected()){
            for(Component c : components){
                if(c instanceof JCheckBox){
                    ((JCheckBox) c).setSelected(true);
                }
            }
        }else{
            for(Component c : components){
                if(c instanceof JCheckBox){
                    ((JCheckBox) c).setSelected(false);
                }
            }            
        }
    }    
    
    public static void ativarSelecTodosAtrDimensao(){
        if(cbxChaveDimensao.getSelectedItem() != null &&
                !cbxChaveDimensao.getSelectedItem().toString().equals("Selecione")){
                
            jcbSelecTodos.setEnabled(true);
            Component[] components = painelListaAtributos.getComponents();
            for(Component c : components){
                c.setEnabled(true);
            }
        }
    }    
    
    public static void carregarLinksComFato(){
        JTable jTable = tabelaFato.getjTable();
        for(int i = 0; i < jTable.getColumnCount(); i++){
            cbxLinkComFato.addItem(jTable.getColumnName(i));
        }
    }
}
