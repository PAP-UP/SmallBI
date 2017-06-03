package view;

import business.GerarScriptSql;
import business.Util;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.TabelaImportada;

public class FormSalvarTabela extends javax.swing.JFrame {

    private JTable tabelaPivot = new JTable();
    private List<JComboBox> listaCbxTipos = new ArrayList<>();
    
    public FormSalvarTabela(JTable tabelaPivot, List<JComboBox> listaCbxTipos) {
        initComponents();
        carregarCbxChavePrimaria(tabelaPivot);
        this.tabelaPivot = tabelaPivot;
        this.listaCbxTipos = listaCbxTipos;
        //txtPainelConfTab_txtNomeTab.setText("MinhaTabelaFato");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelAbaSaveSqlTabPivot_ConfTab = new javax.swing.JPanel();
        cbxPainelConfTab_lblPrimaryKey = new javax.swing.JLabel();
        cbxPainelConfTab_CamposPrimaryKey = new javax.swing.JComboBox();
        txtPainelConfTab_txtNomeTab = new javax.swing.JTextField();
        cbxPainelConfTab_lblNomeTab = new javax.swing.JLabel();
        btnPainelConfTab_Salvar = new javax.swing.JButton();
        btnPainelConfTab_Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelAbaSaveSqlTabPivot_ConfTab.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurações da Tabela"));

        cbxPainelConfTab_lblPrimaryKey.setText("Identificador Único:");

        cbxPainelConfTab_CamposPrimaryKey.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));

        txtPainelConfTab_txtNomeTab.setToolTipText("");

        cbxPainelConfTab_lblNomeTab.setText("Nome da Tabela:");

        btnPainelConfTab_Salvar.setText("Salvar");
        btnPainelConfTab_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelConfTab_SalvarActionPerformed(evt);
            }
        });

        btnPainelConfTab_Sair.setText("Sair");
        btnPainelConfTab_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelConfTab_SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaSaveSqlTabPivot_ConfTabLayout = new javax.swing.GroupLayout(painelAbaSaveSqlTabPivot_ConfTab);
        painelAbaSaveSqlTabPivot_ConfTab.setLayout(painelAbaSaveSqlTabPivot_ConfTabLayout);
        painelAbaSaveSqlTabPivot_ConfTabLayout.setHorizontalGroup(
            painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createSequentialGroup()
                        .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxPainelConfTab_lblNomeTab)
                            .addComponent(cbxPainelConfTab_lblPrimaryKey))
                        .addGap(18, 18, 18)
                        .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPainelConfTab_txtNomeTab, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(cbxPainelConfTab_CamposPrimaryKey, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaSaveSqlTabPivot_ConfTabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPainelConfTab_Salvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnPainelConfTab_Sair)))
                .addContainerGap())
        );
        painelAbaSaveSqlTabPivot_ConfTabLayout.setVerticalGroup(
            painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPainelConfTab_lblNomeTab)
                    .addComponent(txtPainelConfTab_txtNomeTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPainelConfTab_lblPrimaryKey)
                    .addComponent(cbxPainelConfTab_CamposPrimaryKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addGroup(painelAbaSaveSqlTabPivot_ConfTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPainelConfTab_Sair)
                    .addComponent(btnPainelConfTab_Salvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(painelAbaSaveSqlTabPivot_ConfTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(painelAbaSaveSqlTabPivot_ConfTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPainelConfTab_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelConfTab_SalvarActionPerformed
        salvarTabela();
    }//GEN-LAST:event_btnPainelConfTab_SalvarActionPerformed

    private void btnPainelConfTab_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelConfTab_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnPainelConfTab_SairActionPerformed

    private void salvarTabela(){
        String nomeTabela = txtPainelConfTab_txtNomeTab.getText();        
        String chavePrimaria = cbxPainelConfTab_CamposPrimaryKey.getSelectedItem().toString();
        
        if(nomeTabela != null && !nomeTabela.isEmpty()){
            if(chavePrimaria != "Selecione"){
                
//                Calendar calendar = Calendar.getInstance();
//                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//                String data = sdf.format(calendar.getTime());
//                nomeTabela = Util.formatarString(nomeTabela + "_" + data);
                nomeTabela = Util.formatarString(nomeTabela);
                
                //Consulta à memória aqui
                boolean existeNaMem = false;
                for(TabelaImportada t : FormAssistenteModelagem.tabelasImportadas){
                    if(t.getNomeTabela().equals(nomeTabela)){
                        existeNaMem = true;
                    }
                }                
                
                if(existeNaMem == false){
                    System.out.println("Qtd linhas:" + tabelaPivot.getRowCount());

                    JOptionPane.showMessageDialog(null, new GerarScriptSql().salvarTabelaPivot(tabelaPivot, 
                            nomeTabela, chavePrimaria, listaCbxTipos));
                    System.out.println("Script SQL gerado: " + GerarScriptSql.scriptSqlTabelaPivot);               

                    TabelaImportada tabelaImportada = new TabelaImportada();
                    tabelaImportada.setScriptSql(GerarScriptSql.scriptSqlTabelaPivot);
                    tabelaImportada.setjTable(tabelaPivot);
                    tabelaImportada.setPrimaryKey(chavePrimaria);
                    tabelaImportada.setNomeTabela(nomeTabela);
                    FormAssistenteModelagem.tabelasImportadas.add(tabelaImportada);    
                    FormAssistenteImportacao.btnAbaTabPrev_GerarCuboXml.setEnabled(true);
                    FormAssistenteImportacao.btnAbaTabPrev_ImportMaisDados.setEnabled(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Você não pode ter mais de uma tabela com o mesmo nome!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Selecione uma chave para a tabela!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Dê um nome para a tabela!");
        }
    }
        
    private void carregarCbxChavePrimaria(JTable tabelaPivot){
        for(int coluna = 0; coluna < tabelaPivot.getColumnCount(); coluna++){
            cbxPainelConfTab_CamposPrimaryKey.addItem(tabelaPivot.getColumnName(coluna));
        }
    }
        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSalvarTabela(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPainelConfTab_Sair;
    private javax.swing.JButton btnPainelConfTab_Salvar;
    private javax.swing.JComboBox cbxPainelConfTab_CamposPrimaryKey;
    private javax.swing.JLabel cbxPainelConfTab_lblNomeTab;
    private javax.swing.JLabel cbxPainelConfTab_lblPrimaryKey;
    private javax.swing.JPanel painelAbaSaveSqlTabPivot_ConfTab;
    private javax.swing.JTextField txtPainelConfTab_txtNomeTab;
    // End of variables declaration//GEN-END:variables
}
