package View;

import ControllerDao.ConexaoDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class FormConfigurarConexao extends javax.swing.JFrame {
    
    public static JTable tblParametro = null;
    
    public FormConfigurarConexao() {
        initComponents();
        carregarCbxSgbd();
        cbxBanco.setEnabled(false);
        cbxTabela.setEnabled(false);
        btnImportarTabela.setEnabled(false);
        cbxTabela.addItem("Selecione");
    }
    
    public FormConfigurarConexao(JTable tableParametroFormPrincipal) {
        tblParametro = tableParametroFormPrincipal;
        DefaultTableModel modelTblParametro = (DefaultTableModel) tblParametro.getModel();
        modelTblParametro.setRowCount(0);
        modelTblParametro.setColumnCount(0);
        
        initComponents();
        carregarCbxSgbd();
        cbxBanco.setEnabled(false);
        cbxTabela.setEnabled(false);
        btnImportarTabela.setEnabled(false);
        cbxTabela.addItem("Selecione");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTabela = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSgbd = new javax.swing.JLabel();
        cbxSgbd = new javax.swing.JComboBox();
        btnConectar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jPanelSelecionarBancoTabela = new javax.swing.JPanel();
        lblBanco = new javax.swing.JLabel();
        cbxBanco = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cbxTabela = new javax.swing.JComboBox();
        btnImportarTabela = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTabela.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Banco de Dados"));

        lblUsuario.setText("Usuário: ");

        lblSenha.setText("Senha: ");

        lblSgbd.setText("SGBD: ");

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblTabelaLayout = new javax.swing.GroupLayout(lblTabela);
        lblTabela.setLayout(lblTabelaLayout);
        lblTabelaLayout.setHorizontalGroup(
            lblTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblTabelaLayout.createSequentialGroup()
                        .addGroup(lblTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblSenha)
                            .addComponent(lblSgbd))
                        .addGap(59, 59, 59)
                        .addGroup(lblTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(cbxSgbd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSenha)))
                    .addComponent(btnConectar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        lblTabelaLayout.setVerticalGroup(
            lblTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTabelaLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(lblTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSgbd)
                    .addComponent(cbxSgbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addGap(18, 18, 18)
                .addGroup(lblTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnConectar)
                .addGap(6, 6, 6))
        );

        jPanelSelecionarBancoTabela.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o Banco de Dados e a Tabela"));

        lblBanco.setText("Banco de Dados: ");

        cbxBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBancoActionPerformed(evt);
            }
        });

        jLabel1.setText("Tabela: ");

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

        javax.swing.GroupLayout jPanelSelecionarBancoTabelaLayout = new javax.swing.GroupLayout(jPanelSelecionarBancoTabela);
        jPanelSelecionarBancoTabela.setLayout(jPanelSelecionarBancoTabelaLayout);
        jPanelSelecionarBancoTabelaLayout.setHorizontalGroup(
            jPanelSelecionarBancoTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelecionarBancoTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSelecionarBancoTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSelecionarBancoTabelaLayout.createSequentialGroup()
                        .addGroup(jPanelSelecionarBancoTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBanco)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSelecionarBancoTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTabela, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxBanco, 0, 191, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSelecionarBancoTabelaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnImportarTabela)))
                .addContainerGap())
        );
        jPanelSelecionarBancoTabelaLayout.setVerticalGroup(
            jPanelSelecionarBancoTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelecionarBancoTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSelecionarBancoTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBanco))
                .addGap(18, 18, 18)
                .addGroup(jPanelSelecionarBancoTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImportarTabela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSelecionarBancoTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelSelecionarBancoTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        conectarComBanco();
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void cbxBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBancoActionPerformed
        carregarCbxTabela();
    }//GEN-LAST:event_cbxBancoActionPerformed

    private void btnImportarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarTabelaActionPerformed
        importarTabela();
    }//GEN-LAST:event_btnImportarTabelaActionPerformed

    private void cbxTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTabelaActionPerformed
        acaoCbxTabela();
    }//GEN-LAST:event_cbxTabelaActionPerformed
    
    private void acaoCbxTabela(){
        if(!cbxTabela.getSelectedItem().toString().equals("Selecione")){
            btnImportarTabela.setEnabled(true);
        }else{
            btnImportarTabela.setEnabled(false);
        }
    }
    
    private void importarTabela(){
        DefaultTableModel modelo = ConexaoDao.consultarTabela(cbxTabela.getSelectedItem().toString(), tblParametro);
        //FormPrincipal.defaultModelBanco = modelo;
        dispose();
    }
    
    private void carregarCbxTabela(){      
        if(!cbxBanco.getSelectedItem().toString().equals("Selecione")){
            //ArrayList<String> tabelas = ConexaoDao.getTables(cbxSgbd.getSelectedItem().toString(), 
              //      cbxBanco.getSelectedItem().toString(), txtUsuario.getText(), txtSenha.getText());
            //cbxTabela.removeAllItems();
            //cbxTabela.addItem("Selecione");
            cbxTabela.updateUI();
            //for(String tabela : tabelas){
             //   cbxTabela.addItem(tabela);
            //}
            cbxTabela.updateUI();
            cbxTabela.setEnabled(true);
        }else{
            cbxTabela.setEnabled(false);
        }
    }
    
    private void conectarComBanco(){
//        if(validarCamposConexao()){
//            ArrayList<String> bancos = ConexaoDao.setarVariaveisConexao(cbxSgbd.getSelectedItem().toString(), 
//                    txtUsuario.getText(), txtSenha.getText());
//            carregarCbxBanco(bancos);
//            cbxSgbd.setEnabled(false);
//            txtUsuario.setEnabled(false);
//            txtSenha.setEnabled(false);
//            btnConectar.setEnabled(false);
//            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
//        }else{
//            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
//        }
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
    
    private void carregarCbxBanco(ArrayList<String> bancos){
        cbxBanco.removeAllItems();
        cbxBanco.updateUI();
        cbxBanco.addItem("Selecione");
        for (String banco : bancos) {
            cbxBanco.addItem(banco);
        }
        cbxBanco.updateUI();
        cbxBanco.setEnabled(true);
    }
    
    private void carregarCbxSgbd(){
        cbxSgbd.addItem("Selecione");
        cbxSgbd.addItem("PostgreSQL");
        cbxSgbd.addItem("MySQL");
        cbxSgbd.addItem("SQL Server");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FormConfigurarConexao().setVisible(true);
                FormConfigurarConexao form = new FormConfigurarConexao();
                form.setLocationRelativeTo(null);
                form.setResizable(true);
                form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnImportarTabela;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox cbxBanco;
    private javax.swing.JComboBox cbxSgbd;
    private javax.swing.JComboBox cbxTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelSelecionarBancoTabela;
    private javax.swing.JLabel lblBanco;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSgbd;
    private javax.swing.JPanel lblTabela;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}