package view;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;


public class FormLogin extends javax.swing.JFrame {

    public static Integer idCliente = 0;
    public static String login, senha = new String();
    String urlApiLogin = "http://localhost:8081/SmallBI_WebService/rest/usuario/login";
    //String urlApiLogin = "http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/usuario/login";
    
    public FormLogin() {
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
        btnAuten_Login = new javax.swing.JButton();
        btnAuten_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        painelAutenti.setBorder(javax.swing.BorderFactory.createTitledBorder("Autenticação"));

        lblAuten_Login.setText("Login:");

        lblAuten_Senha.setText("Senha:");

        btnAuten_Login.setText("Login");
        btnAuten_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuten_LoginActionPerformed(evt);
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
                            .addComponent(txtAuten_Senha, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAutentiLayout.createSequentialGroup()
                        .addComponent(btnAuten_Cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAuten_Login)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(btnAuten_Login)
                    .addComponent(btnAuten_Cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAutenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAutenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAuten_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuten_LoginActionPerformed
        
        //Chamando direto sem validar para otimizar o trabalho
//        FormAssistenteImportacao frm = new FormAssistenteImportacao();
//        frm.setLocationRelativeTo(null);
//        frm.setResizable(false);
//        frm.setVisible(true); 
//        this.dispose();
        login();
    }//GEN-LAST:event_btnAuten_LoginActionPerformed

    private void btnAuten_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuten_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnAuten_CancelarActionPerformed
    
    private void login(){        
        login = txtAuten_Login.getText();
        senha = txtAuten_Senha.getText();
        if(!login.equals("") && !senha.equals("")){            
            Hashtable<String, Object> hash = new Hashtable<>();
            hash.put("login", login);
            hash.put("senha", senha);

            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpPost httpPost = new HttpPost(urlApiLogin);
            Gson gson = new Gson();
            try {
                StringEntity postingString = new StringEntity(gson.toJson(hash));
                httpPost.setEntity(postingString);
                httpPost.setHeader("Content-Type", "application/json");
                HttpResponse response = httpClient.execute(httpPost);
                
                HttpEntity httpEntity = response.getEntity();
                int cod = response.getStatusLine().getStatusCode();
                getResponse(cod);
                
                if(cod == 200){
                    String json = EntityUtils.toString(httpEntity);
                    JSONObject jSONObject;
                    try {
                        jSONObject = new JSONObject(json);
                        
                        if(jSONObject.isNull("msg")){
                        
                            idCliente = jSONObject.getInt("idCliente");
                            System.out.println("idCliente: " + idCliente);
                            System.out.println("idUsuario: " + jSONObject.getInt("idUsuario"));

                            this.dispose();
                            FormAssistenteImportacao frm = new FormAssistenteImportacao();
                            frm.setLocationRelativeTo(null);
                            frm.setResizable(false);
                            frm.setVisible(true); 
                        }else{
                            JOptionPane.showMessageDialog(null, jSONObject.get("msg"));
                        }
                    } catch (JSONException ex) {
    //                    Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, json);
                    }
                }
                System.out.println(response);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Não foi possível se conectar com o servidor!");
            }
            
        }
    }
    
    private void getResponse(int cod){
        switch(cod){
            case 200: 
//                this.dispose();
//                FormAssistenteImportacao frm = new FormAssistenteImportacao();
//                frm.setLocationRelativeTo(null);
//                frm.setResizable(false);
//                frm.setVisible(true); 
                break;
            case 404:
                JOptionPane.showMessageDialog(null, "Servidor indisponível!");
                break;
            case 500:
                JOptionPane.showMessageDialog(null, "Erro interno no servidor!");
                break;
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FormLogin().setVisible(true);
                FormLogin form = new FormLogin();
                form.setLocationRelativeTo(null);
                form.setResizable(false);
                form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuten_Cancelar;
    private javax.swing.JButton btnAuten_Login;
    private javax.swing.JLabel lblAuten_Login;
    private javax.swing.JLabel lblAuten_Senha;
    private javax.swing.JPanel painelAutenti;
    private javax.swing.JTextField txtAuten_Login;
    private javax.swing.JPasswordField txtAuten_Senha;
    // End of variables declaration//GEN-END:variables
}
