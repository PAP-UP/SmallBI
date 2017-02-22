package view;

import business.GerarSchema;
import business.GerarScriptSql;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;


public class FormEnviarCubo extends javax.swing.JFrame {

    public FormEnviarCubo() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelAutenti = new javax.swing.JPanel();
        lblAuten_Login = new javax.swing.JLabel();
        lblAuten_Senha = new javax.swing.JLabel();
        txtAuten_Login = new javax.swing.JTextField();
        txtAuten_Senha = new javax.swing.JPasswordField();
        btnAuten_Enviar = new javax.swing.JButton();
        btnAuten_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enviar cubo para SmallBI");

        painelAutenti.setBorder(javax.swing.BorderFactory.createTitledBorder("Autenticação"));

        lblAuten_Login.setText("Login:");

        lblAuten_Senha.setText("Senha:");

        btnAuten_Enviar.setText("Enviar");
        btnAuten_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuten_EnviarActionPerformed(evt);
            }
        });

        btnAuten_Cancelar.setText("Cancelar");
        btnAuten_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuten_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAutentiLayout = new javax.swing.GroupLayout(painelAutenti);
        painelAutenti.setLayout(painelAutentiLayout);
        painelAutentiLayout.setHorizontalGroup(
            painelAutentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAutentiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAutentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAutentiLayout.createSequentialGroup()
                        .addGroup(painelAutentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAuten_Senha)
                            .addComponent(lblAuten_Login))
                        .addGap(18, 18, 18)
                        .addGroup(painelAutentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAuten_Login)
                            .addComponent(txtAuten_Senha, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAutentiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAuten_Cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAuten_Enviar)))
                .addContainerGap())
        );
        painelAutentiLayout.setVerticalGroup(
            painelAutentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAutentiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAutentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuten_Login)
                    .addComponent(txtAuten_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAutentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuten_Senha)
                    .addComponent(txtAuten_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelAutentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAuten_Enviar)
                    .addComponent(btnAuten_Cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAutenti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAutenti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAuten_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuten_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnAuten_CancelarActionPerformed

    private void btnAuten_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuten_EnviarActionPerformed
        enviar();
    }//GEN-LAST:event_btnAuten_EnviarActionPerformed

    private void enviar(){
        if(txtAuten_Login != null && !txtAuten_Login.equals("") &&
                txtAuten_Senha != null && !txtAuten_Senha.equals("")){
            
            String login = txtAuten_Login.getText();
            String senha = txtAuten_Senha.getText();
            String mdx = GerarSchema.getSchemaXml();
            String nomeCubo = GerarSchema.getNomeSchema();
            String scriptSql = new String();
            for(String s : GerarScriptSql.scripts){
                scriptSql += s;
            }
            
            Hashtable<String, Object> hash = new Hashtable<>();
            hash.put("login", login);
            hash.put("senha", senha);
            hash.put("mdx", mdx);
            hash.put("nomeCubo", nomeCubo);
            hash.put("scriptSql", scriptSql);
  
            String url = "http://localhost:8080/SmallBI_WebService/rest/cubo/addCubeFromAssistent";
            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpPost httpPost = new HttpPost(url);
            Gson gson = new Gson();
            try {
                StringEntity postingString = new StringEntity(gson.toJson(hash));
                httpPost.setEntity(postingString);
                httpPost.setHeader("Content-Type", "application/json");
                HttpResponse response = httpClient.execute(httpPost);
                
                int cod = response.getStatusLine().getStatusCode();
                JOptionPane.showMessageDialog(null, "Código: " + cod + ". " + getResponse(cod));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(FormEnviarCubo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FormEnviarCubo.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }
    
    private String getResponse(int cod){
        switch(cod){
            case 200: 
                return "Cubo enviado com sucesso!";
            case 404:
                return "Falha ao enviar cubo. Servidor não encontrado";
            case 500:
                return "Falha ao enviar cubo. Erro interno na API";            
        }
        return "";
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEnviarCubo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuten_Cancelar;
    private javax.swing.JButton btnAuten_Enviar;
    private javax.swing.JLabel lblAuten_Login;
    private javax.swing.JLabel lblAuten_Senha;
    private javax.swing.JPanel painelAutenti;
    private javax.swing.JTextField txtAuten_Login;
    private javax.swing.JPasswordField txtAuten_Senha;
    // End of variables declaration//GEN-END:variables
}
