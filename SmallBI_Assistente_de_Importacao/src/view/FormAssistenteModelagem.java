package view;

import business.GerarSchema;
import business.GerarScriptSql;
import business.GerenciarDimensoes;
import business.GerenciarMetricas;
import business.Util;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import view.percorrerAbas.PercorrerAbasFormAssistenteModelagem;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Schema;
import model.TabelaImportada;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import xmleditorkit.XMLEditorKit;

public class FormAssistenteModelagem extends javax.swing.JFrame {
    
    public static List<TabelaImportada> tabelasImportadas = new ArrayList<>();
    
    public static TabelaImportada tabelaFato = new TabelaImportada();
    //String urlApiAddCubo = "http://localhost:8081/SmallBI_WebService/rest/cubo/addCubeFromAssistent";
    String urlApiAddCubo = "http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/cubo/addCubeFromAssistent";
    
    public FormAssistenteModelagem() {
        initComponents();
        PercorrerAbasFormAssistenteModelagem.desativarAbasInicio();  
        
        carregarTabelasImportadasParaEscolherFato();
        GerenciarDimensoes.atualizarListaDimensoes();
        //GerenciarDimensoes.carregarTabelasModelDim();
        
        GerenciarMetricas.carregarAgregadoresModelMetri();
        GerenciarMetricas.carregarFormatosModelMetri();
        GerenciarMetricas.atualizarListaMetricas();
        
        cbxChaveDimensao.setVisible(false);
        lblChaveDimensao.setVisible(false);
        btnAbaModelDim_Voltar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        lbl = new javax.swing.JTabbedPane();
        paineAbaNomeCubo = new javax.swing.JPanel();
        painelAbaNomeCubo_NomeCubo = new javax.swing.JPanel();
        lblAbaNomeCubo_Nomecubo = new javax.swing.JLabel();
        txtAbaNomeCubo_NomeCubo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbxAbaNomeCubo_TabFato = new javax.swing.JComboBox<>();
        btnAbaNomeCubo_Proximo = new javax.swing.JButton();
        btnAbaNomeCubo_Sair = new javax.swing.JButton();
        paineAbaModelDim = new javax.swing.JPanel();
        painelGerenciarDimensões = new javax.swing.JPanel();
        jTabbedPane_Dimensoes = new javax.swing.JTabbedPane();
        painelAddDimensao = new javax.swing.JPanel();
        painelListaAtributos = new javax.swing.JPanel();
        lblTabelaDimensao = new javax.swing.JLabel();
        cbxTabelaDimensao = new javax.swing.JComboBox<>();
        lblNomeDimensao = new javax.swing.JLabel();
        txtNomeDimensao = new javax.swing.JTextField();
        lblChaveDimensao = new javax.swing.JLabel();
        cbxChaveDimensao = new javax.swing.JComboBox<>();
        btnAddDimensao = new javax.swing.JButton();
        jcbSelecTodos = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        cbxLinkComFato = new javax.swing.JComboBox<>();
        painelDimensoes = new javax.swing.JPanel();
        btnSalvarDimensoes = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        painelListaDimensoes = new javax.swing.JPanel();
        btnVoltarDimensoes = new javax.swing.JButton();
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
        btnVoltarMetricas = new javax.swing.JButton();
        btnAbaModelMetri_Voltar = new javax.swing.JButton();
        btnAbaModelMetri_Prox = new javax.swing.JButton();
        btnAbaModelMetri_Sair = new javax.swing.JButton();
        painelAbaCuboPreview = new javax.swing.JPanel();
        painelAbaCuboPreview_Preview = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtPaneAbaCuboPreview_XmlPreview = new javax.swing.JEditorPane();
        btnAbaCuboPreview_Sair = new javax.swing.JButton();
        btnAbaCuboPreview_EnviarCubo = new javax.swing.JButton();
        btnAbaCuboPreview_Voltar = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelAbaNomeCubo_NomeCubo.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do Cubo"));

        lblAbaNomeCubo_Nomecubo.setText("Nome do Cubo: ");

        jLabel1.setText("Tabela Fato: ");

        javax.swing.GroupLayout painelAbaNomeCubo_NomeCuboLayout = new javax.swing.GroupLayout(painelAbaNomeCubo_NomeCubo);
        painelAbaNomeCubo_NomeCubo.setLayout(painelAbaNomeCubo_NomeCuboLayout);
        painelAbaNomeCubo_NomeCuboLayout.setHorizontalGroup(
            painelAbaNomeCubo_NomeCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaNomeCubo_NomeCuboLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaNomeCubo_NomeCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAbaNomeCubo_Nomecubo)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAbaNomeCubo_NomeCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxAbaNomeCubo_TabFato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAbaNomeCubo_NomeCubo, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAbaNomeCubo_NomeCuboLayout.setVerticalGroup(
            painelAbaNomeCubo_NomeCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaNomeCubo_NomeCuboLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaNomeCubo_NomeCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbaNomeCubo_Nomecubo)
                    .addComponent(txtAbaNomeCubo_NomeCubo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAbaNomeCubo_NomeCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxAbaNomeCubo_TabFato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(304, Short.MAX_VALUE))
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

        lbl.addTab("Nome do Cubo", paineAbaNomeCubo);

        painelGerenciarDimensões.setBorder(javax.swing.BorderFactory.createTitledBorder("Dimensões"));

        painelListaAtributos.setBorder(javax.swing.BorderFactory.createTitledBorder("Atributos"));
        painelListaAtributos.setLayout(new java.awt.GridLayout(1, 0));

        lblTabelaDimensao.setText("Tabela: ");

        cbxTabelaDimensao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxTabelaDimensao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTabelaDimensaoActionPerformed(evt);
            }
        });

        lblNomeDimensao.setText("Nome:");

        lblChaveDimensao.setText("PK nao visivel");
        lblChaveDimensao.setEnabled(false);

        cbxChaveDimensao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxChaveDimensao.setEnabled(false);
        cbxChaveDimensao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxChaveDimensaoActionPerformed(evt);
            }
        });

        btnAddDimensao.setText("Adicionar Dimensão");
        btnAddDimensao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDimensaoActionPerformed(evt);
            }
        });

        jcbSelecTodos.setText("Selecionar Todos");
        jcbSelecTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelecTodosActionPerformed(evt);
            }
        });

        jLabel2.setText("Link com Fato: ");

        javax.swing.GroupLayout painelAddDimensaoLayout = new javax.swing.GroupLayout(painelAddDimensao);
        painelAddDimensao.setLayout(painelAddDimensaoLayout);
        painelAddDimensaoLayout.setHorizontalGroup(
            painelAddDimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAddDimensaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAddDimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAddDimensaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddDimensao))
                    .addGroup(painelAddDimensaoLayout.createSequentialGroup()
                        .addGroup(painelAddDimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblChaveDimensao)
                            .addComponent(lblTabelaDimensao)
                            .addComponent(lblNomeDimensao)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(painelAddDimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxLinkComFato, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomeDimensao)
                            .addComponent(cbxTabelaDimensao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxChaveDimensao, 0, 239, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(painelAddDimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelListaAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSelecTodos))
                .addContainerGap())
        );
        painelAddDimensaoLayout.setVerticalGroup(
            painelAddDimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAddDimensaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAddDimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeDimensao)
                    .addComponent(txtNomeDimensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSelecTodos))
                .addGap(18, 18, 18)
                .addGroup(painelAddDimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAddDimensaoLayout.createSequentialGroup()
                        .addGroup(painelAddDimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxTabelaDimensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTabelaDimensao, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelAddDimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxLinkComFato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addComponent(btnAddDimensao)
                        .addGap(61, 61, 61)
                        .addGroup(painelAddDimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxChaveDimensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblChaveDimensao)))
                    .addComponent(painelListaAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane_Dimensoes.addTab("Adicionar Dimensão", painelAddDimensao);

        btnSalvarDimensoes.setText("Salvar");
        btnSalvarDimensoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDimensoesActionPerformed(evt);
            }
        });

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        painelListaDimensoes.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane3.setViewportView(painelListaDimensoes);

        btnVoltarDimensoes.setText("Adicionar");
        btnVoltarDimensoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarDimensoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDimensoesLayout = new javax.swing.GroupLayout(painelDimensoes);
        painelDimensoes.setLayout(painelDimensoesLayout);
        painelDimensoesLayout.setHorizontalGroup(
            painelDimensoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDimensoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDimensoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDimensoesLayout.createSequentialGroup()
                        .addGap(0, 478, Short.MAX_VALUE)
                        .addComponent(btnVoltarDimensoes)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvarDimensoes))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        painelDimensoesLayout.setVerticalGroup(
            painelDimensoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDimensoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDimensoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarDimensoes)
                    .addComponent(btnVoltarDimensoes))
                .addContainerGap())
        );

        jTabbedPane_Dimensoes.addTab("Dimensões", painelDimensoes);

        javax.swing.GroupLayout painelGerenciarDimensõesLayout = new javax.swing.GroupLayout(painelGerenciarDimensões);
        painelGerenciarDimensões.setLayout(painelGerenciarDimensõesLayout);
        painelGerenciarDimensõesLayout.setHorizontalGroup(
            painelGerenciarDimensõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerenciarDimensõesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane_Dimensoes)
                .addContainerGap())
        );
        painelGerenciarDimensõesLayout.setVerticalGroup(
            painelGerenciarDimensõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerenciarDimensõesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane_Dimensoes)
                .addContainerGap())
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
                    .addComponent(painelGerenciarDimensões, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(painelGerenciarDimensões, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(paineAbaModelDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaModelDim_Sair)
                    .addComponent(btnAbaModelDim_Proximo)
                    .addComponent(btnAbaModelDim_Voltar))
                .addContainerGap())
        );

        lbl.addTab("Modelagem Dimensões", paineAbaModelDim);

        painelGerenciarMetricas.setBorder(javax.swing.BorderFactory.createTitledBorder("Métricas"));

        lblNomeMetrica.setText("Nome: ");

        lblColunaMetrica.setText("Coluna: ");

        lblAgregadorMetrica.setText("Agregador: ");

        cbxAgregadorMetrica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxFormatoMetrica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblFormatoMetrica.setText("Formato: ");

        lblTabelaMetrica.setText("Tabela: ");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        painelListaMetricas.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane2.setViewportView(painelListaMetricas);

        btnVoltarMetricas.setText("Adicionar");
        btnVoltarMetricas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMetricasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelMetricasLayout = new javax.swing.GroupLayout(painelMetricas);
        painelMetricas.setLayout(painelMetricasLayout);
        painelMetricasLayout.setHorizontalGroup(
            painelMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMetricasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMetricasLayout.createSequentialGroup()
                        .addGap(0, 478, Short.MAX_VALUE)
                        .addComponent(btnVoltarMetricas)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvarMetricas)))
                .addContainerGap())
        );
        painelMetricasLayout.setVerticalGroup(
            painelMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMetricasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarMetricas)
                    .addComponent(btnVoltarMetricas))
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
                .addComponent(jTabbedPane_Metricas, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
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

        btnAbaModelMetri_Sair.setText("Sair");
        btnAbaModelMetri_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaModelMetri_SairActionPerformed(evt);
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
                        .addComponent(btnAbaModelMetri_Sair)))
                .addContainerGap())
        );
        painelAbaModelMetriLayout.setVerticalGroup(
            painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaModelMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelGerenciarMetricas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(painelAbaModelMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaModelMetri_Sair)
                    .addComponent(btnAbaModelMetri_Prox)
                    .addComponent(btnAbaModelMetri_Voltar))
                .addContainerGap())
        );

        lbl.addTab("Modelagem Métricas", painelAbaModelMetri);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
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

        btnAbaCuboPreview_Voltar.setText("Voltar");
        btnAbaCuboPreview_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaCuboPreview_VoltarActionPerformed(evt);
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
                        .addComponent(btnAbaCuboPreview_Voltar)
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
                .addComponent(painelAbaCuboPreview_Preview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(painelAbaCuboPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaCuboPreview_Sair)
                    .addComponent(btnAbaCuboPreview_EnviarCubo)
                    .addComponent(btnAbaCuboPreview_Voltar))
                .addContainerGap())
        );

        lbl.addTab("Visualização da Modelagem", painelAbaCuboPreview);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarMetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarMetricaActionPerformed
        GerenciarMetricas.adicionarMetrica();
    }//GEN-LAST:event_btnAdicionarMetricaActionPerformed

    private void btnAbaModelMetri_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetri_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAbaModelMetri_SairActionPerformed

    private void btnAbaModelMetri_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetri_VoltarActionPerformed
        PercorrerAbasFormAssistenteModelagem.modelMetriToModelDim();
    }//GEN-LAST:event_btnAbaModelMetri_VoltarActionPerformed

    private void btnAbaModelMetri_ProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelMetri_ProxActionPerformed
        GerenciarMetricas.modelMetriToCuboPreview();
    }//GEN-LAST:event_btnAbaModelMetri_ProxActionPerformed

    private void btnAddDimensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDimensaoActionPerformed
        GerenciarDimensoes.adicionarDimensao();
    }//GEN-LAST:event_btnAddDimensaoActionPerformed

    private void btnAbaModelDim_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelDim_VoltarActionPerformed
        PercorrerAbasFormAssistenteModelagem.modelDimToNomeCubo();
    }//GEN-LAST:event_btnAbaModelDim_VoltarActionPerformed

    private void btnAbaModelDim_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaModelDim_ProximoActionPerformed
        GerenciarDimensoes.modelDimToModelMetri();
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

    private void btnAbaCuboPreview_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaCuboPreview_VoltarActionPerformed
        cuboPreviewVoltar();
    }//GEN-LAST:event_btnAbaCuboPreview_VoltarActionPerformed

    private void cbxTabelaMetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTabelaMetricaActionPerformed
        GerenciarMetricas.carregarCbxColunasMetrica();
    }//GEN-LAST:event_cbxTabelaMetricaActionPerformed

    private void btnSalvarMetricasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMetricasActionPerformed
        GerenciarMetricas.salvarMetricas();
    }//GEN-LAST:event_btnSalvarMetricasActionPerformed

    private void cbxTabelaDimensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTabelaDimensaoActionPerformed
        GerenciarDimensoes.getTabSelecionada();
    }//GEN-LAST:event_cbxTabelaDimensaoActionPerformed

    private void btnSalvarDimensoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDimensoesActionPerformed
        GerenciarDimensoes.salvarDimensoes();
    }//GEN-LAST:event_btnSalvarDimensoesActionPerformed

    private void btnVoltarDimensoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarDimensoesActionPerformed
        GerenciarDimensoes.limparAbaAddDimensao();
    }//GEN-LAST:event_btnVoltarDimensoesActionPerformed

    private void btnVoltarMetricasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMetricasActionPerformed
        GerenciarMetricas.limparAbaAddMetrica();
    }//GEN-LAST:event_btnVoltarMetricasActionPerformed

    private void jcbSelecTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelecTodosActionPerformed
        GerenciarDimensoes.selecionarTodosAtributos();
    }//GEN-LAST:event_jcbSelecTodosActionPerformed

    private void cbxChaveDimensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxChaveDimensaoActionPerformed
        //GerenciarDimensoes.ativarSelecTodosAtrDimensao();
    }//GEN-LAST:event_cbxChaveDimensaoActionPerformed

    private void carregarTabelasImportadasParaEscolherFato(){
        cbxAbaNomeCubo_TabFato.addItem("Selecione");
        for(TabelaImportada tabImp : tabelasImportadas){
            cbxAbaNomeCubo_TabFato.addItem(tabImp.getNomeTabela());
        }
    }
    
    private void cuboPreviewVoltar(){
        PercorrerAbasFormAssistenteModelagem.cuboPreviwToModelMetri();
    }
    
    private void enviarCubo(){
        String mdx = GerarSchema.getSchemaXml();
        String nomeCubo = GerarSchema.getNomeSchema();
        String scriptSql = new String();
        for(String s : GerarScriptSql.scripts){
            scriptSql += s;
        }
        
        System.out.println("Script completo: " + scriptSql);
        
        Hashtable<String, Object> hash = new Hashtable<>();
        hash.put("login", FormLogin.login);
        hash.put("senha", FormLogin.senha);
        hash.put("idCliente", FormLogin.idCliente);
        hash.put("mdx", mdx);
        hash.put("nomeCubo", Util.formatarString(nomeCubo));
        hash.put("scriptSql", scriptSql);
        
        List<String> tabelasCubo = new ArrayList<>();
        for(TabelaImportada t : tabelasImportadas){
            tabelasCubo.add(t.getNomeTabela());
        }
        
        hash.put("tabelasCubo", tabelasCubo);

//        String url = "http://localhost:8080/SmallBI_WebService/rest/cubo/addCubeFromAssistent";
        //String url = "http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/cubo/addCubeFromAssistent";
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(urlApiAddCubo);
        Gson gson = new Gson();
        try {
            StringEntity postingString = new StringEntity(gson.toJson(hash));
            httpPost.setEntity(postingString);
            httpPost.setHeader("Content-Type", "application/json");
            HttpResponse response = httpClient.execute(httpPost);

            int cod = response.getStatusLine().getStatusCode();
            HttpEntity httpEntity = response.getEntity();
            getResponseEnviarCubo(cod, httpEntity);
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FormAssistenteModelagem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FormAssistenteModelagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String getResponseEnviarCubo(int cod, HttpEntity httpEntity){
        switch(cod){
            case 200: 
                try {
                    String json = EntityUtils.toString(httpEntity);
                    String msg = new String();
                    try {
                        JSONObject jSONObject = new JSONObject(json);
                        msg = jSONObject.getString("msg");
                    } catch (JSONException ex) {
                        msg = json;
                        //Logger.getLogger(FormAssistenteModelagem.class.getName()).log(Level.SEVERE, null, ex);
                    }

                   JOptionPane.showMessageDialog(null, msg);
                   dispose();

                } catch (IOException ex) {
                    Logger.getLogger(FormAssistenteModelagem.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(FormAssistenteModelagem.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 404:
                JOptionPane.showMessageDialog(null, "Falha ao enviar cubo. Servidor não encontrado");
                break;
            case 500:
                JOptionPane.showMessageDialog(null, "Falha ao enviar cubo. Erro interno na API");
                break;
        }
        return "";
    }
    
    private void nomeCuboToModelDim(){
        if(!txtAbaNomeCubo_NomeCubo.getText().equals("")){
            if(txtAbaNomeCubo_NomeCubo.getText().length() < 25){
                if(!cbxAbaNomeCubo_TabFato.getSelectedItem().toString().equals("Selecione")){
                    
                    //Salva o scriptSql no diretorio do usuario
                    GerarScriptSql gerarScriptSql = new GerarScriptSql();
                    gerarScriptSql.salvarQuerySQL("ScriptSQL_" + 
                    Util.formatarString(txtAbaNomeCubo_NomeCubo.getText()));
                    
                    //Seta qual sera a tabela fato do cubo
                    TabelaImportada tabImp = getTabImportadaByName(cbxAbaNomeCubo_TabFato.getSelectedItem().toString());
                    tabImp.setIsTabFato(true);
                    tabelaFato = tabImp;
                    
                    //Carregar Tabelas que nao sao fato
                    GerenciarDimensoes.carregarTabelasModelDim();
                    
                    //Carregar Opcoes de Link com a tabela fato
                    GerenciarDimensoes.carregarLinksComFato();
                    
                    PercorrerAbasFormAssistenteModelagem.nomeCuboToModelDim();
                }else{
                    JOptionPane.showMessageDialog(null, "Selecione a tabela fato!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "O nome do cubo não pode ser superior a 25 caracteres!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Preencha o nome do cubo!");
        }
    }
    
    public static TabelaImportada getTabImportadaByName(String name){
        for(TabelaImportada tabImp : tabelasImportadas){
            if(tabImp.getNomeTabela().equals(name))
                return tabImp;
        }
        return null;
    }
    
    public static void gerarSchemaXml(){
        Schema schema = new Schema();
        schema.setNome("Schema " + Util.formatarString(txtAbaNomeCubo_NomeCubo.getText()));
        schema.setTabelasFato(tabelasImportadas);
        schema.setNomeCubo(Util.formatarString(txtAbaNomeCubo_NomeCubo.getText()));
        schema.setDimensoes(GerenciarDimensoes.dimensoesSalvas);
        schema.setGrupoMetrica(GerenciarMetricas.grupoMetricasSalvas);
//        schema.setLinks(GerenciarRelacionamentos.links);
        
        schema.setTabelaFato(cbxAbaNomeCubo_TabFato.getSelectedItem().toString());
        
        GerarSchema gerarSchema = new GerarSchema();
        String xmlGerado = gerarSchema.createSchema(schema);
        System.out.println("XML Gerado: " + xmlGerado);
        carregarTxtAreaPreview(xmlGerado);
    }
    
    private static void carregarTxtAreaPreview(String schemaXml){  
          edtPaneAbaCuboPreview_XmlPreview.setEditorKit(new XMLEditorKit());
          edtPaneAbaCuboPreview_XmlPreview.setText(schemaXml);
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
    private javax.swing.JButton btnAbaCuboPreview_Voltar;
    private javax.swing.JButton btnAbaModelDim_Proximo;
    private javax.swing.JButton btnAbaModelDim_Sair;
    private javax.swing.JButton btnAbaModelDim_Voltar;
    private javax.swing.JButton btnAbaModelMetri_Prox;
    private javax.swing.JButton btnAbaModelMetri_Sair;
    private javax.swing.JButton btnAbaModelMetri_Voltar;
    private javax.swing.JButton btnAbaNomeCubo_Proximo;
    private javax.swing.JButton btnAbaNomeCubo_Sair;
    public static javax.swing.JButton btnAddDimensao;
    private javax.swing.JButton btnAdicionarMetrica;
    private javax.swing.JButton btnSalvarDimensoes;
    private javax.swing.JButton btnSalvarMetricas;
    private javax.swing.JButton btnVoltarDimensoes;
    private javax.swing.JButton btnVoltarMetricas;
    public static javax.swing.JComboBox<String> cbxAbaNomeCubo_TabFato;
    public static javax.swing.JComboBox<String> cbxAgregadorMetrica;
    public static javax.swing.JComboBox<String> cbxChaveDimensao;
    public static javax.swing.JComboBox<String> cbxColunaMetrica;
    public static javax.swing.JComboBox<String> cbxFormatoMetrica;
    public static javax.swing.JComboBox<String> cbxLinkComFato;
    public static javax.swing.JComboBox<String> cbxTabelaDimensao;
    public static javax.swing.JComboBox<String> cbxTabelaMetrica;
    public static javax.swing.JEditorPane edtPaneAbaCuboPreview_XmlPreview;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTabbedPane jTabbedPane_Dimensoes;
    public static javax.swing.JTabbedPane jTabbedPane_Metricas;
    public static javax.swing.JCheckBox jcbSelecTodos;
    public static javax.swing.JTabbedPane lbl;
    private javax.swing.JLabel lblAbaNomeCubo_Nomecubo;
    private javax.swing.JLabel lblAgregadorMetrica;
    private javax.swing.JLabel lblChaveDimensao;
    private javax.swing.JLabel lblColunaMetrica;
    private javax.swing.JLabel lblFormatoMetrica;
    private javax.swing.JLabel lblNomeDimensao;
    private javax.swing.JLabel lblNomeMetrica;
    private javax.swing.JLabel lblTabelaDimensao;
    private javax.swing.JLabel lblTabelaMetrica;
    private javax.swing.JPanel paineAbaModelDim;
    private javax.swing.JPanel paineAbaNomeCubo;
    private javax.swing.JPanel painelAbaCuboPreview;
    private javax.swing.JPanel painelAbaCuboPreview_Preview;
    private javax.swing.JPanel painelAbaModelMetri;
    private javax.swing.JPanel painelAbaNomeCubo_NomeCubo;
    private javax.swing.JPanel painelAddDimensao;
    private javax.swing.JPanel painelAddMetri;
    private javax.swing.JPanel painelDimensoes;
    private javax.swing.JPanel painelGerenciarDimensões;
    public static javax.swing.JPanel painelGerenciarMetricas;
    public static javax.swing.JPanel painelListaAtributos;
    public static javax.swing.JPanel painelListaDimensoes;
    public static javax.swing.JPanel painelListaMetricas;
    private javax.swing.JPanel painelMetricas;
    public static javax.swing.JTextField txtAbaNomeCubo_NomeCubo;
    public static javax.swing.JTextField txtNomeDimensao;
    public static javax.swing.JTextField txtNomeMetrica;
    // End of variables declaration//GEN-END:variables
}
