package view;

import view.percorrerAbas.PercorrerAbasFormGerarCuboXml;
import business.GerarScriptSql;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class FormGerarCuboXml extends javax.swing.JFrame {
    
    private JTable tabelaPivot = new JTable();
    private List<JComboBox> listaCbxTipos = new ArrayList<>();
    public static List<String> atributosParaCubo = new ArrayList<>();
    public static String schemaXml = new String();

    public FormGerarCuboXml(JTable tabelaPivot, List<JComboBox> listaCbxTipos) {
        initComponents();
        PercorrerAbasFormGerarCuboXml.DesativarAbasInicio();
        carregarCbxChavePrimaria(tabelaPivot);
        this.tabelaPivot = tabelaPivot;
        this.listaCbxTipos = listaCbxTipos;
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
        painel_AbaModelDim_AtriDim = new javax.swing.JPanel();
        painel_jtpAbaModelDim_listDims = new javax.swing.JPanel();
        btnJtpAbaModelDim_AddDim = new javax.swing.JButton();
        btnAbaModelDim_Sair = new javax.swing.JButton();
        btnAbaModelDim_Proximo = new javax.swing.JButton();
        btnAbaModelDim_Voltar = new javax.swing.JButton();
        painelAbaModelMetri = new javax.swing.JPanel();
        btnAbaModelMetri = new javax.swing.JButton();
        btnAbaModelMetri_Prox = new javax.swing.JButton();
        btnAbaModelMetri_Voltar = new javax.swing.JButton();
        painelAbaModelMetri_ModelMetri = new javax.swing.JPanel();
        btnModelMetri_AddMetri = new javax.swing.JButton();
        painelAbaModelMetri_ListMetri = new javax.swing.JPanel();
        painelAbaSalvarCubo = new javax.swing.JPanel();
        painelAbaSalvarTab = new javax.swing.JPanel();
        lblAbaSalvarCubo_NomeCubo = new javax.swing.JLabel();
        txtAbaSalvarCubo_NomeCubo = new javax.swing.JTextField();

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
                            .addComponent(cbxPainelConfTab_CamposPrimaryKey, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPainelConfTab_Sair)
                    .addComponent(btnPainelConfTab_Salvar))
                .addContainerGap(226, Short.MAX_VALUE))
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

        painel_AbaModelDim_AtriDim.setBorder(javax.swing.BorderFactory.createTitledBorder("Dimensões"));

        painel_jtpAbaModelDim_listDims.setLayout(new java.awt.GridLayout(1, 0));

        btnJtpAbaModelDim_AddDim.setText("Adicionar Dimensão");
        btnJtpAbaModelDim_AddDim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJtpAbaModelDim_AddDimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_AbaModelDim_AtriDimLayout = new javax.swing.GroupLayout(painel_AbaModelDim_AtriDim);
        painel_AbaModelDim_AtriDim.setLayout(painel_AbaModelDim_AtriDimLayout);
        painel_AbaModelDim_AtriDimLayout.setHorizontalGroup(
            painel_AbaModelDim_AtriDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_AbaModelDim_AtriDimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_AbaModelDim_AtriDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel_jtpAbaModelDim_listDims, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painel_AbaModelDim_AtriDimLayout.createSequentialGroup()
                        .addComponent(btnJtpAbaModelDim_AddDim)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painel_AbaModelDim_AtriDimLayout.setVerticalGroup(
            painel_AbaModelDim_AtriDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_AbaModelDim_AtriDimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_jtpAbaModelDim_listDims, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJtpAbaModelDim_AddDim)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        btnAbaModelDim_Sair.setText("Sair");
        btnAbaModelDim_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaModelDim_SairActionPerformed(evt);
            }
        });

        btnAbaModelDim_Proximo.setText("Próximo");
        btnAbaModelDim_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaModelDim_ProximoActionPerformed(evt);
            }
        });

        btnAbaModelDim_Voltar.setText("Voltar");
        btnAbaModelDim_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaModelDim_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paineAbaModelDimLayout = new javax.swing.GroupLayout(paineAbaModelDim);
        paineAbaModelDim.setLayout(paineAbaModelDimLayout);
        paineAbaModelDimLayout.setHorizontalGroup(
            paineAbaModelDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineAbaModelDimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paineAbaModelDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel_AbaModelDim_AtriDim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineAbaModelDimLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaModelDim_Voltar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaModelDim_Proximo)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaModelDim_Sair)))
                .addContainerGap())
        );
        paineAbaModelDimLayout.setVerticalGroup(
            paineAbaModelDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineAbaModelDimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_AbaModelDim_AtriDim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(paineAbaModelDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaModelDim_Sair)
                    .addComponent(btnAbaModelDim_Proximo)
                    .addComponent(btnAbaModelDim_Voltar))
                .addContainerGap())
        );

        jtpPainelAbas.addTab("Modelagem Dimensões", paineAbaModelDim);

        btnAbaModelMetri.setText("Sair");
        btnAbaModelMetri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaModelMetriActionPerformed(evt);
            }
        });

        btnAbaModelMetri_Prox.setText("Próximo");
        btnAbaModelMetri_Prox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaModelMetri_ProxActionPerformed(evt);
            }
        });

        btnAbaModelMetri_Voltar.setText("Voltar");
        btnAbaModelMetri_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaModelMetri_VoltarActionPerformed(evt);
            }
        });

        painelAbaModelMetri_ModelMetri.setBorder(javax.swing.BorderFactory.createTitledBorder("Métricas"));

        btnModelMetri_AddMetri.setText("Adicionar Métrica");
        btnModelMetri_AddMetri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelMetri_AddMetriActionPerformed(evt);
            }
        });

        painelAbaModelMetri_ListMetri.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout painelAbaModelMetri_ModelMetriLayout = new javax.swing.GroupLayout(painelAbaModelMetri_ModelMetri);
        painelAbaModelMetri_ModelMetri.setLayout(painelAbaModelMetri_ModelMetriLayout);
        painelAbaModelMetri_ModelMetriLayout.setHorizontalGroup(
            painelAbaModelMetri_ModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaModelMetri_ModelMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaModelMetri_ModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaModelMetri_ModelMetriLayout.createSequentialGroup()
                        .addComponent(btnModelMetri_AddMetri)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(painelAbaModelMetri_ListMetri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAbaModelMetri_ModelMetriLayout.setVerticalGroup(
            painelAbaModelMetri_ModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaModelMetri_ModelMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaModelMetri_ListMetri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModelMetri_AddMetri)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelAbaModelMetriLayout = new javax.swing.GroupLayout(painelAbaModelMetri);
        painelAbaModelMetri.setLayout(painelAbaModelMetriLayout);
        painelAbaModelMetriLayout.setHorizontalGroup(
            painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaModelMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaModelMetriLayout.createSequentialGroup()
                        .addGap(0, 385, Short.MAX_VALUE)
                        .addComponent(btnAbaModelMetri_Voltar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaModelMetri_Prox)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaModelMetri))
                    .addComponent(painelAbaModelMetri_ModelMetri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAbaModelMetriLayout.setVerticalGroup(
            painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaModelMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaModelMetri_ModelMetri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaModelMetri)
                    .addComponent(btnAbaModelMetri_Prox)
                    .addComponent(btnAbaModelMetri_Voltar))
                .addContainerGap())
        );

        jtpPainelAbas.addTab("Modelagem Métricas", painelAbaModelMetri);

        painelAbaSalvarTab.setBorder(javax.swing.BorderFactory.createTitledBorder("Salvar Cubo"));

        lblAbaSalvarCubo_NomeCubo.setText("Nome do Cubo: ");

        javax.swing.GroupLayout painelAbaSalvarTabLayout = new javax.swing.GroupLayout(painelAbaSalvarTab);
        painelAbaSalvarTab.setLayout(painelAbaSalvarTabLayout);
        painelAbaSalvarTabLayout.setHorizontalGroup(
            painelAbaSalvarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSalvarTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAbaSalvarCubo_NomeCubo)
                .addGap(18, 18, 18)
                .addComponent(txtAbaSalvarCubo_NomeCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        painelAbaSalvarTabLayout.setVerticalGroup(
            painelAbaSalvarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSalvarTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaSalvarTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbaSalvarCubo_NomeCubo)
                    .addComponent(txtAbaSalvarCubo_NomeCubo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(320, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelAbaSalvarCuboLayout = new javax.swing.GroupLayout(painelAbaSalvarCubo);
        painelAbaSalvarCubo.setLayout(painelAbaSalvarCuboLayout);
        painelAbaSalvarCuboLayout.setHorizontalGroup(
            painelAbaSalvarCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSalvarCuboLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaSalvarTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAbaSalvarCuboLayout.setVerticalGroup(
            painelAbaSalvarCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSalvarCuboLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaSalvarTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jtpPainelAbas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnAbaModelDim_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelDim_SairActionPerformed
        dispose();
    }//GEN-LAST:event_btnAbaModelDim_SairActionPerformed

    private void btnAbaModelDim_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelDim_ProximoActionPerformed
        PercorrerAbasFormGerarCuboXml.AbaModelDimToModelMetri();
    }//GEN-LAST:event_btnAbaModelDim_ProximoActionPerformed

    private void btnAbaModelDim_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelDim_VoltarActionPerformed
        PercorrerAbasFormGerarCuboXml.ModelDimToSaveTab();
    }//GEN-LAST:event_btnAbaModelDim_VoltarActionPerformed

    private void btnModelMetri_AddMetriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelMetri_AddMetriActionPerformed
        chamarFormAddMetri();
    }//GEN-LAST:event_btnModelMetri_AddMetriActionPerformed

    private void btnAbaModelMetriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetriActionPerformed
        dispose();
    }//GEN-LAST:event_btnAbaModelMetriActionPerformed

    private void btnAbaModelMetri_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetri_VoltarActionPerformed
        PercorrerAbasFormGerarCuboXml.ModelMetriToModelDim();
    }//GEN-LAST:event_btnAbaModelMetri_VoltarActionPerformed

    private void btnAbaModelMetri_ProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetri_ProxActionPerformed
        PercorrerAbasFormGerarCuboXml.ModelMetriToSaveCube();
    }//GEN-LAST:event_btnAbaModelMetri_ProxActionPerformed

    private void chamarFormAddMetri(){
        FormAddMetrica frm = new FormAddMetrica(atributosParaCubo);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        frm.setTitle("Adicionar Nova Métrica");
        frm.setVisible(true);
    }
    
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
                PercorrerAbasFormGerarCuboXml.SaveTabToModelDim();
            }else{
                JOptionPane.showMessageDialog(null, "Selecione uma chave para a tabela!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Dê um nome para a tabela!");
        }
    }
        
    private void carregarCbxChavePrimaria(JTable tabelaPivot){
        for(int coluna = 0; coluna < tabelaPivot.getColumnCount(); coluna++){
            cbxPainelConfTab_CamposPrimaryKey.addItem(tabelaPivot.getColumnName(coluna));
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGerarCuboXml(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbaModelDim_Proximo;
    private javax.swing.JButton btnAbaModelDim_Sair;
    private javax.swing.JButton btnAbaModelDim_Voltar;
    private javax.swing.JButton btnAbaModelMetri;
    private javax.swing.JButton btnAbaModelMetri_Prox;
    private javax.swing.JButton btnAbaModelMetri_Voltar;
    private javax.swing.JButton btnJtpAbaModelDim_AddDim;
    private javax.swing.JButton btnModelMetri_AddMetri;
    private javax.swing.JButton btnPainelConfTab_Sair;
    private javax.swing.JButton btnPainelConfTab_Salvar;
    private javax.swing.JComboBox cbxPainelConfTab_CamposPrimaryKey;
    private javax.swing.JLabel cbxPainelConfTab_lblNomeTab;
    private javax.swing.JLabel cbxPainelConfTab_lblPrimaryKey;
    public static javax.swing.JTabbedPane jtpPainelAbas;
    private javax.swing.JLabel lblAbaSalvarCubo_NomeCubo;
    private javax.swing.JPanel paineAbaModelDim;
    private javax.swing.JPanel painelAbaModelMetri;
    public static javax.swing.JPanel painelAbaModelMetri_ListMetri;
    public static javax.swing.JPanel painelAbaModelMetri_ModelMetri;
    private javax.swing.JPanel painelAbaSalvarCubo;
    private javax.swing.JPanel painelAbaSalvarSqlTabelaPivot;
    private javax.swing.JPanel painelAbaSalvarTab;
    private javax.swing.JPanel painelAbaSaveSqlTabPivot_ConfTab;
    private javax.swing.JPanel painel_AbaModelDim_AtriDim;
    public static javax.swing.JPanel painel_jtpAbaModelDim_listDims;
    private javax.swing.JTextField txtAbaSalvarCubo_NomeCubo;
    private javax.swing.JTextField txtPainelConfTab_txtNomeTab;
    // End of variables declaration//GEN-END:variables
}
