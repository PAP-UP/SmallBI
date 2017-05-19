package view;

import business.ImportarCsv;
import view.percorrerAbas.PercorrerAbasFormAssistenteImportacao;
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

    public List<JComboBox> listaDeCbxTipos = new ArrayList<>();
    public static boolean importandoDeArquivo = true;
    private JTable jTableAtivo = new JTable();    
    public static Integer tamMaxArquivo = 501185; //502096; //501185
    
    public FormAssistenteImportacao() {
        initComponents();
        PercorrerAbasFormAssistenteImportacao.desativarAbasNoInicio();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelAbas = new javax.swing.JTabbedPane();
        painelAbaInicio = new javax.swing.JPanel();
        painelAbaInicio_ExplicaoAssistente = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        btnAbaInicio_Proximo = new javax.swing.JButton();
        painelAbaTipoImportação = new javax.swing.JPanel();
        painelAbaTipoImport_ImportacaoArquivo = new javax.swing.JPanel();
        btnAbaTipoImport_ImportarArquivo = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        painelAbaTipoImport_ImportacaoBanco = new javax.swing.JPanel();
        btnAbaTipoImportImportarBanco = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane3 = new javax.swing.JEditorPane();
        btnAbaTipoImport_Voltar = new javax.swing.JButton();
        painelAbaImportacaoArquivo = new javax.swing.JPanel();
        painelAbaImportArq_ImportCsv = new javax.swing.JPanel();
        btnAbaImportArq_ProcurarArquivoCsv = new javax.swing.JButton();
        cbxAbaImportArq_ParamSeparador = new javax.swing.JComboBox<>();
        lblAbaImportArq_ParamSeparador = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane4 = new javax.swing.JEditorPane();
        painelAbaImportArq_ImportXlsx = new javax.swing.JPanel();
        btnAbaImportArq_ProcurarPlanilhaXlsx = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jEditorPane5 = new javax.swing.JEditorPane();
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
        btnAbaConexBd_Ajuda = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jEditorPane6 = new javax.swing.JEditorPane();
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
        btnAbaConsulBd_InfoAjuda = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jEditorPane7 = new javax.swing.JEditorPane();
        btnAbaConsulBd_Voltar = new javax.swing.JButton();
        painelAbaTabelaPreview = new javax.swing.JPanel();
        painelAbaTabPrev_TrabDados = new javax.swing.JPanel();
        btnAbaTabPrev_ImportMaisDados = new javax.swing.JButton();
        btnAbaTabPrev_GerarCuboXml = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jEditorPane8 = new javax.swing.JEditorPane();
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

        jEditorPane2.setEditable(false);
        jEditorPane2.setContentType("text/html"); // NOI18N
        jEditorPane2.setText("<html>\n  <head>\n\n  </head>\n  <body>\n<p style=\"text-align: justify;\"><strong>Bem-vindo ao Assistente de Importa&ccedil;&atilde;o e Modelagem do SmallBI - Intelig&ecirc;ncia para Empresas!</strong></p>\n<p style=\"text-align: justify;\">Esse assistente &eacute; dividido em duas partes: <em><strong>I - Coleta</strong></em>, <em><strong>II&nbsp;- Modelagem</strong></em>.</p>\n<ol style=\"list-style-type: upper-roman; text-align: justify;\">\n<li><em><strong>Coleta</strong></em>: Nesta primeira etapa lhe auxiliaremos a buscas a informa&ccedil;&otilde;es que ser&atilde;o analisadas, a busca pode ser realizada atrav&eacute;s de arquivos CSV (Arquivos Texto), arquivos XLSX (Microsoft Excel), tabelas de banco de dados ou consultas nestes mesmos bancos de dados.\n<ol>\n<li>Coletas de arquivos CSV ou XLSX: Quando realizada a coleta atrav&eacute;s de arquivos CSV &eacute; necess&aacute;rio selecionar o caractere que separa as colunas, o mais comum &eacute; separa-los por \";\". Ap&oacute;s selecionado o arquivo &eacute; necess&aacute;rio escolher o formato de cada coluna do seu arquivo, por exemplo: Caso a coluna A contenha informa&ccedil;&otilde;es do tipo num&eacute;rico inteiro, dever&aacute; ser selecionado essa op&ccedil;&atilde;o na caixa de sele&ccedil;&atilde;o acima. Dentre as op&ccedil;&otilde;es da caixa de sele&ccedil;&atilde;o temos ainda (Inteiro, Real, V/F (Verdadeiro/Falso), Caractere (Apenas um caractere), Texto, Data (dd/MM/yyyy, dd-MM-yyyy, MM-dd-yyyy e yyyy-MM-dd) e N&atilde;o Importar). Essa configura&ccedil;&atilde;o &eacute; realizada na tabela de visualiza&ccedil;&atilde;o dos dados, ap&oacute;s terminado o ajuste &eacute; necess&aacute;rio fazer a valida&ccedil;&atilde;o dos tipos de dados escolhidos, clicando no bot&atilde;o correspondente e ap&oacute;s isso clicar em salvar tabela, nomeando o nome da tabela e a chave que a ligar&aacute; com as tabelas a serem importadas em seguida.</li>\n<li>Coleta de bancos de dados: Nesta op&ccedil;&atilde;o pode ser realizada a coleta de um banco de dados, os aceitos s&atilde;o MySQL, PostgreSQL ou Microsoft SQL Server. Para fazer a coleta &eacute; necess&aacute;rio ter em m&atilde;os os dados para acesso ao banco que s&atilde;o: nome ou ip do servidor de banco de dados, nome do banco de dados, nome do usu&aacute;rio, senha e porta de conex&atilde;o. Ap&oacute;s o preenchimento dessas informa&ccedil;&otilde;es e no caso da conex&atilde;o realizada, pode-se escolher entre buscar uma tabela ou executar uma consulta. Ap&oacute;s utilizar qualquer uma desta op&ccedil;&otilde;es voc&ecirc; ser&aacute; levado a tela de visualiza&ccedil;&atilde;o dos dados. Terminado a coleta &eacute; necess&aacute;rio fazer a valida&ccedil;&atilde;o dos tipos de dados escolhidos, clicando no bot&atilde;o correspondente e ap&oacute;s isso clicar em salvar tabela, nomeando o nome da tabela e a chave que a ligar&aacute; com as tabelas a serem importadas em seguida.</li>\n</ol>\n</li>\n<li><em><strong>Modelagem</strong></em>: Est&aacute; segunda etapa &eacute; subdivida em 3 fases: Nomea&ccedil;&atilde;o do Cubo, Especifica&ccedil;&atilde;o das Dimens&otilde;es, Especifica&ccedil;&atilde;o das M&eacute;tricas.\n<ol>\n<li>Nomea&ccedil;&atilde;o do Cubo: Aqui deve ser escolhido o nome que ser&aacute; dado ao cubo (cole&ccedil;&atilde;o de informa&ccedil;&otilde;es que ser&atilde;o analisadas), e defini&ccedil;&atilde;o da Tabela Fato (Tabela que cont&eacute;m as m&eacute;tricas - dados quantitativos).</li>\n<li>Especifica&ccedil;&atilde;o das Dimens&otilde;es: As dimens&otilde;es podem ser escolhidas para estarem nos eixos (X ou Y) conforme o cen&aacute;rio a ser analisado. As dimens&otilde;es cont&ecirc;m dados qualitativos.</li>\n<li>Especifica&ccedil;&atilde;o da M&eacute;tricas: S&atilde;o os valores que estar&atilde;o da &aacute;rea do gr&aacute;fico. As m&eacute;tricas cont&ecirc;m os dados quantitativos.<br /> Para mais informa&ccedil;&otilde;es estamos &agrave; disposi&ccedil;&atilde;o.</li>\n</ol>\n</li>\n</ol>\n<p>Para mais informa&ccedil;&otilde;es estamos a disposi&ccedil;&atilde;o.</p>\n<p><em><strong>Equipe SmallBI</strong></em></p>\n      \n    </p>\n  </body>\n</html>\n");
        jEditorPane2.setCaretPosition(1);
        jEditorPane2.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jEditorPane2.setMinimumSize(new java.awt.Dimension(22, 22));
        jEditorPane2.setName("jEditorPaneTextoInicial"); // NOI18N
        jEditorPane2.setPreferredSize(new java.awt.Dimension(278, 87));
        jScrollPane8.setViewportView(jEditorPane2);

        javax.swing.GroupLayout painelAbaInicio_ExplicaoAssistenteLayout = new javax.swing.GroupLayout(painelAbaInicio_ExplicaoAssistente);
        painelAbaInicio_ExplicaoAssistente.setLayout(painelAbaInicio_ExplicaoAssistenteLayout);
        painelAbaInicio_ExplicaoAssistenteLayout.setHorizontalGroup(
            painelAbaInicio_ExplicaoAssistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
        );
        painelAbaInicio_ExplicaoAssistenteLayout.setVerticalGroup(
            painelAbaInicio_ExplicaoAssistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnAbaInicio_Proximo.setText("Próximo");
        btnAbaInicio_Proximo.setMaximumSize(new java.awt.Dimension(59, 31));
        btnAbaInicio_Proximo.setMinimumSize(new java.awt.Dimension(59, 31));
        btnAbaInicio_Proximo.setPreferredSize(new java.awt.Dimension(59, 31));
        btnAbaInicio_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaInicio_ProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaInicioLayout = new javax.swing.GroupLayout(painelAbaInicio);
        painelAbaInicio.setLayout(painelAbaInicioLayout);
        painelAbaInicioLayout.setHorizontalGroup(
            painelAbaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaInicio_ExplicaoAssistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelAbaInicioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaInicio_Proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelAbaInicioLayout.setVerticalGroup(
            painelAbaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaInicio_ExplicaoAssistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbaInicio_Proximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAbas.addTab("Inicio", painelAbaInicio);

        painelAbaTipoImport_ImportacaoArquivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Importar a partir de um arquivo CSV ou XLSX"));
        painelAbaTipoImport_ImportacaoArquivo.setPreferredSize(new java.awt.Dimension(964, 251));

        btnAbaTipoImport_ImportarArquivo.setText("Importar Arquivo");
        btnAbaTipoImport_ImportarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaTipoImport_ImportarArquivoActionPerformed(evt);
            }
        });

        jEditorPane1.setEditable(false);
        jEditorPane1.setBackground(new java.awt.Color(204, 204, 255));
        jEditorPane1.setContentType("text/html"); // NOI18N
        jEditorPane1.setText("<html>\n  <head>\n\n  </head>\n  <body>\n<p style=\"text-align: center;\">Nesta op&ccedil;&atilde;o voc&ecirc; pode tanto escolher arquivos CSV quanto planilhas no formato XLSX, voc&ecirc; precisa apenas nos dizer o caminho do arquivo e no caso de arquivos no formato CSV, precisar&aacute; nos informar o par&acirc;metro separador de colunas.</p>\n      \n    </p>\n  </body>\n</html>\n");
        jEditorPane1.setMinimumSize(new java.awt.Dimension(775, 34));
        jEditorPane1.setPreferredSize(new java.awt.Dimension(775, 34));
        jScrollPane7.setViewportView(jEditorPane1);

        javax.swing.GroupLayout painelAbaTipoImport_ImportacaoArquivoLayout = new javax.swing.GroupLayout(painelAbaTipoImport_ImportacaoArquivo);
        painelAbaTipoImport_ImportacaoArquivo.setLayout(painelAbaTipoImport_ImportacaoArquivoLayout);
        painelAbaTipoImport_ImportacaoArquivoLayout.setHorizontalGroup(
            painelAbaTipoImport_ImportacaoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTipoImport_ImportacaoArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaTipoImport_ImportacaoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaTipoImport_ImportacaoArquivoLayout.createSequentialGroup()
                        .addGap(0, 839, Short.MAX_VALUE)
                        .addComponent(btnAbaTipoImport_ImportarArquivo))
                    .addComponent(jScrollPane7))
                .addContainerGap())
        );
        painelAbaTipoImport_ImportacaoArquivoLayout.setVerticalGroup(
            painelAbaTipoImport_ImportacaoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTipoImport_ImportacaoArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbaTipoImport_ImportarArquivo)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        painelAbaTipoImport_ImportacaoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Importar a partir de um Banco de Dados"));
        painelAbaTipoImport_ImportacaoBanco.setPreferredSize(new java.awt.Dimension(964, 251));

        btnAbaTipoImportImportarBanco.setText("Importar do Banco de Dados");
        btnAbaTipoImportImportarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaTipoImportImportarBancoActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));

        jEditorPane3.setEditable(false);
        jEditorPane3.setBackground(new java.awt.Color(204, 204, 255));
        jEditorPane3.setContentType("text/html"); // NOI18N
        jEditorPane3.setText("<html>\n  <head>\n\n  </head>\n  <body>\n<p style=\"text-align: center;\">Nesta op&ccedil;&atilde;o voc&ecirc; poder&aacute; se conectar a um banco de dados PostgreSQL, MySQL ou SQL Server, poder&aacute; ainda consultar tabelas completas ou fazer suas pr&oacute;prias consultas customizadas.</p>\n      \n    </p>\n  </body>\n</html>\n");
        jScrollPane1.setViewportView(jEditorPane3);

        javax.swing.GroupLayout painelAbaTipoImport_ImportacaoBancoLayout = new javax.swing.GroupLayout(painelAbaTipoImport_ImportacaoBanco);
        painelAbaTipoImport_ImportacaoBanco.setLayout(painelAbaTipoImport_ImportacaoBancoLayout);
        painelAbaTipoImport_ImportacaoBancoLayout.setHorizontalGroup(
            painelAbaTipoImport_ImportacaoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTipoImport_ImportacaoBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaTipoImport_ImportacaoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaTipoImport_ImportacaoBancoLayout.createSequentialGroup()
                        .addGap(0, 774, Short.MAX_VALUE)
                        .addComponent(btnAbaTipoImportImportarBanco))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        painelAbaTipoImport_ImportacaoBancoLayout.setVerticalGroup(
            painelAbaTipoImport_ImportacaoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTipoImport_ImportacaoBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAbaTipoImportImportarBanco)
                .addContainerGap())
        );

        btnAbaTipoImport_Voltar.setText("Voltar");
        btnAbaTipoImport_Voltar.setMaximumSize(new java.awt.Dimension(59, 31));
        btnAbaTipoImport_Voltar.setMinimumSize(new java.awt.Dimension(59, 31));
        btnAbaTipoImport_Voltar.setPreferredSize(new java.awt.Dimension(59, 31));
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
                    .addComponent(painelAbaTipoImport_ImportacaoArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                    .addComponent(painelAbaTipoImport_ImportacaoBanco, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaTipoImportaçãoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaTipoImport_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelAbaTipoImportaçãoLayout.setVerticalGroup(
            painelAbaTipoImportaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTipoImportaçãoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaTipoImport_ImportacaoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAbaTipoImport_ImportacaoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnAbaTipoImport_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelAbas.addTab("Tipo de Importação", painelAbaTipoImportação);

        painelAbaImportArq_ImportCsv.setBorder(javax.swing.BorderFactory.createTitledBorder("Impotação de Arquivo CSV"));
        painelAbaImportArq_ImportCsv.setPreferredSize(new java.awt.Dimension(964, 182));

        btnAbaImportArq_ProcurarArquivoCsv.setText("Procurar Arquivo CSV");
        btnAbaImportArq_ProcurarArquivoCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaImportArq_ProcurarArquivoCsvActionPerformed(evt);
            }
        });

        cbxAbaImportArq_ParamSeparador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ",", ":", ";" }));

        lblAbaImportArq_ParamSeparador.setText("Informe o Parâmentro Separador de Campos: ");

        jEditorPane4.setEditable(false);
        jEditorPane4.setBackground(new java.awt.Color(204, 204, 255));
        jEditorPane4.setContentType("text/html"); // NOI18N
        jEditorPane4.setText("<html>\n  <head>\n\n  </head>\n  <body>\n<p style=\"text-align: center;\">Informe o par&acirc;metro separador de colunas no seu arquivo CSV e depois nos mostre &nbsp;o caminho at&eacute; ele.</p>\n      \n    </p>\n  </body>\n</html>\n");
        jEditorPane4.setMinimumSize(new java.awt.Dimension(775, 34));
        jScrollPane2.setViewportView(jEditorPane4);

        javax.swing.GroupLayout painelAbaImportArq_ImportCsvLayout = new javax.swing.GroupLayout(painelAbaImportArq_ImportCsv);
        painelAbaImportArq_ImportCsv.setLayout(painelAbaImportArq_ImportCsvLayout);
        painelAbaImportArq_ImportCsvLayout.setHorizontalGroup(
            painelAbaImportArq_ImportCsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportArq_ImportCsvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaImportArq_ImportCsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaImportArq_ImportCsvLayout.createSequentialGroup()
                        .addGap(0, 481, Short.MAX_VALUE)
                        .addComponent(lblAbaImportArq_ParamSeparador)
                        .addGap(18, 18, 18)
                        .addComponent(cbxAbaImportArq_ParamSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbaImportArq_ProcurarArquivoCsv)
                        .addGap(6, 6, 6))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        painelAbaImportArq_ImportCsvLayout.setVerticalGroup(
            painelAbaImportArq_ImportCsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportArq_ImportCsvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelAbaImportArq_ImportCsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbaImportArq_ParamSeparador)
                    .addComponent(cbxAbaImportArq_ParamSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbaImportArq_ProcurarArquivoCsv))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        painelAbaImportArq_ImportXlsx.setBorder(javax.swing.BorderFactory.createTitledBorder("Importação de Arquivo XLSX"));
        painelAbaImportArq_ImportXlsx.setPreferredSize(new java.awt.Dimension(964, 182));

        btnAbaImportArq_ProcurarPlanilhaXlsx.setText("Procurar Planilha");
        btnAbaImportArq_ProcurarPlanilhaXlsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaImportArq_ProcurarPlanilhaXlsxActionPerformed(evt);
            }
        });

        jEditorPane5.setEditable(false);
        jEditorPane5.setBackground(new java.awt.Color(204, 204, 255));
        jEditorPane5.setContentType("text/html"); // NOI18N
        jEditorPane5.setText("<html>\n  <head>\n\n  </head>\n  <body>\n<p style=\"text-align: center;\">Escolha o caminho at&eacute; sua planilha.</p>\n      \n    </p>\n  </body>\n</html>\n");
        jEditorPane5.setMinimumSize(new java.awt.Dimension(775, 34));
        jScrollPane9.setViewportView(jEditorPane5);

        javax.swing.GroupLayout painelAbaImportArq_ImportXlsxLayout = new javax.swing.GroupLayout(painelAbaImportArq_ImportXlsx);
        painelAbaImportArq_ImportXlsx.setLayout(painelAbaImportArq_ImportXlsxLayout);
        painelAbaImportArq_ImportXlsxLayout.setHorizontalGroup(
            painelAbaImportArq_ImportXlsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportArq_ImportXlsxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaImportArq_ImportXlsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaImportArq_ImportXlsxLayout.createSequentialGroup()
                        .addGap(0, 839, Short.MAX_VALUE)
                        .addComponent(btnAbaImportArq_ProcurarPlanilhaXlsx))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        painelAbaImportArq_ImportXlsxLayout.setVerticalGroup(
            painelAbaImportArq_ImportXlsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportArq_ImportXlsxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbaImportArq_ProcurarPlanilhaXlsx)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnAbaImportArq_Voltar.setText("Voltar");
        btnAbaImportArq_Voltar.setMaximumSize(new java.awt.Dimension(59, 31));
        btnAbaImportArq_Voltar.setMinimumSize(new java.awt.Dimension(59, 31));
        btnAbaImportArq_Voltar.setPreferredSize(new java.awt.Dimension(59, 31));
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
                    .addComponent(painelAbaImportArq_ImportXlsx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                    .addComponent(painelAbaImportArq_ImportCsv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaImportacaoArquivoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaImportArq_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelAbaImportacaoArquivoLayout.setVerticalGroup(
            painelAbaImportacaoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportacaoArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaImportArq_ImportCsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAbaImportArq_ImportXlsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnAbaImportArq_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelAbas.addTab("Arquivo", painelAbaImportacaoArquivo);

        painelAbaConexBd_Conexao.setBorder(javax.swing.BorderFactory.createTitledBorder("Conexão com o Banco"));
        painelAbaConexBd_Conexao.setPreferredSize(new java.awt.Dimension(964, 182));

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
                .addContainerGap()
                .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaConexBd_ConexaoLayout.createSequentialGroup()
                        .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAbaConexBd_Endereco)
                            .addComponent(lblAbaConexBd_Sgbd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxAbaConexBd_Sgbd, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAbaConexBd_Usuario)
                                .addComponent(txtAbaConexBd_Endereco, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))))
                    .addComponent(lblAbaConexBd_Usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbaConexBd_Conectar)
                .addGap(149, 149, 149)
                .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAbaConexBd_Banco)
                    .addComponent(lblABaConexBd_Porta)
                    .addComponent(lblAbaConexBd_Senha))
                .addGroup(painelAbaConexBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtAbaConexBd_Banco)
                    .addComponent(txtAbaConexBd_Porta)
                    .addComponent(txtPassAbaConexBd_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
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
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaConexBd_ConexaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbaConexBd_Conectar)
                .addContainerGap())
        );

        painelAbaConexBd_InfoConex.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações de Conexão"));
        painelAbaConexBd_InfoConex.setPreferredSize(new java.awt.Dimension(964, 182));

        btnAbaConexBd_Ajuda.setText("Ajuda");
        btnAbaConexBd_Ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaConexBd_AjudaActionPerformed(evt);
            }
        });

        jEditorPane6.setEditable(false);
        jEditorPane6.setBackground(new java.awt.Color(204, 204, 255));
        jEditorPane6.setContentType("text/html"); // NOI18N
        jEditorPane6.setText("<html>\n  <head>\n\n  </head>\n  <body>\n<p style=\"text-align: center;\">Informe-nos as vari&aacute;veis necess&aacute;rias para se conectar com seu banco de dados. Lembre-se que ele pode ser acessado localmente ou remotamente.</p>\n<p style=\"text-align: center;\">Qualquer d&uacute;vida clique no bot&atilde;o ajuda ou acesse nosso site www.smallbi.com.br.</p>\n      \n    </p>\n  </body>\n</html>\n");
        jEditorPane6.setMinimumSize(new java.awt.Dimension(775, 34));
        jScrollPane10.setViewportView(jEditorPane6);

        javax.swing.GroupLayout painelAbaConexBd_InfoConexLayout = new javax.swing.GroupLayout(painelAbaConexBd_InfoConex);
        painelAbaConexBd_InfoConex.setLayout(painelAbaConexBd_InfoConexLayout);
        painelAbaConexBd_InfoConexLayout.setHorizontalGroup(
            painelAbaConexBd_InfoConexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConexBd_InfoConexLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaConexBd_InfoConexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaConexBd_InfoConexLayout.createSequentialGroup()
                        .addGap(0, 857, Short.MAX_VALUE)
                        .addComponent(btnAbaConexBd_Ajuda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAbaConexBd_InfoConexLayout.setVerticalGroup(
            painelAbaConexBd_InfoConexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConexBd_InfoConexLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbaConexBd_Ajuda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnAbaConexBd_Voltar.setText("Voltar");
        btnAbaConexBd_Voltar.setMaximumSize(new java.awt.Dimension(59, 31));
        btnAbaConexBd_Voltar.setMinimumSize(new java.awt.Dimension(59, 31));
        btnAbaConexBd_Voltar.setPreferredSize(new java.awt.Dimension(59, 31));
        btnAbaConexBd_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaConexBd_VoltarActionPerformed(evt);
            }
        });

        btnAbaConexBd_Prox.setText("Próximo");
        btnAbaConexBd_Prox.setEnabled(false);
        btnAbaConexBd_Prox.setMaximumSize(new java.awt.Dimension(59, 31));
        btnAbaConexBd_Prox.setMinimumSize(new java.awt.Dimension(59, 31));
        btnAbaConexBd_Prox.setPreferredSize(new java.awt.Dimension(59, 31));
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
                    .addComponent(painelAbaConexBd_InfoConex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                    .addComponent(painelAbaConexBd_Conexao, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaConexBancoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaConexBd_Prox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaConexBd_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelAbaConexBancoLayout.setVerticalGroup(
            painelAbaConexBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaConexBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaConexBd_InfoConex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAbaConexBd_Conexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(painelAbaConexBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaConexBd_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbaConexBd_Prox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelAbas.addTab("Conexão do Banco", painelAbaConexBanco);

        painelAbaConsulBd_ConsultarBd.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Banco"));
        painelAbaConsulBd_ConsultarBd.setPreferredSize(new java.awt.Dimension(964, 182));

        painelAbaConexBd_ConsulDefault.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta Padrão"));
        painelAbaConexBd_ConsulDefault.setName(""); // NOI18N

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
                .addContainerGap()
                .addComponent(txtAbaConexBd_Tabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxAbaConexBd_Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaConexBd_ConsulDefaultLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbaConexBd_ImportTabela)
                .addGap(68, 68, 68))
        );
        painelAbaConexBd_ConsulDefaultLayout.setVerticalGroup(
            painelAbaConexBd_ConsulDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConexBd_ConsulDefaultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaConexBd_ConsulDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAbaConexBd_Tabela)
                    .addComponent(cbxAbaConexBd_Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnAbaConexBd_ImportTabela)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        painelAbaImportBd_ConsulPerson.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta Personalizada"));

        txtAbaImportBd_ConsulPerson.setColumns(20);
        txtAbaImportBd_ConsulPerson.setFont(new java.awt.Font("Courier New", 1, 10)); // NOI18N
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
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaImportBd_ConsulPersonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbaImportBd_ExecConsulPerson)
                .addGap(290, 290, 290))
        );
        painelAbaImportBd_ConsulPersonLayout.setVerticalGroup(
            painelAbaImportBd_ConsulPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportBd_ConsulPersonLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbaImportBd_ExecConsulPerson))
        );

        javax.swing.GroupLayout painelAbaConsulBd_ConsultarBdLayout = new javax.swing.GroupLayout(painelAbaConsulBd_ConsultarBd);
        painelAbaConsulBd_ConsultarBd.setLayout(painelAbaConsulBd_ConsultarBdLayout);
        painelAbaConsulBd_ConsultarBdLayout.setHorizontalGroup(
            painelAbaConsulBd_ConsultarBdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConsulBd_ConsultarBdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaConexBd_ConsulDefault, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAbaImportBd_ConsulPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAbaConsulBd_ConsultarBdLayout.setVerticalGroup(
            painelAbaConsulBd_ConsultarBdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConsulBd_ConsultarBdLayout.createSequentialGroup()
                .addGroup(painelAbaConsulBd_ConsultarBdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaConexBd_ConsulDefault, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAbaImportBd_ConsulPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        painelAbaConsulBd_InfoConsul.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações de Consulta"));
        painelAbaConsulBd_InfoConsul.setPreferredSize(new java.awt.Dimension(984, 182));

        btnAbaConsulBd_InfoAjuda.setText("Ajuda");
        btnAbaConsulBd_InfoAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaConsulBd_InfoAjudaActionPerformed(evt);
            }
        });

        jEditorPane7.setEditable(false);
        jEditorPane7.setBackground(new java.awt.Color(204, 204, 255));
        jEditorPane7.setContentType("text/html"); // NOI18N
        jEditorPane7.setText("<html>\n  <head>\n\n  </head>\n  <body>\n<p style=\"text-align: center;\">Voc&ecirc; pode consultar seu banco de dados de duas formas:<br />Na consulta default, voc&ecirc; consultar&aacute; qualquer tabela do seu banco e todos os dados dela ser&atilde;o trazidos.<br />Na consulta personalizada, voc&ecirc; poder&aacute; montar sua query sql como desejar seguindo os padr&otilde;es de seu SGBD.</p>\n      \n    </p>\n  </body>\n</html>\n");
        jEditorPane7.setMinimumSize(new java.awt.Dimension(775, 34));
        jScrollPane11.setViewportView(jEditorPane7);

        javax.swing.GroupLayout painelAbaConsulBd_InfoConsulLayout = new javax.swing.GroupLayout(painelAbaConsulBd_InfoConsul);
        painelAbaConsulBd_InfoConsul.setLayout(painelAbaConsulBd_InfoConsulLayout);
        painelAbaConsulBd_InfoConsulLayout.setHorizontalGroup(
            painelAbaConsulBd_InfoConsulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConsulBd_InfoConsulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaConsulBd_InfoConsulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaConsulBd_InfoConsulLayout.createSequentialGroup()
                        .addGap(0, 857, Short.MAX_VALUE)
                        .addComponent(btnAbaConsulBd_InfoAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAbaConsulBd_InfoConsulLayout.setVerticalGroup(
            painelAbaConsulBd_InfoConsulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaConsulBd_InfoConsulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbaConsulBd_InfoAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnAbaConsulBd_Voltar.setText("Voltar");
        btnAbaConsulBd_Voltar.setAlignmentX(0.5F);
        btnAbaConsulBd_Voltar.setPreferredSize(new java.awt.Dimension(59, 31));
        btnAbaConsulBd_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaConsulBd_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaConsulBancoLayout = new javax.swing.GroupLayout(painelAbaConsulBanco);
        painelAbaConsulBanco.setLayout(painelAbaConsulBancoLayout);
        painelAbaConsulBancoLayout.setHorizontalGroup(
            painelAbaConsulBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaConsulBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaConsulBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelAbaConsulBd_InfoConsul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                    .addComponent(painelAbaConsulBd_ConsultarBd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                    .addGroup(painelAbaConsulBancoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaConsulBd_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelAbaConsulBancoLayout.setVerticalGroup(
            painelAbaConsulBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaConsulBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaConsulBd_InfoConsul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAbaConsulBd_ConsultarBd, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAbaConsulBd_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jEditorPane8.setEditable(false);
        jEditorPane8.setBackground(new java.awt.Color(254, 254, 254));
        jEditorPane8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jEditorPane8.setContentType("text/html"); // NOI18N
        jEditorPane8.setText("<html>\n  <head>\n\n  </head>\n  <body>\n<p style=\"text-align: center;\"><strong>Neste &uacute;ltimo passo, informe se deseja importar mais dados ou gerar o Cubo XML.</strong></p>\n      \n    </p>\n  </body>\n</html>\n");
        jEditorPane8.setMinimumSize(new java.awt.Dimension(775, 34));
        jScrollPane12.setViewportView(jEditorPane8);

        javax.swing.GroupLayout painelAbaTabPrev_TrabDadosLayout = new javax.swing.GroupLayout(painelAbaTabPrev_TrabDados);
        painelAbaTabPrev_TrabDados.setLayout(painelAbaTabPrev_TrabDadosLayout);
        painelAbaTabPrev_TrabDadosLayout.setHorizontalGroup(
            painelAbaTabPrev_TrabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_TrabDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbaTabPrev_ImportMaisDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAbaTabPrev_GerarCuboXml)
                .addContainerGap())
            .addGroup(painelAbaTabPrev_TrabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelAbaTabPrev_TrabDadosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane12)
                    .addContainerGap()))
        );
        painelAbaTabPrev_TrabDadosLayout.setVerticalGroup(
            painelAbaTabPrev_TrabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_TrabDadosLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(painelAbaTabPrev_TrabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaTabPrev_ImportMaisDados)
                    .addComponent(btnAbaTabPrev_GerarCuboXml))
                .addContainerGap())
            .addGroup(painelAbaTabPrev_TrabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelAbaTabPrev_TrabDadosLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        painelAbaTabPrev_AreaDaTabResult.setBorder(javax.swing.BorderFactory.createTitledBorder("Validação Tabela Importada"));

        painelAbaTabPrev_CbxTiposVariaveis.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout painelAbaTabPrev_painelTiposVariaveisLayout = new javax.swing.GroupLayout(painelAbaTabPrev_painelTiposVariaveis);
        painelAbaTabPrev_painelTiposVariaveis.setLayout(painelAbaTabPrev_painelTiposVariaveisLayout);
        painelAbaTabPrev_painelTiposVariaveisLayout.setHorizontalGroup(
            painelAbaTabPrev_painelTiposVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_painelTiposVariaveisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaTabPrev_CbxTiposVariaveis, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
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
            .addGap(0, 139, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelAbaTabPrev_TabPrevResultLayout = new javax.swing.GroupLayout(painelAbaTabPrev_TabPrevResult);
        painelAbaTabPrev_TabPrevResult.setLayout(painelAbaTabPrev_TabPrevResultLayout);
        painelAbaTabPrev_TabPrevResultLayout.setHorizontalGroup(
            painelAbaTabPrev_TabPrevResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_TabPrevResultLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelAbaTabPrev_TabPrevResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelAbaTabPrev_painelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAbaTabPrev_painelTiposVariaveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        painelAbaTabPrev_TabPrevResultLayout.setVerticalGroup(
            painelAbaTabPrev_TabPrevResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_TabPrevResultLayout.createSequentialGroup()
                .addComponent(painelAbaTabPrev_painelTiposVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelAbaTabPrev_painelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
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
                    .addGroup(painelAbaTabPrev_AreaDaTabResultLayout.createSequentialGroup()
                        .addComponent(jScrollPaneAbaTabPrev_ScrollDaAreaTabPrev, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaTabPrev_AreaDaTabResultLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaTabPrev_SalvarTabela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAbaTabPrev_ValidarTipos)
                        .addGap(10, 10, 10))))
        );
        painelAbaTabPrev_AreaDaTabResultLayout.setVerticalGroup(
            painelAbaTabPrev_AreaDaTabResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_AreaDaTabResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneAbaTabPrev_ScrollDaAreaTabPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAbaTabPrev_AreaDaTabResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaTabPrev_SalvarTabela)
                    .addComponent(btnAbaTabPrev_ValidarTipos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAbaTabPrev_Voltar.setText("Voltar");
        btnAbaTabPrev_Voltar.setAlignmentX(0.5F);
        btnAbaTabPrev_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaTabPrev_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaTabelaPreviewLayout = new javax.swing.GroupLayout(painelAbaTabelaPreview);
        painelAbaTabelaPreview.setLayout(painelAbaTabelaPreviewLayout);
        painelAbaTabelaPreviewLayout.setHorizontalGroup(
            painelAbaTabelaPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaTabelaPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaTabelaPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelAbaTabPrev_AreaDaTabResult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAbaTabPrev_TrabDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelAbaTabelaPreviewLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaTabPrev_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelAbaTabelaPreviewLayout.setVerticalGroup(
            painelAbaTabelaPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabelaPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaTabPrev_AreaDaTabResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelAbaTabPrev_TrabDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnAbaTabPrev_Voltar)
                .addContainerGap())
        );

        painelAbas.addTab("Visualização da Tabela", painelAbaTabelaPreview);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbaInicio_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaInicio_ProximoActionPerformed
        PercorrerAbasFormAssistenteImportacao.abaIniToAbaTipoImport();
    }//GEN-LAST:event_btnAbaInicio_ProximoActionPerformed

    private void btnAbaTipoImport_ImportarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTipoImport_ImportarArquivoActionPerformed
        PercorrerAbasFormAssistenteImportacao.abaTipoImportToAbaImportArq();
    }//GEN-LAST:event_btnAbaTipoImport_ImportarArquivoActionPerformed

    private void btnAbaTipoImportImportarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTipoImportImportarBancoActionPerformed
        PercorrerAbasFormAssistenteImportacao.abaTipoImportToConexBanco();
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
        PercorrerAbasFormAssistenteImportacao.abaTipoImportToAbaIni();
    }//GEN-LAST:event_btnAbaTipoImport_VoltarActionPerformed

    private void btnAbaImportArq_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaImportArq_VoltarActionPerformed
        PercorrerAbasFormAssistenteImportacao.abaImportArqToAbaTipoImport();
    }//GEN-LAST:event_btnAbaImportArq_VoltarActionPerformed

    private void btnAbaConexBd_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaConexBd_VoltarActionPerformed
        PercorrerAbasFormAssistenteImportacao.abaConexBancoToAbaTipoImport();
    }//GEN-LAST:event_btnAbaConexBd_VoltarActionPerformed

    private void btnAbaConsulBd_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaConsulBd_VoltarActionPerformed
        PercorrerAbasFormAssistenteImportacao.abaConsulBancoToAbaConexBanco();
        checarConexao();
    }//GEN-LAST:event_btnAbaConsulBd_VoltarActionPerformed

    private void btnAbaTabPrev_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTabPrev_VoltarActionPerformed
        importarMaisDados();
    }//GEN-LAST:event_btnAbaTabPrev_VoltarActionPerformed

    private void btnAbaTabPrev_SalvarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTabPrev_SalvarTabelaActionPerformed
        salvarTabela();
    }//GEN-LAST:event_btnAbaTabPrev_SalvarTabelaActionPerformed

    private void btnAbaConexBd_ProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaConexBd_ProxActionPerformed
        PercorrerAbasFormAssistenteImportacao.abaConexBancoToAbaConsulBanco();
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
        PercorrerAbasFormAssistenteImportacao.abaTabPreviewToAbaTipoImport();
    }
    
    private void salvarTabela(){
        FormSalvarTabela frm = new FormSalvarTabela(jTableAtivo, listaDeCbxTipos);
        frm.setLocationRelativeTo(null);
        frm.setTitle("Assistente para Salvar Tabela Importada");
        frm.setVisible(true);
    }
    
    private void chamarFormGerarCuboXml(){               
        FormAssistenteModelagem frm = new FormAssistenteModelagem();
        frm.setLocationRelativeTo(null);
        frm.setResizable(false);
        frm.setTitle("Assistente de Modelagem do Cubo");
        frm.setVisible(true);   
        dispose();
    }
    
    private void ajudaAreaConsulBanco(){
        FormAjudaConsulBanco frm = new FormAjudaConsulBanco();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);       
    }
    
    private void ajudaAreaConexBanco(){
       FormAjudaConexBanco frm = new FormAjudaConexBanco();
       frm.setLocationRelativeTo(null);
       frm.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
       frm.setVisible(true);
    }
    
    private void validarTiposDeDados(){
        business.ValidarTipos.removerColunasIndesejadas(jTableAtivo, listaDeCbxTipos);
        String msg = business.ValidarTipos.validarTipagemDosCampos(jTableAtivo, listaDeCbxTipos);                
        JOptionPane.showMessageDialog(null, msg);
        if (msg.equals("Campos validados com sucesso!")) {
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
                PercorrerAbasFormAssistenteImportacao.abaConsulBancoToAbaTabPreview();
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
                PercorrerAbasFormAssistenteImportacao.abaConsulBancoToAbaTabPreview();
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
                        PercorrerAbasFormAssistenteImportacao.abaConexBancoToAbaConsulBanco();
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
                painelAbaTabPrev_painelTabela.setLayout(new BoxLayout(painelAbaTabPrev_painelTabela, 
                        BoxLayout.Y_AXIS)); 
                JScrollPane jScrollPane = new JScrollPane(jTable);
                painelAbaTabPrev_painelTabela.add(jScrollPane);
                painelAbaTabPrev_painelTabela.updateUI();
                jTableAtivo = jTable;
                PercorrerAbasFormAssistenteImportacao.abaImportArqToTabPreview();
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
                PercorrerAbasFormAssistenteImportacao.abaImportArqToTabPreview();
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
            cbx.addItem("Data dd/MM/yyyy");
            cbx.addItem("Data dd-MM-yyyy");            
            cbx.addItem("Data MM-dd-yyyy");
            cbx.addItem("Data yyyy-MM-dd");
            cbx.addItem("Não importar");
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
            cbx.addItem("Data dd/MM/yyyy");
            //cbx.addItem("Data dd-MM-yyyy");            
            //cbx.addItem("Data MM-dd-yyyy");
            cbx.addItem("Data yyyy-MM-dd");
            cbx.addItem("Não importar");
            listaDeCbxTipos.add(cbx);
            painelAbaTabPrev_CbxTiposVariaveis.add(cbx);
            cbx.setSelectedItem(importarDb.transformarTipo(tipos.get(i), cbxAbaConexBd_Sgbd.getSelectedItem().toString()));
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
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JEditorPane jEditorPane3;
    private javax.swing.JEditorPane jEditorPane4;
    private javax.swing.JEditorPane jEditorPane5;
    private javax.swing.JEditorPane jEditorPane6;
    private javax.swing.JEditorPane jEditorPane7;
    private javax.swing.JEditorPane jEditorPane8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPaneAbaTabPrev_ScrollDaAreaTabPrev;
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
    private javax.swing.JPasswordField txtPassAbaConexBd_Senha;
    // End of variables declaration//GEN-END:variables
}
