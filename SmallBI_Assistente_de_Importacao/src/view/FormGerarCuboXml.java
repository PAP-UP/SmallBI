package view;

import business.GerarSchema;
import business.GerarScriptSql;
import java.text.SimpleDateFormat;
import view.percorrerAbas.PercorrerAbasFormGerarCuboXml;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.Dimensao;
import model.GrupoMetrica;
import model.Link;
import model.Schema;
import model.TabelaFato;
import xmleditorkit.XMLEditorKit;

public class FormGerarCuboXml extends javax.swing.JFrame {
    
    public static List<Dimensao> dimensoes = new ArrayList<>();
    public static List<GrupoMetrica> grupoMetricas = new ArrayList<>();
    public static List<TabelaFato> tabelasFato = new ArrayList<>();
    public static List<Link> links = new ArrayList<>();
    

    public FormGerarCuboXml() {
        initComponents();
        PercorrerAbasFormGerarCuboXml.desativarAbasInicio();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        painelAbaRel = new javax.swing.JPanel();
        painel_AbaRel_Rels = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        painel_AbaRel_ListRel = new javax.swing.JPanel();
        btnPainelRel_Sair = new javax.swing.JButton();
        btnPainelRel_Prox = new javax.swing.JButton();
        btnPainelRel_Voltar = new javax.swing.JButton();
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

        painel_AbaRel_Rels.setBorder(javax.swing.BorderFactory.createTitledBorder("Relacionamentos"));

        jButton4.setText("Adicionar Relacionamento");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        painel_AbaRel_ListRel.setLayout(new java.awt.GridLayout());

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
                .addContainerGap(254, Short.MAX_VALUE))
        );

        btnPainelRel_Sair.setText("Sair");
        btnPainelRel_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelRel_SairActionPerformed(evt);
            }
        });

        btnPainelRel_Prox.setText("Próximo");
        btnPainelRel_Prox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelRel_ProxActionPerformed(evt);
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
                        .addComponent(btnPainelRel_Prox)
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
                    .addComponent(btnPainelRel_Prox)
                    .addComponent(btnPainelRel_Voltar))
                .addContainerGap())
        );

        jtpPainelAbas.addTab("Relacionar", painelAbaRel);

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
                .addContainerGap(254, Short.MAX_VALUE))
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
                .addComponent(painelAbaModelMetri_ModelMetri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAbaModelMetri)
                        .addComponent(btnAbaModelMetri_Prox))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaModelMetriLayout.createSequentialGroup()
                        .addComponent(btnAbaModelMetri_Voltar)
                        .addContainerGap())))
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

    private void btnModelMetri_AddMetriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelMetri_AddMetriActionPerformed
        chamarFormAddMetri();
    }//GEN-LAST:event_btnModelMetri_AddMetriActionPerformed

    private void btnAbaModelMetriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetriActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAbaModelMetriActionPerformed

    private void btnAbaModelMetri_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetri_VoltarActionPerformed
        PercorrerAbasFormGerarCuboXml.modelMetriToAddRel();
    }//GEN-LAST:event_btnAbaModelMetri_VoltarActionPerformed

    private void btnAbaModelMetri_ProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetri_ProxActionPerformed
        modelMetriToCuboPreview();
    }//GEN-LAST:event_btnAbaModelMetri_ProxActionPerformed

    private void btnJtpAbaModelDim_AddDimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJtpAbaModelDim_AddDimActionPerformed
        chamarFormAddDim();
    }//GEN-LAST:event_btnJtpAbaModelDim_AddDimActionPerformed

    private void btnAbaModelDim_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelDim_VoltarActionPerformed
        PercorrerAbasFormGerarCuboXml.modelDimToNomeCubo();
    }//GEN-LAST:event_btnAbaModelDim_VoltarActionPerformed

    private void btnAbaModelDim_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelDim_ProximoActionPerformed
        modelDimToAddRel();
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
        // TODO add your handling code here:
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

    private void btnPainelRel_ProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelRel_ProxActionPerformed
        addRelToModelMetri();
    }//GEN-LAST:event_btnPainelRel_ProxActionPerformed

    private void btnPainelRel_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelRel_VoltarActionPerformed
        addRelToModelDim();
    }//GEN-LAST:event_btnPainelRel_VoltarActionPerformed

    private void addRelToModelDim(){
        PercorrerAbasFormGerarCuboXml.addRelToModelDim();
    }
    
    private void addRelToModelMetri(){
        PercorrerAbasFormGerarCuboXml.addRelToModelMetri();
    }
    
    private void chamarFormAddRel(){
        FormAddRel frm = new FormAddRel();
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        frm.setTitle("Adicionar Novo Relacionamento");
        frm.setVisible(true);
    }
    
    private void modelMetriToCuboPreview(){
        if(grupoMetricas.size() > 0){
            PercorrerAbasFormGerarCuboXml.modelMetriToCuboPreview();    
            gerarSchemaXml();
        }else{
            JOptionPane.showMessageDialog(null, "Adicione ao menos uma métrica ao cubo!");
        }
    }
    
    private void modelDimToAddRel(){
        if(dimensoes.size() > 0){
            PercorrerAbasFormGerarCuboXml.modelDimToAddRel();
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
    
    private void chamarFormAddMetri(){
        FormAddMetrica frm = new FormAddMetrica();
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        frm.setTitle("Adicionar Nova Métrica");
        frm.setVisible(true);
    }
    
    private void chamarFormAddDim(){      
        FormAddDimensao frm = new FormAddDimensao();
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        frm.setTitle("Adicionar Nova Dimensão");
        frm.setVisible(true);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGerarCuboXml().setVisible(true);
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
    private javax.swing.JButton btnJtpAbaModelDim_AddDim;
    private javax.swing.JButton btnModelMetri_AddMetri;
    private javax.swing.JButton btnPainelRel_Prox;
    private javax.swing.JButton btnPainelRel_Sair;
    private javax.swing.JButton btnPainelRel_Voltar;
    private javax.swing.JEditorPane edtPaneAbaCuboPreview_XmlPreview;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JPanel painelAbaRel;
    private javax.swing.JPanel painel_AbaModelDim_AtriDim;
    public static javax.swing.JPanel painel_AbaRel_ListRel;
    private javax.swing.JPanel painel_AbaRel_Rels;
    public static javax.swing.JPanel painel_jtpAbaModelDim_listDims;
    private javax.swing.JTextField txtAbaNomeCubo_NomeCubo;
    // End of variables declaration//GEN-END:variables
}
