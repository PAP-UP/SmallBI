package view;

import business.GerarSchema;
import business.GerarScriptSql;
import java.awt.Component;
import java.text.SimpleDateFormat;
import view.percorrerAbas.PercorrerAbasFormGerarCuboXml;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.Dimensao;
import model.GrupoMetrica;
import model.Link;
import model.Metrica;
import model.Schema;
import model.TabelaFato;
import xmleditorkit.XMLEditorKit;

public class FormAssistenteModelagem extends javax.swing.JFrame {
    
    public static List<Dimensao> dimensoes = new ArrayList<>();
    public static List<GrupoMetrica> grupoMetricas = new ArrayList<>();
    public static List<TabelaFato> tabelasFato = new ArrayList<>();
    public static List<Link> links = new ArrayList<>();
    
    public FormAssistenteModelagem() {
        initComponents();
        PercorrerAbasFormGerarCuboXml.desativarAbasInicio();  
        carregarAgregadores();
        carregarFormatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jtpPainelAbas = new javax.swing.JTabbedPane();
        paineAbaNomeCubo = new javax.swing.JPanel();
        painelAbaNomeCubo_NomeCubo = new javax.swing.JPanel();
        lblAbaNomeCubo_Nomecubo = new javax.swing.JLabel();
        txtAbaNomeCubo_NomeCubo = new javax.swing.JTextField();
        btnAbaNomeCubo_Proximo = new javax.swing.JButton();
        btnAbaNomeCubo_Sair = new javax.swing.JButton();
        paineAbaModelDim = new javax.swing.JPanel();
        painel_AbaModelDim_AtriDim = new javax.swing.JPanel();
        painel_jtpAbaModelDim_listDims = new javax.swing.JPanel();
        btnJtpAbaModelDim_AddDim = new javax.swing.JButton();
        btnAbaModelDim_Voltar = new javax.swing.JButton();
        btnAbaModelDim_Proximo = new javax.swing.JButton();
        btnAbaModelDim_Sair = new javax.swing.JButton();
        painelAbaModelMetri = new javax.swing.JPanel();
        painelGerenciarMetricas = new javax.swing.JPanel();
        jTabbedPane_Metricas = new javax.swing.JTabbedPane();
        painelAddMetri = new javax.swing.JPanel();
        lblNomeMetrica = new javax.swing.JLabel();
        txtNomeMetrica = new javax.swing.JTextField();
        cbxColunaMetrica = new javax.swing.JComboBox<>();
        lblColunaMetrica = new javax.swing.JLabel();
        lblAgregadorMetrica = new javax.swing.JLabel();
        cbxAgregadorMetrica = new javax.swing.JComboBox<>();
        cbxFormatoMetrica = new javax.swing.JComboBox<>();
        lblFormatoMetrica = new javax.swing.JLabel();
        lblTabelaMetrica = new javax.swing.JLabel();
        cbxTabelaMetrica = new javax.swing.JComboBox<>();
        btnAdicionarMetrica = new javax.swing.JButton();
        painelMetricas = new javax.swing.JPanel();
        btnSalvarMetricas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        painelListaMetricas = new javax.swing.JPanel();
        btnAbaModelMetri_Voltar = new javax.swing.JButton();
        btnAbaModelMetri_Prox = new javax.swing.JButton();
        btnAbaModelMetri = new javax.swing.JButton();
        painelAbaRel = new javax.swing.JPanel();
        painel_AbaRel_Rels = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        painel_AbaRel_ListRel = new javax.swing.JPanel();
        btnPainelRel_Sair = new javax.swing.JButton();
        btnPainelRel_GerarCubo = new javax.swing.JButton();
        btnPainelRel_Voltar = new javax.swing.JButton();
        painelAbaCuboPreview = new javax.swing.JPanel();
        painelAbaCuboPreview_Preview = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtPaneAbaCuboPreview_XmlPreview = new javax.swing.JEditorPane();
        btnAbaCuboPreview_Sair = new javax.swing.JButton();
        btnAbaCuboPreview_EnviarCubo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap(307, Short.MAX_VALUE))
        );

        btnAbaNomeCubo_Proximo.setText("Próximo");
        btnAbaNomeCubo_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaNomeCubo_ProximoActionPerformed(evt);
            }
        });

        btnAbaNomeCubo_Sair.setText("Sair");
        btnAbaNomeCubo_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaNomeCubo_SairActionPerformed(evt);
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
                        .addComponent(btnAbaNomeCubo_Proximo)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaNomeCubo_Sair)))
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
                    .addComponent(btnAbaNomeCubo_Sair))
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
                    .addComponent(painel_jtpAbaModelDim_listDims, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
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
                .addContainerGap(297, Short.MAX_VALUE))
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

        painelGerenciarMetricas.setBorder(javax.swing.BorderFactory.createTitledBorder("Métricas"));

        lblNomeMetrica.setText("Nome: ");

        cbxColunaMetrica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblColunaMetrica.setText("Coluna: ");

        lblAgregadorMetrica.setText("Agregador: ");

        cbxAgregadorMetrica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxFormatoMetrica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblFormatoMetrica.setText("Formato: ");

        lblTabelaMetrica.setText("Tabela: ");

        cbxTabelaMetrica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxTabelaMetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTabelaMetricaActionPerformed(evt);
            }
        });

        btnAdicionarMetrica.setText("Adicionar Métrica");
        btnAdicionarMetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarMetricaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAddMetriLayout = new javax.swing.GroupLayout(painelAddMetri);
        painelAddMetri.setLayout(painelAddMetriLayout);
        painelAddMetriLayout.setHorizontalGroup(
            painelAddMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAddMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAddMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAddMetriLayout.createSequentialGroup()
                        .addGroup(painelAddMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAgregadorMetrica, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFormatoMetrica, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                        .addGroup(painelAddMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxFormatoMetrica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxAgregadorMetrica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAddMetriLayout.createSequentialGroup()
                        .addGroup(painelAddMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblColunaMetrica)
                            .addComponent(lblNomeMetrica)
                            .addComponent(lblTabelaMetrica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelAddMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxTabelaMetrica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomeMetrica, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(cbxColunaMetrica, 0, 233, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAddMetriLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdicionarMetrica)))
                .addContainerGap())
        );
        painelAddMetriLayout.setVerticalGroup(
            painelAddMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAddMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAddMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeMetrica)
                    .addComponent(txtNomeMetrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAddMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTabelaMetrica)
                    .addComponent(cbxTabelaMetrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAddMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColunaMetrica)
                    .addComponent(cbxColunaMetrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAddMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgregadorMetrica)
                    .addComponent(cbxAgregadorMetrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAddMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormatoMetrica)
                    .addComponent(cbxFormatoMetrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdicionarMetrica)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_Metricas.addTab("Adicionar Métrica", painelAddMetri);

        btnSalvarMetricas.setText("Salvar");
        btnSalvarMetricas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMetricasActionPerformed(evt);
            }
        });

        painelListaMetricas.setLayout(new java.awt.GridLayout());
        jScrollPane2.setViewportView(painelListaMetricas);

        javax.swing.GroupLayout painelMetricasLayout = new javax.swing.GroupLayout(painelMetricas);
        painelMetricas.setLayout(painelMetricasLayout);
        painelMetricasLayout.setHorizontalGroup(
            painelMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMetricasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMetricasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvarMetricas)))
                .addContainerGap())
        );
        painelMetricasLayout.setVerticalGroup(
            painelMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMetricasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarMetricas)
                .addContainerGap())
        );

        jTabbedPane_Metricas.addTab("Métricas", painelMetricas);

        javax.swing.GroupLayout painelGerenciarMetricasLayout = new javax.swing.GroupLayout(painelGerenciarMetricas);
        painelGerenciarMetricas.setLayout(painelGerenciarMetricasLayout);
        painelGerenciarMetricasLayout.setHorizontalGroup(
            painelGerenciarMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerenciarMetricasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane_Metricas)
                .addContainerGap())
        );
        painelGerenciarMetricasLayout.setVerticalGroup(
            painelGerenciarMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerenciarMetricasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane_Metricas)
                .addContainerGap())
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
                    .addComponent(painelGerenciarMetricas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(painelGerenciarMetricas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbaModelMetri)
                    .addComponent(btnAbaModelMetri_Prox)
                    .addComponent(btnAbaModelMetri_Voltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpPainelAbas.addTab("Modelagem Métricas", painelAbaModelMetri);

        painel_AbaRel_Rels.setBorder(javax.swing.BorderFactory.createTitledBorder("Relacionamentos"));

        jButton4.setText("Adicionar Relacionamento");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        painel_AbaRel_ListRel.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout painel_AbaRel_RelsLayout = new javax.swing.GroupLayout(painel_AbaRel_Rels);
        painel_AbaRel_Rels.setLayout(painel_AbaRel_RelsLayout);
        painel_AbaRel_RelsLayout.setHorizontalGroup(
            painel_AbaRel_RelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_AbaRel_RelsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_AbaRel_RelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel_AbaRel_ListRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painel_AbaRel_RelsLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(0, 489, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painel_AbaRel_RelsLayout.setVerticalGroup(
            painel_AbaRel_RelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_AbaRel_RelsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_AbaRel_ListRel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        btnPainelRel_Sair.setText("Sair");
        btnPainelRel_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelRel_SairActionPerformed(evt);
            }
        });

        btnPainelRel_GerarCubo.setText("Gerar Cubo");
        btnPainelRel_GerarCubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelRel_GerarCuboActionPerformed(evt);
            }
        });

        btnPainelRel_Voltar.setText("Voltar");
        btnPainelRel_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelRel_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaRelLayout = new javax.swing.GroupLayout(painelAbaRel);
        painelAbaRel.setLayout(painelAbaRelLayout);
        painelAbaRelLayout.setHorizontalGroup(
            painelAbaRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaRelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel_AbaRel_Rels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaRelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPainelRel_Voltar)
                        .addGap(18, 18, 18)
                        .addComponent(btnPainelRel_GerarCubo)
                        .addGap(18, 18, 18)
                        .addComponent(btnPainelRel_Sair)))
                .addContainerGap())
        );
        painelAbaRelLayout.setVerticalGroup(
            painelAbaRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaRelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_AbaRel_Rels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(painelAbaRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPainelRel_Sair)
                    .addComponent(btnPainelRel_GerarCubo)
                    .addComponent(btnPainelRel_Voltar))
                .addContainerGap())
        );

        jtpPainelAbas.addTab("Relacionar", painelAbaRel);

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

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
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
                    .addComponent(btnAbaCuboPreview_EnviarCubo)
                    .addComponent(jButton1))
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
                .addComponent(jtpPainelAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarMetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarMetricaActionPerformed
        adicionarMetrica();
    }//GEN-LAST:event_btnAdicionarMetricaActionPerformed

    private void btnAbaModelMetriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetriActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAbaModelMetriActionPerformed

    private void btnAbaModelMetri_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetri_VoltarActionPerformed
        PercorrerAbasFormGerarCuboXml.modelMetriToModelDim();
    }//GEN-LAST:event_btnAbaModelMetri_VoltarActionPerformed

    private void btnAbaModelMetri_ProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetri_ProxActionPerformed
        modelMetriToAddRel();
    }//GEN-LAST:event_btnAbaModelMetri_ProxActionPerformed

    private void btnJtpAbaModelDim_AddDimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJtpAbaModelDim_AddDimActionPerformed
        chamarFormAddDim();
    }//GEN-LAST:event_btnJtpAbaModelDim_AddDimActionPerformed

    private void btnAbaModelDim_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelDim_VoltarActionPerformed
        PercorrerAbasFormGerarCuboXml.modelDimToNomeCubo();
    }//GEN-LAST:event_btnAbaModelDim_VoltarActionPerformed

    private void btnAbaModelDim_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelDim_ProximoActionPerformed
        modelDimToModelMetri();
    }//GEN-LAST:event_btnAbaModelDim_ProximoActionPerformed

    private void btnAbaModelDim_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelDim_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAbaModelDim_SairActionPerformed

    private void btnAbaNomeCubo_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaNomeCubo_ProximoActionPerformed
        nomeCuboToModelDim();
    }//GEN-LAST:event_btnAbaNomeCubo_ProximoActionPerformed

    private void btnAbaCuboPreview_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaCuboPreview_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAbaCuboPreview_SairActionPerformed

    private void btnAbaCuboPreview_EnviarCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaCuboPreview_EnviarCuboActionPerformed
        enviarCubo();
    }//GEN-LAST:event_btnAbaCuboPreview_EnviarCuboActionPerformed

    private void btnAbaNomeCubo_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaNomeCubo_SairActionPerformed
        dispose();
    }//GEN-LAST:event_btnAbaNomeCubo_SairActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        chamarFormAddRel();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnPainelRel_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelRel_SairActionPerformed
        dispose();
    }//GEN-LAST:event_btnPainelRel_SairActionPerformed

    private void btnPainelRel_GerarCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelRel_GerarCuboActionPerformed
        addRelToCuboPreview();
    }//GEN-LAST:event_btnPainelRel_GerarCuboActionPerformed

    private void btnPainelRel_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelRel_VoltarActionPerformed
        addRelToModelMetri();
    }//GEN-LAST:event_btnPainelRel_VoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PercorrerAbasFormGerarCuboXml.cuboPrevToAddRel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxTabelaMetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTabelaMetricaActionPerformed
        carregarCbxColunasMetrica();
    }//GEN-LAST:event_cbxTabelaMetricaActionPerformed

    private void btnSalvarMetricasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMetricasActionPerformed
        salvarMetricas();
    }//GEN-LAST:event_btnSalvarMetricasActionPerformed

    private void salvarMetricas(){
        Component[] components = painelListaMetricas.getComponents();
        for(Component c : components){
            if(c.getClass().equals(JCheckBox.class)){
                System.out.println("Achou um componente " + c.getName());
            }
        }
    }
    
    private void carregarAgregadores(){
        cbxAgregadorMetrica.removeAllItems();
        cbxAgregadorMetrica.addItem("count");
        cbxAgregadorMetrica.addItem("sum");
        cbxAgregadorMetrica.addItem("avg");
        cbxAgregadorMetrica.addItem("max");
    }
    
    private void carregarFormatos(){
        cbxFormatoMetrica.removeAllItems();
        cbxFormatoMetrica.addItem("Standard");
        cbxFormatoMetrica.addItem("#,###.00");
    }
    
    private void carregarCbxColunasMetrica(){
        cbxColunaMetrica.removeAllItems();
        for(String s : FormAddDimensao.atributosUtilizadosNoCubo){
            cbxColunaMetrica.addItem(s);
        }
    }
    
    private void adicionarMetrica(){
        if(txtNomeMetrica != null && !txtNomeMetrica.equals("")){
            Metrica metrica = new Metrica();
            metrica.setNome(txtNomeMetrica.getText());
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

                grupoMetricas.add(gm);
            }else{
                List<Metrica> metricas = gm.getMetricas();
                metricas.add(metrica);
                gm.setMetricas(metricas);

                grupoMetricas.set(grupoMetricas.indexOf(gm), gm);
            }
            autalizarListaMetricas();
            jTabbedPane_Metricas.setSelectedIndex(1);
        }else{
            JOptionPane.showMessageDialog(null, "Defina um nome para a métrica!");
        }
    }
    
    private void autalizarListaMetricas(){
        painelListaMetricas.removeAll();
        for(GrupoMetrica gm : grupoMetricas){
            List<Metrica> metricas = gm.getMetricas();
            for(Metrica m : metricas){
                JCheckBox checkBox = new JCheckBox();
                checkBox.setText("Métrica: " + m.getNome());
                checkBox.setSelected(true);
                painelListaMetricas.setLayout(new BoxLayout(painelListaMetricas, BoxLayout.Y_AXIS));
                painelListaMetricas.add(checkBox);
                painelListaMetricas.updateUI();
            }
        }
    }
    
    private GrupoMetrica getGrupoUsandoMesmaTabela(String tabSelecionada){
        for(GrupoMetrica gm : grupoMetricas){
            if(gm.getTabela().equals(tabSelecionada)){
                return gm;
            }
        }
        return null;
    }
    
    private void enviarCubo(){
        GerarSchema gerarSchema = new GerarSchema();
        gerarSchema.salvarSchema();
//        JOptionPane.showMessageDialog(null, "Cubo salvo");
        FormEnviarCubo frm = new FormEnviarCubo();
        frm.setLocationRelativeTo(null);
        //frm.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        frm.setVisible(true);
    }
    
    private void addRelToModelMetri(){
        PercorrerAbasFormGerarCuboXml.addRelToModelMetri();
    }
    
    private void addRelToCuboPreview(){
        PercorrerAbasFormGerarCuboXml.addRelToCuboPreview();
        gerarSchemaXml();
    }
    
    private void chamarFormAddRel(){
        FormAddRel frm = new FormAddRel();
        frm.setLocationRelativeTo(null);
        //frm.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        frm.setTitle("Adicionar Novo Relacionamento");
        frm.setVisible(true);
    }
    
    private void modelMetriToAddRel(){
        if(grupoMetricas.size() > 0){
            PercorrerAbasFormGerarCuboXml.modelMetriToAddRel();            
        }else{
            JOptionPane.showMessageDialog(null, "Adicione ao menos uma métrica ao cubo!");
        }
    }
    
    private void modelDimToModelMetri(){
        if(dimensoes.size() > 0){
            
            //Carregar Tabelas para serem utilizadas na gerencia de metricas;
            cbxTabelaMetrica.removeAllItems();
            for(TabelaFato t : tabelasFato){
                cbxTabelaMetrica.addItem(t.getNomeTabela());
            }
            
            PercorrerAbasFormGerarCuboXml.modelDimToModelMetri();
        }else{
            JOptionPane.showMessageDialog(null, "Adicione ao menos uma dimensão ao cubo!");
        }
    }
    
    private void nomeCuboToModelDim(){
        if(!txtAbaNomeCubo_NomeCubo.getText().equals("")){

            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String data = sdf.format(calendar.getTime());

            GerarScriptSql gerarScriptSql = new GerarScriptSql();
            gerarScriptSql.salvarQuerySQL("ScriptSQL_" + txtAbaNomeCubo_NomeCubo.getText() + "_" + data);
            
            PercorrerAbasFormGerarCuboXml.nomeCuboToModelDim();
        }else{
            JOptionPane.showMessageDialog(null, "Preencha o nome do cubo!");
        }
    }
    
    private void gerarSchemaXml(){
        Schema schema = new Schema();
        schema.setNome("Schema " + txtAbaNomeCubo_NomeCubo.getText());
        schema.setTabelasFato(tabelasFato);
        schema.setNomeCubo(txtAbaNomeCubo_NomeCubo.getText());
        schema.setDimensoes(dimensoes);
        schema.setGrupoMetrica(grupoMetricas);
        schema.setLinks(links);
        
        GerarSchema gerarSchema = new GerarSchema();
        String xmlGerado = gerarSchema.createSchema(schema);
        System.out.println("XML Gerado: " + xmlGerado);
        carregarTxtAreaPreview(xmlGerado);
    }
    
    private void carregarTxtAreaPreview(String schemaXml){  
          edtPaneAbaCuboPreview_XmlPreview.setEditorKit(new XMLEditorKit());
          edtPaneAbaCuboPreview_XmlPreview.setText(schemaXml);
    }
    
    private void chamarFormAddDim(){      
        FormAddDimensao frm = new FormAddDimensao();
        frm.setLocationRelativeTo(null);
        //frm.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        frm.setTitle("Adicionar Nova Dimensão");
        frm.setVisible(true);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAssistenteModelagem().setVisible(true);
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
    private javax.swing.JButton btnAbaNomeCubo_Proximo;
    private javax.swing.JButton btnAbaNomeCubo_Sair;
    private javax.swing.JButton btnAdicionarMetrica;
    private javax.swing.JButton btnJtpAbaModelDim_AddDim;
    private javax.swing.JButton btnPainelRel_GerarCubo;
    private javax.swing.JButton btnPainelRel_Sair;
    private javax.swing.JButton btnPainelRel_Voltar;
    private javax.swing.JButton btnSalvarMetricas;
    private javax.swing.JComboBox<String> cbxAgregadorMetrica;
    private javax.swing.JComboBox<String> cbxColunaMetrica;
    private javax.swing.JComboBox<String> cbxFormatoMetrica;
    private javax.swing.JComboBox<String> cbxTabelaMetrica;
    private javax.swing.JEditorPane edtPaneAbaCuboPreview_XmlPreview;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane_Metricas;
    public static javax.swing.JTabbedPane jtpPainelAbas;
    private javax.swing.JLabel lblAbaNomeCubo_Nomecubo;
    private javax.swing.JLabel lblAgregadorMetrica;
    private javax.swing.JLabel lblColunaMetrica;
    private javax.swing.JLabel lblFormatoMetrica;
    private javax.swing.JLabel lblNomeMetrica;
    private javax.swing.JLabel lblTabelaMetrica;
    private javax.swing.JPanel paineAbaModelDim;
    private javax.swing.JPanel paineAbaNomeCubo;
    private javax.swing.JPanel painelAbaCuboPreview;
    private javax.swing.JPanel painelAbaCuboPreview_Preview;
    private javax.swing.JPanel painelAbaModelMetri;
    private javax.swing.JPanel painelAbaNomeCubo_NomeCubo;
    private javax.swing.JPanel painelAbaRel;
    private javax.swing.JPanel painelAddMetri;
    public static javax.swing.JPanel painelGerenciarMetricas;
    private javax.swing.JPanel painelListaMetricas;
    private javax.swing.JPanel painelMetricas;
    private javax.swing.JPanel painel_AbaModelDim_AtriDim;
    public static javax.swing.JPanel painel_AbaRel_ListRel;
    private javax.swing.JPanel painel_AbaRel_Rels;
    public static javax.swing.JPanel painel_jtpAbaModelDim_listDims;
    private javax.swing.JTextField txtAbaNomeCubo_NomeCubo;
    private javax.swing.JTextField txtNomeMetrica;
    // End of variables declaration//GEN-END:variables
}
