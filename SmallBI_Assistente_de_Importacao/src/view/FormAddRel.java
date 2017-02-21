package view;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import model.Dimensao;
import model.Link;

public class FormAddRel extends javax.swing.JFrame {

    public FormAddRel() {
        initComponents();
//        carregarTabFato();
        carregarTab();
    }

    private void carregarTab(){
        cbx_tab_com_rel.removeAllItems();
        cbx_tab_com_rel.addItem("Selecione");
        for(Dimensao d : FormAssistenteModelagem.dimensoes){
            cbx_tab_com_rel.addItem(d.getTabela());
//            cbx_dim_com_rel.addItem(d.getNome());
        }
        cbx_tab_com_rel.updateUI();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelAbas = new javax.swing.JTabbedPane();
        painelAbaAdd = new javax.swing.JPanel();
        painelAbaAdd_AddRel = new javax.swing.JPanel();
        lbl_tab_com_rel = new javax.swing.JLabel();
        cbx_tab_com_rel = new javax.swing.JComboBox<>();
        lbl_atr_com_rel = new javax.swing.JLabel();
        cbx_atr_com_rel = new javax.swing.JComboBox<>();
        lbl_tab_referenciada = new javax.swing.JLabel();
        cbx_tab_referenciada = new javax.swing.JComboBox<>();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelAbaAdd_AddRel.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Relacionamento"));

        lbl_tab_com_rel.setText("Tabela com um relacionamento:");

        cbx_tab_com_rel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbx_tab_com_rel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tab_com_relActionPerformed(evt);
            }
        });

        lbl_atr_com_rel.setText("Atributo de relacionamento:");

        cbx_atr_com_rel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbx_atr_com_rel.setEnabled(false);
        cbx_atr_com_rel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_atr_com_relActionPerformed(evt);
            }
        });

        lbl_tab_referenciada.setText("Tabela referenciada:");

        cbx_tab_referenciada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbx_tab_referenciada.setEnabled(false);
        cbx_tab_referenciada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tab_referenciadaActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaAdd_AddRelLayout = new javax.swing.GroupLayout(painelAbaAdd_AddRel);
        painelAbaAdd_AddRel.setLayout(painelAbaAdd_AddRelLayout);
        painelAbaAdd_AddRelLayout.setHorizontalGroup(
            painelAbaAdd_AddRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaAdd_AddRelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaAdd_AddRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tab_com_rel)
                    .addComponent(lbl_atr_com_rel)
                    .addComponent(lbl_tab_referenciada))
                .addGap(18, 18, 18)
                .addGroup(painelAbaAdd_AddRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbx_tab_com_rel, 0, 227, Short.MAX_VALUE)
                    .addComponent(cbx_atr_com_rel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_tab_referenciada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaAdd_AddRelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap())
        );
        painelAbaAdd_AddRelLayout.setVerticalGroup(
            painelAbaAdd_AddRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaAdd_AddRelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaAdd_AddRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tab_com_rel)
                    .addComponent(cbx_tab_com_rel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAbaAdd_AddRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_atr_com_rel)
                    .addComponent(cbx_atr_com_rel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAbaAdd_AddRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tab_referenciada)
                    .addComponent(cbx_tab_referenciada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelAbaAdd_AddRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnSalvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelAbaAddLayout = new javax.swing.GroupLayout(painelAbaAdd);
        painelAbaAdd.setLayout(painelAbaAddLayout);
        painelAbaAddLayout.setHorizontalGroup(
            painelAbaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaAdd_AddRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAbaAddLayout.setVerticalGroup(
            painelAbaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaAdd_AddRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelAbas.addTab("Adicionar", painelAbaAdd);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void cbx_tab_com_relActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tab_com_relActionPerformed
        if(cbx_tab_com_rel.getSelectedItem() != null && !cbx_tab_com_rel.getSelectedItem().toString().equals("Selecione")){
            Dimensao tabComRel = new Dimensao();
            for(Dimensao d : FormAssistenteModelagem.dimensoes){
                if(d.getTabela().equals(cbx_tab_com_rel.getSelectedItem().toString())){
                    tabComRel = d;
                }
            }
            
            cbx_atr_com_rel.removeAllItems();
            cbx_atr_com_rel.addItem("Selecione");
            for(String atr : tabComRel.getAtributos()){
                cbx_atr_com_rel.addItem(atr);
            }
            cbx_atr_com_rel.updateUI();
            cbx_atr_com_rel.setEnabled(true);
            
            cbx_tab_referenciada.removeAllItems();
            cbx_tab_referenciada.addItem("Selecione");
            cbx_tab_referenciada.setEnabled(false);
            btnSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_cbx_tab_com_relActionPerformed

    private void cbx_atr_com_relActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_atr_com_relActionPerformed
        if(cbx_atr_com_rel.getSelectedItem() != null && !cbx_atr_com_rel.getSelectedItem().toString().equals("Selecione")){
            
            cbx_tab_referenciada.removeAllItems();
            cbx_tab_referenciada.addItem("Selecione");
            for(Dimensao d : FormAssistenteModelagem.dimensoes){
                if(!d.getTabela().equals(cbx_tab_com_rel.getSelectedItem().toString())){
                    cbx_tab_referenciada.addItem(d.getTabela());
                }
            }
            cbx_tab_referenciada.updateUI();
            cbx_tab_referenciada.setEnabled(true);
        }
    }//GEN-LAST:event_cbx_atr_com_relActionPerformed

    private void cbx_tab_referenciadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tab_referenciadaActionPerformed
        if(cbx_tab_referenciada.getSelectedItem() != null && 
                !cbx_tab_referenciada.getSelectedItem().toString().equals("Selecione")){
            
            btnSalvar.setEnabled(true);
        }
    }//GEN-LAST:event_cbx_tab_referenciadaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvarRel();
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    private void salvarRel(){
        Link link = new Link();
        link.setTarget(cbx_tab_com_rel.getSelectedItem().toString());
        link.setForeignKey(cbx_atr_com_rel.getSelectedItem().toString());
        link.setSource(cbx_tab_referenciada.getSelectedItem().toString());
        
        FormAssistenteModelagem.links.add(link);
        
        JLabel l = new JLabel();
        l.setText("Relacionamento: " + link.getTarget() + "." + link.getForeignKey() + " => " + link.getSource());
//        FormAssistenteModelagem.painel_AbaRel_ListRel.setLayout(
//                new BoxLayout(FormAssistenteModelagem.painel_AbaRel_ListRel,BoxLayout.Y_AXIS));
//        FormAssistenteModelagem.painel_AbaRel_ListRel.add(l);
//        FormAssistenteModelagem.painel_AbaRel_ListRel.updateUI();
        dispose();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAddRel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbx_atr_com_rel;
    private javax.swing.JComboBox<String> cbx_tab_com_rel;
    private javax.swing.JComboBox<String> cbx_tab_referenciada;
    private javax.swing.JLabel lbl_atr_com_rel;
    private javax.swing.JLabel lbl_tab_com_rel;
    private javax.swing.JLabel lbl_tab_referenciada;
    private javax.swing.JPanel painelAbaAdd;
    private javax.swing.JPanel painelAbaAdd_AddRel;
    private javax.swing.JTabbedPane painelAbas;
    // End of variables declaration//GEN-END:variables
}
