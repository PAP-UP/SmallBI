package view;

import business.GerarSchema;
import view.percorrerAbas.PercorrerAbasFormGerarCuboXml;
import business.GerarScriptSql;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Dimensao;
import model.Metrica;
import model.Schema;
import xmleditorkit.XMLEditorKit;

public class FormGerarCuboXml extends javax.swing.JFrame {
    
    private JTable tabelaPivot = new JTable();
    private List<JComboBox> listaCbxTipos = new ArrayList<>();
    public static List<Dimensao> dimensoes = new ArrayList<>();
    public static List<Metrica> metricas = new ArrayList<>();

    public FormGerarCuboXml(JTable tabelaPivot, List<JComboBox> listaCbxTipos) {
        initComponents();
        PercorrerAbasFormGerarCuboXml.desativarAbasInicio();
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
        paineAbaNomeCubo = new javax.swing.JPanel();
        painelAbaNomeCubo_NomeCubo = new javax.swing.JPanel();
        lblAbaNomeCubo_Nomecubo = new javax.swing.JLabel();
        txtAbaNomeCubo_NomeCubo = new javax.swing.JTextField();
        btnAbaNomeCubo_Proximo = new javax.swing.JButton();
        btnAbaNomeCubo_Anterior = new javax.swing.JButton();
        paineAbaModelDim = new javax.swing.JPanel();
        painel_AbaModelDim_AtriDim = new javax.swing.JPanel();
        painel_jtpAbaModelDim_listDims = new javax.swing.JPanel();
        btnJtpAbaModelDim_AddDim = new javax.swing.JButton();
        btnAbaModelDim_Voltar = new javax.swing.JButton();
        btnAbaModelDim_Proximo = new javax.swing.JButton();
        btnAbaModelDim_Sair = new javax.swing.JButton();
        painelAbaModelMetri = new javax.swing.JPanel();
        painelAbaModelMetri_ModelMetri = new javax.swing.JPanel();
        btnModelMetri_AddMetri = new javax.swing.JButton();
        painelAbaModelMetri_ListMetri = new javax.swing.JPanel();
        btnAbaModelMetri_Voltar = new javax.swing.JButton();
        btnAbaModelMetri_Prox = new javax.swing.JButton();
        btnAbaModelMetri = new javax.swing.JButton();
        painelAbaCuboPreview = new javax.swing.JPanel();
        painelAbaCuboPreview_Preview = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtPaneAbaCuboPreview_XmlPreview = new javax.swing.JEditorPane();
        btnAbaCuboPreview_Sair = new javax.swing.JButton();
        btnAbaCuboPreview_EnviarCubo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelAbaSaveSqlTabPivot_ConfTab.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurações da Tabela"));

        cbxPainelConfTab_lblPrimaryKey.setText("Chave Primária:");

        cbxPainelConfTab_CamposPrimaryKey.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));

        cbxPainelConfTab_lblNomeTab.setText("Nome da Tabela:");

        javax.swing.GroupLayout painelAbaSaveSqlTabPivot_ConfTabLayout = new javax.swing.GroupLayout(painelAbaSaveSqlTabPivot_ConfTab);
        painelAbaSaveSqlTabPivot_ConfTab.setLayout(painelAbaSaveSqlTabPivot_ConfTabLayout);
        painelAbaSaveSqlTabPivot_ConfTabLayout.setHorizontalGroup(
            painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxPainelConfTab_lblNomeTab)
                    .addComponent(cbxPainelConfTab_lblPrimaryKey))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPainelConfTab_txtNomeTab)
                    .addComponent(cbxPainelConfTab_CamposPrimaryKey, 0, 540, Short.MAX_VALUE))
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
                .addContainerGap(225, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout painelAbaSalvarSqlTabelaPivotLayout = new javax.swing.GroupLayout(painelAbaSalvarSqlTabelaPivot);
        painelAbaSalvarSqlTabelaPivot.setLayout(painelAbaSalvarSqlTabelaPivotLayout);
        painelAbaSalvarSqlTabelaPivotLayout.setHorizontalGroup(
            painelAbaSalvarSqlTabelaPivotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSalvarSqlTabelaPivotLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaSalvarSqlTabelaPivotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaSaveSqlTabPivot_ConfTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaSalvarSqlTabelaPivotLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPainelConfTab_Salvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnPainelConfTab_Sair)))
                .addContainerGap())
        );
        painelAbaSalvarSqlTabelaPivotLayout.setVerticalGroup(
            painelAbaSalvarSqlTabelaPivotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSalvarSqlTabelaPivotLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaSaveSqlTabPivot_ConfTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAbaSalvarSqlTabelaPivotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPainelConfTab_Sair)
                    .addComponent(btnPainelConfTab_Salvar))
                .addContainerGap())
        );

        jtpPainelAbas.addTab("Salvar Tabela Pivot", painelAbaSalvarSqlTabelaPivot);

        painelAbaNomeCubo_NomeCubo.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do Cubo"));

        lblAbaNomeCubo_Nomecubo.setText("Nome do Cubo: ");

        javax.swing.GroupLayout painelAbaNomeCubo_NomeCuboLayout = new javax.swing.GroupLayout(painelAbaNomeCubo_NomeCubo);
        painelAbaNomeCubo_NomeCubo.setLayout(painelAbaNomeCubo_NomeCuboLayout);
        painelAbaNomeCubo_NomeCuboLayout.setHorizontalGroup(
            painelAbaNomeCubo_NomeCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaNomeCubo_NomeCuboLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAbaNomeCubo_Nomecubo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAbaNomeCubo_NomeCubo, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAbaNomeCubo_NomeCuboLayout.setVerticalGroup(
            painelAbaNomeCubo_NomeCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaNomeCubo_NomeCuboLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaNomeCubo_NomeCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbaNomeCubo_Nomecubo)
                    .addComponent(txtAbaNomeCubo_NomeCubo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(264, Short.MAX_VALUE))
        );

        btnAbaNomeCubo_Proximo.setText("Próximo");
        btnAbaNomeCubo_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaNomeCubo_ProximoActionPerformed(evt);
            }
        });

        btnAbaNomeCubo_Anterior.setText("Anterior");
        btnAbaNomeCubo_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaNomeCubo_AnteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paineAbaNomeCuboLayout = new javax.swing.GroupLayout(paineAbaNomeCubo);
        paineAbaNomeCubo.setLayout(paineAbaNomeCuboLayout);
        paineAbaNomeCuboLayout.setHorizontalGroup(
            paineAbaNomeCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineAbaNomeCuboLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paineAbaNomeCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaNomeCubo_NomeCubo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineAbaNomeCuboLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaNomeCubo_Anterior)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaNomeCubo_Proximo)))
                .addContainerGap())
        );
        paineAbaNomeCuboLayout.setVerticalGroup(
            paineAbaNomeCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineAbaNomeCuboLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaNomeCubo_NomeCubo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(paineAbaNomeCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaNomeCubo_Proximo)
                    .addComponent(btnAbaNomeCubo_Anterior))
                .addContainerGap())
        );

        jtpPainelAbas.addTab("Nome do Cubo", paineAbaNomeCubo);

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
                        .addGap(0, 534, Short.MAX_VALUE))))
        );
        painel_AbaModelDim_AtriDimLayout.setVerticalGroup(
            painel_AbaModelDim_AtriDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_AbaModelDim_AtriDimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_jtpAbaModelDim_listDims, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJtpAbaModelDim_AddDim)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        btnAbaModelDim_Voltar.setText("Voltar");
        btnAbaModelDim_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaModelDim_VoltarActionPerformed(evt);
            }
        });

        btnAbaModelDim_Proximo.setText("Próximo");
        btnAbaModelDim_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaModelDim_ProximoActionPerformed(evt);
            }
        });

        btnAbaModelDim_Sair.setText("Sair");
        btnAbaModelDim_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaModelDim_SairActionPerformed(evt);
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

        painelAbaModelMetri_ModelMetri.setBorder(javax.swing.BorderFactory.createTitledBorder("Métricas"));

        btnModelMetri_AddMetri.setText("Adicionar Métrica");
        btnModelMetri_AddMetri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelMetri_AddMetriActionPerformed(evt);
            }
        });

        painelAbaModelMetri_ListMetri.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout painelAbaModelMetri_ModelMetriLayout = new javax.swing.GroupLayout(painelAbaModelMetri_ModelMetri);
        painelAbaModelMetri_ModelMetri.setLayout(painelAbaModelMetri_ModelMetriLayout);
        painelAbaModelMetri_ModelMetriLayout.setHorizontalGroup(
            painelAbaModelMetri_ModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaModelMetri_ModelMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaModelMetri_ModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaModelMetri_ModelMetriLayout.createSequentialGroup()
                        .addComponent(btnModelMetri_AddMetri)
                        .addGap(0, 536, Short.MAX_VALUE))
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
                .addContainerGap(266, Short.MAX_VALUE))
        );

        btnAbaModelMetri_Voltar.setText("Voltar");
        btnAbaModelMetri_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaModelMetri_VoltarActionPerformed(evt);
            }
        });

        btnAbaModelMetri_Prox.setText("Próximo");
        btnAbaModelMetri_Prox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaModelMetri_ProxActionPerformed(evt);
            }
        });

        btnAbaModelMetri.setText("Sair");
        btnAbaModelMetri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaModelMetriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaModelMetriLayout = new javax.swing.GroupLayout(painelAbaModelMetri);
        painelAbaModelMetri.setLayout(painelAbaModelMetriLayout);
        painelAbaModelMetriLayout.setHorizontalGroup(
            painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaModelMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaModelMetri_ModelMetri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaModelMetriLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaModelMetri_Voltar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaModelMetri_Prox)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaModelMetri)))
                .addContainerGap())
        );
        painelAbaModelMetriLayout.setVerticalGroup(
            painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaModelMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaModelMetri_ModelMetri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaModelMetri)
                    .addComponent(btnAbaModelMetri_Prox)
                    .addComponent(btnAbaModelMetri_Voltar)))
        );

        jtpPainelAbas.addTab("Modelagem Métricas", painelAbaModelMetri);

        painelAbaCuboPreview_Preview.setBorder(javax.swing.BorderFactory.createTitledBorder("Preview do Cubo"));

        jScrollPane1.setViewportView(edtPaneAbaCuboPreview_XmlPreview);

        javax.swing.GroupLayout painelAbaCuboPreview_PreviewLayout = new javax.swing.GroupLayout(painelAbaCuboPreview_Preview);
        painelAbaCuboPreview_Preview.setLayout(painelAbaCuboPreview_PreviewLayout);
        painelAbaCuboPreview_PreviewLayout.setHorizontalGroup(
            painelAbaCuboPreview_PreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaCuboPreview_PreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAbaCuboPreview_PreviewLayout.setVerticalGroup(
            painelAbaCuboPreview_PreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaCuboPreview_PreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAbaCuboPreview_Sair.setText("Sair");
        btnAbaCuboPreview_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaCuboPreview_SairActionPerformed(evt);
            }
        });

        btnAbaCuboPreview_EnviarCubo.setText("Enviar Cubo");
        btnAbaCuboPreview_EnviarCubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaCuboPreview_EnviarCuboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaCuboPreviewLayout = new javax.swing.GroupLayout(painelAbaCuboPreview);
        painelAbaCuboPreview.setLayout(painelAbaCuboPreviewLayout);
        painelAbaCuboPreviewLayout.setHorizontalGroup(
            painelAbaCuboPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaCuboPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaCuboPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaCuboPreview_Preview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaCuboPreviewLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaCuboPreview_EnviarCubo)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaCuboPreview_Sair)))
                .addContainerGap())
        );
        painelAbaCuboPreviewLayout.setVerticalGroup(
            painelAbaCuboPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaCuboPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaCuboPreview_Preview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelAbaCuboPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaCuboPreview_Sair)
                    .addComponent(btnAbaCuboPreview_EnviarCubo))
                .addContainerGap())
        );

        jtpPainelAbas.addTab("Preview", painelAbaCuboPreview);

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
                .addComponent(jtpPainelAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPainelConfTab_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelConfTab_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnPainelConfTab_SairActionPerformed

    private void btnPainelConfTab_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelConfTab_SalvarActionPerformed
        salvarTabela();
    }//GEN-LAST:event_btnPainelConfTab_SalvarActionPerformed

    private void btnModelMetri_AddMetriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelMetri_AddMetriActionPerformed
        chamarFormAddMetri();
    }//GEN-LAST:event_btnModelMetri_AddMetriActionPerformed

    private void btnAbaModelMetriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetriActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAbaModelMetriActionPerformed

    private void btnAbaModelMetri_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetri_VoltarActionPerformed
        PercorrerAbasFormGerarCuboXml.modelMetriToModelDim();
    }//GEN-LAST:event_btnAbaModelMetri_VoltarActionPerformed

    private void btnAbaModelMetri_ProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetri_ProxActionPerformed
        PercorrerAbasFormGerarCuboXml.modelMetriToCuboPreview();    
        gerarSchemaXml();
    }//GEN-LAST:event_btnAbaModelMetri_ProxActionPerformed

    private void btnJtpAbaModelDim_AddDimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJtpAbaModelDim_AddDimActionPerformed
        chamarFormAddDim();
    }//GEN-LAST:event_btnJtpAbaModelDim_AddDimActionPerformed

    private void btnAbaModelDim_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelDim_VoltarActionPerformed
        PercorrerAbasFormGerarCuboXml.modelDimToNomeCubo();
    }//GEN-LAST:event_btnAbaModelDim_VoltarActionPerformed

    private void btnAbaModelDim_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelDim_ProximoActionPerformed
        PercorrerAbasFormGerarCuboXml.modelDimToModelMetri();
    }//GEN-LAST:event_btnAbaModelDim_ProximoActionPerformed

    private void btnAbaModelDim_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelDim_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAbaModelDim_SairActionPerformed

    private void btnAbaNomeCubo_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaNomeCubo_ProximoActionPerformed
        PercorrerAbasFormGerarCuboXml.nomeCuboToModelDim();
    }//GEN-LAST:event_btnAbaNomeCubo_ProximoActionPerformed

    private void btnAbaNomeCubo_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaNomeCubo_AnteriorActionPerformed
        PercorrerAbasFormGerarCuboXml.nomeCuboToSaveTab();
    }//GEN-LAST:event_btnAbaNomeCubo_AnteriorActionPerformed

    private void btnAbaCuboPreview_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaCuboPreview_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAbaCuboPreview_SairActionPerformed

    private void btnAbaCuboPreview_EnviarCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaCuboPreview_EnviarCuboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbaCuboPreview_EnviarCuboActionPerformed

    private void gerarSchemaXml(){
        Schema schema = new Schema();
        schema.setNome("Schema " + txtAbaNomeCubo_NomeCubo.getText());
        schema.setTabela(txtPainelConfTab_txtNomeTab.getText());
        schema.setChaveTabela(cbxPainelConfTab_CamposPrimaryKey.getSelectedItem().toString());
        schema.setNomeCubo(txtAbaNomeCubo_NomeCubo.getText());
        schema.setDimensoes(dimensoes);
        schema.setMetricas(metricas);
        System.out.println("XML Gerado: " + GerarSchema.createSchema(schema));
        //GerarSchema.createSchema(schema);
        carregarTxtAreaPreview(GerarSchema.createSchema(schema));
    }
    
    private void carregarTxtAreaPreview(String schemaXml){  
          edtPaneAbaCuboPreview_XmlPreview.setEditorKit(new XMLEditorKit());
          edtPaneAbaCuboPreview_XmlPreview.setText(schemaXml);
    }
    
    private void chamarFormAddMetri(){
        FormAddMetrica frm = new FormAddMetrica();
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
                PercorrerAbasFormGerarCuboXml.saveTabToNomeCubo();
            
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
    private javax.swing.JButton btnAbaCuboPreview_EnviarCubo;
    private javax.swing.JButton btnAbaCuboPreview_Sair;
    private javax.swing.JButton btnAbaModelDim_Proximo;
    private javax.swing.JButton btnAbaModelDim_Sair;
    private javax.swing.JButton btnAbaModelDim_Voltar;
    private javax.swing.JButton btnAbaModelMetri;
    private javax.swing.JButton btnAbaModelMetri_Prox;
    private javax.swing.JButton btnAbaModelMetri_Voltar;
    private javax.swing.JButton btnAbaNomeCubo_Anterior;
    private javax.swing.JButton btnAbaNomeCubo_Proximo;
    private javax.swing.JButton btnJtpAbaModelDim_AddDim;
    private javax.swing.JButton btnModelMetri_AddMetri;
    private javax.swing.JButton btnPainelConfTab_Sair;
    private javax.swing.JButton btnPainelConfTab_Salvar;
    private javax.swing.JComboBox cbxPainelConfTab_CamposPrimaryKey;
    private javax.swing.JLabel cbxPainelConfTab_lblNomeTab;
    private javax.swing.JLabel cbxPainelConfTab_lblPrimaryKey;
    private javax.swing.JEditorPane edtPaneAbaCuboPreview_XmlPreview;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTabbedPane jtpPainelAbas;
    private javax.swing.JLabel lblAbaNomeCubo_Nomecubo;
    private javax.swing.JPanel paineAbaModelDim;
    private javax.swing.JPanel paineAbaNomeCubo;
    private javax.swing.JPanel painelAbaCuboPreview;
    private javax.swing.JPanel painelAbaCuboPreview_Preview;
    private javax.swing.JPanel painelAbaModelMetri;
    public static javax.swing.JPanel painelAbaModelMetri_ListMetri;
    public static javax.swing.JPanel painelAbaModelMetri_ModelMetri;
    private javax.swing.JPanel painelAbaNomeCubo_NomeCubo;
    private javax.swing.JPanel painelAbaSalvarSqlTabelaPivot;
    private javax.swing.JPanel painelAbaSaveSqlTabPivot_ConfTab;
    private javax.swing.JPanel painel_AbaModelDim_AtriDim;
    public static javax.swing.JPanel painel_jtpAbaModelDim_listDims;
    private javax.swing.JTextField txtAbaNomeCubo_NomeCubo;
    private javax.swing.JTextField txtPainelConfTab_txtNomeTab;
    // End of variables declaration//GEN-END:variables
}
