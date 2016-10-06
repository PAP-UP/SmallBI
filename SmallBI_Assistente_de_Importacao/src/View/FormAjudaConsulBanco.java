package View;

public class FormAjudaConsulBanco extends javax.swing.JFrame {

    public FormAjudaConsulBanco() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelAjuda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAjuda = new javax.swing.JTextArea();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assistente de Ajuda com Banco de Dados");

        painelAjuda.setBorder(javax.swing.BorderFactory.createTitledBorder("Assistente de Ajuda com Banco de Dados"));

        txtAreaAjuda.setBackground(new java.awt.Color(204, 204, 255));
        txtAreaAjuda.setColumns(20);
        txtAreaAjuda.setRows(5);
        txtAreaAjuda.setText("\n\t           Bem vindo ao Assistente de Ajuda com\n\t                           Banco de Dados!\n\n          Na área de consulta existem duas possibilidades, uma consulta\n  padrão ou personalizada, as consultas padrão, trazem todos os dados de uma \n  determinada tabela através do comando \"SELECT * FROM nome_da_tabela\",  \n  já a personalizada, se da através de um script sql, esse script ou query, deverá \n  seguir os padrões de linguagem do seu SGBD.\n\n");
        txtAreaAjuda.setFocusable(false);
        jScrollPane1.setViewportView(txtAreaAjuda);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAjudaLayout = new javax.swing.GroupLayout(painelAjuda);
        painelAjuda.setLayout(painelAjudaLayout);
        painelAjudaLayout.setHorizontalGroup(
            painelAjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAjudaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAjudaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair)))
                .addContainerGap())
        );
        painelAjudaLayout.setVerticalGroup(
            painelAjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAjudaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAjuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAjuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAjudaConsulBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelAjuda;
    private javax.swing.JTextArea txtAreaAjuda;
    // End of variables declaration//GEN-END:variables
}
