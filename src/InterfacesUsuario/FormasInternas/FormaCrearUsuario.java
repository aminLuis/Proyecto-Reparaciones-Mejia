
package InterfacesUsuario.FormasInternas;

import Clases.AnimacionesLabels;
import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Carlos
 */
public class FormaCrearUsuario extends javax.swing.JInternalFrame {

    public FormaCrearUsuario() {
        initComponents();
    }

    AnimacionesLabels animacion = new AnimacionesLabels();
    
    
    public void limpiarCampos(){
        
        usuario.setText("");
        passwd.setText("");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwd = new javax.swing.JTextField();
        labelNuevo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setClosable(true);
        setTitle("Crear usuario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login 64px.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 80, 80));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Credenciales usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 16))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("usuario - CC");

        usuario.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        usuario.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña usuario");

        passwd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        passwd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        passwd.setOpaque(false);

        labelNuevo.setBackground(new java.awt.Color(255, 255, 255));
        labelNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo User 32px.png"))); // NOI18N
        labelNuevo.setOpaque(true);
        labelNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelNuevoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(passwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 350, 180));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo28.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNuevoMouseEntered
        animacion.eventoMouseEntered(labelNuevo);
    }//GEN-LAST:event_labelNuevoMouseEntered

    private void labelNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNuevoMouseExited
        animacion.eventoMouseExited(labelNuevo);
    }//GEN-LAST:event_labelNuevoMouseExited

    private void labelNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNuevoMouseClicked
        
        try{
            
            if(usuario.getText().equals("")||passwd.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Hay campos vacios",null,JOptionPane.ERROR_MESSAGE);
            }else{
                
                Conexion con = new Conexion();
                
                ResultSet temp = con.buscarUsuario(Integer.parseInt(usuario.getText()));
                
               
                
                if(!temp.next()){
                    con.agregarUsuario(Integer.parseInt(usuario.getText()), passwd.getText(), false);
                    limpiarCampos();
                }else{
                    JOptionPane.showMessageDialog(null, "El número de cédula ingresado ya existe en la base de datos",null,JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        
    }//GEN-LAST:event_labelNuevoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNuevo;
    private javax.swing.JTextField passwd;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
