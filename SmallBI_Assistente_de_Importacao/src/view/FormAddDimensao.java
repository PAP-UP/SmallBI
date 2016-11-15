package view;

import view.percorrerAbas.PercorrerAbasAddDimensao;
import java.util.List;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import model.Dimensao;

public class FormAddDimensao extends javax.swing.JFrame {

    private JTable tabelaPivot = new JTable();
    private String nomeTabelaPivot = new String();
    private List<JCheckBox> listaDeCheckBox = new ArrayList<>();
    public static List<String> atributosDoCubo = new ArrayList<>();
    
    public FormAddDimensao(JTable tabelaPivot, String nomeTabelaPivot) {
        initComponents();
        this.tabelaPivot = tabelaPivot;     
        this.nomeTabelaPivot = nomeTabelaPivot;
        carregarCheckBoxesAtr();
        PercorrerAbasAddDimensao.desativarAbasInicio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConfDim = new javax.swing.JPanel();
        painelAbas = new javax.swing.JTabbedPane();
        painelAba_Atributos = new javax.swing.JPanel();
        scroolPaneAbaAtri_Atributos = new javax.swing.JScrollPane();
        jPanelAtributos = new javax.swing.JPanel();
        btnAbaAtributos_Proximo = new javax.swing.JButton();
        btnAbaAtributos_Sair = new javax.swing.JButton();
        painelAba_NomeChave = new javax.swing.JPanel();
        painelAbaNomeChave_NomeChave = new javax.swing.JPanel();
        lblAbaNomeChave_NomeDim = new javax.swing.JLabel();
        txtAbaNomeChave_NomeDim = new javax.swing.JTextField();
        lblAbaNomeChave_Chave = new javax.swing.JLabel();
        btnAbaNomeChave_Salvar = new javax.swing.JButton();
        btnAbaNomeChave_Sair = new javax.swing.JButton();
        cbxAbaNomeChave_PKs = new javax.swing.JComboBox<>();
        btnAbaNomeChave_Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelConfDim.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurar Nova Dimensão"));

        painelAba_Atributos.setBorder(javax.swing.BorderFactory.createTitledBorder("Atributos"));

        scroolPaneAbaAtri_Atributos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanelAtributos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanelAtributosLayout = new javax.swing.GroupLayout(jPanelAtributos);
        jPanelAtributos.setLayout(jPanelAtributosLayout);
        jPanelAtributosLayout.setHorizontalGroup(
            jPanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );
        jPanelAtributosLayout.setVerticalGroup(
            jPanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        scroolPaneAbaAtri_Atributos.setViewportView(jPanelAtributos);

        btnAbaAtributos_Proximo.setText("Próximo");
        btnAbaAtributos_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaAtributos_ProximoActionPerformed(evt);
            }
        });

        btnAbaAtributos_Sair.setText("Sair");
        btnAbaAtributos_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaAtributos_SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAba_AtributosLayout = new javax.swing.GroupLayout(painelAba_Atributos);
        painelAba_Atributos.setLayout(painelAba_AtributosLayout);
        painelAba_AtributosLayout.setHorizontalGroup(
            painelAba_AtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAba_AtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAba_AtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroolPaneAbaAtri_Atributos, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAba_AtributosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaAtributos_Proximo)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaAtributos_Sair)))
                .addContainerGap())
        );
        painelAba_AtributosLayout.setVerticalGroup(
            painelAba_AtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAba_AtributosLayout.createSequentialGroup()
                .addComponent(scroolPaneAbaAtri_Atributos, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAba_AtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaAtributos_Proximo)
                    .addComponent(btnAbaAtributos_Sair))
                .addContainerGap())
        );

        painelAbas.addTab("Atributos", painelAba_Atributos);

        painelAbaNomeChave_NomeChave.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome e Chave da Dimensão"));

        lblAbaNomeChave_NomeDim.setText("Nome da Dimensão: ");

        lblAbaNomeChave_Chave.setText("Chave Primária: ");

        btnAbaNomeChave_Salvar.setText("Salvar");
        btnAbaNomeChave_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaNomeChave_SalvarActionPerformed(evt);
            }
        });

        btnAbaNomeChave_Sair.setText("Sair");
        btnAbaNomeChave_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaNomeChave_SairActionPerformed(evt);
            }
        });

        cbxAbaNomeChave_PKs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAbaNomeChave_Voltar.setText("Voltar");
        btnAbaNomeChave_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaNomeChave_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaNomeChave_NomeChaveLayout = new javax.swing.GroupLayout(painelAbaNomeChave_NomeChave);
        painelAbaNomeChave_NomeChave.setLayout(painelAbaNomeChave_NomeChaveLayout);
        painelAbaNomeChave_NomeChaveLayout.setHorizontalGroup(
            painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaNomeChave_NomeChaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaNomeChave_NomeChaveLayout.createSequentialGroup()
                        .addGroup(painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAbaNomeChave_NomeDim)
                            .addComponent(lblAbaNomeChave_Chave))
                        .addGap(18, 18, 18)
                        .addGroup(painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAbaNomeChave_NomeDim)
                            .addComponent(cbxAbaNomeChave_PKs, 0, 244, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaNomeChave_NomeChaveLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaNomeChave_Voltar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaNomeChave_Salvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaNomeChave_Sair)))
                .addContainerGap())
        );
        painelAbaNomeChave_NomeChaveLayout.setVerticalGroup(
            painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaNomeChave_NomeChaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbaNomeChave_NomeDim)
                    .addComponent(txtAbaNomeChave_NomeDim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbaNomeChave_Chave)
                    .addComponent(cbxAbaNomeChave_PKs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaNomeChave_Sair)
                    .addComponent(btnAbaNomeChave_Salvar)
                    .addComponent(btnAbaNomeChave_Voltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelAba_NomeChaveLayout = new javax.swing.GroupLayout(painelAba_NomeChave);
        painelAba_NomeChave.setLayout(painelAba_NomeChaveLayout);
        painelAba_NomeChaveLayout.setHorizontalGroup(
            painelAba_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAba_NomeChaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaNomeChave_NomeChave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAba_NomeChaveLayout.setVerticalGroup(
            painelAba_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAba_NomeChaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaNomeChave_NomeChave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelAbas.addTab("Nome e Chave", painelAba_NomeChave);

        javax.swing.GroupLayout painelConfDimLayout = new javax.swing.GroupLayout(painelConfDim);
        painelConfDim.setLayout(painelConfDimLayout);
        painelConfDimLayout.setHorizontalGroup(
            painelConfDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfDimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbas)
                .addContainerGap())
        );
        painelConfDimLayout.setVerticalGroup(
            painelConfDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfDimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbas)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConfDim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConfDim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbaNomeChave_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaNomeChave_SairActionPerformed
        dispose();
    }//GEN-LAST:event_btnAbaNomeChave_SairActionPerformed

    private void btnAbaNomeChave_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaNomeChave_SalvarActionPerformed
        salvarDimensao();
    }//GEN-LAST:event_btnAbaNomeChave_SalvarActionPerformed

    private void btnAbaAtributos_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaAtributos_ProximoActionPerformed
        PercorrerAbasAddDimensao.atributosToNomeChave();
        carregarCbxPrimaryKey();
    }//GEN-LAST:event_btnAbaAtributos_ProximoActionPerformed

    private void btnAbaNomeChave_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaNomeChave_VoltarActionPerformed
        PercorrerAbasAddDimensao.nomeChaveToAtributos();
    }//GEN-LAST:event_btnAbaNomeChave_VoltarActionPerformed

    private void btnAbaAtributos_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaAtributos_SairActionPerformed
        dispose();
    }//GEN-LAST:event_btnAbaAtributos_SairActionPerformed
    
    private void salvarDimensao(){
        Dimensao d = new Dimensao();
        d.setNome(txtAbaNomeChave_NomeDim.getText());
        d.setTabela(nomeTabelaPivot);
        d.setKey(cbxAbaNomeChave_PKs.getSelectedItem().toString());
        d.setAtributos(atributosDoCubo);    
        FormGerarCuboXml.dimensoes.add(d);
        
        JLabel l = new JLabel();
        l.setText("Dimensão: " + d.getNome() + ", Tabela: " + d.getTabela() + ", Chave: " + d.getKey() + ";");
        FormGerarCuboXml.painel_jtpAbaModelDim_listDims.setLayout(
            new BoxLayout(FormGerarCuboXml.painel_jtpAbaModelDim_listDims,BoxLayout.Y_AXIS));
        FormGerarCuboXml.painel_jtpAbaModelDim_listDims.add(l);
        FormGerarCuboXml.painel_jtpAbaModelDim_listDims.updateUI();        
        dispose();
    }
        
    private void carregarCbxPrimaryKey(){
        cbxAbaNomeChave_PKs.removeAllItems();
        for(JCheckBox checkBox : listaDeCheckBox){
            if(checkBox.isSelected()){
                cbxAbaNomeChave_PKs.addItem(checkBox.getText());
                salvarAtributosUtilizados(checkBox.getText());
            }
        }
        cbxAbaNomeChave_PKs.updateUI();
        PercorrerAbasAddDimensao.abaAtriToAbaNomeChave();
    }
    
    private void salvarAtributosUtilizados(String atributo){        
        boolean existeNaLista = false;
        for(int i = 0; i < atributosDoCubo.size(); i++){
            if(atributosDoCubo.get(i).equals(atributo)){
                existeNaLista = true;
            }
        }        
        if(existeNaLista == false){
            atributosDoCubo.add(atributo);
        }else{
            //atributosDoCubo.remove(atributo);
        }
    }
    
    private void carregarCheckBoxesAtr(){
        jPanelAtributos.setLayout(new BoxLayout(jPanelAtributos, BoxLayout.Y_AXIS));
        for(int i = 0; i < tabelaPivot.getColumnCount(); i++){
            JCheckBox checkBox = new JCheckBox();
            checkBox.setText(tabelaPivot.getColumnName(i));
            checkBox.setVisible(true);
            listaDeCheckBox.add(checkBox);
            jPanelAtributos.add(checkBox);
        }
        jPanelAtributos.updateUI();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAddDimensao(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbaAtributos_Proximo;
    private javax.swing.JButton btnAbaAtributos_Sair;
    private javax.swing.JButton btnAbaNomeChave_Sair;
    private javax.swing.JButton btnAbaNomeChave_Salvar;
    private javax.swing.JButton btnAbaNomeChave_Voltar;
    private javax.swing.JComboBox<String> cbxAbaNomeChave_PKs;
    private javax.swing.JPanel jPanelAtributos;
    private javax.swing.JLabel lblAbaNomeChave_Chave;
    private javax.swing.JLabel lblAbaNomeChave_NomeDim;
    private javax.swing.JPanel painelAbaNomeChave_NomeChave;
    private javax.swing.JPanel painelAba_Atributos;
    private javax.swing.JPanel painelAba_NomeChave;
    public static javax.swing.JTabbedPane painelAbas;
    private javax.swing.JPanel painelConfDim;
    private javax.swing.JScrollPane scroolPaneAbaAtri_Atributos;
    private javax.swing.JTextField txtAbaNomeChave_NomeDim;
    // End of variables declaration//GEN-END:variables
}
