
package InterfacesUsuario.FormasInternas;

import Clases.AnimacionesLabels;
import Clases.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Luis Carlos
 */
public class CambiarCategoria extends javax.swing.JInternalFrame {

    public CambiarCategoria() {
        initComponents();
        labelActualizar.setEnabled(false);
    }

    
    AnimacionesLabels animacion = new AnimacionesLabels();
    
    
    public void limpiarCampos(){
        ideBuscar.setText("");
        categoria.setText("");
    }
    
    
    public void guardarDatos(String categoria){
        
        try{
            
            Conexion con = new Conexion();
            
            con.guardarCategoria(categoria);
            
        }catch(ClassNotFoundException e){
            
        }
        
    }
    
    
    public void actualizarDatos(String nueva, int ide){
         try{
            
            Conexion con = new Conexion();
            
            con.editarCategoria(nueva, ide);
            
        }catch(ClassNotFoundException e){
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        categoria = new javax.swing.JTextField();
        labelActualizar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ideBuscar = new javax.swing.JTextField();
        labelBuscar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        setClosable(true);
        setTitle("Cambiar categoria");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar IDE categoría");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, -1));

        categoria.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        categoria.setForeground(new java.awt.Color(255, 255, 255));
        categoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        categoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        categoria.setCaretColor(new java.awt.Color(255, 255, 255));
        categoria.setOpaque(false);
        getContentPane().add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 200, -1));

        labelActualizar.setBackground(new java.awt.Color(255, 255, 255));
        labelActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizado 32px.png"))); // NOI18N
        labelActualizar.setOpaque(true);
        labelActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelActualizarMouseExited(evt);
            }
        });
        getContentPane().add(labelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 34, 34));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Categoría actual");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, -1));

        ideBuscar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        ideBuscar.setForeground(new java.awt.Color(255, 255, 255));
        ideBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ideBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        ideBuscar.setCaretColor(new java.awt.Color(255, 255, 255));
        ideBuscar.setOpaque(false);
        getContentPane().add(ideBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 140, -1));

        labelBuscar.setBackground(new java.awt.Color(255, 255, 255));
        labelBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda 24px.png"))); // NOI18N
        labelBuscar.setOpaque(true);
        labelBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelBuscarMouseExited(evt);
            }
        });
        getContentPane().add(labelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 36, 27, 27));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese nueva categoria");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo21.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelActualizarMouseClicked

        if(categoria.getText().equals("")){
            JOptionPane.showMessageDialog(null, "El campo categoría está vacio",null,JOptionPane.ERROR_MESSAGE);
        }else{
            actualizarDatos(categoria.getText(), Integer.parseInt(ideBuscar.getText()));
            ideBuscar.setEnabled(true);
            limpiarCampos();
        }
      
    }//GEN-LAST:event_labelActualizarMouseClicked

    private void labelActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelActualizarMouseEntered
        animacion.eventoMouseEntered(labelActualizar);
    }//GEN-LAST:event_labelActualizarMouseEntered

    private void labelActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelActualizarMouseExited
        animacion.eventoMouseExited(labelActualizar);
    }//GEN-LAST:event_labelActualizarMouseExited

    private void labelBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarMouseEntered
       animacion.eventoMouseEntered(labelBuscar);
    }//GEN-LAST:event_labelBuscarMouseEntered

    private void labelBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarMouseExited
       animacion.eventoMouseExited(labelBuscar);
    }//GEN-LAST:event_labelBuscarMouseExited

    private void labelBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarMouseClicked
       
        try{
                
            Conexion con = new Conexion();
                  
            con.conectar();
            String categ = con.buscarIdeCategoria(Integer.parseInt(ideBuscar.getText()));
            
            if(categ.equals("")){
                JOptionPane.showMessageDialog(null, "El IDE ingresado no existe en la base de datos",null,JOptionPane.ERROR_MESSAGE);
            }else{
                
                labelActualizar.setEnabled(true);
                categoria.setText(categ);
                ideBuscar.setEnabled(false);
            }
            
        }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Formato númerico no válido. Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
        }catch(ClassNotFoundException e){
            
        }
        
        
    }//GEN-LAST:event_labelBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField ideBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelActualizar;
    private javax.swing.JLabel labelBuscar;
    // End of variables declaration//GEN-END:variables
}
