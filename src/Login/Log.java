
package Login;

import Clases.AnimacionesLabels;
import Clases.Conexion;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import ModoDesarrollador.Principal;
import InterfacesAdmin.PresentacionAdmin;
import InterfacesOperaciones.IngresoVehiculo;


/**
 *
 * @author Luis Carlos
 */
public class Log extends javax.swing.JFrame {

    public Log() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    AnimacionesLabels animacion = new AnimacionesLabels();
    
    
    
    public boolean validarCampos(){
        
        if(user.getText().equals("")||password.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Hay campos vacios",null,JOptionPane.ERROR_MESSAGE);
            
                if(user.getText().equals("")){
                    labelUser.setForeground(Color.RED);
                }

                if(password.getText().equals("")){
                   labelPswd.setForeground(Color.RED);
                }
            
                return false;
        }else{
            
                try{

                    Long.parseLong(user.getText());

                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Formato numerico no válido. Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
                    labelUser.setForeground(Color.RED);
                    return false;
                }
        }
            
            
        return true;
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        labelPswd = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        separador2 = new javax.swing.JSeparator();
        separador1 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        labelUser = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        ingresar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar 64px.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 90, 90));

        labelPswd.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        labelPswd.setForeground(new java.awt.Color(255, 255, 255));
        labelPswd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPswd.setText("Contraseña");
        getContentPane().add(labelPswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 387, 90, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login Reparaciones Mejía");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 230, -1));

        user.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setBorder(null);
        user.setCaretColor(new java.awt.Color(255, 255, 255));
        user.setOpaque(false);
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 210, -1));
        getContentPane().add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 210, 4));

        separador1.setOpaque(true);
        getContentPane().add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 210, 2));

        password.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(255, 255, 255));
        password.setOpaque(false);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 210, -1));

        labelUser.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        labelUser.setForeground(new java.awt.Color(255, 255, 255));
        labelUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUser.setText("Usuario");
        getContentPane().add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 70, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave 32px.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 32, 32));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar 32px.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 32, 32));

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setText("Salir");
        salir.setOpaque(true);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 50, -1));

        ingresar.setBackground(new java.awt.Color(255, 255, 255));
        ingresar.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        ingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresar.setText("Ingresar");
        ingresar.setOpaque(true);
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarMouseExited(evt);
            }
        });
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 70, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo38.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 370, 490));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo10.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
    }//GEN-LAST:event_passwordActionPerformed

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
       animacion.eventoMouseEntered(salir);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        animacion.eventoMouseExited(salir);
    }//GEN-LAST:event_salirMouseExited

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseEntered
       animacion.eventoMouseEntered(ingresar);
    }//GEN-LAST:event_ingresarMouseEntered

    private void ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseExited
        animacion.eventoMouseExited(ingresar);
    }//GEN-LAST:event_ingresarMouseExited

    private void ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseClicked
        
        if(validarCampos()){
            
            boolean root = false;
            boolean admin = false;
            try{ 

            Conexion con = new Conexion();
            ResultSet rs = con.buscarUsuario(Long.parseLong(user.getText()));

            while(rs.next()){
                
                if((rs.getString("password")).equals("root")){
                    root = true;
                }
            }
            
            
            if(root){
                
                    Principal principal = new Principal();
                    JOptionPane.showMessageDialog(null, "Ha ingresado como root","Advertencia",JOptionPane.WARNING_MESSAGE);
                    principal.setVisible(true);
                    this.dispose();
                
            }else{
                
                    ResultSet result = con.buscarUsuario(Long.parseLong(user.getText()));

                    while(result.next()){

                       admin = result.getBoolean("role");
                    }
                
                
                if(admin){
                 
                    PresentacionAdmin admon = new PresentacionAdmin();
                    JOptionPane.showMessageDialog(null, "Ha ingresado como administrador","Advertencia",JOptionPane.WARNING_MESSAGE);
                    admon.setVisible(true);
                    this.dispose();
                    
                    }else{

                        IngresoVehiculo vehiculo = new IngresoVehiculo();
                        JOptionPane.showMessageDialog(null, "Ha ingresado como usuario");
                        vehiculo.setVisible(true);
                        this.dispose();

                    }
                
                
            }
            
            
            
            
            }catch(ClassNotFoundException | SQLException e){
              JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_ingresarMouseClicked

    private void userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyTyped
       
        labelUser.setForeground(Color.WHITE);
    }//GEN-LAST:event_userKeyTyped

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
       labelPswd.setForeground(Color.WHITE);
    }//GEN-LAST:event_passwordKeyTyped

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelPswd;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel salir;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
