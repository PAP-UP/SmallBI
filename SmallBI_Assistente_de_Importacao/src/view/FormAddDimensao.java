package view;

import view.percorrerAbas.PercorrerAbasAddDimensao;
import java.util.List;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Dimensao;
import model.TabelaFato;

public class FormAddDimensao extends javax.swing.JFrame {

    private List<JCheckBox> listaDeCheckBox = new ArrayList<>();
    public static List<String> atributosUtilizadosNoCubo = new ArrayList<>();
    private TabelaFato tabelaFato;
    
    public FormAddDimensao() {
        initComponents();
        //carregarCheckBoxesAtr();
        carregarTabelasSalvas();
        PercorrerAbasAddDimensao.desativarAbasInicio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConfDim = new javax.swing.JPanel();
        painelAbas = new javax.swing.JTabbedPane();
        painelAba_Tabela = new javax.swing.JPanel();
        painelTabelas = new javax.swing.JPanel();
        lblTabelas_selecione = new javax.swing.JLabel();
        cbxTabelas = new javax.swing.JComboBox<>();
        btnPainelTabelas_Sair = new javax.swing.JButton();
        btnPainelTabelas_Proximo = new javax.swing.JButton();
        painelAba_Atributos = new javax.swing.JPanel();
        scroolPaneAbaAtri_Atributos = new javax.swing.JScrollPane();
        jPanelAtributos = new javax.swing.JPanel();
        btnAbaAtributos_Proximo = new javax.swing.JButton();
        btnAbaAtributos_Sair = new javax.swing.JButton();
        btnAbaAtributos_Voltar = new javax.swing.JButton();
        painelAba_NomeChave = new javax.swing.JPanel();
        painelAbaNomeChave_NomeChave = new javax.swing.JPanel();
        lblAbaNomeChave_NomeDim = new javax.swing.JLabel();
        txtAbaNomeChave_NomeDim = new javax.swing.JTextField();
        lblAbaNomeChave_Chave = new javax.swing.JLabel();
        btnAbaNomeChave_Salvar = new javax.swing.JButton();
        btnAbaNomeChave_Sair = new javax.swing.JButton();
        cbxAbaNomeChave_PKs = new javax.swing.JComboBox<>();
        btnAbaNomeChave_Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelConfDim.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        painelTabelas.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabelas"));

        lblTabelas_selecione.setText("Selecione uma tabela: ");

        cbxTabelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnPainelTabelas_Sair.setText("Sair");
        btnPainelTabelas_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelTabelas_SairActionPerformed(evt);
            }
        });

        btnPainelTabelas_Proximo.setText("Próximo");
        btnPainelTabelas_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelTabelas_ProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTabelasLayout = new javax.swing.GroupLayout(painelTabelas);
        painelTabelas.setLayout(painelTabelasLayout);
        painelTabelasLayout.setHorizontalGroup(
            painelTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelTabelasLayout.createSequentialGroup()
                        .addComponent(lblTabelas_selecione)
                        .addGap(18, 18, 18)
                        .addComponent(cbxTabelas, 0, 224, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTabelasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPainelTabelas_Proximo)
                        .addGap(18, 18, 18)
                        .addComponent(btnPainelTabelas_Sair)))
                .addContainerGap())
        );
        painelTabelasLayout.setVerticalGroup(
            painelTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTabelas_selecione)
                    .addComponent(cbxTabelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(painelTabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPainelTabelas_Sair)
                    .addComponent(btnPainelTabelas_Proximo))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelAba_TabelaLayout = new javax.swing.GroupLayout(painelAba_Tabela);
        painelAba_Tabela.setLayout(painelAba_TabelaLayout);
        painelAba_TabelaLayout.setHorizontalGroup(
            painelAba_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAba_TabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAba_TabelaLayout.setVerticalGroup(
            painelAba_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAba_TabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelAbas.addTab("Tabela", painelAba_Tabela);

        painelAba_Atributos.setBorder(javax.swing.BorderFactory.createTitledBorder("Atributos"));

        scroolPaneAbaAtri_Atributos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanelAtributos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanelAtributosLayout = new javax.swing.GroupLayout(jPanelAtributos);
        jPanelAtributos.setLayout(jPanelAtributosLayout);
        jPanelAtributosLayout.setHorizontalGroup(
            jPanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        jPanelAtributosLayout.setVerticalGroup(
            jPanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        scroolPaneAbaAtri_Atributos.setViewportView(jPanelAtributos);

        btnAbaAtributos_Proximo.setText("Próximo");
        btnAbaAtributos_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaAtributos_ProximoActionPerformed(evt);
            }
        });

        btnAbaAtributos_Sair.setText("Sair");
        btnAbaAtributos_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaAtributos_SairActionPerformed(evt);
            }
        });

        btnAbaAtributos_Voltar.setText("Voltar");
        btnAbaAtributos_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaAtributos_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAba_AtributosLayout = new javax.swing.GroupLayout(painelAba_Atributos);
        painelAba_Atributos.setLayout(painelAba_AtributosLayout);
        painelAba_AtributosLayout.setHorizontalGroup(
            painelAba_AtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAba_AtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAba_AtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroolPaneAbaAtri_Atributos, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAba_AtributosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaAtributos_Voltar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaAtributos_Proximo)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaAtributos_Sair)))
                .addContainerGap())
        );
        painelAba_AtributosLayout.setVerticalGroup(
            painelAba_AtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAba_AtributosLayout.createSequentialGroup()
                .addComponent(scroolPaneAbaAtri_Atributos, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAba_AtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaAtributos_Proximo)
                    .addComponent(btnAbaAtributos_Sair)
                    .addComponent(btnAbaAtributos_Voltar))
                .addContainerGap())
        );

        painelAbas.addTab("Atributos", painelAba_Atributos);

        painelAbaNomeChave_NomeChave.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome e Chave da Dimensão"));

        lblAbaNomeChave_NomeDim.setText("Nome da Dimensão: ");

        lblAbaNomeChave_Chave.setText("Chave Primária: ");

        btnAbaNomeChave_Salvar.setText("Salvar");
        btnAbaNomeChave_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaNomeChave_SalvarActionPerformed(evt);
            }
        });

        btnAbaNomeChave_Sair.setText("Sair");
        btnAbaNomeChave_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaNomeChave_SairActionPerformed(evt);
            }
        });

        cbxAbaNomeChave_PKs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAbaNomeChave_Voltar.setText("Voltar");
        btnAbaNomeChave_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaNomeChave_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAbaNomeChave_NomeChaveLayout = new javax.swing.GroupLayout(painelAbaNomeChave_NomeChave);
        painelAbaNomeChave_NomeChave.setLayout(painelAbaNomeChave_NomeChaveLayout);
        painelAbaNomeChave_NomeChaveLayout.setHorizontalGroup(
            painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaNomeChave_NomeChaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaNomeChave_NomeChaveLayout.createSequentialGroup()
                        .addGroup(painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAbaNomeChave_NomeDim)
                            .addComponent(lblAbaNomeChave_Chave))
                        .addGap(18, 18, 18)
                        .addGroup(painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAbaNomeChave_NomeDim)
                            .addComponent(cbxAbaNomeChave_PKs, 0, 233, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaNomeChave_NomeChaveLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaNomeChave_Voltar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaNomeChave_Salvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaNomeChave_Sair)))
                .addContainerGap())
        );
        painelAbaNomeChave_NomeChaveLayout.setVerticalGroup(
            painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaNomeChave_NomeChaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbaNomeChave_NomeDim)
                    .addComponent(txtAbaNomeChave_NomeDim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbaNomeChave_Chave)
                    .addComponent(cbxAbaNomeChave_PKs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(painelAbaNomeChave_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaNomeChave_Sair)
                    .addComponent(btnAbaNomeChave_Salvar)
                    .addComponent(btnAbaNomeChave_Voltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelAba_NomeChaveLayout = new javax.swing.GroupLayout(painelAba_NomeChave);
        painelAba_NomeChave.setLayout(painelAba_NomeChaveLayout);
        painelAba_NomeChaveLayout.setHorizontalGroup(
            painelAba_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAba_NomeChaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaNomeChave_NomeChave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAba_NomeChaveLayout.setVerticalGroup(
            painelAba_NomeChaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAba_NomeChaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbaNomeChave_NomeChave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelAbas.addTab("Nome e Chave", painelAba_NomeChave);

        javax.swing.GroupLayout painelConfDimLayout = new javax.swing.GroupLayout(painelConfDim);
        painelConfDim.setLayout(painelConfDimLayout);
        painelConfDimLayout.setHorizontalGroup(
            painelConfDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConfDimLayout.createSequentialGroup()
                .addComponent(painelAbas)
                .addContainerGap())
        );
        painelConfDimLayout.setVerticalGroup(
            painelConfDimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConfDimLayout.createSequentialGroup()
                .addComponent(painelAbas)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConfDim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConfDim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbaNomeChave_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaNomeChave_SairActionPerformed
        dispose();
    }//GEN-LAST:event_btnAbaNomeChave_SairActionPerformed

    private void btnAbaNomeChave_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaNomeChave_SalvarActionPerformed
        salvarDimensao();
    }//GEN-LAST:event_btnAbaNomeChave_SalvarActionPerformed

    private void btnAbaAtributos_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaAtributos_ProximoActionPerformed
        PercorrerAbasAddDimensao.atributosToNomeChave();
        carregarCbxPrimaryKey();
    }//GEN-LAST:event_btnAbaAtributos_ProximoActionPerformed

    private void btnAbaNomeChave_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaNomeChave_VoltarActionPerformed
        PercorrerAbasAddDimensao.nomeChaveToAtributos();
    }//GEN-LAST:event_btnAbaNomeChave_VoltarActionPerformed

    private void btnAbaAtributos_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaAtributos_SairActionPerformed
        dispose();
    }//GEN-LAST:event_btnAbaAtributos_SairActionPerformed

    private void btnPainelTabelas_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelTabelas_SairActionPerformed
        dispose();
    }//GEN-LAST:event_btnPainelTabelas_SairActionPerformed

    private void btnPainelTabelas_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelTabelas_ProximoActionPerformed
        carregarCheckBoxesAtr();
        PercorrerAbasAddDimensao.tabelaToAtributos();
    }//GEN-LAST:event_btnPainelTabelas_ProximoActionPerformed

    private void btnAbaAtributos_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaAtributos_VoltarActionPerformed
        PercorrerAbasAddDimensao.atributosToTabela();
    }//GEN-LAST:event_btnAbaAtributos_VoltarActionPerformed
    
    private void carregarTabelasSalvas(){
        cbxTabelas.removeAllItems();
        for(TabelaFato t : FormGerarCuboXml.tabelasFato){
            cbxTabelas.addItem(t.getNomeTabela());
        }
    }
    
    private void carregarCbxPrimaryKey(){
        cbxAbaNomeChave_PKs.removeAllItems();
        for(JCheckBox checkBox : listaDeCheckBox){
            if(checkBox.isSelected()){
                cbxAbaNomeChave_PKs.addItem(checkBox.getText());
                salvarAtributosUtilizados(checkBox.getText());
            }
        }
        cbxAbaNomeChave_PKs.updateUI();
    }
        
    private void salvarDimensao(){
    
        if(!txtAbaNomeChave_NomeDim.getText().equals("") && cbxAbaNomeChave_PKs.getSelectedItem() != null){
            Dimensao d = new Dimensao();
            d.setNome(txtAbaNomeChave_NomeDim.getText());
            d.setTabela(tabelaFato.getNomeTabela());
            d.setKey(cbxAbaNomeChave_PKs.getSelectedItem().toString());
            List<String> atributos = new ArrayList<>();
            //System.out.println("Qtd atributos: " + cbxAbaNomeChave_PKs.getItemCount());
            
            for(int i = 0; i < cbxAbaNomeChave_PKs.getItemCount(); i++){
                if(cbxAbaNomeChave_PKs.getItemAt(i) != null){
                    atributos.add(cbxAbaNomeChave_PKs.getItemAt(i));
                }
            }
            d.setAtributos(atributos);    
            FormGerarCuboXml.dimensoes.add(d);

            JLabel l = new JLabel();
            l.setText("Dimensão: " + d.getNome() + ", Tabela: " + d.getTabela() + ", Chave: " + d.getKey() + ";");
            FormGerarCuboXml.painel_jtpAbaModelDim_listDims.setLayout(
                new BoxLayout(FormGerarCuboXml.painel_jtpAbaModelDim_listDims,BoxLayout.Y_AXIS));
            FormGerarCuboXml.painel_jtpAbaModelDim_listDims.add(l);
            FormGerarCuboXml.painel_jtpAbaModelDim_listDims.updateUI();        
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }
    
    private void salvarAtributosUtilizados(String atributo){        
        boolean existeNaLista = false;
        for(int i = 0; i < atributosUtilizadosNoCubo.size(); i++){
            if(atributosUtilizadosNoCubo.get(i).equals(atributo)){
                existeNaLista = true;
            }
        }        
        if(existeNaLista == false){
            atributosUtilizadosNoCubo.add(atributo);
        }
    }
    
    private void carregarCheckBoxesAtr(){
        
        jPanelAtributos.setLayout(new BoxLayout(jPanelAtributos, BoxLayout.Y_AXIS));
        tabelaFato = new TabelaFato();
        for(TabelaFato t : FormGerarCuboXml.tabelasFato){
            String tabelaSeleciona = cbxTabelas.getSelectedItem().toString();
            if(t.getNomeTabela().equals(tabelaSeleciona)){
                tabelaFato = t;
            }
        }
       
        jPanelAtributos.removeAll();
        listaDeCheckBox.clear();
        for(int i = 0; i < tabelaFato.getjTable().getColumnCount(); i++){
            JCheckBox checkBox = new JCheckBox();
            checkBox.setText(tabelaFato.getjTable().getColumnName(i));
            checkBox.setVisible(true);
            listaDeCheckBox.add(checkBox);
            jPanelAtributos.add(checkBox);
        }
        jPanelAtributos.updateUI();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAddDimensao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbaAtributos_Proximo;
    private javax.swing.JButton btnAbaAtributos_Sair;
    private javax.swing.JButton btnAbaAtributos_Voltar;
    private javax.swing.JButton btnAbaNomeChave_Sair;
    private javax.swing.JButton btnAbaNomeChave_Salvar;
    private javax.swing.JButton btnAbaNomeChave_Voltar;
    private javax.swing.JButton btnPainelTabelas_Proximo;
    private javax.swing.JButton btnPainelTabelas_Sair;
    private javax.swing.JComboBox<String> cbxAbaNomeChave_PKs;
    private javax.swing.JComboBox<String> cbxTabelas;
    private javax.swing.JPanel jPanelAtributos;
    private javax.swing.JLabel lblAbaNomeChave_Chave;
    private javax.swing.JLabel lblAbaNomeChave_NomeDim;
    private javax.swing.JLabel lblTabelas_selecione;
    private javax.swing.JPanel painelAbaNomeChave_NomeChave;
    private javax.swing.JPanel painelAba_Atributos;
    private javax.swing.JPanel painelAba_NomeChave;
    private javax.swing.JPanel painelAba_Tabela;
    public static javax.swing.JTabbedPane painelAbas;
    private javax.swing.JPanel painelConfDim;
    private javax.swing.JPanel painelTabelas;
    private javax.swing.JScrollPane scroolPaneAbaAtri_Atributos;
    private javax.swing.JTextField txtAbaNomeChave_NomeDim;
    // End of variables declaration//GEN-END:variables
}
