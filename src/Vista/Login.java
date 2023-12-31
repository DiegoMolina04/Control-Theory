/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Constructor.Usuario;
import com.placeholder.PlaceHolder;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author andym
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    PlaceHolder holder;

    static LinkedList<Usuario>usuario= new LinkedList<Usuario>(); //Lista usuario 
    
    
    public Login() {
        initComponents();
        setTitle("Diagnostico De Paciente");
        setLocationRelativeTo(null);
        sesion.requestFocus(); //Se cambia el focus para poder observar el placeholder
        sesion.requestFocus();
        holder = new PlaceHolder(txt_ingreseUsuario, "Ingrese el nombre de usuario");
        holder = new PlaceHolder(txt_ingreseContraseña, "Ingrese la contraseña de usuario");
        
    }
    
    public void cargarUsuarios(){
        
        Usuario us1 = new Usuario("Diego","123");
        Usuario us2 = new Usuario("Natalia","123");
        usuario.add(us1);
        usuario.add(us2);
        
    }
    
    public int verificarUsuario(String nombreComprobar, String contraseñaComprobar){ //Metodo que valida el usuario ingresado.
        
        int flag = 0; //Variable que identificara si el usuario se encontro en la lista o no.
        for (int i = 0; i < usuario.size(); i++) {
            
            String nombre = usuario.get(i).getNombre(); //Se toma el nombre.
            String contraseña = usuario.get(i).getContraseña(); //Se toma la contraseña.
            
            if (nombreComprobar.equals(nombre)&&contraseñaComprobar.equals(contraseña)){ /*Si la información ingresada en los campos es igual a
                                                                                                     un usuario guardado le da a la variable flag valor de 1*/
                
                flag = 1; //Si existe el usuario.
                
            }else {
                
            }
            
        }
        
        return flag;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_limpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_agregarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sesion = new javax.swing.JLabel();
        txt_ingreseUsuario = new javax.swing.JTextField();
        txt_ingreseContraseña = new javax.swing.JTextField();
        btn_iniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/limpiar_norm.png"))); // NOI18N
        btn_limpiar.setBorder(null);
        btn_limpiar.setBorderPainted(false);
        btn_limpiar.setContentAreaFilled(false);
        btn_limpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/limpiar_press.png"))); // NOI18N
        btn_limpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/limpiar_roll.png"))); // NOI18N
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/medicina.JPG"))); // NOI18N

        btn_agregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/add_norm.png"))); // NOI18N
        btn_agregarUsuario.setBorder(null);
        btn_agregarUsuario.setBorderPainted(false);
        btn_agregarUsuario.setContentAreaFilled(false);
        btn_agregarUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/add_press.png"))); // NOI18N
        btn_agregarUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/add_roll.png"))); // NOI18N
        btn_agregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Bienvenido a Diagnostico De Paciente");

        sesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sesion.setText("Inicio De Sesión");

        btn_iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/acep_norm.png"))); // NOI18N
        btn_iniciar.setBorder(null);
        btn_iniciar.setBorderPainted(false);
        btn_iniciar.setContentAreaFilled(false);
        btn_iniciar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/acep_press.png"))); // NOI18N
        btn_iniciar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/acep_roll.png"))); // NOI18N
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_agregarUsuario)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_iniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(btn_limpiar)
                        .addGap(57, 57, 57))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_ingreseContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ingreseUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(sesion)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_agregarUsuario)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addComponent(sesion)
                .addGap(18, 18, 18)
                .addComponent(txt_ingreseUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_ingreseContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_iniciar)
                    .addComponent(btn_limpiar)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        
        txt_ingreseUsuario.setText("");
        txt_ingreseContraseña.setText("");
        holder = new PlaceHolder(txt_ingreseUsuario, "Ingrese el nombre de usuario");
        holder = new PlaceHolder(txt_ingreseContraseña, "Ingrese la contraseña de usuario");
        
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_agregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarUsuarioActionPerformed
        
        AgregarUsuario objAgregar = new AgregarUsuario();
        objAgregar.setVisible(true); //Se abre la vista AgregarUsuario.
        dispose(); //Se cierra vista Login.
        
        
    }//GEN-LAST:event_btn_agregarUsuarioActionPerformed

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        
        String nombreComprobar = txt_ingreseUsuario.getText();
        String contraseñaComprobar = txt_ingreseContraseña.getText();
        
        int verificacion = verificarUsuario(nombreComprobar, contraseñaComprobar); //Llamado a la función verificadUsuario.

        if(verificacion==1){
            
            SignosVitales objMedico = new SignosVitales();
            objMedico.setVisible(true); //Se abre la vista de propietario.
            dispose(); //Se cierra la vista de Login.
         
        }else{
            JOptionPane.showMessageDialog(null, "Error ! Verifique datos ingresados","Diagnostico De Paciente",  JOptionPane.ERROR_MESSAGE);
        }
          
        
    }//GEN-LAST:event_btn_iniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_agregarUsuario;
    public javax.swing.JButton btn_iniciar;
    public javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel sesion;
    public javax.swing.JTextField txt_ingreseContraseña;
    public javax.swing.JTextField txt_ingreseUsuario;
    // End of variables declaration//GEN-END:variables
}
