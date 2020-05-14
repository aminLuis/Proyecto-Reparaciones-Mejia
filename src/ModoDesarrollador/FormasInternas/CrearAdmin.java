
package ModoDesarrollador.FormasInternas;

import Clases.AnimacionesLabels;
import javax.swing.JOptionPane;
import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Luis Carlos
 */
public class CrearAdmin extends javax.swing.JInternalFrame {


    public CrearAdmin() {
        initComponents();
    }


    AnimacionesLabels animacion = new AnimacionesLabels();
    
    
    
    
    public void limpiarCampos(){
        
        user.setText("");
        pswd.setText("");
    }
    
    
    public void registrarAdmin()throws ClassNotFoundException{
        
        try{
            
            if(user.getText().equals("")||pswd.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Hay campos vacios",null,JOptionPane.ERROR_MESSAGE);
            }else{
                
                Conexion con = new Conexion();
                
                ResultSet temp = con.buscarUsuario(Integer.parseInt(user.getText()));
               
                
                if(!temp.next()){
                    con.agregarUsuario(Long.parseLong(user.getText()), pswd.getText(), true);
                    limpiarCampos();
                }else{
                    JOptionPane.showMessageDialog(null, "El número de cédula ingresado ya existe en la base de datos",null,JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Formato numerico no válido. Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pswd = new javax.swing.JTextField();
        labelAgregar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green, 2));
        setClosable(true);
        setTitle("Crear administrador");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user 64px.png"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 80, 100));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Usuario CC");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, -1));

        user.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 27, 160, -1));

        pswd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        pswd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 77, 160, -1));

        labelAgregar.setBackground(new java.awt.Color(255, 255, 255));
        labelAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo User 32px.png"))); // NOI18N
        labelAgregar.setOpaque(true);
        labelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAgregarMouseExited(evt);
            }
        });
        jPanel1.add(labelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 40, 37));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 315, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo33.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAgregarMouseEntered
        animacion.eventoMouseEntered(labelAgregar);
    }//GEN-LAST:event_labelAgregarMouseEntered

    private void labelAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAgregarMouseExited
        animacion.eventoMouseExited(labelAgregar);
    }//GEN-LAST:event_labelAgregarMouseExited

    private void labelAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAgregarMouseClicked
        
        try{
            
            registrarAdmin();
            
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
        
    }//GEN-LAST:event_labelAgregarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAgregar;
    private javax.swing.JTextField pswd;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
