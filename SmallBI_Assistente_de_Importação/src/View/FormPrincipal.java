package View;

import ControllerDao.ConexaoDao;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormPrincipal extends javax.swing.JFrame {

    private List<JComboBox> listaDeCbxTipos = new ArrayList<>();
    
    public FormPrincipal() {
        initComponents();
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
        painelAbaImportacaoBanco = new javax.swing.JPanel();
        painelAbaImportBd_Conexao = new javax.swing.JPanel();
        txtAbaImportBd_Conexao = new javax.swing.JTextField();
        lblAbaImportBd_Sgbd = new javax.swing.JLabel();
        cbxAbaImportBd_Sgbd = new javax.swing.JComboBox<>();
        lblAbaImportBd_Banco = new javax.swing.JLabel();
        txtAbaImportBd_Banco = new javax.swing.JTextField();
        lblAbaImportBd_Endereco = new javax.swing.JLabel();
        txtAbaImportBd_Endereco = new javax.swing.JTextField();
        lblABaImportBd_Porta = new javax.swing.JLabel();
        txtAbaImportBd_Porta = new javax.swing.JTextField();
        lblAbaImportBd_Usuario = new javax.swing.JLabel();
        txtAbaImportBd_Usuario = new javax.swing.JTextField();
        lblAbaImportBd_Senha = new javax.swing.JLabel();
        txtPassAbaImportBd_Senha = new javax.swing.JPasswordField();
        btnAbaImportBd_Conectar = new javax.swing.JButton();
        btnAbaImportBd_Desconectar = new javax.swing.JButton();
        btnAbaImportBd_Ajuda = new javax.swing.JButton();
        painelAbaImportBd_ConsultarBd = new javax.swing.JPanel();
        painelAbaImportBd_ConsulDefault = new javax.swing.JPanel();
        txtAbaImportBd_Tabela = new javax.swing.JLabel();
        cbxAbaImportBd_Tabela = new javax.swing.JComboBox<>();
        btnAbaImportBd_ImportTabela = new javax.swing.JButton();
        painelAbaImportBd_ConsulPerson = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAbaImportBd_ConsulPerson = new javax.swing.JTextArea();
        btnAbaImportBd_ExecConsulPerson = new javax.swing.JButton();
        painelAbaTabelaPreview = new javax.swing.JPanel();
        painelAbaTabPrev_TabPrevResult = new javax.swing.JPanel();
        painelAbaTabPrev_CbxTiposVariaveis = new javax.swing.JPanel();
        jScrollPaneTabPrev = new javax.swing.JScrollPane();
        tblTabPrev = new javax.swing.JTable();
        btnAbaTabPrev_ValidarTipos = new javax.swing.JButton();

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
        txtAreaAbaInicio_Explicacao.setText("\t\n\t\n\tAqui vai o texto explicativo ara utilização do Assistente de Importação do SmallBI");
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
                    .addComponent(jScrollPaneInicioExplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaInicio_ExplicaoAssistenteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaInicio_Proximo)))
                .addContainerGap())
        );
        painelAbaInicio_ExplicaoAssistenteLayout.setVerticalGroup(
            painelAbaInicio_ExplicaoAssistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaInicio_ExplicaoAssistenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneInicioExplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
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
        txtAreaAbaTipoImport_ImportacaoArquivo.setText("\t\n\tNesta opção você pode tanto escolher arquivos CSV quanto planilhas no formato XLSX,\nvocê precisa apenas nos dizer o caminho do arquivo e no caso de arquivos no formato CSV, precisará nos\ninformar o parâmetro separador de colunas.");
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
        txtAreaImportacaoBanco.setText("\t\n\tNesta opção você poderá se conectar a um banco de dados PostgreSQL, MySQL ou \nSQL Server, poderá ainda consultar tabelas completas ou fazer suas próprias consultas customizadas.");
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
                        .addGap(0, 445, Short.MAX_VALUE)
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

        javax.swing.GroupLayout painelAbaTipoImportaçãoLayout = new javax.swing.GroupLayout(painelAbaTipoImportação);
        painelAbaTipoImportação.setLayout(painelAbaTipoImportaçãoLayout);
        painelAbaTipoImportaçãoLayout.setHorizontalGroup(
            painelAbaTipoImportaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTipoImportaçãoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaTipoImportaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaTipoImport_ImportacaoBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAbaTipoImport_ImportacaoArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAbaTipoImportaçãoLayout.setVerticalGroup(
            painelAbaTipoImportaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTipoImportaçãoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaTipoImport_ImportacaoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAbaTipoImport_ImportacaoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAbas.addTab("Tipo de Importação", painelAbaTipoImportação);

        painelAbaImportArq_ImportCsv.setBorder(javax.swing.BorderFactory.createTitledBorder("Impotação de Arquivo CSV"));

        txtAreaAbaImportArq_ImportCsv.setBackground(new java.awt.Color(204, 204, 255));
        txtAreaAbaImportArq_ImportCsv.setColumns(20);
        txtAreaAbaImportArq_ImportCsv.setRows(5);
        txtAreaAbaImportArq_ImportCsv.setText("\t\n\tImporme-nos o parâmetro separador de colunas no seu arquivo CSV e depois nos mostre\n\t\t\t    o caminho até ele.");
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
                    .addComponent(jScrollPaneImportCsv, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
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
        txtAreaAbaImportArq_ImportXlsx.setText("\n\n\t\t           Nos mostre o caminho até sua planilha.");
        txtAreaAbaImportArq_ImportXlsx.setFocusable(false);
        jScrollPaneImportXlsx.setViewportView(txtAreaAbaImportArq_ImportXlsx);

        btnAbaImportArq_ProcurarPlanilhaXlsx.setText("Procurar Planilha XLSX");
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

        javax.swing.GroupLayout painelAbaImportacaoArquivoLayout = new javax.swing.GroupLayout(painelAbaImportacaoArquivo);
        painelAbaImportacaoArquivo.setLayout(painelAbaImportacaoArquivoLayout);
        painelAbaImportacaoArquivoLayout.setHorizontalGroup(
            painelAbaImportacaoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportacaoArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaImportacaoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaImportArq_ImportCsv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAbaImportArq_ImportXlsx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAbaImportacaoArquivoLayout.setVerticalGroup(
            painelAbaImportacaoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportacaoArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaImportArq_ImportCsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAbaImportArq_ImportXlsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAbas.addTab("Importação de Arquivo", painelAbaImportacaoArquivo);

        painelAbaImportBd_Conexao.setBorder(javax.swing.BorderFactory.createTitledBorder("Conexão com o Banco"));

        txtAbaImportBd_Conexao.setBackground(new java.awt.Color(204, 204, 255));
        txtAbaImportBd_Conexao.setText("     Informe as variáveis para conectar-se com seu Banco de Dados.");
        txtAbaImportBd_Conexao.setFocusable(false);

        lblAbaImportBd_Sgbd.setText("SGBD:");

        cbxAbaImportBd_Sgbd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "PostgreSQL", "MySQL", "SQL Server" }));
        cbxAbaImportBd_Sgbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAbaImportBd_SgbdActionPerformed(evt);
            }
        });

        lblAbaImportBd_Banco.setText("Banco:");

        lblAbaImportBd_Endereco.setText("Endereço:");

        txtAbaImportBd_Endereco.setText("localhost");

        lblABaImportBd_Porta.setText("Porta:");

        lblAbaImportBd_Usuario.setText("Usuário:");

        lblAbaImportBd_Senha.setText("Senha");

        btnAbaImportBd_Conectar.setText("Conectar");
        btnAbaImportBd_Conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaImportBd_ConectarActionPerformed(evt);
            }
        });

        btnAbaImportBd_Desconectar.setText("Desconectar");
        btnAbaImportBd_Desconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaImportBd_DesconectarActionPerformed(evt);
            }
        });

        btnAbaImportBd_Ajuda.setText("Ajuda");
        btnAbaImportBd_Ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaImportBd_AjudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaImportBd_ConexaoLayout = new javax.swing.GroupLayout(painelAbaImportBd_Conexao);
        painelAbaImportBd_Conexao.setLayout(painelAbaImportBd_ConexaoLayout);
        painelAbaImportBd_ConexaoLayout.setHorizontalGroup(
            painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportBd_ConexaoLayout.createSequentialGroup()
                .addGroup(painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaImportBd_ConexaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(painelAbaImportBd_ConexaoLayout.createSequentialGroup()
                                    .addComponent(lblAbaImportBd_Sgbd)
                                    .addGap(40, 40, 40)
                                    .addComponent(cbxAbaImportBd_Sgbd, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painelAbaImportBd_ConexaoLayout.createSequentialGroup()
                                    .addComponent(lblAbaImportBd_Endereco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAbaImportBd_Usuario)
                                        .addComponent(txtAbaImportBd_Endereco))))
                            .addComponent(lblAbaImportBd_Usuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAbaImportBd_Banco)
                            .addComponent(lblABaImportBd_Porta)
                            .addComponent(lblAbaImportBd_Senha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAbaImportBd_Banco)
                            .addComponent(txtAbaImportBd_Porta)
                            .addComponent(txtPassAbaImportBd_Senha, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaImportBd_ConexaoLayout.createSequentialGroup()
                        .addContainerGap(233, Short.MAX_VALUE)
                        .addComponent(btnAbaImportBd_Conectar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaImportBd_Desconectar)
                        .addGap(220, 220, 220)))
                .addContainerGap())
            .addGroup(painelAbaImportBd_ConexaoLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(txtAbaImportBd_Conexao, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbaImportBd_Ajuda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelAbaImportBd_ConexaoLayout.setVerticalGroup(
            painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportBd_ConexaoLayout.createSequentialGroup()
                .addGroup(painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAbaImportBd_Conexao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbaImportBd_Ajuda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbaImportBd_Sgbd)
                    .addComponent(cbxAbaImportBd_Sgbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAbaImportBd_Banco)
                    .addComponent(txtAbaImportBd_Banco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblABaImportBd_Porta)
                    .addGroup(painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAbaImportBd_Endereco)
                        .addComponent(txtAbaImportBd_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAbaImportBd_Porta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAbaImportBd_Usuario)
                        .addComponent(txtAbaImportBd_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAbaImportBd_Senha)
                        .addComponent(txtPassAbaImportBd_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(painelAbaImportBd_ConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbaImportBd_Conectar)
                    .addComponent(btnAbaImportBd_Desconectar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAbaImportBd_ConsultarBd.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Banco"));

        painelAbaImportBd_ConsulDefault.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta Default"));

        txtAbaImportBd_Tabela.setText("Tabela:");

        btnAbaImportBd_ImportTabela.setText("Importar Tabela");
        btnAbaImportBd_ImportTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaImportBd_ImportTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaImportBd_ConsulDefaultLayout = new javax.swing.GroupLayout(painelAbaImportBd_ConsulDefault);
        painelAbaImportBd_ConsulDefault.setLayout(painelAbaImportBd_ConsulDefaultLayout);
        painelAbaImportBd_ConsulDefaultLayout.setHorizontalGroup(
            painelAbaImportBd_ConsulDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportBd_ConsulDefaultLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(txtAbaImportBd_Tabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxAbaImportBd_Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbaImportBd_ImportTabela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelAbaImportBd_ConsulDefaultLayout.setVerticalGroup(
            painelAbaImportBd_ConsulDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportBd_ConsulDefaultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaImportBd_ConsulDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAbaImportBd_Tabela)
                    .addComponent(cbxAbaImportBd_Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbaImportBd_ImportTabela))
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

        javax.swing.GroupLayout painelAbaImportBd_ConsultarBdLayout = new javax.swing.GroupLayout(painelAbaImportBd_ConsultarBd);
        painelAbaImportBd_ConsultarBd.setLayout(painelAbaImportBd_ConsultarBdLayout);
        painelAbaImportBd_ConsultarBdLayout.setHorizontalGroup(
            painelAbaImportBd_ConsultarBdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportBd_ConsultarBdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaImportBd_ConsultarBdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaImportBd_ConsulDefault, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAbaImportBd_ConsulPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAbaImportBd_ConsultarBdLayout.setVerticalGroup(
            painelAbaImportBd_ConsultarBdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportBd_ConsultarBdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaImportBd_ConsulDefault, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAbaImportBd_ConsulPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelAbaImportacaoBancoLayout = new javax.swing.GroupLayout(painelAbaImportacaoBanco);
        painelAbaImportacaoBanco.setLayout(painelAbaImportacaoBancoLayout);
        painelAbaImportacaoBancoLayout.setHorizontalGroup(
            painelAbaImportacaoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportacaoBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaImportacaoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaImportBd_Conexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAbaImportBd_ConsultarBd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAbaImportacaoBancoLayout.setVerticalGroup(
            painelAbaImportacaoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportacaoBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaImportBd_Conexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelAbaImportBd_ConsultarBd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        painelAbas.addTab("Importação do Banco", painelAbaImportacaoBanco);

        painelAbaTabPrev_TabPrevResult.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela Preview Resultado"));

        painelAbaTabPrev_CbxTiposVariaveis.setLayout(new java.awt.GridLayout());

        tblTabPrev.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPaneTabPrev.setViewportView(tblTabPrev);

        btnAbaTabPrev_ValidarTipos.setText("Validar Tipos de Dados");
        btnAbaTabPrev_ValidarTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaTabPrev_ValidarTiposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaTabPrev_TabPrevResultLayout = new javax.swing.GroupLayout(painelAbaTabPrev_TabPrevResult);
        painelAbaTabPrev_TabPrevResult.setLayout(painelAbaTabPrev_TabPrevResultLayout);
        painelAbaTabPrev_TabPrevResultLayout.setHorizontalGroup(
            painelAbaTabPrev_TabPrevResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_TabPrevResultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaTabPrev_TabPrevResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbaTabPrev_CbxTiposVariaveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneTabPrev, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaTabPrev_TabPrevResultLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaTabPrev_ValidarTipos)))
                .addContainerGap())
        );
        painelAbaTabPrev_TabPrevResultLayout.setVerticalGroup(
            painelAbaTabPrev_TabPrevResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_TabPrevResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaTabPrev_CbxTiposVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTabPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAbaTabPrev_ValidarTipos)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelAbaTabelaPreviewLayout = new javax.swing.GroupLayout(painelAbaTabelaPreview);
        painelAbaTabelaPreview.setLayout(painelAbaTabelaPreviewLayout);
        painelAbaTabelaPreviewLayout.setHorizontalGroup(
            painelAbaTabelaPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabelaPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaTabPrev_TabPrevResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAbaTabelaPreviewLayout.setVerticalGroup(
            painelAbaTabelaPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabelaPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaTabPrev_TabPrevResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(painelAbas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbaInicio_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaInicio_ProximoActionPerformed
        painelAbas.setSelectedIndex(1);
    }//GEN-LAST:event_btnAbaInicio_ProximoActionPerformed

    private void btnAbaTipoImport_ImportarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTipoImport_ImportarArquivoActionPerformed
        painelAbas.setSelectedIndex(2);
    }//GEN-LAST:event_btnAbaTipoImport_ImportarArquivoActionPerformed

    private void btnAbaTipoImportImportarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTipoImportImportarBancoActionPerformed
        painelAbas.setSelectedIndex(3);
    }//GEN-LAST:event_btnAbaTipoImportImportarBancoActionPerformed

    private void btnAbaImportArq_ProcurarArquivoCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaImportArq_ProcurarArquivoCsvActionPerformed
        chamarImportarCsv();
    }//GEN-LAST:event_btnAbaImportArq_ProcurarArquivoCsvActionPerformed

    private void btnAbaImportArq_ProcurarPlanilhaXlsxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaImportArq_ProcurarPlanilhaXlsxActionPerformed
        chamarImportarXlsx();
    }//GEN-LAST:event_btnAbaImportArq_ProcurarPlanilhaXlsxActionPerformed

    private void btnAbaImportBd_ConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaImportBd_ConectarActionPerformed
        conectarComBanco();
    }//GEN-LAST:event_btnAbaImportBd_ConectarActionPerformed

    private void btnAbaImportBd_ImportTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaImportBd_ImportTabelaActionPerformed
        importarTabelaDefault();
    }//GEN-LAST:event_btnAbaImportBd_ImportTabelaActionPerformed

    private void btnAbaImportBd_ExecConsulPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaImportBd_ExecConsulPersonActionPerformed
        importarTabelaPersonalizada();
    }//GEN-LAST:event_btnAbaImportBd_ExecConsulPersonActionPerformed

    private void btnAbaImportBd_DesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaImportBd_DesconectarActionPerformed
        desconectarDoBanco();
    }//GEN-LAST:event_btnAbaImportBd_DesconectarActionPerformed

    private void btnAbaTabPrev_ValidarTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaTabPrev_ValidarTiposActionPerformed
        validarTiposDeDados();
    }//GEN-LAST:event_btnAbaTabPrev_ValidarTiposActionPerformed

    private void cbxAbaImportBd_SgbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAbaImportBd_SgbdActionPerformed
        carregarTxtPorta();
    }//GEN-LAST:event_cbxAbaImportBd_SgbdActionPerformed

    private void btnAbaImportBd_AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaImportBd_AjudaActionPerformed
        ajudaAreaBanco();
    }//GEN-LAST:event_btnAbaImportBd_AjudaActionPerformed

    private void ajudaAreaBanco(){
       FormAjudaComBanco frm = new FormAjudaComBanco();
       frm.setLocationRelativeTo(null);
       frm.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
       frm.setVisible(true);
    }
    
    private void validarTiposDeDados(){
        String msg = Core.ValidarTipos.validarTipagemDosCampos(tblTabPrev, listaDeCbxTipos);                
        JOptionPane.showMessageDialog(null, msg);
        if (msg.equals("Campos validados com sucesso!")) {
            
        } 
    }
    
    private void desconectarDoBanco(){
        ConexaoDao.desconectar();
        //limparJTable();
        //painelCbxTipos.removeAll();
        //painelCbxTipos.updateUI();
        JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
    }
    
    private void importarTabelaPersonalizada(){
        if(ConexaoDao.consultarTabela(tblTabPrev, txtAbaImportBd_ConsulPerson.getText()) == null){
            JOptionPane.showMessageDialog(null, "Falha ao executar Script SQL");
        }else{
            painelAbas.setSelectedIndex(4);
            iniciarComboBoxTiposBanco();
        }
    }
    
    private void importarTabelaDefault(){
        ConexaoDao.consultarTabela(cbxAbaImportBd_Tabela.getSelectedItem().toString(), tblTabPrev);
        painelAbas.setSelectedIndex(4);
        iniciarComboBoxTiposBanco();
    }               
    
    private void conectarComBanco(){
        if(validarCamposConexao()){
            ArrayList<String> bancos = ConexaoDao.setarVariaveisConexao(
                    cbxAbaImportBd_Sgbd.getSelectedItem().toString(), 
                        txtAbaImportBd_Usuario.getText(), txtPassAbaImportBd_Senha.getText(),
                            txtAbaImportBd_Endereco.getText(), txtAbaImportBd_Porta.getText());
            if(bancos != null){
                carregarCbxTabela();
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao conectar!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }
    
    private void carregarCbxTabela(){
        ArrayList<String> tabelas = ConexaoDao.getTables(cbxAbaImportBd_Sgbd.getSelectedItem().toString(), 
                txtAbaImportBd_Banco.getText(), txtAbaImportBd_Usuario.getText(), 
                    txtPassAbaImportBd_Senha.getText(), txtAbaImportBd_Porta.getText(), 
                        txtAbaImportBd_Endereco.getText());

        cbxAbaImportBd_Tabela.removeAllItems();
        cbxAbaImportBd_Tabela.addItem("Selecione");
        if(tabelas != null){  
            for(String tabela : tabelas){
                cbxAbaImportBd_Tabela.addItem(tabela);
            }
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível acessar este banco!");
        }
    }
    
    private boolean validarCamposConexao(){
        if(!cbxAbaImportBd_Sgbd.getSelectedItem().equals("Selecione")){
            if(!txtAbaImportBd_Banco.getText().equals(null) && 
                    !txtAbaImportBd_Endereco.getText().equals(null) &&
                        !txtAbaImportBd_Porta.getText().equals(null) &&
                            !txtAbaImportBd_Usuario.getText().equals(null) && 
                                !txtPassAbaImportBd_Senha.getText().equals(null)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    private void chamarImportarXlsx(){
        Core.ImportarXlsx.importarArquivo(tblTabPrev);
        if(tblTabPrev.getRowCount() > 0){
            iniciarComboBoxTiposArquivo();
            painelAbas.setSelectedIndex(4);
        }
    }
    
    private void chamarImportarCsv(){
        Core.ImportarCsv.importarArquivo(tblTabPrev, cbxAbaImportArq_ParamSeparador.getSelectedItem().toString());
        if(tblTabPrev.getRowCount() >= 0){
            iniciarComboBoxTiposArquivo();
            painelAbas.setSelectedIndex(4);
        }
    }
    
    private void iniciarComboBoxTiposArquivo() {
        int colunas = 0;
        colunas = tblTabPrev.getColumnCount();
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
            listaDeCbxTipos.add(cbx);
            painelAbaTabPrev_CbxTiposVariaveis.add(cbx);
            painelAbaTabPrev_CbxTiposVariaveis.updateUI();
        }
    }
    
    private void iniciarComboBoxTiposBanco(){
        ArrayList<String> tipos = buscarTipoDeCampoDoBanco();        
        int colunas = 0;
        colunas = tblTabPrev.getColumnCount();
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
            listaDeCbxTipos.add(cbx);
            painelAbaTabPrev_CbxTiposVariaveis.add(cbx);
            cbx.setSelectedItem(transformarTipo(tipos.get(i)));
            painelAbaTabPrev_CbxTiposVariaveis.updateUI();
        }
    }
    
    private ArrayList<String> buscarTipoDeCampoDoBanco(){
        return ConexaoDao.getDataType(cbxAbaImportBd_Tabela.getSelectedItem().toString(), 
                cbxAbaImportBd_Sgbd.getSelectedItem().toString());
    }
    
    private String transformarTipo(String tipoBanco){
        System.out.println(tipoBanco);
        switch(cbxAbaImportBd_Sgbd.getSelectedItem().toString()){
            case "PostgreSQL":
                switch(tipoBanco){
                    case "smallint":
                        return "Inteiro";
                    case "integer":
                        return "Inteiro";
                    case "bigint":
                        return "Inteiro";
                    case "decimal":
                        return "Real";
                    case "numeric":
                        return "Real";
                    case "real":
                        return "Real";
                    case "double precision":
                        return "Real";
                    case "money":
                        return "Real";
                    case "varchar":
                        return "Texto";
                    case "character":
                        return "Caractere";
                    case "char":
                        return "Caractere";
                    case "text":
                        return "Caractere";
                    case "character varying":
                        return "Texto";
                    case "date":
                        return "Data dd-MM-yyyy";
                    default:
                        return "Texto";
                }//switch postgres
            case "MySQL":
                switch(tipoBanco){
                    case "tinyint":
                        return "Inteiro";
                    case "smallint":
                        return "Inteiro";
                    case "mediumint":
                        return "Inteiro";
                    case "int":
                        return "Inteiro";
                    case "bigint":
                        return "Inteiro";
                    case "decimal":
                        return "Real";
                    case "float":
                        return "Real";
                    case "double":
                        return "Real";
                    case "bit":
                        return "V/F";
                    case "char":
                        return "Caractere";
                    case "varchar":
                        return "Texto";
                    default:
                        return "Texto";                    
                }//swtich mysql
            case "SQL Server":
                switch(tipoBanco){
                    
                }//switch sqlserver
                break;
        }//switch SGBD
        return null;
    }
    
    private void carregarTxtPorta(){
        switch(cbxAbaImportBd_Sgbd.getSelectedItem().toString()){
            case "Selecione":
                txtAbaImportBd_Porta.setText("");
                break;
            case "PostgreSQL":
                txtAbaImportBd_Porta.setText("5432");
                break;
            case "MySQL":
                txtAbaImportBd_Porta.setText("3306");
                break;
            case "SQL Server":
                txtAbaImportBd_Porta.setText("1433");
                break;
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FormPrincipal().setVisible(true);
                FormPrincipal form = new FormPrincipal();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbaImportArq_ProcurarArquivoCsv;
    private javax.swing.JButton btnAbaImportArq_ProcurarPlanilhaXlsx;
    private javax.swing.JButton btnAbaImportBd_Ajuda;
    private javax.swing.JButton btnAbaImportBd_Conectar;
    private javax.swing.JButton btnAbaImportBd_Desconectar;
    private javax.swing.JButton btnAbaImportBd_ExecConsulPerson;
    private javax.swing.JButton btnAbaImportBd_ImportTabela;
    private javax.swing.JButton btnAbaInicio_Proximo;
    private javax.swing.JButton btnAbaTabPrev_ValidarTipos;
    private javax.swing.JButton btnAbaTipoImportImportarBanco;
    private javax.swing.JButton btnAbaTipoImport_ImportarArquivo;
    private javax.swing.JComboBox<String> cbxAbaImportArq_ParamSeparador;
    private javax.swing.JComboBox<String> cbxAbaImportBd_Sgbd;
    private javax.swing.JComboBox<String> cbxAbaImportBd_Tabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPaneImportCsv;
    private javax.swing.JScrollPane jScrollPaneImportXlsx;
    private javax.swing.JScrollPane jScrollPaneInicioExplicacao;
    private javax.swing.JScrollPane jScrollPaneTabPrev;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblABaImportBd_Porta;
    private javax.swing.JLabel lblAbaImportArq_ParamSeparador;
    private javax.swing.JLabel lblAbaImportBd_Banco;
    private javax.swing.JLabel lblAbaImportBd_Endereco;
    private javax.swing.JLabel lblAbaImportBd_Senha;
    private javax.swing.JLabel lblAbaImportBd_Sgbd;
    private javax.swing.JLabel lblAbaImportBd_Usuario;
    private javax.swing.JPanel painelAbaImportArq_ImportCsv;
    private javax.swing.JPanel painelAbaImportArq_ImportXlsx;
    private javax.swing.JPanel painelAbaImportBd_Conexao;
    private javax.swing.JPanel painelAbaImportBd_ConsulDefault;
    private javax.swing.JPanel painelAbaImportBd_ConsulPerson;
    private javax.swing.JPanel painelAbaImportBd_ConsultarBd;
    private javax.swing.JPanel painelAbaImportacaoArquivo;
    private javax.swing.JPanel painelAbaImportacaoBanco;
    private javax.swing.JPanel painelAbaInicio;
    private javax.swing.JPanel painelAbaInicio_ExplicaoAssistente;
    private javax.swing.JPanel painelAbaTabPrev_CbxTiposVariaveis;
    private javax.swing.JPanel painelAbaTabPrev_TabPrevResult;
    private javax.swing.JPanel painelAbaTabelaPreview;
    private javax.swing.JPanel painelAbaTipoImport_ImportacaoArquivo;
    private javax.swing.JPanel painelAbaTipoImport_ImportacaoBanco;
    private javax.swing.JPanel painelAbaTipoImportação;
    private javax.swing.JTabbedPane painelAbas;
    private javax.swing.JTable tblTabPrev;
    private javax.swing.JTextField txtAbaImportBd_Banco;
    private javax.swing.JTextField txtAbaImportBd_Conexao;
    private javax.swing.JTextArea txtAbaImportBd_ConsulPerson;
    private javax.swing.JTextField txtAbaImportBd_Endereco;
    private javax.swing.JTextField txtAbaImportBd_Porta;
    private javax.swing.JLabel txtAbaImportBd_Tabela;
    private javax.swing.JTextField txtAbaImportBd_Usuario;
    private javax.swing.JTextArea txtAreaAbaImportArq_ImportCsv;
    private javax.swing.JTextArea txtAreaAbaImportArq_ImportXlsx;
    private javax.swing.JTextArea txtAreaAbaInicio_Explicacao;
    private javax.swing.JTextArea txtAreaAbaTipoImport_ImportacaoArquivo;
    private javax.swing.JTextArea txtAreaImportacaoBanco;
    private javax.swing.JPasswordField txtPassAbaImportBd_Senha;
    // End of variables declaration//GEN-END:variables
}
