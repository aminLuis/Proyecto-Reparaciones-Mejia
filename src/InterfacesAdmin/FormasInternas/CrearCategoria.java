
package InterfacesAdmin.FormasInternas;

import Clases.AnimacionesLabels;
import Clases.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Carlos
 */
public class CrearCategoria extends javax.swing.JInternalFrame {

    public CrearCategoria() {
        initComponents();
    }

    
    AnimacionesLabels animacion = new AnimacionesLabels();
    
    
    
    public void guardarDatos(String categoria){
        
        try{
            
            Conexion con = new Conexion();
            
            con.guardarCategoria(categoria);
            
        }catch(ClassNotFoundException e){
            
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        categoria = new javax.swing.JTextField();
        labelGuardar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green, 2));
        setClosable(true);
        setTitle("Nueva categoria");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese nueva categoria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, -1));

        categoria.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        categoria.setForeground(new java.awt.Color(255, 255, 255));
        categoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        categoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        categoria.setCaretColor(new java.awt.Color(255, 255, 255));
        categoria.setOpaque(false);
        getContentPane().add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, -1));

        labelGuardar.setBackground(new java.awt.Color(255, 255, 255));
        labelGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar 32px.png"))); // NOI18N
        labelGuardar.setOpaque(true);
        labelGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelGuardarMouseExited(evt);
            }
        });
        getContentPane().add(labelGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 34, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo21.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseClicked

        if(categoria.getText().equals("")){
            JOptionPane.showMessageDialog(null, "El campo categoría está vacio",null,JOptionPane.ERROR_MESSAGE);
        }else{
            guardarDatos(categoria.getText());
            categoria.setText("");
        }
      
    }//GEN-LAST:event_labelGuardarMouseClicked

    private void labelGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseEntered
        animacion.eventoMouseEntered(labelGuardar);
    }//GEN-LAST:event_labelGuardarMouseEntered

    private void labelGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseExited
        animacion.eventoMouseExited(labelGuardar);
    }//GEN-LAST:event_labelGuardarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelGuardar;
    // End of variables declaration//GEN-END:variables
}
