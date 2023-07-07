/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Constructor.Usuario;
import com.placeholder.PlaceHolder;
import javax.swing.JOptionPane;

/**
 *
 * @author andym
 */
public class SignosVitales extends javax.swing.JFrame {

    /**
     * Creates new form DiagnosticoMedico
     */
    
    PlaceHolder holder;
    static int temperaturaCorporal=0, presionArterial=0, frecuenciaCardiaca=0, frecuenciaRespiratoria=0;
    static String temperatura, presion, cardiaca, respiratoria;
    
    public SignosVitales() {
        initComponents();
        setTitle("Diagnostico De Paciente");
        setLocationRelativeTo(null);
        ingreseDatos.requestFocus();
        ingreseDatos.requestFocus();
        holder = new PlaceHolder(txt_ingreseTemperatura, "Ingrese temperatura corporal"); //Uso del placeholder
        holder = new PlaceHolder(txt_ingresePresion, "Ingrese presion arterial"); 
        holder = new PlaceHolder(txt_ingreseCardiaca, "Ingrese frecuencia cardiaca"); 
        holder = new PlaceHolder(txt_ingreseRespiratoria, "Ingrese frecuencia respiratoria"); 
    }
    
    public int modeloMatematico(int signoVital){
        
        double Vc = 0.0, Vn = 0.0, Vr = 0.0;
        double temperaturaValor = Double.parseDouble(temperatura);
        double presionValor = Double.parseDouble(presion);
        double cardiacaValor = Double.parseDouble(cardiaca);
        double respiratoriaValor = Double.parseDouble(respiratoria);
        int decision = 0;
        //int decisionTemperatura=0, decisionPresion=0, decisionCardiaca=0, decisionRespiratoria=0;
        
        switch (signoVital){
            
            case 1: //Temperatura Corporal
                Vc = (1 - 2)*(1 - 1.5); //Se calcula Vc, donde 2 equilibra el sistema y 1.5 es el margen que se tiene.
                Vn = (Vc * 2); //Se calcula Vn, donde 2  es el margen nominal que entra a equilibrar el sistema.
                Vr = Vn / (1 + Vc*temperaturaValor);
                //System.out.println("Este es el resultado: "+Vr);
                if(Vr<=0.05194805194805195 && Vr>=0.050890585241730284){//Vr>0.05194 && Vr<0.05089
                    //System.out.println("Controlado");
                    decision = 0;
                }else if(Vr>0.05089){
                    //System.out.println("No controlado (bajo)");
                    decision = 1;
                }else if(Vr<0.05194){
                    //System.out.println("No controlado (alto)");
                    decision = 2;
                }
            break;
            
            case 2: //Presión Arterial.
                Vc = (1 - 30)*(1 - 20); //Se calcula Vc, donde 30 equilibra el sistema y 20 es el margen que se tiene.
                Vn = (Vc * 30); //Se calcula Vn, donde 30  es el margen nominal que entra a equilibrar el sistema.
                Vr = Vn / (1 + Vc*presionValor);
                //System.out.println("Este es el resultado: "+Vr);
                if(Vr<=0.2999945554527141 && Vr>=0.214){//Vr>0.05194 && Vr<0.05089
                    //System.out.println("Controlado");
                    decision = 0;
                }else if(Vr>0.214){
                    //System.out.println("No controlado (bajo)");
                    decision = 1;
                }else if(Vr<0.2999945554527141){
                    //System.out.println("No controlado (alto)");
                    decision = 2;
                }
            break;
            
            case 3: //Frecuencia Cardiaca.
                Vc = (1 - 90)*(1 - 85); //Se calcula Vc, donde 90 equilibra el sistema y 85 es el margen que se tiene.
                Vn = (Vc * 90); //Se calcula Vn, donde 90  es el margen nominal que entra a equilibrar el sistema.
                Vr = Vn / (1 + Vc*cardiacaValor);
                //System.out.println("Este es el resultado: "+Vr);
                if(Vr<=1.5 && Vr>=0.818){//Vr>0.05194 && Vr<0.05089
                    //System.out.println("Controlado");
                    decision = 0;
                }else if(Vr>0.818){
                    //System.out.println("No controlado (bajo)");
                    decision = 1;
                }else if(Vr<1.5){
                    //System.out.println("No controlado (alto)");
                    decision = 2;
                }
            break;
            
            case 4: //Frecuencia Respiratoria.
                Vc = (1 - 6)*(1 - 4); //Se calcula Vc, donde 6 equilibra el sistema y 4 es el margen que se tiene.
                Vn = (Vc * 6); //Se calcula Vn, donde 6  es el margen nominal que entra a equilibrar el sistema.
                Vr = Vn / (1 + Vc*respiratoriaValor);
                //System.out.println("Este es el resultado: "+Vr);
                if(Vr<=0.4972375690607735  && Vr>=0.29900332225913623){//Vr>0.05194 && Vr<0.05089
                    //System.out.println("Controlado");
                    decision = 0;
                }else if(Vr>0.29900332225913623){
                    //System.out.println("No controlado (bajo)");
                    decision = 1;
                }else if(Vr<0.4972375690607735 ){
                    //System.out.println("No controlado (alto)");
                    decision = 2;
                }
            break;
            
        }
        
        return decision;
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
        ingreseDatos = new javax.swing.JLabel();
        txt_ingreseTemperatura = new javax.swing.JTextField();
        txt_ingresePresion = new javax.swing.JTextField();
        txt_ingreseCardiaca = new javax.swing.JTextField();
        txt_ingreseRespiratoria = new javax.swing.JTextField();
        btn_ingreseDatos = new javax.swing.JButton();
        btn_limpiarDatos = new javax.swing.JButton();
        btn_salirSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        ingreseDatos.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ingreseDatos.setText("Ingrese Signos Vitales Del Paciente");

        btn_ingreseDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/acep_norm.png"))); // NOI18N
        btn_ingreseDatos.setBorder(null);
        btn_ingreseDatos.setBorderPainted(false);
        btn_ingreseDatos.setContentAreaFilled(false);
        btn_ingreseDatos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/acep_press.png"))); // NOI18N
        btn_ingreseDatos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/acep_roll.png"))); // NOI18N
        btn_ingreseDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingreseDatosActionPerformed(evt);
            }
        });

        btn_limpiarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/limpiar_norm.png"))); // NOI18N
        btn_limpiarDatos.setBorder(null);
        btn_limpiarDatos.setBorderPainted(false);
        btn_limpiarDatos.setContentAreaFilled(false);
        btn_limpiarDatos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/limpiar_press.png"))); // NOI18N
        btn_limpiarDatos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/limpiar_roll.png"))); // NOI18N
        btn_limpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarDatosActionPerformed(evt);
            }
        });

        btn_salirSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/salir_norm.png"))); // NOI18N
        btn_salirSesion.setBorder(null);
        btn_salirSesion.setBorderPainted(false);
        btn_salirSesion.setContentAreaFilled(false);
        btn_salirSesion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/salir_press.png"))); // NOI18N
        btn_salirSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/salir_roll.png"))); // NOI18N
        btn_salirSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btn_ingreseDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_limpiarDatos)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_ingreseRespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ingreseCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ingresePresion, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ingreseTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_salirSesion)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ingreseDatos)
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(ingreseDatos)
                .addGap(18, 18, 18)
                .addComponent(txt_ingreseTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_ingresePresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_ingreseCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_ingreseRespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ingreseDatos)
                    .addComponent(btn_limpiarDatos))
                .addGap(18, 18, 18)
                .addComponent(btn_salirSesion)
                .addContainerGap(12, Short.MAX_VALUE))
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

    private void btn_limpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarDatosActionPerformed
        txt_ingreseCardiaca.setText("");
        txt_ingresePresion.setText("");
        txt_ingreseRespiratoria.setText("");
        txt_ingreseTemperatura.setText("");
        holder = new PlaceHolder(txt_ingreseTemperatura, "Ingrese temperatura corporal"); //Uso del placeholder
        holder = new PlaceHolder(txt_ingresePresion, "Ingrese presion arterial"); 
        holder = new PlaceHolder(txt_ingreseCardiaca, "Ingrese frecuencia cardiaca"); 
        holder = new PlaceHolder(txt_ingreseRespiratoria, "Ingrese frecuencia respiratoria");
    }//GEN-LAST:event_btn_limpiarDatosActionPerformed

    private void btn_ingreseDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingreseDatosActionPerformed
        
        //Login objLogin = new Login();
        
        temperatura = txt_ingreseTemperatura.getText();
        presion = txt_ingresePresion.getText();
        cardiaca = txt_ingreseCardiaca.getText();
        respiratoria = txt_ingreseRespiratoria.getText();
        
        if(temperatura.equals("Ingrese temperatura corporal")||presion.equals("Ingrese presion arterial")||cardiaca.equals("Ingrese frecuencia cardiaca")||respiratoria.equals("Ingrese frecuencia respiratoria")){ //Verifica que no existan campos vacios
            
            JOptionPane.showMessageDialog(null, "Error ! Verifique datos ingresados","Diagnostico De Paciente",  JOptionPane.ERROR_MESSAGE);
            
        }else{
            
            /*DiagnosticoPaciente objPaciente = new DiagnosticoPaciente();
            objPaciente.setVisible(true);
            dispose();*/
            
            for (int i = 1; i < 5; i++) {
                
                int resultado = modeloMatematico(i);
                
                switch (i){
                    
                    case 1:
                        temperaturaCorporal = resultado;
                    break;    
                    
                    case 2:
                        presionArterial = resultado;
                    break;
                    
                    case 3:
                        frecuenciaCardiaca = resultado;
                    break;
                    
                    case 4:
                        frecuenciaRespiratoria = resultado;
                    break;
                    
                }    
                
            }
            
            //StringBuilder strBuilder = new StringBuilder();
            //txtArea_filtrar.setText(strBuilder.toString()); //Se coloca en el txtArea
            StringBuilder strBuilder = new StringBuilder();
            DiagnosticoPaciente objPaciente = new DiagnosticoPaciente();
            
            switch (temperaturaCorporal){
                case 0: //Controlado
                    objPaciente.lb_resultadoCorporal.setText("Controlado");
                break;    
                
                case 1: //No controlado (bajo)
                    objPaciente.lb_resultadoCorporal.setText("No controlado (bajo)");
                    strBuilder.append("Temperatura Corporal Baja\n");
                    strBuilder.append("1. Retirar ropa mojada en caso de tenerla.\n");
                    strBuilder.append("2. Abrigar con cobertor termico.\n");
                    strBuilder.append("3. Colocar bolsas calientes en cuello y cabeza.\n");
                break;
                
                case 2: //No controlado (alto)
                    objPaciente.lb_resultadoCorporal.setText("No controlado (alto)");
                    strBuilder.append("Temperatura Corporal Alta\n");
                    strBuilder.append("1. Administrar analgésicos.\n");
                    strBuilder.append("2. Baño agua tibia.\n");
                    strBuilder.append("3. Administrar antibióticos.\n");
                break;
            }
            
            switch (presionArterial){
                case 0: //Controlado
                    objPaciente.lb_resultadoArterial.setText("Controlado");
                break;    
                
                case 1: //No controlado (bajo)
                    objPaciente.lb_resultadoArterial.setText("No controlado (bajo)");
                    strBuilder.append("Presión Arterial Baja\n");
                    strBuilder.append("1. Acostar al paciente y elevar sus extremidades.\n");
                    strBuilder.append("2. Aplicar compresas frías si tiene temperatura alta.\n");
                    strBuilder.append("3. Aplicar insulina en caso de ser diabetico.\n");
                break;
                
                case 2: //No controlado (alto)
                    objPaciente.lb_resultadoArterial.setText("No controlado (alto)");
                    strBuilder.append("Presión Arterial Alta\n");
                    strBuilder.append("1. Administrar hipertensivos.\n");
                break;
            }
            
            switch (frecuenciaCardiaca){
                case 0: //Controlado
                    objPaciente.lb_resultadoCardiaca.setText("Controlado");
                break;    
                
                case 1: //No controlado (bajo)
                    objPaciente.lb_resultadoCardiaca.setText("No controlado (bajo)");
                    strBuilder.append("Frecuencia Cardiaca Baja\n");
                    strBuilder.append("1. Suministrar medicamentos.\n");
                    strBuilder.append("2. Suministrar adrenalina, si la frecuencia cardiaca es casi nula.\n");
                    strBuilder.append("3. Colocar marcapasos temporal.\n");
                break;
                
                case 2: //No controlado (alto)
                    objPaciente.lb_resultadoCardiaca.setText("No controlado (alto)");
                    strBuilder.append("Frecuencia Cardiaca Alta\n");
                    strBuilder.append("1. Acostar al paciente con sus extremidades extendidas.\n");
                    strBuilder.append("2. Estabilizar respiración.\n");
                break;
            }
            
            switch (frecuenciaRespiratoria){
                case 0: //Controlado
                    objPaciente.lb_resultadoRespiratoria.setText("Controlado");
                break;    
                
                case 1: //No controlado (bajo)
                    objPaciente.lb_resultadoRespiratoria.setText("No controlado (bajo)");
                    strBuilder.append("Frecuencia Respiratoria Baja\n");
                    strBuilder.append("1. Mantener respiración para aumentar frecuencia cardiaca.\n");
                    strBuilder.append("2. Aplicar inhalador para abrir bronquios.\n");
                break;
                
                case 2: //No controlado (alto)
                    objPaciente.lb_resultadoRespiratoria.setText("No controlado (alto)");
                    strBuilder.append("Frecuencia Cardiaca Alta\n");
                    strBuilder.append("1. Aplicar inhalador para relajar los bronquios.\n");
                    strBuilder.append("2. realizar respiraciones largas y lentas.\n");
                break;
            }
            objPaciente.txtArea_diagnosticoPaciente.setText(strBuilder.toString());
            objPaciente.setVisible(true);
            dispose();
            
        }
        
    }//GEN-LAST:event_btn_ingreseDatosActionPerformed

    private void btn_salirSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirSesionActionPerformed
        String decision = JOptionPane.showInputDialog("¿Seguro desea cerrar la sesión? Si/No"); //Cierra la sesión
        
        if(decision.toLowerCase().equals("si")){ //Si la respuesta es si.
            
            Login objLogin = new Login();
            objLogin.setVisible(true);
            dispose();
            
        }else if(decision.toLowerCase().equals("no")){ //Si la respuesta es no.
            
        }else{
            JOptionPane.showMessageDialog(null, "Error ! Respuesta no valida","Diagnostico De Paciente",  JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_salirSesionActionPerformed

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
            java.util.logging.Logger.getLogger(SignosVitales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignosVitales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignosVitales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignosVitales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /*for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }*/
        /* Create and display the form */
        SignosVitales objVitales = new SignosVitales();
        //objVitales.modeloMatematico(1);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignosVitales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_ingreseDatos;
    public javax.swing.JButton btn_limpiarDatos;
    public javax.swing.JButton btn_salirSesion;
    public javax.swing.JLabel ingreseDatos;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_ingreseCardiaca;
    public javax.swing.JTextField txt_ingresePresion;
    public javax.swing.JTextField txt_ingreseRespiratoria;
    public javax.swing.JTextField txt_ingreseTemperatura;
    // End of variables declaration//GEN-END:variables
}
