package View;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import ControllerDao.TabelaDao;
import javax.swing.JOptionPane;

public class FormSalvar extends javax.swing.JFrame {
    
    private JTable tabela = new JTable();
    private List<JComboBox> listaCbxTipos = new ArrayList<>();
    
    public FormSalvar(JTable tbl, List<JComboBox> listaCbxTiposParametro) {
        initComponents();
        carregarCbxChavePrimaria(tbl);
        tabela = tbl;
        listaCbxTipos = listaCbxTiposParametro;
        txtNomeTabela.setText("Tabela01");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelConfiguracaoTabela = new javax.swing.JPanel();
        lblNomeTabela = new javax.swing.JLabel();
        txtNomeTabela = new javax.swing.JTextField();
        lblChavePrimaria = new javax.swing.JLabel();
        cbxCamposChavePrimaria = new javax.swing.JComboBox();
        painelAcoes = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelConfiguracaoTabela.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurações da tabela"));

        lblNomeTabela.setText("Nome da Tabela:");

        lblChavePrimaria.setText("Chave Primária:");

        cbxCamposChavePrimaria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));

        javax.swing.GroupLayout painelConfiguracaoTabelaLayout = new javax.swing.GroupLayout(painelConfiguracaoTabela);
        painelConfiguracaoTabela.setLayout(painelConfiguracaoTabelaLayout);
        painelConfiguracaoTabelaLayout.setHorizontalGroup(
            painelConfiguracaoTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfiguracaoTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConfiguracaoTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeTabela)
                    .addComponent(lblChavePrimaria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConfiguracaoTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeTabela)
                    .addComponent(cbxCamposChavePrimaria, 0, 212, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelConfiguracaoTabelaLayout.setVerticalGroup(
            painelConfiguracaoTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfiguracaoTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConfiguracaoTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeTabela)
                    .addComponent(txtNomeTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelConfiguracaoTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChavePrimaria)
                    .addComponent(cbxCamposChavePrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        painelAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAcoesLayout = new javax.swing.GroupLayout(painelAcoes);
        painelAcoes.setLayout(painelAcoesLayout);
        painelAcoesLayout.setHorizontalGroup(
            painelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );
        painelAcoesLayout.setVerticalGroup(
            painelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAcoesLayout.createSequentialGroup()
                .addGroup(painelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelConfiguracaoTabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelConfiguracaoTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvarTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    public void salvarTabela(){
        String nomeTabela = txtNomeTabela.getText();        
        String chavePrimaria = cbxCamposChavePrimaria.getSelectedItem().toString();
        if(nomeTabela != null){
            if(chavePrimaria != "Selecione"){
                TabelaDao tabelaDao = new TabelaDao();
                JOptionPane.showMessageDialog(null, tabelaDao.incluir(tabela, nomeTabela, chavePrimaria, listaCbxTipos));
            }else{
                JOptionPane.showMessageDialog(null, "Selecione uma chave para a tabela!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Dê um nome para a tabela!");
        }
    }
    
    private void carregarCbxChavePrimaria(JTable tbl){
        for(int coluna = 0; coluna < tbl.getColumnCount(); coluna++){
            cbxCamposChavePrimaria.addItem(tbl.getColumnName(coluna));
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSalvar(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbxCamposChavePrimaria;
    private javax.swing.JLabel lblChavePrimaria;
    private javax.swing.JLabel lblNomeTabela;
    private javax.swing.JPanel painelAcoes;
    private javax.swing.JPanel painelConfiguracaoTabela;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField txtNomeTabela;
    // End of variables declaration//GEN-END:variables
}
