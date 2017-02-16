package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Dimensao;
import model.FactLink;
import model.GrupoMetrica;
import model.Metrica;
import model.TabelaFato;
import view.percorrerAbas.PercorrerAbasAddMetrica;

public class FormAddMetrica extends javax.swing.JFrame {

    private GrupoMetrica grupoMetrica = new GrupoMetrica();
    
    public FormAddMetrica() {
        initComponents();
        carregarAgregadores();
        carregarFormatos();
        carregarTabelasSalvas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelAbas = new javax.swing.JTabbedPane();
        abaGrupoMetri = new javax.swing.JPanel();
        painelConfGrupMetri = new javax.swing.JPanel();
        lblAbaGrupoMetri_Tabela = new javax.swing.JLabel();
        cbxAbaGrupoMetri_Tabela = new javax.swing.JComboBox<>();
        lblAbaGrupoMetri_NomeGrupo = new javax.swing.JLabel();
        txtAbaGrupoMetri_NomeGrupo = new javax.swing.JTextField();
        btnAbaGrupoMetri_Sair = new javax.swing.JButton();
        btnAbaGrupoMetri_Proximo = new javax.swing.JButton();
        AbaMetricas = new javax.swing.JPanel();
        painelConfMetricas = new javax.swing.JPanel();
        lblPainelConfMetri_NomeMetri = new javax.swing.JLabel();
        txtPainelConfMetri_Nome = new javax.swing.JTextField();
        cbxPainelConfMetri_Coluna = new javax.swing.JComboBox<>();
        lblPainelConfMetri_Coluna = new javax.swing.JLabel();
        lblPainelConfMetri_Agre = new javax.swing.JLabel();
        cbxPainelConfMetri_Agre = new javax.swing.JComboBox<>();
        lblPainelConfMetri_Formato = new javax.swing.JLabel();
        cbxPainelConfMetri_Formato = new javax.swing.JComboBox<>();
        btnPainelConfMetri_Adicionar = new javax.swing.JButton();
        btnPainelConfMetri_Sair = new javax.swing.JButton();
        AbaPreviewMetricas = new javax.swing.JPanel();
        painelMetricasAdicionadas = new javax.swing.JPanel();
        abaPreviewMetri_ScrollMetricas = new javax.swing.JScrollPane();
        painelMetricas = new javax.swing.JPanel();
        btnAbaPreviewMetri_Salvar = new javax.swing.JButton();
        btnAbaPreviewMetri_MaisMetri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelConfGrupMetri.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuração Grupo de Métricas"));

        lblAbaGrupoMetri_Tabela.setText("Tabela: ");

        cbxAbaGrupoMetri_Tabela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAbaGrupoMetri_NomeGrupo.setText("Nome Grupo Métricas: ");

        btnAbaGrupoMetri_Sair.setText("Sair");

        btnAbaGrupoMetri_Proximo.setText("Próximo");
        btnAbaGrupoMetri_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaGrupoMetri_ProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelConfGrupMetriLayout = new javax.swing.GroupLayout(painelConfGrupMetri);
        painelConfGrupMetri.setLayout(painelConfGrupMetriLayout);
        painelConfGrupMetriLayout.setHorizontalGroup(
            painelConfGrupMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfGrupMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConfGrupMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConfGrupMetriLayout.createSequentialGroup()
                        .addGroup(painelConfGrupMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAbaGrupoMetri_NomeGrupo)
                            .addComponent(lblAbaGrupoMetri_Tabela))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelConfGrupMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAbaGrupoMetri_NomeGrupo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxAbaGrupoMetri_Tabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConfGrupMetriLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaGrupoMetri_Proximo)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaGrupoMetri_Sair)))
                .addContainerGap())
        );
        painelConfGrupMetriLayout.setVerticalGroup(
            painelConfGrupMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfGrupMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConfGrupMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbaGrupoMetri_NomeGrupo)
                    .addComponent(txtAbaGrupoMetri_NomeGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelConfGrupMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbaGrupoMetri_Tabela)
                    .addComponent(cbxAbaGrupoMetri_Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(painelConfGrupMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaGrupoMetri_Sair)
                    .addComponent(btnAbaGrupoMetri_Proximo))
                .addContainerGap())
        );

        javax.swing.GroupLayout abaGrupoMetriLayout = new javax.swing.GroupLayout(abaGrupoMetri);
        abaGrupoMetri.setLayout(abaGrupoMetriLayout);
        abaGrupoMetriLayout.setHorizontalGroup(
            abaGrupoMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaGrupoMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConfGrupMetri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        abaGrupoMetriLayout.setVerticalGroup(
            abaGrupoMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaGrupoMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConfGrupMetri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelAbas.addTab("Grupo de Métricas", abaGrupoMetri);

        painelConfMetricas.setBorder(javax.swing.BorderFactory.createTitledBorder("Métrica"));

        lblPainelConfMetri_NomeMetri.setText("Nome: ");

        cbxPainelConfMetri_Coluna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblPainelConfMetri_Coluna.setText("Coluna: ");

        lblPainelConfMetri_Agre.setText("Agregador: ");

        cbxPainelConfMetri_Agre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblPainelConfMetri_Formato.setText("Formato: ");

        cbxPainelConfMetri_Formato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout painelConfMetricasLayout = new javax.swing.GroupLayout(painelConfMetricas);
        painelConfMetricas.setLayout(painelConfMetricasLayout);
        painelConfMetricasLayout.setHorizontalGroup(
            painelConfMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfMetricasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConfMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConfMetricasLayout.createSequentialGroup()
                        .addGroup(painelConfMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPainelConfMetri_Agre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPainelConfMetri_Formato, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelConfMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxPainelConfMetri_Formato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxPainelConfMetri_Agre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelConfMetricasLayout.createSequentialGroup()
                        .addGroup(painelConfMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPainelConfMetri_Coluna)
                            .addComponent(lblPainelConfMetri_NomeMetri))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelConfMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPainelConfMetri_Nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxPainelConfMetri_Coluna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        painelConfMetricasLayout.setVerticalGroup(
            painelConfMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfMetricasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConfMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPainelConfMetri_NomeMetri)
                    .addComponent(txtPainelConfMetri_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelConfMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPainelConfMetri_Coluna)
                    .addComponent(cbxPainelConfMetri_Coluna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelConfMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPainelConfMetri_Agre)
                    .addComponent(cbxPainelConfMetri_Agre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(painelConfMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPainelConfMetri_Formato)
                    .addComponent(cbxPainelConfMetri_Formato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnPainelConfMetri_Adicionar.setText("Adicionar");
        btnPainelConfMetri_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelConfMetri_AdicionarActionPerformed(evt);
            }
        });

        btnPainelConfMetri_Sair.setText("Sair");
        btnPainelConfMetri_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelConfMetri_SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AbaMetricasLayout = new javax.swing.GroupLayout(AbaMetricas);
        AbaMetricas.setLayout(AbaMetricasLayout);
        AbaMetricasLayout.setHorizontalGroup(
            AbaMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaMetricasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AbaMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelConfMetricas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AbaMetricasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPainelConfMetri_Adicionar)
                        .addGap(18, 18, 18)
                        .addComponent(btnPainelConfMetri_Sair)))
                .addContainerGap())
        );
        AbaMetricasLayout.setVerticalGroup(
            AbaMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaMetricasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConfMetricas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AbaMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPainelConfMetri_Sair)
                    .addComponent(btnPainelConfMetri_Adicionar))
                .addContainerGap())
        );

        painelAbas.addTab("Métricas", AbaMetricas);

        painelMetricasAdicionadas.setBorder(javax.swing.BorderFactory.createTitledBorder("Preview Métricas"));

        javax.swing.GroupLayout painelMetricasLayout = new javax.swing.GroupLayout(painelMetricas);
        painelMetricas.setLayout(painelMetricasLayout);
        painelMetricasLayout.setHorizontalGroup(
            painelMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        painelMetricasLayout.setVerticalGroup(
            painelMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );

        abaPreviewMetri_ScrollMetricas.setViewportView(painelMetricas);

        javax.swing.GroupLayout painelMetricasAdicionadasLayout = new javax.swing.GroupLayout(painelMetricasAdicionadas);
        painelMetricasAdicionadas.setLayout(painelMetricasAdicionadasLayout);
        painelMetricasAdicionadasLayout.setHorizontalGroup(
            painelMetricasAdicionadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMetricasAdicionadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaPreviewMetri_ScrollMetricas)
                .addContainerGap())
        );
        painelMetricasAdicionadasLayout.setVerticalGroup(
            painelMetricasAdicionadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMetricasAdicionadasLayout.createSequentialGroup()
                .addComponent(abaPreviewMetri_ScrollMetricas)
                .addContainerGap())
        );

        btnAbaPreviewMetri_Salvar.setText("Salvar");
        btnAbaPreviewMetri_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaPreviewMetri_SalvarActionPerformed(evt);
            }
        });

        btnAbaPreviewMetri_MaisMetri.setText("Mais Métricas");
        btnAbaPreviewMetri_MaisMetri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbaPreviewMetri_MaisMetriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AbaPreviewMetricasLayout = new javax.swing.GroupLayout(AbaPreviewMetricas);
        AbaPreviewMetricas.setLayout(AbaPreviewMetricasLayout);
        AbaPreviewMetricasLayout.setHorizontalGroup(
            AbaPreviewMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaPreviewMetricasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AbaPreviewMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelMetricasAdicionadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AbaPreviewMetricasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbaPreviewMetri_MaisMetri)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbaPreviewMetri_Salvar)))
                .addContainerGap())
        );
        AbaPreviewMetricasLayout.setVerticalGroup(
            AbaPreviewMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaPreviewMetricasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelMetricasAdicionadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(AbaPreviewMetricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbaPreviewMetri_Salvar)
                    .addComponent(btnAbaPreviewMetri_MaisMetri))
                .addContainerGap())
        );

        painelAbas.addTab("Preview", AbaPreviewMetricas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbas, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAbas, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPainelConfMetri_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelConfMetri_SairActionPerformed
        dispose();
    }//GEN-LAST:event_btnPainelConfMetri_SairActionPerformed

    private void btnPainelConfMetri_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelConfMetri_AdicionarActionPerformed
        metricasToPreview();
    }//GEN-LAST:event_btnPainelConfMetri_AdicionarActionPerformed

    private void btnAbaGrupoMetri_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaGrupoMetri_ProximoActionPerformed
        grupoMetriToMetricas();
    }//GEN-LAST:event_btnAbaGrupoMetri_ProximoActionPerformed

    private void btnAbaPreviewMetri_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaPreviewMetri_SalvarActionPerformed
        salvarGrupoMetrica();
    }//GEN-LAST:event_btnAbaPreviewMetri_SalvarActionPerformed

    private void btnAbaPreviewMetri_MaisMetriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbaPreviewMetri_MaisMetriActionPerformed
       maisMetricas();
    }//GEN-LAST:event_btnAbaPreviewMetri_MaisMetriActionPerformed

    private void metricasToPreview(){
        if(!txtPainelConfMetri_Nome.getText().equals("")){
            PercorrerAbasAddMetrica.metricasToPreview();
            adicionarMetricaAoGrupo();
        }else{
            JOptionPane.showMessageDialog(null, "Preencha o nome da métrica!");
        }
    }
    
    private void maisMetricas(){
        PercorrerAbasAddMetrica.previewToMetricas();
    }
    
    private void grupoMetriToMetricas(){
        if(!txtAbaGrupoMetri_NomeGrupo.getText().equals("")){
            PercorrerAbasAddMetrica.grupoMetriToMetricas();
            criarGrupoMetricas();
            carregarCbxColunas();
        }else{
            JOptionPane.showMessageDialog(null, "Preencha o nome do grupo de métricas!");
        }
    }
    
    private void adicionarMetricaAoGrupo(){
        Metrica m = new Metrica();
        m.setNome(txtPainelConfMetri_Nome.getText());
        m.setColuna(cbxPainelConfMetri_Coluna.getSelectedItem().toString());
        m.setAgregador(cbxPainelConfMetri_Agre.getSelectedItem().toString());
        m.setFormato(cbxPainelConfMetri_Formato.getSelectedItem().toString()); 
        
        List<Metrica> metricas = new ArrayList<>();
        if(grupoMetrica.getMetricas() != null){
            metricas = grupoMetrica.getMetricas();
        }
        
        metricas.add(m);
        grupoMetrica.setMetricas(metricas);
        
//        List<FactLink> factLinks = new ArrayList<>();
//        if(grupoMetrica.getFactLinks() != null){
//            factLinks = grupoMetrica.getFactLinks();
//        }
//        
//        for(Dimensao d : FormAssistenteModelagem.dimensoes){
//            for(String atributo : d.getAtributos()){
//                 if(atributo.equals(m.getColuna())){
//                     FactLink factLink = new FactLink();
//                     factLink.setDimension(d.getNome());
//                     factLink.setForeignKey(atributo);
//                     factLinks.add(factLink);
//                 }
//            }
//        }
//        grupoMetrica.setFactLinks(factLinks);        
        gerarPreview(m);
    }
    
    private void criarGrupoMetricas(){
        grupoMetrica.setNome(txtAbaGrupoMetri_NomeGrupo.getText());
        grupoMetrica.setTabela(cbxAbaGrupoMetri_Tabela.getSelectedItem().toString());
    }
    
    private void salvarGrupoMetrica(){
        FormAssistenteModelagem.grupoMetricas.add(grupoMetrica);
        
        JLabel l = new JLabel();
        l.setText("Grupo de métricas: " + grupoMetrica.getNome());
//        FormAssistenteModelagem.painelAbaModelMetri_ListMetri.setLayout(
//            new BoxLayout(FormAssistenteModelagem.painelAbaModelMetri_ListMetri, BoxLayout.Y_AXIS));
//        FormAssistenteModelagem.painelAbaModelMetri_ListMetri.add(l);
//                FormAssistenteModelagem.painelAbaModelMetri_ListMetri.updateUI();
        dispose();
    }
    
    private void gerarPreview(Metrica m){
        JLabel l = new JLabel();
        l.setText("Métrica: " + m.getNome() + ", Coluna: " + m.getColuna() + ", Agregador: " + m.getAgregador() +
                ", Formato: " + m.getFormato() + ";");
        painelMetricas.setLayout(new BoxLayout(painelMetricas, BoxLayout.Y_AXIS)); 
        painelMetricas.add(l);
        painelMetricas.updateUI();
    }
    //---------------
    private void carregarTabelasSalvas(){
        cbxAbaGrupoMetri_Tabela.removeAllItems();
        for(TabelaFato t : FormAssistenteModelagem.tabelasFato){
            cbxAbaGrupoMetri_Tabela.addItem(t.getNomeTabela());
        }
    }
    
    private void carregarCbxColunas(){
        cbxPainelConfMetri_Coluna.removeAllItems();
        for(String s : FormAddDimensao.atributosUtilizadosNoCubo){
            cbxPainelConfMetri_Coluna.addItem(s);
        }
    }
    
    private void carregarAgregadores(){
        cbxPainelConfMetri_Agre.removeAllItems();
        cbxPainelConfMetri_Agre.addItem("count");
        cbxPainelConfMetri_Agre.addItem("sum");
        cbxPainelConfMetri_Agre.addItem("avg");
        cbxPainelConfMetri_Agre.addItem("max");
    }
    
    private void carregarFormatos(){
        cbxPainelConfMetri_Formato.removeAllItems();
        cbxPainelConfMetri_Formato.addItem("Standard");
        cbxPainelConfMetri_Formato.addItem("#,###.00");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAddMetrica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AbaMetricas;
    private javax.swing.JPanel AbaPreviewMetricas;
    private javax.swing.JPanel abaGrupoMetri;
    private javax.swing.JScrollPane abaPreviewMetri_ScrollMetricas;
    private javax.swing.JButton btnAbaGrupoMetri_Proximo;
    private javax.swing.JButton btnAbaGrupoMetri_Sair;
    private javax.swing.JButton btnAbaPreviewMetri_MaisMetri;
    private javax.swing.JButton btnAbaPreviewMetri_Salvar;
    private javax.swing.JButton btnPainelConfMetri_Adicionar;
    private javax.swing.JButton btnPainelConfMetri_Sair;
    private javax.swing.JComboBox<String> cbxAbaGrupoMetri_Tabela;
    private javax.swing.JComboBox<String> cbxPainelConfMetri_Agre;
    private javax.swing.JComboBox<String> cbxPainelConfMetri_Coluna;
    private javax.swing.JComboBox<String> cbxPainelConfMetri_Formato;
    private javax.swing.JLabel lblAbaGrupoMetri_NomeGrupo;
    private javax.swing.JLabel lblAbaGrupoMetri_Tabela;
    private javax.swing.JLabel lblPainelConfMetri_Agre;
    private javax.swing.JLabel lblPainelConfMetri_Coluna;
    private javax.swing.JLabel lblPainelConfMetri_Formato;
    private javax.swing.JLabel lblPainelConfMetri_NomeMetri;
    public static javax.swing.JTabbedPane painelAbas;
    private javax.swing.JPanel painelConfGrupMetri;
    private javax.swing.JPanel painelConfMetricas;
    private javax.swing.JPanel painelMetricas;
    private javax.swing.JPanel painelMetricasAdicionadas;
    private javax.swing.JTextField txtAbaGrupoMetri_NomeGrupo;
    private javax.swing.JTextField txtPainelConfMetri_Nome;
    // End of variables declaration//GEN-END:variables
}