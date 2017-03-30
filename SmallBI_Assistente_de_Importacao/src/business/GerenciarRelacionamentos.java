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
import model.Dimensao;
import model.Link;
import model.TabelaImportada;
import static view.FormAssistenteModelagem.tabelasImportadas;
import static view.FormAssistenteModelagem.*;
import view.percorrerAbas.PercorrerAbasFormAssistenteModelagem;

/**
 *
 * @author deynesonborba
 */
public class GerenciarRelacionamentos {
    public static List<Link> links = new ArrayList<>();
    private static Integer idLink = 0;
    
    public static void salvarRelacionamentos(){
        if(links.size() > 0){
            Component[] components = painelListaRelacionamentos.getComponents();
            if(components.length > 0){
                for(Component c : components){
                    if(c instanceof JCheckBox){
                        JCheckBox checkBox = (JCheckBox) c;
                        if(!checkBox.isSelected()){
                            delRel(checkBox);
                        }
                    }
                }
            }
            addRelToCuboPreview();
        }else{
            JOptionPane.showMessageDialog(null, "Adicione ao menos um relacionamento!");
        }
    }
    
    //Foi colocado a assinatura boolean apenas para quebrar o For quando remover o relacionamento indesejado;
    private static boolean delRel(JCheckBox checkBox){
        for(Link l : links){
            if(l.getIdLink().toString().equals(checkBox.getName())){
                links.remove(l);
                return true;
            }
        }
        return false;
    }
    
    public static void adicionarRelacionamento(){
        String tabRelacionamento = cbxTabelaRelacionamento.getSelectedItem().toString();
        String atrRelacionado = cbxAtributoRelacionado.getSelectedItem().toString();
        String tabReferenciada = cbxTabelaReferenciada.getSelectedItem().toString();
        
        if(!tabRelacionamento.equals("Selecione") &&
                !atrRelacionado.equals("Selecione") &&
                    !tabReferenciada.equals("Selecione")){
            
            Link linkRel = new Link();
            linkRel.setIdLink(idLink + 1);
            linkRel.setTarget(tabRelacionamento);
            linkRel.setForeignKey(atrRelacionado);
            linkRel.setSource(tabReferenciada);
            links.add(linkRel);
            
            atualizarListaRelacionamentos();
            jTabbedPane_Relacionamentos.setSelectedIndex(1);
        }
    }
    
    public static void atualizarListaRelacionamentos(){
        
        painelListaRelacionamentos.removeAll();
        for(Link rel : links){
            JLabel label = new JLabel();
            label.setText("Relacionamento: ");
            
            JCheckBox checkBox = new JCheckBox();
            checkBox.setName(String.valueOf(rel.getIdLink()));
            checkBox.setText(rel.getTarget() + "." + rel.getForeignKey() + " => " + rel.getSource());
            checkBox.setSelected(true);
            
            painelListaRelacionamentos.add(label);
            painelListaRelacionamentos.add(checkBox);
        }
        painelListaRelacionamentos.setLayout(new BoxLayout(painelListaRelacionamentos, BoxLayout.Y_AXIS));
        painelListaRelacionamentos.updateUI();
    }
    
    public static void ativarTabelaReferenciada(){
        //Essa condicional está declarada para evitar uma Exeption quando o comando
        //cbxAtributosRelacionado.removeAllItens(); for executado.
        if(cbxAtributoRelacionado.getModel().getSelectedItem() != null){            
            String atrRelacionado = cbxAtributoRelacionado.getSelectedItem().toString();
            if(!atrRelacionado.equals("") && !atrRelacionado.equals("Selecione")){
                cbxTabelaReferenciada.setEnabled(true);
            }
        }
    }
    
    public static void carregarAtributosRel(){
        if(!cbxTabelaRelacionamento.getSelectedItem().toString().equals("Selecione")){
            Dimensao dimUsada = new Dimensao();
            for(Dimensao d : GerenciarDimensoes.dimensoesSalvas){
                if(d.getTabela().equals(cbxTabelaRelacionamento.getSelectedItem().toString())){
                    dimUsada = d;
                }
            }
            
            cbxAtributoRelacionado.removeAllItems();
            cbxAtributoRelacionado.addItem("Selecione");
            for(String atr : dimUsada.getAtributos()){
                cbxAtributoRelacionado.addItem(atr);
            }
            cbxAtributoRelacionado.setEnabled(true);
            cbxAtributoRelacionado.updateUI();
            carregarTabelasReferenciadas();
        }
    }
    
    private static void carregarTabelasReferenciadas(){
        cbxTabelaReferenciada.removeAllItems();
        cbxTabelaReferenciada.addItem("Selecione");
        for(Dimensao d : GerenciarDimensoes.dimensoesSalvas){
            if(!d.getTabela().equals(cbxTabelaRelacionamento.getSelectedItem().toString())){
                cbxTabelaReferenciada.addItem(d.getTabela());
            }
        }
    }
    
    public static void carregarTabelasRelacionamentos(){
        for(TabelaImportada t : tabelasImportadas){
            cbxTabelaRelacionamento.addItem(t.getNomeTabela());
        }
    }    

    public static void addRelToModelMetri(){
        PercorrerAbasFormAssistenteModelagem.addRelToModelMetri();
        painelListaMetricas.updateUI();
    }
    
    public static void addRelToCuboPreview(){
        PercorrerAbasFormAssistenteModelagem.addRelToCuboPreview();
        gerarSchemaXml();
    }    
}
