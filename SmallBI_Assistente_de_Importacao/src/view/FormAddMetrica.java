package view;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import model.Metrica;

public class FormAddMetrica extends javax.swing.JFrame {
    
    public FormAddMetrica() {
        initComponents();
        carregarAgregadores();
        carregarFormatos();
        carregarColunas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConfMetri = new javax.swing.JPanel();
        lblPainelConfMetri_NomeMetri = new javax.swing.JLabel();
        lblPainelConfMetri_Coluna = new javax.swing.JLabel();
        lblPainelConfMetri_Agre = new javax.swing.JLabel();
        txtPainelConfMetri_Nome = new javax.swing.JTextField();
        cbxPainelConfMetri_Coluna = new javax.swing.JComboBox<>();
        cbxPainelConfMetri_Agre = new javax.swing.JComboBox<>();
        btnPainelConfMetri_Sair = new javax.swing.JButton();
        btnPainelConfMetri_Salvar = new javax.swing.JButton();
        lblPainelConfMetri_Formato = new javax.swing.JLabel();
        cbxPainelConfMetri_Formato = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelConfMetri.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurar Nova Métrica"));

        lblPainelConfMetri_NomeMetri.setText("Nome: ");

        lblPainelConfMetri_Coluna.setText("Coluna: ");

        lblPainelConfMetri_Agre.setText("Agregador: ");

        cbxPainelConfMetri_Coluna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxPainelConfMetri_Agre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnPainelConfMetri_Sair.setText("Sair");
        btnPainelConfMetri_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelConfMetri_SairActionPerformed(evt);
            }
        });

        btnPainelConfMetri_Salvar.setText("Salvar");
        btnPainelConfMetri_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelConfMetri_SalvarActionPerformed(evt);
            }
        });

        lblPainelConfMetri_Formato.setText("Formato: ");

        cbxPainelConfMetri_Formato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout painelConfMetriLayout = new javax.swing.GroupLayout(painelConfMetri);
        painelConfMetri.setLayout(painelConfMetriLayout);
        painelConfMetriLayout.setHorizontalGroup(
            painelConfMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConfMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConfMetriLayout.createSequentialGroup()
                        .addGroup(painelConfMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPainelConfMetri_NomeMetri)
                            .addComponent(lblPainelConfMetri_Coluna))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelConfMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPainelConfMetri_Nome)
                            .addComponent(cbxPainelConfMetri_Coluna, 0, 233, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConfMetriLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPainelConfMetri_Salvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnPainelConfMetri_Sair))
                    .addGroup(painelConfMetriLayout.createSequentialGroup()
                        .addGroup(painelConfMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPainelConfMetri_Agre)
                            .addComponent(lblPainelConfMetri_Formato))
                        .addGap(28, 28, 28)
                        .addGroup(painelConfMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxPainelConfMetri_Agre, 0, 233, Short.MAX_VALUE)
                            .addComponent(cbxPainelConfMetri_Formato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        painelConfMetriLayout.setVerticalGroup(
            painelConfMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfMetriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConfMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPainelConfMetri_NomeMetri)
                    .addComponent(txtPainelConfMetri_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelConfMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPainelConfMetri_Coluna)
                    .addComponent(cbxPainelConfMetri_Coluna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelConfMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPainelConfMetri_Agre)
                    .addComponent(cbxPainelConfMetri_Agre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelConfMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPainelConfMetri_Formato)
                    .addComponent(cbxPainelConfMetri_Formato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(painelConfMetriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPainelConfMetri_Sair)
                    .addComponent(btnPainelConfMetri_Salvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConfMetri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConfMetri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPainelConfMetri_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelConfMetri_SairActionPerformed
        dispose();
    }//GEN-LAST:event_btnPainelConfMetri_SairActionPerformed

    private void btnPainelConfMetri_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelConfMetri_SalvarActionPerformed
        salvarMetrica();
    }//GEN-LAST:event_btnPainelConfMetri_SalvarActionPerformed

    private void salvarMetrica(){        
        Metrica m = new Metrica();
        m.setNome(txtPainelConfMetri_Nome.getText());
        m.setColuna(cbxPainelConfMetri_Coluna.getSelectedItem().toString());
        m.setAgregador(cbxPainelConfMetri_Agre.getSelectedItem().toString());
        m.setFormato(cbxPainelConfMetri_Formato.getSelectedItem().toString());        
        FormGerarCuboXml.metricas.add(m);
        
        JLabel l = new JLabel();   
        l.setText("Métrica: " + m.getNome() + ", Coluna: " + m.getColuna() + ", Agregador: " + m.getAgregador() +
                ", Formato: " + m.getFormato() + ";");
        FormGerarCuboXml.painelAbaModelMetri_ListMetri.setLayout(
            new BoxLayout(FormGerarCuboXml.painelAbaModelMetri_ListMetri, BoxLayout.Y_AXIS));    
        FormGerarCuboXml.painelAbaModelMetri_ListMetri.add(l);
        FormGerarCuboXml.painelAbaModelMetri_ListMetri.updateUI();        
        dispose();
    }
    
    private void carregarColunas(){
        cbxPainelConfMetri_Coluna.removeAllItems();
        for(String s : FormAddDimensao.atributosDoCubo){
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
    private javax.swing.JButton btnPainelConfMetri_Sair;
    private javax.swing.JButton btnPainelConfMetri_Salvar;
    private javax.swing.JComboBox<String> cbxPainelConfMetri_Agre;
    private javax.swing.JComboBox<String> cbxPainelConfMetri_Coluna;
    private javax.swing.JComboBox<String> cbxPainelConfMetri_Formato;
    private javax.swing.JLabel lblPainelConfMetri_Agre;
    private javax.swing.JLabel lblPainelConfMetri_Coluna;
    private javax.swing.JLabel lblPainelConfMetri_Formato;
    private javax.swing.JLabel lblPainelConfMetri_NomeMetri;
    private javax.swing.JPanel painelConfMetri;
    private javax.swing.JTextField txtPainelConfMetri_Nome;
    // End of variables declaration//GEN-END:variables
}