package view;

import business.ImportarCsv;
import view.percorrerAbas.PercorrerAbasFormPrincipal;
import business.ImportarDb;
import business.ImportarXlsx;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class FormAssistenteImportacao extends javax.swing.JFrame {

    private List<JComboBox> listaDeCbxTipos = new ArrayList<>();
    public static boolean importandoDeArquivo = true;
    private JTable jTableAtivo = new JTable();    
    
    public FormAssistenteImportacao() {
        initComponents();
        PercorrerAbasFormPrincipal.desativarAbasNoInicio();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelAbas = new javax.swing.JTabbedPane();
        painelAbaInicio = new javax.swing.JPanel();
        painelAbaInicio_ExplicaoAssistente = new javax.swing.JPanel();
        jScrollPaneInicioExplicacao = new javax.swing.JScrollPane();
        txtAreaAbaInicio_Explicacao = new javax.swing.JTextArea();
        btnAbaInicio_Proximo = new javax.swing.JButton();
        painelAbaTipoImportação = new javax.swing.JPanel();
        painelAbaTipoImport_ImportacaoArquivo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAbaTipoImport_ImportacaoArquivo = new javax.swing.JTextArea();
        btnAbaTipoImport_ImportarArquivo = new javax.swing.JButton();
        painelAbaTipoImport_ImportacaoBanco = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaImportacaoBanco = new javax.swing.JTextArea();
        btnAbaTipoImportImportarBanco = new javax.swing.JButton();
        btnAbaTipoImport_Voltar = new javax.swing.JButton();
        painelAbaImportacaoArquivo = new javax.swing.JPanel();
        painelAbaImportArq_ImportCsv = new javax.swing.JPanel();
        jScrollPaneImportCsv = new javax.swing.JScrollPane();
        txtAreaAbaImportArq_ImportCsv = new javax.swing.JTextArea();
        btnAbaImportArq_ProcurarArquivoCsv = new javax.swing.JButton();
        cbxAbaImportArq_ParamSeparador = new javax.swing.JComboBox<>();
        lblAbaImportArq_ParamSeparador = new javax.swing.JLabel();
        painelAbaImportArq_ImportXlsx = new javax.swing.JPanel();
        jScrollPaneImportXlsx = new javax.swing.JScrollPane();
        txtAreaAbaImportArq_ImportXlsx = new javax.swing.JTextArea();
        btnAbaImportArq_ProcurarPlanilhaXlsx = new javax.swing.JButton();
        btnAbaImportArq_Voltar = new javax.swing.JButton();
        painelAbaConexBanco = new javax.swing.JPanel();
        painelAbaConexBd_Conexao = new javax.swing.JPanel();
        lblAbaConexBd_Sgbd = new javax.swing.JLabel();
        cbxAbaConexBd_Sgbd = new javax.swing.JComboBox<>();
        lblAbaConexBd_Banco = new javax.swing.JLabel();
        txtAbaConexBd_Banco = new javax.swing.JTextField();
        lblAbaConexBd_Endereco = new javax.swing.JLabel();
        txtAbaConexBd_Endereco = new javax.swing.JTextField();
        lblABaConexBd_Porta = new javax.swing.JLabel();
        txtAbaConexBd_Porta = new javax.swing.JTextField();
        lblAbaConexBd_Usuario = new javax.swing.JLabel();
        txtAbaConexBd_Usuario = new javax.swing.JTextField();
        lblAbaConexBd_Senha = new javax.swing.JLabel();
        txtPassAbaConexBd_Senha = new javax.swing.JPasswordField();
        btnAbaConexBd_Conectar = new javax.swing.JButton();
        painelAbaConexBd_InfoConex = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaAbaConexBd_InfoConex = new javax.swing.JTextArea();
        btnAbaConexBd_Ajuda = new javax.swing.JButton();
        btnAbaConexBd_Voltar = new javax.swing.JButton();
        btnAbaConexBd_Prox = new javax.swing.JButton();
        painelAbaConsulBanco = new javax.swing.JPanel();
        painelAbaConsulBd_ConsultarBd = new javax.swing.JPanel();
        painelAbaConexBd_ConsulDefault = new javax.swing.JPanel();
        txtAbaConexBd_Tabela = new javax.swing.JLabel();
        cbxAbaConexBd_Tabela = new javax.swing.JComboBox<>();
        btnAbaConexBd_ImportTabela = new javax.swing.JButton();
        painelAbaImportBd_ConsulPerson = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAbaImportBd_ConsulPerson = new javax.swing.JTextArea();
        btnAbaImportBd_ExecConsulPerson = new javax.swing.JButton();
        painelAbaConsulBd_InfoConsul = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaAbaConsulBd_InfoConsul = new javax.swing.JTextArea();
        btnAbaConsulBd_InfoAjuda = new javax.swing.JButton();
        btnAbaConsulBd_Voltar = new javax.swing.JButton();
        painelAbaTabelaPreview = new javax.swing.JPanel();
        painelAbaTabPrev_TrabDados = new javax.swing.JPanel();
        btnAbaTabPrev_ImportMaisDados = new javax.swing.JButton();
        btnAbaTabPrev_GerarCuboXml = new javax.swing.JButton();
        txtAbaTabPrev_TrabDados = new javax.swing.JTextField();
        painelAbaTabPrev_AreaDaTabResult = new javax.swing.JPanel();
        jScrollPaneAbaTabPrev_ScrollDaAreaTabPrev = new javax.swing.JScrollPane();
        painelAbaTabPrev_TabPrevResult = new javax.swing.JPanel();
        painelAbaTabPrev_painelTiposVariaveis = new javax.swing.JPanel();
        painelAbaTabPrev_CbxTiposVariaveis = new javax.swing.JPanel();
        painelAbaTabPrev_painelTabela = new javax.swing.JPanel();
        btnAbaTabPrev_ValidarTipos = new javax.swing.JButton();
        btnAbaTabPrev_SalvarTabela = new javax.swing.JButton();
        btnAbaTabPrev_Voltar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmallBI - Assistente de Importação");

        painelAbaInicio_ExplicaoAssistente.setBorder(javax.swing.BorderFactory.createTitledBorder("Como utilizar o Assistente de Importação do SmallBI"));

        txtAreaAbaInicio_Explicacao.setColumns(20);
        txtAreaAbaInicio_Explicacao.setRows(5);
        txtAreaAbaInicio_Explicacao.setText("\t\n\t\n\t           Aqui vai o texto explicativo para utilização do Assistente de Importação do SmallBI");
        txtAreaAbaInicio_Explicacao.setFocusable(false);
        jScrollPaneInicioExplicacao.setViewportView(txtAreaAbaInicio_Explicacao);

        btnAbaInicio_Proximo.setText("Próximo");
        btnAbaInicio_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaInicio_ProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaInicio_ExplicaoAssistenteLayout = new javax.swing.GroupLayout(painelAbaInicio_ExplicaoAssistente);
        painelAbaInicio_ExplicaoAssistente.setLayout(painelAbaInicio_ExplicaoAssistenteLayout);
        painelAbaInicio_ExplicaoAssistenteLayout.setHorizontalGroup(
            painelAbaInicio_ExplicaoAssistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaInicio_ExplicaoAssistenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaInicio_ExplicaoAssistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneInicioExplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaInicio_ExplicaoAssistenteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaInicio_Proximo)))
                .addContainerGap())
        );
        painelAbaInicio_ExplicaoAssistenteLayout.setVerticalGroup(
            painelAbaInicio_ExplicaoAssistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaInicio_ExplicaoAssistenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneInicioExplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAbaInicio_Proximo)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelAbaInicioLayout = new javax.swing.GroupLayout(painelAbaInicio);
        painelAbaInicio.setLayout(painelAbaInicioLayout);
        painelAbaInicioLayout.setHorizontalGroup(
            painelAbaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaInicio_ExplicaoAssistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAbaInicioLayout.setVerticalGroup(
            painelAbaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaInicio_ExplicaoAssistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelAbas.addTab("Inicio", painelAbaInicio);

        painelAbaTipoImport_ImportacaoArquivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Importar a partir de um arquivo CSV ou XLSX"));

        txtAreaAbaTipoImport_ImportacaoArquivo.setBackground(new java.awt.Color(204, 204, 255));
        txtAreaAbaTipoImport_ImportacaoArquivo.setColumns(20);
        txtAreaAbaTipoImport_ImportacaoArquivo.setRows(5);
        txtAreaAbaTipoImport_ImportacaoArquivo.setText("\t\n\tNesta opção você pode tanto escolher arquivos CSV quanto planilhas no formato XLSX,\n          você precisa apenas nos dizer o caminho do arquivo e no caso de arquivos no formato CSV, precisará nos\n                                                            informar o parâmetro separador de colunas.");
        txtAreaAbaTipoImport_ImportacaoArquivo.setFocusable(false);
        jScrollPane1.setViewportView(txtAreaAbaTipoImport_ImportacaoArquivo);

        btnAbaTipoImport_ImportarArquivo.setText("Importar Arquivo");
        btnAbaTipoImport_ImportarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaTipoImport_ImportarArquivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaTipoImport_ImportacaoArquivoLayout = new javax.swing.GroupLayout(painelAbaTipoImport_ImportacaoArquivo);
        painelAbaTipoImport_ImportacaoArquivo.setLayout(painelAbaTipoImport_ImportacaoArquivoLayout);
        painelAbaTipoImport_ImportacaoArquivoLayout.setHorizontalGroup(
            painelAbaTipoImport_ImportacaoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTipoImport_ImportacaoArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaTipoImport_ImportacaoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaTipoImport_ImportacaoArquivoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaTipoImport_ImportarArquivo)))
                .addContainerGap())
        );
        painelAbaTipoImport_ImportacaoArquivoLayout.setVerticalGroup(
            painelAbaTipoImport_ImportacaoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTipoImport_ImportacaoArquivoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbaTipoImport_ImportarArquivo)
                .addContainerGap())
        );

        painelAbaTipoImport_ImportacaoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Importar a partir de um Banco de Dados"));

        txtAreaImportacaoBanco.setBackground(new java.awt.Color(204, 204, 255));
        txtAreaImportacaoBanco.setColumns(20);
        txtAreaImportacaoBanco.setRows(5);
        txtAreaImportacaoBanco.setText("\t\n\tNesta opção você poderá se conectar a um banco de dados PostgreSQL, MySQL ou \n             SQL Server, poderá ainda consultar tabelas completas ou fazer suas próprias consultas customizadas.");
        txtAreaImportacaoBanco.setFocusable(false);
        jScrollPane2.setViewportView(txtAreaImportacaoBanco);

        btnAbaTipoImportImportarBanco.setText("Importar do Banco de Dados");
        btnAbaTipoImportImportarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaTipoImportImportarBancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaTipoImport_ImportacaoBancoLayout = new javax.swing.GroupLayout(painelAbaTipoImport_ImportacaoBanco);
        painelAbaTipoImport_ImportacaoBanco.setLayout(painelAbaTipoImport_ImportacaoBancoLayout);
        painelAbaTipoImport_ImportacaoBancoLayout.setHorizontalGroup(
            painelAbaTipoImport_ImportacaoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTipoImport_ImportacaoBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaTipoImport_ImportacaoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaTipoImport_ImportacaoBancoLayout.createSequentialGroup()
                        .addGap(0, 523, Short.MAX_VALUE)
                        .addComponent(btnAbaTipoImportImportarBanco)))
                .addContainerGap())
        );
        painelAbaTipoImport_ImportacaoBancoLayout.setVerticalGroup(
            painelAbaTipoImport_ImportacaoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTipoImport_ImportacaoBancoLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbaTipoImportImportarBanco)
                .addContainerGap())
        );

        btnAbaTipoImport_Voltar.setText("Voltar");
        btnAbaTipoImport_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaTipoImport_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaTipoImportaçãoLayout = new javax.swing.GroupLayout(painelAbaTipoImportação);
        painelAbaTipoImportação.setLayout(painelAbaTipoImportaçãoLayout);
        painelAbaTipoImportaçãoLayout.setHorizontalGroup(
            painelAbaTipoImportaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTipoImportaçãoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaTipoImportaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaTipoImport_ImportacaoBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAbaTipoImport_ImportacaoArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaTipoImportaçãoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaTipoImport_Voltar)))
                .addContainerGap())
        );
        painelAbaTipoImportaçãoLayout.setVerticalGroup(
            painelAbaTipoImportaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTipoImportaçãoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaTipoImport_ImportacaoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAbaTipoImport_ImportacaoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(btnAbaTipoImport_Voltar)
                .addContainerGap())
        );

        painelAbas.addTab("Tipo de Importação", painelAbaTipoImportação);

        painelAbaImportArq_ImportCsv.setBorder(javax.swing.BorderFactory.createTitledBorder("Impotação de Arquivo CSV"));

        txtAreaAbaImportArq_ImportCsv.setBackground(new java.awt.Color(204, 204, 255));
        txtAreaAbaImportArq_ImportCsv.setColumns(20);
        txtAreaAbaImportArq_ImportCsv.setRows(5);
        txtAreaAbaImportArq_ImportCsv.setText("\t\n\t  Imporme-nos o parâmetro separador de colunas no seu arquivo CSV e depois nos mostre\n\t  \t\t            o caminho até ele.");
        txtAreaAbaImportArq_ImportCsv.setFocusable(false);
        jScrollPaneImportCsv.setViewportView(txtAreaAbaImportArq_ImportCsv);

        btnAbaImportArq_ProcurarArquivoCsv.setText("Procurar Arquivo CSV");
        btnAbaImportArq_ProcurarArquivoCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaImportArq_ProcurarArquivoCsvActionPerformed(evt);
            }
        });

        cbxAbaImportArq_ParamSeparador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ",", ":", ";" }));

        lblAbaImportArq_ParamSeparador.setText("Informe o Parâmentro Separador de Campos: ");

        javax.swing.GroupLayout painelAbaImportArq_ImportCsvLayout = new javax.swing.GroupLayout(painelAbaImportArq_ImportCsv);
        painelAbaImportArq_ImportCsv.setLayout(painelAbaImportArq_ImportCsvLayout);
        painelAbaImportArq_ImportCsvLayout.setHorizontalGroup(
            painelAbaImportArq_ImportCsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportArq_ImportCsvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaImportArq_ImportCsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneImportCsv, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaImportArq_ImportCsvLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblAbaImportArq_ParamSeparador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxAbaImportArq_ParamSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaImportArq_ProcurarArquivoCsv)))
                .addContainerGap())
        );
        painelAbaImportArq_ImportCsvLayout.setVerticalGroup(
            painelAbaImportArq_ImportCsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportArq_ImportCsvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneImportCsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAbaImportArq_ImportCsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaImportArq_ProcurarArquivoCsv)
                    .addComponent(cbxAbaImportArq_ParamSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAbaImportArq_ParamSeparador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAbaImportArq_ImportXlsx.setBorder(javax.swing.BorderFactory.createTitledBorder("Importação de Arquivo XLSX"));

        txtAreaAbaImportArq_ImportXlsx.setBackground(new java.awt.Color(204, 204, 255));
        txtAreaAbaImportArq_ImportXlsx.setColumns(20);
        txtAreaAbaImportArq_ImportXlsx.setRows(5);
        txtAreaAbaImportArq_ImportXlsx.setText("\n\n\t\t                   Nos mostre o caminho até sua planilha.");
        txtAreaAbaImportArq_ImportXlsx.setFocusable(false);
        jScrollPaneImportXlsx.setViewportView(txtAreaAbaImportArq_ImportXlsx);

        btnAbaImportArq_ProcurarPlanilhaXlsx.setText("Procurar Planilha");
        btnAbaImportArq_ProcurarPlanilhaXlsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaImportArq_ProcurarPlanilhaXlsxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaImportArq_ImportXlsxLayout = new javax.swing.GroupLayout(painelAbaImportArq_ImportXlsx);
        painelAbaImportArq_ImportXlsx.setLayout(painelAbaImportArq_ImportXlsxLayout);
        painelAbaImportArq_ImportXlsxLayout.setHorizontalGroup(
            painelAbaImportArq_ImportXlsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportArq_ImportXlsxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaImportArq_ImportXlsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneImportXlsx)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaImportArq_ImportXlsxLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaImportArq_ProcurarPlanilhaXlsx)))
                .addContainerGap())
        );
        painelAbaImportArq_ImportXlsxLayout.setVerticalGroup(
            painelAbaImportArq_ImportXlsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportArq_ImportXlsxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneImportXlsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbaImportArq_ProcurarPlanilhaXlsx)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAbaImportArq_Voltar.setText("Voltar");
        btnAbaImportArq_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaImportArq_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaImportacaoArquivoLayout = new javax.swing.GroupLayout(painelAbaImportacaoArquivo);
        painelAbaImportacaoArquivo.setLayout(painelAbaImportacaoArquivoLayout);
        painelAbaImportacaoArquivoLayout.setHorizontalGroup(
            painelAbaImportacaoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportacaoArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaImportacaoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaImportArq_ImportCsv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAbaImportArq_ImportXlsx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaImportacaoArquivoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaImportArq_Voltar)))
                .addContainerGap())
        );
        painelAbaImportacaoArquivoLayout.setVerticalGroup(
            painelAbaImportacaoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportacaoArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaImportArq_ImportCsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAbaImportArq_ImportXlsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(btnAbaImportArq_Voltar)
                .addContainerGap())
        );

        painelAbas.addTab("Importação de Arquivo", painelAbaImportacaoArquivo);

        painelAbaConexBd_Conexao.setBorder(javax.swing.BorderFactory.createTitledBorder("Conexão com o Banco"));

        lblAbaConexBd_Sgbd.setText("SGBD:");

        cbxAbaConexBd_Sgbd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "PostgreSQL", "MySQL", "SQL Server" }));
        cbxAbaConexBd_Sgbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAbaConexBd_SgbdActionPerformed(evt);
            }
        });

        lblAbaConexBd_Banco.setText("Banco:");

        lblAbaConexBd_Endereco.setText("Endereço:");

        txtAbaConexBd_Endereco.setText("localhost");

        lblABaConexBd_Porta.setText("Porta:");

        lblAbaConexBd_Usuario.setText("Usuário:");

        lblAbaConexBd_Senha.setText("Senha");

        btnAbaConexBd_Conectar.setText("Conectar");
        btnAbaConexBd_Conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaConexBd_ConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaConexBd_ConexaoLayout = new javax.swing.GroupLayout(painelAbaConexBd_Conexao);
        painelAbaConexBd_Conexao.setLayout(painelAbaConexBd_ConexaoLayout);
        painelAbaConexBd_ConexaoLayout.setHorizontalGroup(
            painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConexBd_ConexaoLayout.createSequentialGroup()
                .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelAbaConexBd_ConexaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(painelAbaConexBd_ConexaoLayout.createSequentialGroup()
                                    .addComponent(lblAbaConexBd_Sgbd)
                                    .addGap(40, 40, 40)
                                    .addComponent(cbxAbaConexBd_Sgbd, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painelAbaConexBd_ConexaoLayout.createSequentialGroup()
                                    .addComponent(lblAbaConexBd_Endereco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAbaConexBd_Usuario)
                                        .addComponent(txtAbaConexBd_Endereco))))
                            .addComponent(lblAbaConexBd_Usuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                        .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAbaConexBd_Banco)
                            .addComponent(lblABaConexBd_Porta)
                            .addComponent(lblAbaConexBd_Senha)))
                    .addGroup(painelAbaConexBd_ConexaoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAbaConexBd_Conectar)
                        .addGap(104, 104, 104)))
                .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtAbaConexBd_Banco)
                    .addComponent(txtAbaConexBd_Porta)
                    .addComponent(txtPassAbaConexBd_Senha, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAbaConexBd_ConexaoLayout.setVerticalGroup(
            painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConexBd_ConexaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbaConexBd_Sgbd)
                    .addComponent(cbxAbaConexBd_Sgbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAbaConexBd_Banco)
                    .addComponent(txtAbaConexBd_Banco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblABaConexBd_Porta)
                    .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAbaConexBd_Endereco)
                        .addComponent(txtAbaConexBd_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAbaConexBd_Porta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAbaConexBd_Usuario)
                        .addComponent(txtAbaConexBd_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAbaConexBd_Senha)
                        .addComponent(txtPassAbaConexBd_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnAbaConexBd_Conectar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAbaConexBd_InfoConex.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações de Conexão"));

        txtAreaAbaConexBd_InfoConex.setBackground(new java.awt.Color(204, 204, 255));
        txtAreaAbaConexBd_InfoConex.setColumns(20);
        txtAreaAbaConexBd_InfoConex.setRows(5);
        txtAreaAbaConexBd_InfoConex.setText("\t         \n\t          Informe-nos as variáveis necessárias para se conectar com seu banco de dados.\n\t                   Lembre-se que ele pode ser acessado localmente ou remotamente.\n\t          Qualquer dúvida clique no botão ajuda ou acesse nosso site www.smallbi.com.br");
        txtAreaAbaConexBd_InfoConex.setToolTipText("");
        txtAreaAbaConexBd_InfoConex.setFocusable(false);
        jScrollPane4.setViewportView(txtAreaAbaConexBd_InfoConex);

        btnAbaConexBd_Ajuda.setText("Ajuda");
        btnAbaConexBd_Ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaConexBd_AjudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaConexBd_InfoConexLayout = new javax.swing.GroupLayout(painelAbaConexBd_InfoConex);
        painelAbaConexBd_InfoConex.setLayout(painelAbaConexBd_InfoConexLayout);
        painelAbaConexBd_InfoConexLayout.setHorizontalGroup(
            painelAbaConexBd_InfoConexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConexBd_InfoConexLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaConexBd_InfoConexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaConexBd_InfoConexLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaConexBd_Ajuda)))
                .addContainerGap())
        );
        painelAbaConexBd_InfoConexLayout.setVerticalGroup(
            painelAbaConexBd_InfoConexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConexBd_InfoConexLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAbaConexBd_Ajuda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAbaConexBd_Voltar.setText("Voltar");
        btnAbaConexBd_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaConexBd_VoltarActionPerformed(evt);
            }
        });

        btnAbaConexBd_Prox.setText("Próximo");
        btnAbaConexBd_Prox.setEnabled(false);
        btnAbaConexBd_Prox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaConexBd_ProxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaConexBancoLayout = new javax.swing.GroupLayout(painelAbaConexBanco);
        painelAbaConexBanco.setLayout(painelAbaConexBancoLayout);
        painelAbaConexBancoLayout.setHorizontalGroup(
            painelAbaConexBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConexBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaConexBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaConexBd_InfoConex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAbaConexBd_Conexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaConexBancoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaConexBd_Prox)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaConexBd_Voltar)))
                .addContainerGap())
        );
        painelAbaConexBancoLayout.setVerticalGroup(
            painelAbaConexBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaConexBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaConexBd_InfoConex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAbaConexBd_Conexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(painelAbaConexBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaConexBd_Voltar)
                    .addComponent(btnAbaConexBd_Prox))
                .addContainerGap())
        );

        painelAbas.addTab("Conexão do Banco", painelAbaConexBanco);

        painelAbaConsulBd_ConsultarBd.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Banco"));

        painelAbaConexBd_ConsulDefault.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta Default"));

        txtAbaConexBd_Tabela.setText("Tabela:");

        btnAbaConexBd_ImportTabela.setText("Importar Tabela");
        btnAbaConexBd_ImportTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaConexBd_ImportTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaConexBd_ConsulDefaultLayout = new javax.swing.GroupLayout(painelAbaConexBd_ConsulDefault);
        painelAbaConexBd_ConsulDefault.setLayout(painelAbaConexBd_ConsulDefaultLayout);
        painelAbaConexBd_ConsulDefaultLayout.setHorizontalGroup(
            painelAbaConexBd_ConsulDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConexBd_ConsulDefaultLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(txtAbaConexBd_Tabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxAbaConexBd_Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbaConexBd_ImportTabela)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        painelAbaConexBd_ConsulDefaultLayout.setVerticalGroup(
            painelAbaConexBd_ConsulDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConexBd_ConsulDefaultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaConexBd_ConsulDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAbaConexBd_Tabela)
                    .addComponent(cbxAbaConexBd_Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbaConexBd_ImportTabela))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        painelAbaImportBd_ConsulPerson.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta Personalizada"));

        txtAbaImportBd_ConsulPerson.setColumns(20);
        txtAbaImportBd_ConsulPerson.setRows(5);
        jScrollPane3.setViewportView(txtAbaImportBd_ConsulPerson);

        btnAbaImportBd_ExecConsulPerson.setText("Executar");
        btnAbaImportBd_ExecConsulPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaImportBd_ExecConsulPersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaImportBd_ConsulPersonLayout = new javax.swing.GroupLayout(painelAbaImportBd_ConsulPerson);
        painelAbaImportBd_ConsulPerson.setLayout(painelAbaImportBd_ConsulPersonLayout);
        painelAbaImportBd_ConsulPersonLayout.setHorizontalGroup(
            painelAbaImportBd_ConsulPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportBd_ConsulPersonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaImportBd_ConsulPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaImportBd_ConsulPersonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaImportBd_ExecConsulPerson)))
                .addContainerGap())
        );
        painelAbaImportBd_ConsulPersonLayout.setVerticalGroup(
            painelAbaImportBd_ConsulPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportBd_ConsulPersonLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbaImportBd_ExecConsulPerson)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelAbaConsulBd_ConsultarBdLayout = new javax.swing.GroupLayout(painelAbaConsulBd_ConsultarBd);
        painelAbaConsulBd_ConsultarBd.setLayout(painelAbaConsulBd_ConsultarBdLayout);
        painelAbaConsulBd_ConsultarBdLayout.setHorizontalGroup(
            painelAbaConsulBd_ConsultarBdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConsulBd_ConsultarBdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaConsulBd_ConsultarBdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaConexBd_ConsulDefault, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAbaImportBd_ConsulPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAbaConsulBd_ConsultarBdLayout.setVerticalGroup(
            painelAbaConsulBd_ConsultarBdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConsulBd_ConsultarBdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaConexBd_ConsulDefault, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAbaImportBd_ConsulPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAbaConsulBd_InfoConsul.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações de Consulta"));

        txtAreaAbaConsulBd_InfoConsul.setBackground(new java.awt.Color(204, 204, 255));
        txtAreaAbaConsulBd_InfoConsul.setColumns(20);
        txtAreaAbaConsulBd_InfoConsul.setRows(5);
        txtAreaAbaConsulBd_InfoConsul.setText("\n\t\tVocê pode consultar seu banco de dados de duas formas:\n           Na consulta default, você consultará qualquer tabela do seu banco e todos os dados dela serão trazidos.\n       Na consulta personalizada, você poderá montar sua query sql como desejar seguindo os padrões de seu SGBD.");
        txtAreaAbaConsulBd_InfoConsul.setFocusable(false);
        jScrollPane6.setViewportView(txtAreaAbaConsulBd_InfoConsul);

        btnAbaConsulBd_InfoAjuda.setText("Ajuda");
        btnAbaConsulBd_InfoAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaConsulBd_InfoAjudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaConsulBd_InfoConsulLayout = new javax.swing.GroupLayout(painelAbaConsulBd_InfoConsul);
        painelAbaConsulBd_InfoConsul.setLayout(painelAbaConsulBd_InfoConsulLayout);
        painelAbaConsulBd_InfoConsulLayout.setHorizontalGroup(
            painelAbaConsulBd_InfoConsulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConsulBd_InfoConsulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaConsulBd_InfoConsulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaConsulBd_InfoConsulLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaConsulBd_InfoAjuda)))
                .addContainerGap())
        );
        painelAbaConsulBd_InfoConsulLayout.setVerticalGroup(
            painelAbaConsulBd_InfoConsulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConsulBd_InfoConsulLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbaConsulBd_InfoAjuda))
        );

        btnAbaConsulBd_Voltar.setText("Voltar");
        btnAbaConsulBd_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaConsulBd_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaConsulBancoLayout = new javax.swing.GroupLayout(painelAbaConsulBanco);
        painelAbaConsulBanco.setLayout(painelAbaConsulBancoLayout);
        painelAbaConsulBancoLayout.setHorizontalGroup(
            painelAbaConsulBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConsulBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaConsulBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaConsulBd_InfoConsul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAbaConsulBd_ConsultarBd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaConsulBancoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaConsulBd_Voltar)))
                .addContainerGap())
        );
        painelAbaConsulBancoLayout.setVerticalGroup(
            painelAbaConsulBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaConsulBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaConsulBd_InfoConsul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAbaConsulBd_ConsultarBd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbaConsulBd_Voltar)
                .addContainerGap())
        );

        painelAbas.addTab("Consultar Banco", painelAbaConsulBanco);

        painelAbaTabPrev_TrabDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Trabalhar Dados"));

        btnAbaTabPrev_ImportMaisDados.setText("Importar Mais Dados");
        btnAbaTabPrev_ImportMaisDados.setEnabled(false);
        btnAbaTabPrev_ImportMaisDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaTabPrev_ImportMaisDadosActionPerformed(evt);
            }
        });

        btnAbaTabPrev_GerarCuboXml.setText("Gerar Cubo");
        btnAbaTabPrev_GerarCuboXml.setEnabled(false);
        btnAbaTabPrev_GerarCuboXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaTabPrev_GerarCuboXmlActionPerformed(evt);
            }
        });

        txtAbaTabPrev_TrabDados.setBackground(new java.awt.Color(204, 204, 255));
        txtAbaTabPrev_TrabDados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAbaTabPrev_TrabDados.setText("Neste último passo, informe se deseja importar mais dados ou gerar o Cubo XML");
        txtAbaTabPrev_TrabDados.setBorder(new javax.swing.border.MatteBorder(null));
        txtAbaTabPrev_TrabDados.setFocusable(false);

        javax.swing.GroupLayout painelAbaTabPrev_TrabDadosLayout = new javax.swing.GroupLayout(painelAbaTabPrev_TrabDados);
        painelAbaTabPrev_TrabDados.setLayout(painelAbaTabPrev_TrabDadosLayout);
        painelAbaTabPrev_TrabDadosLayout.setHorizontalGroup(
            painelAbaTabPrev_TrabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_TrabDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaTabPrev_TrabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaTabPrev_TrabDadosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaTabPrev_ImportMaisDados)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaTabPrev_GerarCuboXml))
                    .addComponent(txtAbaTabPrev_TrabDados))
                .addContainerGap())
        );
        painelAbaTabPrev_TrabDadosLayout.setVerticalGroup(
            painelAbaTabPrev_TrabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaTabPrev_TrabDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAbaTabPrev_TrabDados, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelAbaTabPrev_TrabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaTabPrev_ImportMaisDados)
                    .addComponent(btnAbaTabPrev_GerarCuboXml))
                .addGap(19, 19, 19))
        );

        painelAbaTabPrev_AreaDaTabResult.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela Preview Resultado"));

        painelAbaTabPrev_CbxTiposVariaveis.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout painelAbaTabPrev_painelTiposVariaveisLayout = new javax.swing.GroupLayout(painelAbaTabPrev_painelTiposVariaveis);
        painelAbaTabPrev_painelTiposVariaveis.setLayout(painelAbaTabPrev_painelTiposVariaveisLayout);
        painelAbaTabPrev_painelTiposVariaveisLayout.setHorizontalGroup(
            painelAbaTabPrev_painelTiposVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_painelTiposVariaveisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaTabPrev_CbxTiposVariaveis, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAbaTabPrev_painelTiposVariaveisLayout.setVerticalGroup(
            painelAbaTabPrev_painelTiposVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_painelTiposVariaveisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaTabPrev_CbxTiposVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelAbaTabPrev_painelTabelaLayout = new javax.swing.GroupLayout(painelAbaTabPrev_painelTabela);
        painelAbaTabPrev_painelTabela.setLayout(painelAbaTabPrev_painelTabelaLayout);
        painelAbaTabPrev_painelTabelaLayout.setHorizontalGroup(
            painelAbaTabPrev_painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelAbaTabPrev_painelTabelaLayout.setVerticalGroup(
            painelAbaTabPrev_painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelAbaTabPrev_TabPrevResultLayout = new javax.swing.GroupLayout(painelAbaTabPrev_TabPrevResult);
        painelAbaTabPrev_TabPrevResult.setLayout(painelAbaTabPrev_TabPrevResultLayout);
        painelAbaTabPrev_TabPrevResultLayout.setHorizontalGroup(
            painelAbaTabPrev_TabPrevResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaTabPrev_TabPrevResultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaTabPrev_TabPrevResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelAbaTabPrev_painelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAbaTabPrev_painelTiposVariaveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAbaTabPrev_TabPrevResultLayout.setVerticalGroup(
            painelAbaTabPrev_TabPrevResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_TabPrevResultLayout.createSequentialGroup()
                .addComponent(painelAbaTabPrev_painelTiposVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAbaTabPrev_painelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPaneAbaTabPrev_ScrollDaAreaTabPrev.setViewportView(painelAbaTabPrev_TabPrevResult);

        btnAbaTabPrev_ValidarTipos.setText("Validar Tipos de Dados");
        btnAbaTabPrev_ValidarTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaTabPrev_ValidarTiposActionPerformed(evt);
            }
        });

        btnAbaTabPrev_SalvarTabela.setText("Salvar Tabela");
        btnAbaTabPrev_SalvarTabela.setEnabled(false);
        btnAbaTabPrev_SalvarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaTabPrev_SalvarTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaTabPrev_AreaDaTabResultLayout = new javax.swing.GroupLayout(painelAbaTabPrev_AreaDaTabResult);
        painelAbaTabPrev_AreaDaTabResult.setLayout(painelAbaTabPrev_AreaDaTabResultLayout);
        painelAbaTabPrev_AreaDaTabResultLayout.setHorizontalGroup(
            painelAbaTabPrev_AreaDaTabResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_AreaDaTabResultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaTabPrev_AreaDaTabResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneAbaTabPrev_ScrollDaAreaTabPrev)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaTabPrev_AreaDaTabResultLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaTabPrev_SalvarTabela)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaTabPrev_ValidarTipos)))
                .addContainerGap())
        );
        painelAbaTabPrev_AreaDaTabResultLayout.setVerticalGroup(
            painelAbaTabPrev_AreaDaTabResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_AreaDaTabResultLayout.createSequentialGroup()
                .addComponent(jScrollPaneAbaTabPrev_ScrollDaAreaTabPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAbaTabPrev_AreaDaTabResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaTabPrev_ValidarTipos)
                    .addComponent(btnAbaTabPrev_SalvarTabela))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAbaTabPrev_Voltar.setText("Voltar");
        btnAbaTabPrev_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaTabPrev_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaTabelaPreviewLayout = new javax.swing.GroupLayout(painelAbaTabelaPreview);
        painelAbaTabelaPreview.setLayout(painelAbaTabelaPreviewLayout);
        painelAbaTabelaPreviewLayout.setHorizontalGroup(
            painelAbaTabelaPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabelaPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaTabelaPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaTabPrev_AreaDaTabResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAbaTabPrev_TrabDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaTabelaPreviewLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaTabPrev_Voltar)))
                .addContainerGap())
        );
        painelAbaTabelaPreviewLayout.setVerticalGroup(
            painelAbaTabelaPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabelaPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaTabPrev_AreaDaTabResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelAbaTabPrev_TrabDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbaTabPrev_Voltar)
                .addContainerGap())
        );

        painelAbas.addTab("Tabela Preview", painelAbaTabelaPreview);

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
                .addComponent(painelAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbaInicio_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaInicio_ProximoActionPerformed
        PercorrerAbasFormPrincipal.abaIniToAbaTipoImport();
    }//GEN-LAST:event_btnAbaInicio_ProximoActionPerformed

    private void btnAbaTipoImport_ImportarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTipoImport_ImportarArquivoActionPerformed
        PercorrerAbasFormPrincipal.abaTipoImportToAbaImportArq();
    }//GEN-LAST:event_btnAbaTipoImport_ImportarArquivoActionPerformed

    private void btnAbaTipoImportImportarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTipoImportImportarBancoActionPerformed
        PercorrerAbasFormPrincipal.abaTipoImportToConexBanco();
        checarConexao();
    }//GEN-LAST:event_btnAbaTipoImportImportarBancoActionPerformed

    private void btnAbaImportArq_ProcurarArquivoCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaImportArq_ProcurarArquivoCsvActionPerformed
        chamarImportarCsv();
    }//GEN-LAST:event_btnAbaImportArq_ProcurarArquivoCsvActionPerformed

    private void btnAbaImportArq_ProcurarPlanilhaXlsxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaImportArq_ProcurarPlanilhaXlsxActionPerformed
        chamarImportarXlsx();
    }//GEN-LAST:event_btnAbaImportArq_ProcurarPlanilhaXlsxActionPerformed

    private void btnAbaConexBd_ConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaConexBd_ConectarActionPerformed
        conectarComBanco();
    }//GEN-LAST:event_btnAbaConexBd_ConectarActionPerformed

    private void btnAbaConexBd_ImportTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaConexBd_ImportTabelaActionPerformed
        importarTabelaDefault();
    }//GEN-LAST:event_btnAbaConexBd_ImportTabelaActionPerformed

    private void btnAbaImportBd_ExecConsulPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaImportBd_ExecConsulPersonActionPerformed
        importarTabelaPersonalizada();
    }//GEN-LAST:event_btnAbaImportBd_ExecConsulPersonActionPerformed

    private void btnAbaTabPrev_ValidarTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTabPrev_ValidarTiposActionPerformed
        validarTiposDeDados();
    }//GEN-LAST:event_btnAbaTabPrev_ValidarTiposActionPerformed

    private void cbxAbaConexBd_SgbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAbaConexBd_SgbdActionPerformed
        carregarTxtPorta();
    }//GEN-LAST:event_cbxAbaConexBd_SgbdActionPerformed

    private void btnAbaConexBd_AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaConexBd_AjudaActionPerformed
        ajudaAreaConexBanco();
    }//GEN-LAST:event_btnAbaConexBd_AjudaActionPerformed

    private void btnAbaConsulBd_InfoAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaConsulBd_InfoAjudaActionPerformed
        ajudaAreaConsulBanco();
    }//GEN-LAST:event_btnAbaConsulBd_InfoAjudaActionPerformed

    private void btnAbaTabPrev_ImportMaisDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTabPrev_ImportMaisDadosActionPerformed
        importarMaisDados();
    }//GEN-LAST:event_btnAbaTabPrev_ImportMaisDadosActionPerformed

    private void btnAbaTabPrev_GerarCuboXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTabPrev_GerarCuboXmlActionPerformed
        chamarFormGerarCuboXml();
    }//GEN-LAST:event_btnAbaTabPrev_GerarCuboXmlActionPerformed

    private void btnAbaTipoImport_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTipoImport_VoltarActionPerformed
        PercorrerAbasFormPrincipal.abaTipoImportToAbaIni();
    }//GEN-LAST:event_btnAbaTipoImport_VoltarActionPerformed

    private void btnAbaImportArq_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaImportArq_VoltarActionPerformed
        PercorrerAbasFormPrincipal.abaImportArqToAbaTipoImport();
    }//GEN-LAST:event_btnAbaImportArq_VoltarActionPerformed

    private void btnAbaConexBd_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaConexBd_VoltarActionPerformed
        PercorrerAbasFormPrincipal.abaConexBancoToAbaTipoImport();
    }//GEN-LAST:event_btnAbaConexBd_VoltarActionPerformed

    private void btnAbaConsulBd_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaConsulBd_VoltarActionPerformed
        PercorrerAbasFormPrincipal.abaConsulBancoToAbaConexBanco();
        checarConexao();
    }//GEN-LAST:event_btnAbaConsulBd_VoltarActionPerformed

    private void btnAbaTabPrev_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTabPrev_VoltarActionPerformed
        importarMaisDados();
    }//GEN-LAST:event_btnAbaTabPrev_VoltarActionPerformed

    private void btnAbaTabPrev_SalvarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTabPrev_SalvarTabelaActionPerformed
        salvarTabela();
    }//GEN-LAST:event_btnAbaTabPrev_SalvarTabelaActionPerformed

    private void btnAbaConexBd_ProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaConexBd_ProxActionPerformed
        PercorrerAbasFormPrincipal.abaConexBancoToAbaConsulBanco();
        carregarCbxTabela();
    }//GEN-LAST:event_btnAbaConexBd_ProxActionPerformed
    
    private void checarConexao(){
        ImportarDb importarDb = new ImportarDb();
        if(importarDb.checkConexao() == null){
            btnAbaConexBd_Conectar.setText("Conectar");
        }else{
            btnAbaConexBd_Conectar.setText("Desconectar");
            btnAbaConexBd_Prox.setEnabled(true);
        }
    }
    
    private void importarMaisDados(){
        listaDeCbxTipos.clear();
        painelAbaTabPrev_painelTabela.removeAll();
        painelAbaTabPrev_CbxTiposVariaveis.removeAll();
        PercorrerAbasFormPrincipal.abaTabPreviewToAbaTipoImport();
    }
    
    private void salvarTabela(){
        FormSalvarTabela frm = new FormSalvarTabela(jTableAtivo, listaDeCbxTipos);
        frm.setLocationRelativeTo(null);
        //frm.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        frm.setTitle("Assistente para Salvar Tabela Importada");
//        this.setVisible(false);
        frm.setVisible(true);
    }
    
    private void chamarFormGerarCuboXml(){               
        FormAssistenteModelagem frm = new FormAssistenteModelagem();
        frm.setLocationRelativeTo(null);
        //frm.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        frm.setTitle("Assistente de Modelagem do Cubo");
        frm.setVisible(true);        
    }
    
    private void ajudaAreaConsulBanco(){
        FormAjudaConsulBanco frm = new FormAjudaConsulBanco();
        frm.setLocationRelativeTo(null);
        //frm.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        frm.setVisible(true);       
    }
    
    private void ajudaAreaConexBanco(){
       FormAjudaConexBanco frm = new FormAjudaConexBanco();
       frm.setLocationRelativeTo(null);
       frm.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
       frm.setVisible(true);
    }
    
    private void validarTiposDeDados(){
        String msg = business.ValidarTipos.validarTipagemDosCampos(jTableAtivo, listaDeCbxTipos);                
        JOptionPane.showMessageDialog(null, msg);
        if (msg.equals("Campos validados com sucesso!")) {
            //btnAbaTabPrev_GerarCuboXml.setEnabled(true);
            btnAbaTabPrev_SalvarTabela.setEnabled(true);
        } 
    }
    
    private void importarTabelaPersonalizada(){
        ImportarDb importarDb = new ImportarDb();
        String scriptPersonalisado = txtAbaImportBd_ConsulPerson.getText();
        
        if(scriptPersonalisado != null && !scriptPersonalisado.equals("")){
            
            JTable jTable = importarDb.consultarTabelaPersonalisada(scriptPersonalisado);

            if(jTable == null){
                JOptionPane.showMessageDialog(null, "Falha ao executar Script SQL");
                //Mensagem em Conexao.getResultSet pode trazer mais detalhes;
            }else{
                PercorrerAbasFormPrincipal.abaConsulBancoToAbaTabPreview();
                painelAbaTabPrev_painelTabela.setLayout(new BoxLayout(painelAbaTabPrev_painelTabela, BoxLayout.Y_AXIS)); 
                JScrollPane jScrollPane = new JScrollPane(jTable);
                painelAbaTabPrev_painelTabela.add(jScrollPane);
                painelAbaTabPrev_painelTabela.updateUI();
                jTableAtivo = jTable;

                //Se importa do mesmo modo que um arquivo, 
                //pois não se sabe o nome da tabela ou poderá ser várias diferentes
                iniciarComboBoxTiposArquivo(jTable);                                        
            }
        }
    }
    
    private void importarTabelaDefault(){
        ImportarDb importarDb = new ImportarDb();
        String tabelaSelecionada = cbxAbaConexBd_Tabela.getSelectedItem().toString();
        
        if(tabelaSelecionada != null && !tabelaSelecionada.equals("Selecione")){
            JTable jTable = importarDb.consultarTabelaDefault(tabelaSelecionada);

            if(jTable == null){
               JOptionPane.showMessageDialog(null, "Selecione uma tabela para ser importada!");
            }else{
                PercorrerAbasFormPrincipal.abaConsulBancoToAbaTabPreview();
                painelAbaTabPrev_painelTabela.setLayout(new BoxLayout(painelAbaTabPrev_painelTabela, BoxLayout.Y_AXIS)); 
                JScrollPane jScrollPane = new JScrollPane(jTable);
                painelAbaTabPrev_painelTabela.add(jScrollPane);
                painelAbaTabPrev_painelTabela.updateUI();
                jTableAtivo = jTable;
                iniciarComboBoxTiposBanco(jTable);   
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma tabela!");
        }
    }               
    
    private void conectarComBanco(){
        ImportarDb importarDb = new ImportarDb();
        if(btnAbaConexBd_Conectar.getText().equals("Conectar")){
            if(validarCamposConexao()){            
                ArrayList<String> bancos = importarDb.setarVariaveisConexao(
                        cbxAbaConexBd_Sgbd.getSelectedItem().toString(), 
                            txtAbaConexBd_Usuario.getText(), txtPassAbaConexBd_Senha.getText(),
                                txtAbaConexBd_Endereco.getText(), txtAbaConexBd_Porta.getText());
                if(bancos != null){
                    boolean bancoExiste = carregarCbxTabela();
                    if(bancoExiste == true){
                        PercorrerAbasFormPrincipal.abaConexBancoToAbaConsulBanco();
                        btnAbaConexBd_Prox.setEnabled(true);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Falha ao conectar!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            }
        }else{
            importarDb.desconectar();
            JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
            btnAbaConexBd_Conectar.setText("Conectar");
        }
    }
    
    private boolean carregarCbxTabela(){
        ImportarDb importarDb = new ImportarDb();
        ArrayList<String> tabelas = importarDb.getTables(cbxAbaConexBd_Sgbd.getSelectedItem().toString(), 
                txtAbaConexBd_Banco.getText(), txtAbaConexBd_Usuario.getText(), 
                    txtPassAbaConexBd_Senha.getText(), txtAbaConexBd_Porta.getText(), 
                        txtAbaConexBd_Endereco.getText());

        cbxAbaConexBd_Tabela.removeAllItems();
        cbxAbaConexBd_Tabela.addItem("Selecione");
        if(tabelas != null){  
            for(String tabela : tabelas){
                cbxAbaConexBd_Tabela.addItem(tabela);
            }
//            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível acessar este banco!");
            return false;
        }
    }
    
    private boolean validarCamposConexao(){
        if(!cbxAbaConexBd_Sgbd.getSelectedItem().equals("Selecione")){
            if(!txtAbaConexBd_Banco.getText().equals(null) && 
                    !txtAbaConexBd_Endereco.getText().equals(null) &&
                        !txtAbaConexBd_Porta.getText().equals(null) &&
                            !txtAbaConexBd_Usuario.getText().equals(null) && 
                                !txtPassAbaConexBd_Senha.getText().equals(null)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    private void chamarImportarXlsx(){
        ImportarXlsx importarXlsx = new ImportarXlsx();
        JTable jTable = importarXlsx.importarArquivo();
        if(jTable != null){
            if(jTable.getRowCount() > 0){
                iniciarComboBoxTiposArquivo(jTable);
                painelAbaTabPrev_painelTabela.setLayout(new BoxLayout(painelAbaTabPrev_painelTabela, BoxLayout.Y_AXIS)); 
                //jTable.setShowHorizontalLines(true);
                JScrollPane jScrollPane = new JScrollPane(jTable);
                painelAbaTabPrev_painelTabela.add(jScrollPane);
                painelAbaTabPrev_painelTabela.updateUI();
                jTableAtivo = jTable;
                PercorrerAbasFormPrincipal.abaImportArqToTabPreview();
            }
        }
    }
    
    private void chamarImportarCsv(){    
        String separador = cbxAbaImportArq_ParamSeparador.getSelectedItem().toString();
        ImportarCsv importarCsv = new ImportarCsv(separador);
        
        JTable jTable = importarCsv.importarArquivo();
        
        if(jTable != null){
            if(jTable.getRowCount() > 0){
                iniciarComboBoxTiposArquivo(jTable);
                painelAbaTabPrev_painelTabela.setLayout(new BoxLayout(painelAbaTabPrev_painelTabela, BoxLayout.Y_AXIS)); 
                JScrollPane jScrollPane = new JScrollPane(jTable);
                painelAbaTabPrev_painelTabela.add(jScrollPane);
                painelAbaTabPrev_painelTabela.updateUI();
                jTableAtivo = jTable;
                PercorrerAbasFormPrincipal.abaImportArqToTabPreview();
            }      
        }
    }
    
    private void iniciarComboBoxTiposArquivo(JTable jtable) {
        int colunas = 0;
        colunas = jtable.getColumnCount();
        painelAbaTabPrev_CbxTiposVariaveis.removeAll();
        listaDeCbxTipos.removeAll(listaDeCbxTipos);
        for (int i = 0; i < colunas; i++) {
            JComboBox cbx = new JComboBox();
            cbx.addItem("Texto");
            cbx.addItem("V/F");
            cbx.addItem("Inteiro");
            cbx.addItem("Real");
            cbx.addItem("Caractere");
            cbx.addItem("Data dd-MM-yyyy");            
            cbx.addItem("Data MM-dd-yyyy");
            cbx.addItem("Data yyyy-MM-dd");
            listaDeCbxTipos.add(cbx);
            painelAbaTabPrev_CbxTiposVariaveis.add(cbx);
            painelAbaTabPrev_CbxTiposVariaveis.updateUI();
        }
    }
    
    private void iniciarComboBoxTiposBanco(JTable jTable){
        ArrayList<String> tipos = buscarTipoDeCampoDoBanco();        
        int colunas = 0;
        colunas = jTable.getColumnCount();
        ImportarDb importarDb = new ImportarDb();
        painelAbaTabPrev_CbxTiposVariaveis.removeAll();
        for (int i = 0; i < colunas; i++) {
            JComboBox cbx = new JComboBox();
            cbx.addItem("Texto");
            cbx.addItem("V/F");
            cbx.addItem("Inteiro");
            cbx.addItem("Real");
            cbx.addItem("Caractere");
            cbx.addItem("Data dd-MM-yyyy");            
            cbx.addItem("Data MM-dd-yyyy");
            cbx.addItem("Data yyyy-MM-dd");
            listaDeCbxTipos.add(cbx);
            painelAbaTabPrev_CbxTiposVariaveis.add(cbx);
            cbx.setSelectedItem(importarDb.transformarTipo(tipos.get(i), 
                    cbxAbaConexBd_Sgbd.getSelectedItem().toString()));
            painelAbaTabPrev_CbxTiposVariaveis.updateUI();
        }
    }
    
    private ArrayList<String> buscarTipoDeCampoDoBanco(){
        ImportarDb importarDb = new ImportarDb();        
        String nomeTabela = cbxAbaConexBd_Tabela.getSelectedItem().toString();
        String sgbdSelecionado =  cbxAbaConexBd_Sgbd.getSelectedItem().toString();
        return importarDb.getDataType(nomeTabela, sgbdSelecionado);
    }
    
    private void carregarTxtPorta(){
        switch(cbxAbaConexBd_Sgbd.getSelectedItem().toString()){
            case "Selecione":
                txtAbaConexBd_Porta.setText("");
                break;
            case "PostgreSQL":
                txtAbaConexBd_Porta.setText("5432");
                break;
            case "MySQL":
                txtAbaConexBd_Porta.setText("3306");
                break;
            case "SQL Server":
                txtAbaConexBd_Porta.setText("1433");
                break;
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FormAssistenteImportacao().setVisible(true);
                FormAssistenteImportacao form = new FormAssistenteImportacao();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbaConexBd_Ajuda;
    private javax.swing.JButton btnAbaConexBd_Conectar;
    private javax.swing.JButton btnAbaConexBd_ImportTabela;
    private javax.swing.JButton btnAbaConexBd_Prox;
    private javax.swing.JButton btnAbaConexBd_Voltar;
    private javax.swing.JButton btnAbaConsulBd_InfoAjuda;
    private javax.swing.JButton btnAbaConsulBd_Voltar;
    private javax.swing.JButton btnAbaImportArq_ProcurarArquivoCsv;
    private javax.swing.JButton btnAbaImportArq_ProcurarPlanilhaXlsx;
    private javax.swing.JButton btnAbaImportArq_Voltar;
    private javax.swing.JButton btnAbaImportBd_ExecConsulPerson;
    private javax.swing.JButton btnAbaInicio_Proximo;
    public static javax.swing.JButton btnAbaTabPrev_GerarCuboXml;
    public static javax.swing.JButton btnAbaTabPrev_ImportMaisDados;
    public static javax.swing.JButton btnAbaTabPrev_SalvarTabela;
    private javax.swing.JButton btnAbaTabPrev_ValidarTipos;
    private javax.swing.JButton btnAbaTabPrev_Voltar;
    private javax.swing.JButton btnAbaTipoImportImportarBanco;
    private javax.swing.JButton btnAbaTipoImport_ImportarArquivo;
    private javax.swing.JButton btnAbaTipoImport_Voltar;
    private javax.swing.JComboBox<String> cbxAbaConexBd_Sgbd;
    private javax.swing.JComboBox<String> cbxAbaConexBd_Tabela;
    private javax.swing.JComboBox<String> cbxAbaImportArq_ParamSeparador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPaneAbaTabPrev_ScrollDaAreaTabPrev;
    private javax.swing.JScrollPane jScrollPaneImportCsv;
    private javax.swing.JScrollPane jScrollPaneImportXlsx;
    private javax.swing.JScrollPane jScrollPaneInicioExplicacao;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblABaConexBd_Porta;
    private javax.swing.JLabel lblAbaConexBd_Banco;
    private javax.swing.JLabel lblAbaConexBd_Endereco;
    private javax.swing.JLabel lblAbaConexBd_Senha;
    private javax.swing.JLabel lblAbaConexBd_Sgbd;
    private javax.swing.JLabel lblAbaConexBd_Usuario;
    private javax.swing.JLabel lblAbaImportArq_ParamSeparador;
    private javax.swing.JPanel painelAbaConexBanco;
    private javax.swing.JPanel painelAbaConexBd_Conexao;
    private javax.swing.JPanel painelAbaConexBd_ConsulDefault;
    private javax.swing.JPanel painelAbaConexBd_InfoConex;
    private javax.swing.JPanel painelAbaConsulBanco;
    private javax.swing.JPanel painelAbaConsulBd_ConsultarBd;
    private javax.swing.JPanel painelAbaConsulBd_InfoConsul;
    private javax.swing.JPanel painelAbaImportArq_ImportCsv;
    private javax.swing.JPanel painelAbaImportArq_ImportXlsx;
    private javax.swing.JPanel painelAbaImportBd_ConsulPerson;
    private javax.swing.JPanel painelAbaImportacaoArquivo;
    private javax.swing.JPanel painelAbaInicio;
    private javax.swing.JPanel painelAbaInicio_ExplicaoAssistente;
    private javax.swing.JPanel painelAbaTabPrev_AreaDaTabResult;
    public static javax.swing.JPanel painelAbaTabPrev_CbxTiposVariaveis;
    private javax.swing.JPanel painelAbaTabPrev_TabPrevResult;
    private javax.swing.JPanel painelAbaTabPrev_TrabDados;
    private javax.swing.JPanel painelAbaTabPrev_painelTabela;
    private javax.swing.JPanel painelAbaTabPrev_painelTiposVariaveis;
    private javax.swing.JPanel painelAbaTabelaPreview;
    private javax.swing.JPanel painelAbaTipoImport_ImportacaoArquivo;
    private javax.swing.JPanel painelAbaTipoImport_ImportacaoBanco;
    private javax.swing.JPanel painelAbaTipoImportação;
    public static javax.swing.JTabbedPane painelAbas;
    private javax.swing.JTextField txtAbaConexBd_Banco;
    private javax.swing.JTextField txtAbaConexBd_Endereco;
    private javax.swing.JTextField txtAbaConexBd_Porta;
    private javax.swing.JLabel txtAbaConexBd_Tabela;
    private javax.swing.JTextField txtAbaConexBd_Usuario;
    private javax.swing.JTextArea txtAbaImportBd_ConsulPerson;
    private javax.swing.JTextField txtAbaTabPrev_TrabDados;
    private javax.swing.JTextArea txtAreaAbaConexBd_InfoConex;
    private javax.swing.JTextArea txtAreaAbaConsulBd_InfoConsul;
    private javax.swing.JTextArea txtAreaAbaImportArq_ImportCsv;
    private javax.swing.JTextArea txtAreaAbaImportArq_ImportXlsx;
    private javax.swing.JTextArea txtAreaAbaInicio_Explicacao;
    private javax.swing.JTextArea txtAreaAbaTipoImport_ImportacaoArquivo;
    private javax.swing.JTextArea txtAreaImportacaoBanco;
    private javax.swing.JPasswordField txtPassAbaConexBd_Senha;
    // End of variables declaration//GEN-END:variables
}
