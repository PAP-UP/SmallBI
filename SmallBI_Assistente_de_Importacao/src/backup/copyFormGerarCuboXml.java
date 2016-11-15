package backup;

import view.FormAddDimensao;
import business.GerarScriptSql;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class copyFormGerarCuboXml extends javax.swing.JFrame {
    
    private JTable tabelaPivot = new JTable();
    private List<JComboBox> listaCbxTipos = new ArrayList<>();

    public copyFormGerarCuboXml(JTable tbl, List<JComboBox> listaCbxTiposParametro) {
        initComponents();
        carregarCbxChavePrimaria(tbl);
        tabelaPivot = tbl;
        listaCbxTipos = listaCbxTiposParametro;
        txtPainelConfTab_txtNomeTab.setText("MinhaTabelaFato");  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpPainelAbas = new javax.swing.JTabbedPane();
        painelAbaSalvarSqlTabelaPivot = new javax.swing.JPanel();
        painelAbaSaveSqlTabPivot_ConfTab = new javax.swing.JPanel();
        cbxPainelConfTab_lblPrimaryKey = new javax.swing.JLabel();
        cbxPainelConfTab_CamposPrimaryKey = new javax.swing.JComboBox();
        txtPainelConfTab_txtNomeTab = new javax.swing.JTextField();
        cbxPainelConfTab_lblNomeTab = new javax.swing.JLabel();
        btnPainelConfTab_Salvar = new javax.swing.JButton();
        btnPainelConfTab_Sair = new javax.swing.JButton();
        paineAbaModelDim = new javax.swing.JPanel();
        jtp_AbaModelDim_ModelDim = new javax.swing.JTabbedPane();
        painel_JtpAbaModelDim_ConfDim = new javax.swing.JPanel();
        painel_jtpAbaModelDim_AtriDim = new javax.swing.JPanel();
        painel_jtpAbaModelDim_listDims = new javax.swing.JPanel();
        btnJtpAbaModelDim_AddDim = new javax.swing.JButton();
        painelAbaModelMetri = new javax.swing.JPanel();
        panelAbaModelMetri_ModelMetri = new javax.swing.JPanel();
        painelAbaSalvarCubo = new javax.swing.JPanel();
        painelAbaSalvarCubo_RevCubo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelAbaSaveSqlTabPivot_ConfTab.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurações da Tabela"));

        cbxPainelConfTab_lblPrimaryKey.setText("Chave Primária:");

        cbxPainelConfTab_CamposPrimaryKey.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));

        cbxPainelConfTab_lblNomeTab.setText("Nome da Tabela:");

        btnPainelConfTab_Salvar.setText("Salvar");
        btnPainelConfTab_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelConfTab_SalvarActionPerformed(evt);
            }
        });

        btnPainelConfTab_Sair.setText("Sair");
        btnPainelConfTab_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelConfTab_SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaSaveSqlTabPivot_ConfTabLayout = new javax.swing.GroupLayout(painelAbaSaveSqlTabPivot_ConfTab);
        painelAbaSaveSqlTabPivot_ConfTab.setLayout(painelAbaSaveSqlTabPivot_ConfTabLayout);
        painelAbaSaveSqlTabPivot_ConfTabLayout.setHorizontalGroup(
            painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createSequentialGroup()
                        .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxPainelConfTab_lblNomeTab)
                            .addComponent(cbxPainelConfTab_lblPrimaryKey))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPainelConfTab_txtNomeTab)
                            .addComponent(cbxPainelConfTab_CamposPrimaryKey, 0, 425, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaSaveSqlTabPivot_ConfTabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPainelConfTab_Salvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnPainelConfTab_Sair)))
                .addContainerGap())
        );
        painelAbaSaveSqlTabPivot_ConfTabLayout.setVerticalGroup(
            painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPainelConfTab_lblNomeTab)
                    .addComponent(txtPainelConfTab_txtNomeTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPainelConfTab_lblPrimaryKey)
                    .addComponent(cbxPainelConfTab_CamposPrimaryKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPainelConfTab_Sair)
                    .addComponent(btnPainelConfTab_Salvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelAbaSalvarSqlTabelaPivotLayout = new javax.swing.GroupLayout(painelAbaSalvarSqlTabelaPivot);
        painelAbaSalvarSqlTabelaPivot.setLayout(painelAbaSalvarSqlTabelaPivotLayout);
        painelAbaSalvarSqlTabelaPivotLayout.setHorizontalGroup(
            painelAbaSalvarSqlTabelaPivotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSalvarSqlTabelaPivotLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaSaveSqlTabPivot_ConfTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAbaSalvarSqlTabelaPivotLayout.setVerticalGroup(
            painelAbaSalvarSqlTabelaPivotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSalvarSqlTabelaPivotLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaSaveSqlTabPivot_ConfTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpPainelAbas.addTab("Salvar Tabela Pivot", painelAbaSalvarSqlTabelaPivot);

        javax.swing.GroupLayout painel_JtpAbaModelDim_ConfDimLayout = new javax.swing.GroupLayout(painel_JtpAbaModelDim_ConfDim);
        painel_JtpAbaModelDim_ConfDim.setLayout(painel_JtpAbaModelDim_ConfDimLayout);
        painel_JtpAbaModelDim_ConfDimLayout.setHorizontalGroup(
            painel_JtpAbaModelDim_ConfDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );
        painel_JtpAbaModelDim_ConfDimLayout.setVerticalGroup(
            painel_JtpAbaModelDim_ConfDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jtp_AbaModelDim_ModelDim.addTab("Configurar Dimensão", painel_JtpAbaModelDim_ConfDim);

        painel_jtpAbaModelDim_AtriDim.setBorder(javax.swing.BorderFactory.createTitledBorder("Dimensões"));

        painel_jtpAbaModelDim_listDims.setLayout(new java.awt.GridLayout(1, 0));

        btnJtpAbaModelDim_AddDim.setText("Adicionar Dimensão");
        btnJtpAbaModelDim_AddDim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJtpAbaModelDim_AddDimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_jtpAbaModelDim_AtriDimLayout = new javax.swing.GroupLayout(painel_jtpAbaModelDim_AtriDim);
        painel_jtpAbaModelDim_AtriDim.setLayout(painel_jtpAbaModelDim_AtriDimLayout);
        painel_jtpAbaModelDim_AtriDimLayout.setHorizontalGroup(
            painel_jtpAbaModelDim_AtriDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_jtpAbaModelDim_AtriDimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_jtpAbaModelDim_AtriDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel_jtpAbaModelDim_listDims, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painel_jtpAbaModelDim_AtriDimLayout.createSequentialGroup()
                        .addComponent(btnJtpAbaModelDim_AddDim)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painel_jtpAbaModelDim_AtriDimLayout.setVerticalGroup(
            painel_jtpAbaModelDim_AtriDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_jtpAbaModelDim_AtriDimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_jtpAbaModelDim_listDims, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJtpAbaModelDim_AddDim)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paineAbaModelDimLayout = new javax.swing.GroupLayout(paineAbaModelDim);
        paineAbaModelDim.setLayout(paineAbaModelDimLayout);
        paineAbaModelDimLayout.setHorizontalGroup(
            paineAbaModelDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineAbaModelDimLayout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addComponent(jtp_AbaModelDim_ModelDim, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(paineAbaModelDimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_jtpAbaModelDim_AtriDim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paineAbaModelDimLayout.setVerticalGroup(
            paineAbaModelDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineAbaModelDimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_jtpAbaModelDim_AtriDim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jtp_AbaModelDim_ModelDim, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtpPainelAbas.addTab("Modelagem Dimensões", paineAbaModelDim);

        panelAbaModelMetri_ModelMetri.setBorder(javax.swing.BorderFactory.createTitledBorder("Modelar Métricas"));

        javax.swing.GroupLayout panelAbaModelMetri_ModelMetriLayout = new javax.swing.GroupLayout(panelAbaModelMetri_ModelMetri);
        panelAbaModelMetri_ModelMetri.setLayout(panelAbaModelMetri_ModelMetriLayout);
        panelAbaModelMetri_ModelMetriLayout.setHorizontalGroup(
            panelAbaModelMetri_ModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        panelAbaModelMetri_ModelMetriLayout.setVerticalGroup(
            panelAbaModelMetri_ModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelAbaModelMetriLayout = new javax.swing.GroupLayout(painelAbaModelMetri);
        painelAbaModelMetri.setLayout(painelAbaModelMetriLayout);
        painelAbaModelMetriLayout.setHorizontalGroup(
            painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaModelMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAbaModelMetri_ModelMetri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAbaModelMetriLayout.setVerticalGroup(
            painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaModelMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAbaModelMetri_ModelMetri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpPainelAbas.addTab("Modelagem Métricas", painelAbaModelMetri);

        painelAbaSalvarCubo_RevCubo.setBorder(javax.swing.BorderFactory.createTitledBorder("Revisão do Cubo"));

        javax.swing.GroupLayout painelAbaSalvarCubo_RevCuboLayout = new javax.swing.GroupLayout(painelAbaSalvarCubo_RevCubo);
        painelAbaSalvarCubo_RevCubo.setLayout(painelAbaSalvarCubo_RevCuboLayout);
        painelAbaSalvarCubo_RevCuboLayout.setHorizontalGroup(
            painelAbaSalvarCubo_RevCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        painelAbaSalvarCubo_RevCuboLayout.setVerticalGroup(
            painelAbaSalvarCubo_RevCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelAbaSalvarCuboLayout = new javax.swing.GroupLayout(painelAbaSalvarCubo);
        painelAbaSalvarCubo.setLayout(painelAbaSalvarCuboLayout);
        painelAbaSalvarCuboLayout.setHorizontalGroup(
            painelAbaSalvarCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSalvarCuboLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaSalvarCubo_RevCubo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAbaSalvarCuboLayout.setVerticalGroup(
            painelAbaSalvarCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSalvarCuboLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaSalvarCubo_RevCubo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpPainelAbas.addTab("Salvar Cubo", painelAbaSalvarCubo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpPainelAbas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpPainelAbas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPainelConfTab_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelConfTab_SairActionPerformed
        dispose();
    }//GEN-LAST:event_btnPainelConfTab_SairActionPerformed

    private void btnPainelConfTab_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelConfTab_SalvarActionPerformed
        salvarTabela();
    }//GEN-LAST:event_btnPainelConfTab_SalvarActionPerformed

    private void btnJtpAbaModelDim_AddDimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJtpAbaModelDim_AddDimActionPerformed
        chamarFormAddDim();
    }//GEN-LAST:event_btnJtpAbaModelDim_AddDimActionPerformed

    private void chamarFormAddDim(){      
        FormAddDimensao frm = new FormAddDimensao(tabelaPivot, txtPainelConfTab_txtNomeTab.getText());
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        frm.setTitle("Adicionar Nova Dimensão");
        frm.setVisible(true);
    }
    
    private void salvarTabela(){
        String nomeTabela = txtPainelConfTab_txtNomeTab.getText();        
        String chavePrimaria = cbxPainelConfTab_CamposPrimaryKey.getSelectedItem().toString();
        if(nomeTabela != null && nomeTabela != ""){
            if(chavePrimaria != "Selecione"){
                JOptionPane.showMessageDialog(null, new GerarScriptSql().salvarTabelaPivot(tabelaPivot, 
                        nomeTabela, chavePrimaria, listaCbxTipos));
                System.out.println("Script SQL gerado: " + GerarScriptSql.scriptSqlTabelaPivot);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione uma chave para a tabela!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Dê um nome para a tabela!");
        }
    }
    
    private void carregarCbxChavePrimaria(JTable tbl){
        for(int coluna = 0; coluna < tbl.getColumnCount(); coluna++){
            cbxPainelConfTab_CamposPrimaryKey.addItem(tbl.getColumnName(coluna));
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new copyFormGerarCuboXml(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJtpAbaModelDim_AddDim;
    private javax.swing.JButton btnPainelConfTab_Sair;
    private javax.swing.JButton btnPainelConfTab_Salvar;
    private javax.swing.JComboBox cbxPainelConfTab_CamposPrimaryKey;
    private javax.swing.JLabel cbxPainelConfTab_lblNomeTab;
    private javax.swing.JLabel cbxPainelConfTab_lblPrimaryKey;
    private javax.swing.JTabbedPane jtpPainelAbas;
    private javax.swing.JTabbedPane jtp_AbaModelDim_ModelDim;
    private javax.swing.JPanel paineAbaModelDim;
    private javax.swing.JPanel painelAbaModelMetri;
    private javax.swing.JPanel painelAbaSalvarCubo;
    private javax.swing.JPanel painelAbaSalvarCubo_RevCubo;
    private javax.swing.JPanel painelAbaSalvarSqlTabelaPivot;
    private javax.swing.JPanel painelAbaSaveSqlTabPivot_ConfTab;
    private javax.swing.JPanel painel_JtpAbaModelDim_ConfDim;
    private javax.swing.JPanel painel_jtpAbaModelDim_AtriDim;
    public static javax.swing.JPanel painel_jtpAbaModelDim_listDims;
    private javax.swing.JPanel panelAbaModelMetri_ModelMetri;
    private javax.swing.JTextField txtPainelConfTab_txtNomeTab;
    // End of variables declaration//GEN-END:variables
}
