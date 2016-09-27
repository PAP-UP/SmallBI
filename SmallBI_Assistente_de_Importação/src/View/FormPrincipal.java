package View;

import javax.swing.JComboBox;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
        iniciarCbxTiposExemplo();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaAbaImportArq_ImportCsv = new javax.swing.JTextArea();
        btnAbaImportArq_ProcurarArquivoCsv = new javax.swing.JButton();
        painelAbaImportArq_ImportXlsx = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaAbaImportArq_ImportXlsx = new javax.swing.JTextArea();
        btnAbaImportArq_ProcurarPlanilhaXlsx = new javax.swing.JButton();
        painelAbaImportacaoBanco = new javax.swing.JPanel();
        painelAbaTabelaPreview = new javax.swing.JPanel();
        painelAbaTabPrev_TabPrevResult = new javax.swing.JPanel();
        painelAbaTabPrev_CbxTiposVariaveis = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblTabPrev = new javax.swing.JTable();

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
                .addComponent(jScrollPaneInicioExplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
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
        jScrollPane3.setViewportView(txtAreaAbaImportArq_ImportCsv);

        btnAbaImportArq_ProcurarArquivoCsv.setText("Procurar Arquivo CSV");

        javax.swing.GroupLayout painelAbaImportArq_ImportCsvLayout = new javax.swing.GroupLayout(painelAbaImportArq_ImportCsv);
        painelAbaImportArq_ImportCsv.setLayout(painelAbaImportArq_ImportCsvLayout);
        painelAbaImportArq_ImportCsvLayout.setHorizontalGroup(
            painelAbaImportArq_ImportCsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportArq_ImportCsvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaImportArq_ImportCsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaImportArq_ImportCsvLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaImportArq_ProcurarArquivoCsv)))
                .addContainerGap())
        );
        painelAbaImportArq_ImportCsvLayout.setVerticalGroup(
            painelAbaImportArq_ImportCsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportArq_ImportCsvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbaImportArq_ProcurarArquivoCsv)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAbaImportArq_ImportXlsx.setBorder(javax.swing.BorderFactory.createTitledBorder("Importação de Arquivo XLSX"));

        txtAreaAbaImportArq_ImportXlsx.setBackground(new java.awt.Color(204, 204, 255));
        txtAreaAbaImportArq_ImportXlsx.setColumns(20);
        txtAreaAbaImportArq_ImportXlsx.setRows(5);
        txtAreaAbaImportArq_ImportXlsx.setText("\n\n\t\t           Nos mostre o caminho até sua planilha.");
        txtAreaAbaImportArq_ImportXlsx.setFocusable(false);
        jScrollPane4.setViewportView(txtAreaAbaImportArq_ImportXlsx);

        btnAbaImportArq_ProcurarPlanilhaXlsx.setText("Procurar Planilha XLSX");

        javax.swing.GroupLayout painelAbaImportArq_ImportXlsxLayout = new javax.swing.GroupLayout(painelAbaImportArq_ImportXlsx);
        painelAbaImportArq_ImportXlsx.setLayout(painelAbaImportArq_ImportXlsxLayout);
        painelAbaImportArq_ImportXlsxLayout.setHorizontalGroup(
            painelAbaImportArq_ImportXlsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportArq_ImportXlsxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaImportArq_ImportXlsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaImportArq_ImportXlsxLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaImportArq_ProcurarPlanilhaXlsx)))
                .addContainerGap())
        );
        painelAbaImportArq_ImportXlsxLayout.setVerticalGroup(
            painelAbaImportArq_ImportXlsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaImportArq_ImportXlsxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout painelAbaImportacaoBancoLayout = new javax.swing.GroupLayout(painelAbaImportacaoBanco);
        painelAbaImportacaoBanco.setLayout(painelAbaImportacaoBancoLayout);
        painelAbaImportacaoBancoLayout.setHorizontalGroup(
            painelAbaImportacaoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        painelAbaImportacaoBancoLayout.setVerticalGroup(
            painelAbaImportacaoBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        painelAbas.addTab("Importação do Banco", painelAbaImportacaoBanco);

        painelAbaTabPrev_TabPrevResult.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela Preview Resultado"));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Definir Tipo", "Texto", "V/F", "Inteiro", "Real", "Caractere", "Data dd-MM-yyyy", "Data MM-dd-yyyy" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Definir Tipo", "Texto", "V/F", "Inteiro", "Real", "Caractere", "Data dd-MM-yyyy", "Data MM-dd-yyyy" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Definir Tipo", "Texto", "V/F", "Inteiro", "Real", "Caractere", "Data dd-MM-yyyy", "Data MM-dd-yyyy" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Definir Tipo", "Texto", "V/F", "Inteiro", "Real", "Caractere", "Data dd-MM-yyyy", "Data MM-dd-yyyy" }));

        javax.swing.GroupLayout painelAbaTabPrev_CbxTiposVariaveisLayout = new javax.swing.GroupLayout(painelAbaTabPrev_CbxTiposVariaveis);
        painelAbaTabPrev_CbxTiposVariaveis.setLayout(painelAbaTabPrev_CbxTiposVariaveisLayout);
        painelAbaTabPrev_CbxTiposVariaveisLayout.setHorizontalGroup(
            painelAbaTabPrev_CbxTiposVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_CbxTiposVariaveisLayout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox4, 0, 167, Short.MAX_VALUE))
        );
        painelAbaTabPrev_CbxTiposVariaveisLayout.setVerticalGroup(
            painelAbaTabPrev_CbxTiposVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_CbxTiposVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tblTabPrev.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tblTabPrev);

        javax.swing.GroupLayout painelAbaTabPrev_TabPrevResultLayout = new javax.swing.GroupLayout(painelAbaTabPrev_TabPrevResult);
        painelAbaTabPrev_TabPrevResult.setLayout(painelAbaTabPrev_TabPrevResultLayout);
        painelAbaTabPrev_TabPrevResultLayout.setHorizontalGroup(
            painelAbaTabPrev_TabPrevResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_TabPrevResultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaTabPrev_TabPrevResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addComponent(painelAbaTabPrev_CbxTiposVariaveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAbaTabPrev_TabPrevResultLayout.setVerticalGroup(
            painelAbaTabPrev_TabPrevResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaTabPrev_TabPrevResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaTabPrev_CbxTiposVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
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
                .addComponent(painelAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void iniciarCbxTiposExemplo(){
        for(int i = 0; i < 4; i++){
            JComboBox cbx = new JComboBox();
            cbx.addItem("Texto");
            cbx.addItem("V/F");
            cbx.addItem("Inteiro");
            cbx.addItem("Real");
            cbx.addItem("Caractere");
            cbx.addItem("Data dd-MM-yyyy");            
            cbx.addItem("Data MM-dd-yyyy");
            painelAbaTabPrev_CbxTiposVariaveis.add(cbx);
            painelAbaTabPrev_CbxTiposVariaveis.updateUI();
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
    private javax.swing.JButton btnAbaInicio_Proximo;
    private javax.swing.JButton btnAbaTipoImportImportarBanco;
    private javax.swing.JButton btnAbaTipoImport_ImportarArquivo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPaneInicioExplicacao;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel painelAbaImportArq_ImportCsv;
    private javax.swing.JPanel painelAbaImportArq_ImportXlsx;
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
    private javax.swing.JTextArea txtAreaAbaImportArq_ImportCsv;
    private javax.swing.JTextArea txtAreaAbaImportArq_ImportXlsx;
    private javax.swing.JTextArea txtAreaAbaInicio_Explicacao;
    private javax.swing.JTextArea txtAreaAbaTipoImport_ImportacaoArquivo;
    private javax.swing.JTextArea txtAreaImportacaoBanco;
    // End of variables declaration//GEN-END:variables
}
