package view;

import model.Dimensao;
import model.TabelaFato;

public class FormAddRel extends javax.swing.JFrame {

    public FormAddRel() {
        initComponents();
//        carregarTabFato();
        carregarDim();
    }

    private void carregarDim(){
        cbx_dim_com_rel.removeAllItems();
        cbx_dim_com_rel.addItem("Selecione");
        for(Dimensao d : FormGerarCuboXml.dimensoes){
            cbx_dim_com_rel.addItem(d.getNome());
        }
        cbx_dim_com_rel.updateUI();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelAbas = new javax.swing.JTabbedPane();
        painelAbaAdd = new javax.swing.JPanel();
        painelAbaAdd_AddRel = new javax.swing.JPanel();
        lbl_dim_com_rel = new javax.swing.JLabel();
        cbx_dim_com_rel = new javax.swing.JComboBox<>();
        lbl_atr_com_rel = new javax.swing.JLabel();
        cbx_atr_com_rel = new javax.swing.JComboBox<>();
        lbl_dim_relacionada = new javax.swing.JLabel();
        cbx_dim_relacionada = new javax.swing.JComboBox<>();
        lbl_atr_relacionado = new javax.swing.JLabel();
        cbx_atr_relacionado = new javax.swing.JComboBox<>();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelAbaAdd_AddRel.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Relacionamento"));

        lbl_dim_com_rel.setText("Dimensão com um relacionamento:");

        cbx_dim_com_rel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbx_dim_com_rel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_dim_com_relActionPerformed(evt);
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

        lbl_dim_relacionada.setText("Dimensão referenciada:");

        cbx_dim_relacionada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbx_dim_relacionada.setEnabled(false);
        cbx_dim_relacionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_dim_relacionadaActionPerformed(evt);
            }
        });

        lbl_atr_relacionado.setText("Atributo referenciado:");

        cbx_atr_relacionado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbx_atr_relacionado.setEnabled(false);
        cbx_atr_relacionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_atr_relacionadoActionPerformed(evt);
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
                    .addComponent(lbl_dim_com_rel)
                    .addComponent(lbl_atr_com_rel)
                    .addComponent(lbl_dim_relacionada)
                    .addComponent(lbl_atr_relacionado))
                .addGap(18, 18, 18)
                .addGroup(painelAbaAdd_AddRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbx_dim_com_rel, 0, 227, Short.MAX_VALUE)
                    .addComponent(cbx_atr_com_rel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_dim_relacionada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_atr_relacionado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(lbl_dim_com_rel)
                    .addComponent(cbx_dim_com_rel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAbaAdd_AddRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_atr_com_rel)
                    .addComponent(cbx_atr_com_rel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAbaAdd_AddRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dim_relacionada)
                    .addComponent(cbx_dim_relacionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAbaAdd_AddRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_atr_relacionado)
                    .addComponent(cbx_atr_relacionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
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

    private void cbx_dim_com_relActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_dim_com_relActionPerformed
        if(cbx_dim_com_rel.getSelectedItem() != null && !cbx_dim_com_rel.getSelectedItem().toString().equals("Selecione")){
            Dimensao dimComRel = new Dimensao();
            for(Dimensao d : FormGerarCuboXml.dimensoes){
                if(d.getNome().equals(cbx_dim_com_rel.getSelectedItem().toString())){
                    dimComRel = d;
                }
            }
            
            cbx_atr_com_rel.removeAllItems();
            cbx_atr_com_rel.addItem("Selecione");
            for(String atr : dimComRel.getAtributos()){
                cbx_atr_com_rel.addItem(atr);
            }
            cbx_atr_com_rel.updateUI();
            cbx_atr_com_rel.setEnabled(true);
            
            cbx_dim_relacionada.removeAllItems();
            cbx_dim_relacionada.addItem("Selecione");
            cbx_dim_relacionada.setEnabled(false);
            cbx_atr_relacionado.removeAllItems();
            cbx_atr_relacionado.addItem("Selecione");
            cbx_atr_relacionado.setEnabled(false);
            btnSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_cbx_dim_com_relActionPerformed

    private void cbx_atr_com_relActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_atr_com_relActionPerformed
        if(cbx_atr_com_rel.getSelectedItem() != null && !cbx_atr_com_rel.getSelectedItem().toString().equals("Selecione")){
            
            cbx_dim_relacionada.removeAllItems();
            cbx_dim_relacionada.addItem("Selecione");
            for(Dimensao d : FormGerarCuboXml.dimensoes){
                if(!d.getNome().equals(cbx_dim_com_rel.getSelectedItem().toString())){
                    cbx_dim_relacionada.addItem(d.getNome());
                }
            }
            cbx_dim_relacionada.updateUI();
            cbx_dim_relacionada.setEnabled(true);
        }
    }//GEN-LAST:event_cbx_atr_com_relActionPerformed

    private void cbx_dim_relacionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_dim_relacionadaActionPerformed
        if(cbx_dim_relacionada.getSelectedItem() != null && 
                !cbx_dim_relacionada.getSelectedItem().toString().equals("Selecione")){
            
            Dimensao dimRelacionada = new Dimensao();
            for(Dimensao d : FormGerarCuboXml.dimensoes){
                if(d.getNome().equals(cbx_dim_relacionada.getSelectedItem().toString())){
                    dimRelacionada = d;
                }
            }
            
            cbx_atr_relacionado.removeAllItems();
            cbx_atr_relacionado.addItem("Selecione");
            for(String atr : dimRelacionada.getAtributos()){
                cbx_atr_relacionado.addItem(atr);
            }
            cbx_atr_relacionado.updateUI();
            cbx_atr_relacionado.setEnabled(true);
            btnSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_cbx_dim_relacionadaActionPerformed

    private void cbx_atr_relacionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_atr_relacionadoActionPerformed
        if(cbx_atr_relacionado.getSelectedItem() != null && 
                !cbx_atr_relacionado.getSelectedItem().toString().equals("Selecione")){
            
            btnSalvar.setEnabled(true);
        }
    }//GEN-LAST:event_cbx_atr_relacionadoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvarRel();
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    private void salvarRel(){
        
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
    private javax.swing.JComboBox<String> cbx_atr_relacionado;
    private javax.swing.JComboBox<String> cbx_dim_com_rel;
    private javax.swing.JComboBox<String> cbx_dim_relacionada;
    private javax.swing.JLabel lbl_atr_com_rel;
    private javax.swing.JLabel lbl_atr_relacionado;
    private javax.swing.JLabel lbl_dim_com_rel;
    private javax.swing.JLabel lbl_dim_relacionada;
    private javax.swing.JPanel painelAbaAdd;
    private javax.swing.JPanel painelAbaAdd_AddRel;
    private javax.swing.JTabbedPane painelAbas;
    // End of variables declaration//GEN-END:variables
}
