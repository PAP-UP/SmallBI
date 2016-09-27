package View;

import ControllerDao.ConexaoDao;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormPrincipal extends javax.swing.JFrame {

    private List<JComboBox> listaDeCbxTipos = new ArrayList<>();
    
    public FormPrincipal() {
        initComponents();
        btnValidarTipos.setVisible(false);
        btnSalvarTabela.setVisible(false);
        btnDesconectar.setEnabled(false);
        esconderBotoesConexaoBanco();
        esconderBotoesImportacaoTabelaBanco();
        
        lblDefinirSeparador.setVisible(false);
        cbxSeparador.setVisible(false);
        
        lblBanco.setVisible(false); //ALTERAÇÃO NO MODO DE CONEXÃO
        cbxBanco.setVisible(false); //ALTERAÇÃO NO MODO DE CONEXÃO
        ativarLayoutImportarBanco(); //ALTERAÇÃO NO MODO DE CONEXÃO
        btnImportarFromDatabase.setVisible(false); //ALTERAÇÃO NO MODO DE CONEXÃO
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        lblDefinirSeparador = new javax.swing.JLabel();
        cbxSeparador = new javax.swing.JComboBox();
        btnImportar = new javax.swing.JButton();
        btnImportarFromDatabase = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblSgbd = new javax.swing.JLabel();
        cbxSgbd = new javax.swing.JComboBox();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnConectar = new javax.swing.JButton();
        btnDesconectar = new javax.swing.JButton();
        painelCbxBanco = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblTabela = new javax.swing.JLabel();
        cbxTabela = new javax.swing.JComboBox();
        btnImportarTabela = new javax.swing.JButton();
        btnEscreverQuerySQL = new javax.swing.JButton();
        btnExecutarQuery = new javax.swing.JButton();
        jScrollPaneTxtArea = new javax.swing.JScrollPane();
        txtAreaScriptSQL = new javax.swing.JTextArea();
        painelCbxTabela = new javax.swing.JPanel();
        lblBanco = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblPorta = new javax.swing.JLabel();
        txtEnredeco = new javax.swing.JTextField();
        txtPorta = new javax.swing.JTextField();
        jScrollPaneAreaDoArquivo = new javax.swing.JScrollPane();
        painelAreaDoArquivo = new javax.swing.JPanel();
        painelCbxTipos = new javax.swing.JPanel();
        jScrollPaneTblArquivo = new javax.swing.JScrollPane();
        tblArquivo = new javax.swing.JTable();
        btnValidarTipos = new javax.swing.JButton();
        btnSalvarTabela = new javax.swing.JButton();
        lblBD = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        cbxBanco = new javax.swing.JComboBox();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assistente de importação");
        setMinimumSize(new java.awt.Dimension(950, 350));
        setResizable(false);

        lblDefinirSeparador.setText("Separador de Campos:");

        cbxSeparador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ",", ";", "|" }));

        btnImportar.setText("Importar Arquivo CSV/XLSX");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        btnImportarFromDatabase.setText("Importar do Banco do Dados");
        btnImportarFromDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarFromDatabaseActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblSgbd.setText("SGBD: ");

        cbxSgbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSgbdActionPerformed(evt);
            }
        });

        lblUsuario.setText("Usuario:");

        lblSenha.setText("Senha:");

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        btnConectar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConectarKeyPressed(evt);
            }
        });

        btnDesconectar.setText("Desconectar");
        btnDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesconectarActionPerformed(evt);
            }
        });

        lblTabela.setText("Tabela: ");

        cbxTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTabelaActionPerformed(evt);
            }
        });

        btnImportarTabela.setText("Importar Tabela");
        btnImportarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarTabelaActionPerformed(evt);
            }
        });

        btnEscreverQuerySQL.setText("Escrever Query SQL");
        btnEscreverQuerySQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscreverQuerySQLActionPerformed(evt);
            }
        });

        btnExecutarQuery.setText("Executar");
        btnExecutarQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarQueryActionPerformed(evt);
            }
        });

        txtAreaScriptSQL.setColumns(20);
        txtAreaScriptSQL.setRows(5);
        jScrollPaneTxtArea.setViewportView(txtAreaScriptSQL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxTabela, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnImportarTabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEscreverQuerySQL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPaneTxtArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExecutarQuery))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImportarTabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnEscreverQuerySQL)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneTxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecutarQuery)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelCbxBancoLayout = new javax.swing.GroupLayout(painelCbxBanco);
        painelCbxBanco.setLayout(painelCbxBancoLayout);
        painelCbxBancoLayout.setHorizontalGroup(
            painelCbxBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCbxBancoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelCbxBancoLayout.setVerticalGroup(
            painelCbxBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCbxBancoLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelCbxTabelaLayout = new javax.swing.GroupLayout(painelCbxTabela);
        painelCbxTabela.setLayout(painelCbxTabelaLayout);
        painelCbxTabelaLayout.setHorizontalGroup(
            painelCbxTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );
        painelCbxTabelaLayout.setVerticalGroup(
            painelCbxTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        lblBanco.setText("Banco de Dados: ");

        lblEndereco.setText("Endereço:");

        lblPorta.setText("Porta:");

        txtEnredeco.setText("localhost");

        painelAreaDoArquivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Área do Arquivo"));

        painelCbxTipos.setLayout(new java.awt.GridLayout(1, 0));

        tblArquivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPaneTblArquivo.setViewportView(tblArquivo);

        javax.swing.GroupLayout painelAreaDoArquivoLayout = new javax.swing.GroupLayout(painelAreaDoArquivo);
        painelAreaDoArquivo.setLayout(painelAreaDoArquivoLayout);
        painelAreaDoArquivoLayout.setHorizontalGroup(
            painelAreaDoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAreaDoArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAreaDoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelCbxTipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneTblArquivo))
                .addGap(16, 16, 16))
        );
        painelAreaDoArquivoLayout.setVerticalGroup(
            painelAreaDoArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAreaDoArquivoLayout.createSequentialGroup()
                .addComponent(painelCbxTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTblArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPaneAreaDoArquivo.setViewportView(painelAreaDoArquivo);

        btnValidarTipos.setText("Validar Tipos");
        btnValidarTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarTiposActionPerformed(evt);
            }
        });

        btnSalvarTabela.setText("Salvar Tabela");
        btnSalvarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarTabelaActionPerformed(evt);
            }
        });

        lblBD.setText("Banco: ");

        cbxBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnConectar)
                            .addGap(18, 18, 18)
                            .addComponent(btnDesconectar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblSenha)
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblUsuario)
                                        .addComponent(lblSgbd))
                                    .addGap(9, 9, 9)))
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxSgbd, javax.swing.GroupLayout.Alignment.TRAILING, 0, 201, Short.MAX_VALUE)
                                .addComponent(txtSenha)
                                .addComponent(txtUsuario)
                                .addComponent(txtBanco, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEndereco)
                                .addComponent(lblPorta))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPorta)
                                .addComponent(txtEnredeco)))
                        .addComponent(painelCbxBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblBanco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbxBanco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(painelCbxTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(lblBD))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPaneAreaDoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImportarFromDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnImportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnValidarTipos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalvarTabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblDefinirSeparador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(389, 389, 389)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnValidarTipos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarTabela)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnImportar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnImportarFromDatabase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPaneAreaDoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(38, 38, 38)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDefinirSeparador)
                            .addComponent(cbxBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBanco))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSgbd)
                            .addComponent(cbxSgbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBD)
                            .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEndereco)
                            .addComponent(txtEnredeco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPorta)
                            .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDesconectar)
                            .addComponent(btnConectar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCbxBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCbxTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void cbxBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBancoActionPerformed
        carregarCbxTabela();
    }//GEN-LAST:event_cbxBancoActionPerformed

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        conectarComBanco();        
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnImportarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarTabelaActionPerformed
        importarTabela();
    }//GEN-LAST:event_btnImportarTabelaActionPerformed

    private void cbxTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTabelaActionPerformed
        acaoCbxTabela();
    }//GEN-LAST:event_cbxTabelaActionPerformed

    private void btnImportarFromDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarFromDatabaseActionPerformed
        ativarLayoutImportarBanco();
    }//GEN-LAST:event_btnImportarFromDatabaseActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        importarArquivo();
    }//GEN-LAST:event_btnImportarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTabelaActionPerformed
        abrirFormSalvarTabela();
    }//GEN-LAST:event_btnSalvarTabelaActionPerformed

    private void btnValidarTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarTiposActionPerformed
        validarTipos();
    }//GEN-LAST:event_btnValidarTiposActionPerformed

    private void btnDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconectarActionPerformed
        desconectar();
    }//GEN-LAST:event_btnDesconectarActionPerformed

    private void cbxSgbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSgbdActionPerformed
        carregarTxtPorta();
    }//GEN-LAST:event_cbxSgbdActionPerformed

    private void btnConectarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConectarKeyPressed
        conectarComBanco();
    }//GEN-LAST:event_btnConectarKeyPressed

    private void btnEscreverQuerySQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscreverQuerySQLActionPerformed
        //abrirFormEscreverQuerySQL();
        jScrollPaneTxtArea.setVisible(true);
        txtAreaScriptSQL.setVisible(true);
        btnExecutarQuery.setVisible(true);
    }//GEN-LAST:event_btnEscreverQuerySQLActionPerformed

    private void btnExecutarQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarQueryActionPerformed
        importarTabelaFromScript();
    }//GEN-LAST:event_btnExecutarQueryActionPerformed
    
    private void abrirFormSalvarTabela(){
        FormSalvar frmSalvar = new FormSalvar(tblArquivo, listaDeCbxTipos);
        frmSalvar.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        frmSalvar.setTitle("Assistente de configuração");
        frmSalvar.setLocationRelativeTo(null);
        frmSalvar.setResizable(false);
        frmSalvar.setVisible(true);
    }
    
    private void importarArquivo() {
        //esconderBotoesConexaoBanco(); //ALTERAÇÃO NO MODO DE CONEXÃO
        //esconderBotoesImportacaoTabelaBanco(); //ALTERAÇÃO NO MODO DE CONEXÃO
        
        String separador = cbxSeparador.getSelectedItem().toString();
        Util.TratarArquivos.importar(tblArquivo, separador);
        if(tblArquivo.getRowCount() > 0){
            controlarBotoes();
            iniciarComboBoxTipos();
        }
        else{            
            painelCbxTipos.removeAll();
            painelCbxTipos.updateUI();
            btnValidarTipos.setVisible(false);
        }
    }
    
    private void importarTabela(){
        ConexaoDao.consultarTabela(cbxTabela.getSelectedItem().toString(), tblArquivo);
        controlarBotoes();
        iniciarComboBoxTiposDoBanco();
    }
    
    private void importarTabelaFromScript(){
        if(ConexaoDao.consultarTabela(tblArquivo, txtAreaScriptSQL.getText()) == null){
            JOptionPane.showMessageDialog(null, "Falha ao executar Script SQL");
        }else{
            controlarBotoes();
            iniciarComboBoxTipos();
        }
    }
    
    private void conectarComBanco(){
        if(validarCamposConexao()){
            ArrayList<String> bancos = ConexaoDao.setarVariaveisConexao(cbxSgbd.getSelectedItem().toString(), 
                    txtUsuario.getText(), txtSenha.getText(),txtEnredeco.getText(),txtPorta.getText());
            if(bancos != null){
                //carregarCbxBanco(bancos); //ALTERAÇÃO NO MODO DE CONEXÃO
                cbxSgbd.setEnabled(false);
                txtUsuario.setEnabled(false);
                txtSenha.setEnabled(false);
                btnConectar.setEnabled(false);
                //JOptionPane.showMessageDialog(null, "Conectado com sucesso!"); //ALTERAÇÃO NO MODO DE CONEXÃO
                carregarCbxTabela();
                //mostrarBotoesImportacaoTabelaBanco(); //ALTERAÇÃO NO MODO DE CONEXÃO
                btnDesconectar.setEnabled(true);
                btnImportar.setEnabled(false);
                cbxSeparador.setEnabled(false);
                btnImportarFromDatabase.setEnabled(false);
            }else{
                //JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
                JOptionPane.showMessageDialog(null, "Falha ao conectar!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }
    
    private void desconectar(){
        ConexaoDao.desconectar();
        cbxSgbd.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtSenha.setEnabled(true);
        btnConectar.setEnabled(true);
        esconderBotoesImportacaoTabelaBanco();
        btnDesconectar.setEnabled(false);
        btnImportar.setEnabled(true);
        cbxSeparador.setEnabled(true);
        btnImportarFromDatabase.setEnabled(true);
        limparJTable();
        painelCbxTipos.removeAll();
        painelCbxTipos.updateUI();
        
        btnValidarTipos.setVisible(false);
    }
    
    private void limparJTable(){
        DefaultTableModel model = (DefaultTableModel)tblArquivo.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
    }
    
    private void validarTipos(){
       String msg = Util.TratarArquivos.validarTipagemDosCampos(tblArquivo, listaDeCbxTipos);
        JOptionPane.showMessageDialog(null, msg);
        if (msg.equals("Campos validados com sucesso!")) {
            btnSalvarTabela.setVisible(true);
        } 
    }
    
    private boolean validarCamposConexao(){
        if(!cbxSgbd.getSelectedItem().equals("Selecione")){
            if(!txtUsuario.getText().equals(null) && !txtSenha.getText().equals(null)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public void controlarBotoes(){
        listaDeCbxTipos.clear();
        painelAreaDoArquivo.setVisible(true);
        btnValidarTipos.setVisible(true);
        jScrollPaneTblArquivo.setVisible(true);
    }
    
    private void acaoCbxTabela(){
        if(cbxTabela.getSelectedItem() != "Selecione"){
            btnImportarTabela.setEnabled(true);
        }else{
            btnImportarTabela.setEnabled(false);
        }
    }
    
    public void iniciarComboBoxTipos() {
        int colunas = 0;
        colunas = tblArquivo.getColumnCount();
        painelCbxTipos.removeAll();
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
            painelCbxTipos.add(cbx);
            painelCbxTipos.updateUI();
        }
    }
    
    private void iniciarComboBoxTiposDoBanco(){
        ArrayList<String> tipos = buscarTipoDeCampoDoBanco();        
        int colunas = 0;
        colunas = tblArquivo.getColumnCount();
        painelCbxTipos.removeAll();
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
            painelCbxTipos.add(cbx);
            cbx.setSelectedItem(transformarTipo(tipos.get(i)));
            painelCbxTipos.updateUI();
        }
    }
    
    private ArrayList<String> buscarTipoDeCampoDoBanco(){
        return ConexaoDao.getDataType(cbxTabela.getSelectedItem().toString(), 
                cbxSgbd.getSelectedItem().toString());
    }
    
    private String transformarTipo(String tipoBanco){
        System.out.println(tipoBanco);
        switch(cbxSgbd.getSelectedItem().toString()){
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
    
    private void ativarLayoutImportarBanco(){
        mostrarBotoesConexaoBanco();
        carregarCbxSgbd();
    }
    
    private void carregarTxtPorta(){
        switch(cbxSgbd.getSelectedItem().toString()){
            case "Selecione":
                txtPorta.setText("");
                break;
            case "PostgreSQL":
                txtPorta.setText("5432");
                break;
            case "MySQL":
                txtPorta.setText("3306");
                break;
            case "SQL Server":
                txtPorta.setText("1433");
                break;
        }
    }
    
    private void carregarCbxBanco(ArrayList<String> bancos){
        cbxBanco.removeAllItems();
        cbxBanco.addItem("Selecione");
        for(String banco : bancos){
            cbxBanco.addItem(banco);
        }
        painelCbxBanco.updateUI();
    }
    
    private void carregarCbxSgbd(){
        if(cbxSgbd.getSelectedItem() == null){
            cbxSgbd.addItem("Selecione");
            cbxSgbd.addItem("PostgreSQL");
            cbxSgbd.addItem("MySQL");
            cbxSgbd.addItem("SQL Server");
        }
    }
    
    private void carregarCbxTabela(){ 
        //ALTERAÇÃO NO MODO DE CONEXÃO----------------------------------------
        
//        if(cbxBanco.getSelectedItem() != null){
//            if(cbxBanco.getSelectedItem().toString() != "Selecione"){
//                ArrayList<String> tabelas = ConexaoDao.getTables(cbxSgbd.getSelectedItem().toString(), 
//                        cbxBanco.getSelectedItem().toString(), txtUsuario.getText(), txtSenha.getText(), 
//                        txtPorta.getText(), txtEnredeco.getText());
//
//                cbxTabela.removeAllItems();
//                cbxTabela.addItem("Selecione");
//                if(tabelas != null){  
//                    for(String tabela : tabelas){
//                        cbxTabela.addItem(tabela);
//                    }
//                    painelCbxTabela.updateUI();
//                    cbxTabela.setEnabled(true);
//                }else{
//                    cbxTabela.setEnabled(false);
//                    JOptionPane.showMessageDialog(null, "Não foi possível acessar este banco!");
//                }
//            }else{
//                cbxTabela.setEnabled(false);
//            }
//        }
//        else{
//            cbxTabela.setEnabled(false);
//        }
        
        //ALTERAÇÃO NO MODO DE CONEXÃO----------------------------
        
        if(txtBanco.getText() != null || txtBanco.getText() != ""){
                ArrayList<String> tabelas = ConexaoDao.getTables(cbxSgbd.getSelectedItem().toString(), 
                        txtBanco.getText(), txtUsuario.getText(), txtSenha.getText(), 
                        txtPorta.getText(), txtEnredeco.getText());

                cbxTabela.removeAllItems();
                cbxTabela.addItem("Selecione");
                if(tabelas != null){  
                    for(String tabela : tabelas){
                        cbxTabela.addItem(tabela);
                    }
                    painelCbxTabela.updateUI();
                    cbxTabela.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Conectado com sucesso!"); //ALTERAÇÃO NO MODO DE CONEXÃO
                    mostrarBotoesImportacaoTabelaBanco(); //ALTERAÇÃO NO MODO DE CONEXÃO
                }else{
                    cbxTabela.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Não foi possível acessar este banco!");
                    esconderBotoesImportacaoTabelaBanco(); //ALTERAÇÃO NO MODO DE CONEXÃO
                }
            }else{
                cbxTabela.setEnabled(false);
            }
    }

    private void mostrarBotoesConexaoBanco(){
        lblSgbd.setVisible(true);
        cbxSgbd.setVisible(true);
        lblUsuario.setVisible(true);
        txtUsuario.setVisible(true);
        lblSenha.setVisible(true);
        txtSenha.setVisible(true);
        btnConectar.setVisible(true);
        btnDesconectar.setVisible(true);
        lblEndereco.setVisible(true);
        txtEnredeco.setVisible(true);
        lblPorta.setVisible(true);
        txtPorta.setVisible(true);
        
        lblBD.setVisible(true); //ALTERAÇÃO NO MODO DE CONEXÃO
        txtBanco.setVisible(true); //ALTERAÇÃO NO MODO DE CONEXÃO
    }
    
    private void mostrarBotoesImportacaoTabelaBanco(){
        //lblBanco.setVisible(true); //ALTERAÇÃO NO MODO DE CONEXÃO
        //cbxBanco.setVisible(true); //ALTERAÇÃO NO MODO DE CONEXÃO
        lblTabela.setVisible(true);
        cbxTabela.setVisible(true);
        btnImportarTabela.setVisible(true);
        
        btnEscreverQuerySQL.setVisible(true);
    }
    
    private void esconderBotoesConexaoBanco(){
        lblSgbd.setVisible(false);
        cbxSgbd.setVisible(false);
        lblUsuario.setVisible(false);
        txtUsuario.setVisible(false);
        lblSenha.setVisible(false);
        txtSenha.setVisible(false);
        btnConectar.setVisible(false);
        btnDesconectar.setVisible(false);
        lblEndereco.setVisible(false);
        txtEnredeco.setVisible(false);
        lblPorta.setVisible(false);
        txtPorta.setVisible(false);
        
        lblBD.setVisible(false); //ALTERAÇÃO NO MODO DE CONEXÃO
        txtBanco.setVisible(false); //ALTERAÇÃO NO MODO DE CONEXÃO
    }
    
     private void esconderBotoesImportacaoTabelaBanco(){
        //lblBanco.setVisible(false); //ALTERAÇÃO NO MODO DE CONEXÃO
        //cbxBanco.setVisible(false); //ALTERAÇÃO NO MODO DE CONEXÃO
        lblTabela.setVisible(false);
        cbxTabela.setVisible(false);
        btnImportarTabela.setVisible(false);
        
        btnEscreverQuerySQL.setVisible(false);
        jScrollPaneTxtArea.setVisible(false);
        txtAreaScriptSQL.setVisible(false);
        btnExecutarQuery.setVisible(false);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormPrincipal form = new FormPrincipal();
                form.setLocationRelativeTo(null);
                form.setResizable(true);
                form.setExtendedState(JFrame.MAXIMIZED_BOTH);
                form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnDesconectar;
    private javax.swing.JButton btnEscreverQuerySQL;
    private javax.swing.JButton btnExecutarQuery;
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnImportarFromDatabase;
    private javax.swing.JButton btnImportarTabela;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarTabela;
    private javax.swing.JButton btnValidarTipos;
    private javax.swing.JComboBox cbxBanco;
    private javax.swing.JComboBox cbxSeparador;
    private javax.swing.JComboBox cbxSgbd;
    private javax.swing.JComboBox cbxTabela;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneAreaDoArquivo;
    private javax.swing.JScrollPane jScrollPaneTblArquivo;
    private javax.swing.JScrollPane jScrollPaneTxtArea;
    private javax.swing.JLabel lblBD;
    private javax.swing.JLabel lblBanco;
    private javax.swing.JLabel lblDefinirSeparador;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblPorta;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSgbd;
    private javax.swing.JLabel lblTabela;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel painelAreaDoArquivo;
    private javax.swing.JPanel painelCbxBanco;
    private javax.swing.JPanel painelCbxTabela;
    private javax.swing.JPanel painelCbxTipos;
    private javax.swing.JTable tblArquivo;
    private javax.swing.JTextArea txtAreaScriptSQL;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtEnredeco;
    private javax.swing.JTextField txtPorta;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}