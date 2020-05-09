
package InterfacesUsuario.FormasInternas;

import Clases.AnimacionesLabels;
import Clases.Conexion;
import Clases.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Carlos
 */
public class CambiarDatos extends javax.swing.JInternalFrame {

    public CambiarDatos() {
        initComponents();
        desactivarCampos();
        labelActualizar.setEnabled(false);
    }

    AnimacionesLabels animacion = new AnimacionesLabels();
    int interno;
    
    
    public void limpiarCamposDatos(){
        numInterno.setText("");
        placa.setText("");
        modelo.setText("");
        cilindraje.setText("");
    }
    
    
    public void actualizarDatos(Vehiculo vehiculo, int numInterno)throws ClassNotFoundException{
        
        Conexion con = new Conexion();
        
        con.editarTodosDatos(vehiculo, numInterno);
    }
    
    public void desactivarCampos(){
        numInterno.setEnabled(false);
        placa.setEnabled(false);
        modelo.setEnabled(false);
        cilindraje.setEnabled(false);
    }
    
    public void activarCampos(){
        numInterno.setEnabled(true);
        placa.setEnabled(true);
        modelo.setEnabled(true);
        cilindraje.setEnabled(true);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        numInterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cilindraje = new javax.swing.JTextField();
        labelActualizar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buscarNum = new javax.swing.JTextField();
        labelBuscar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        setClosable(true);
        setTitle("Actualizar Datos Vehículo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Número interno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        numInterno.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        numInterno.setForeground(new java.awt.Color(255, 255, 255));
        numInterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numInterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        numInterno.setCaretColor(new java.awt.Color(255, 255, 255));
        numInterno.setOpaque(false);
        getContentPane().add(numInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 120, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Placa");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        placa.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        placa.setForeground(new java.awt.Color(255, 255, 255));
        placa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        placa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        placa.setCaretColor(new java.awt.Color(255, 255, 255));
        placa.setOpaque(false);
        getContentPane().add(placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 120, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Modelo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        modelo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        modelo.setForeground(new java.awt.Color(255, 255, 255));
        modelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        modelo.setCaretColor(new java.awt.Color(255, 255, 255));
        modelo.setOpaque(false);
        getContentPane().add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 120, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cilindraje");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 70, -1));

        cilindraje.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cilindraje.setForeground(new java.awt.Color(255, 255, 255));
        cilindraje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cilindraje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        cilindraje.setCaretColor(new java.awt.Color(255, 255, 255));
        cilindraje.setOpaque(false);
        getContentPane().add(cilindraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 120, -1));

        labelActualizar.setBackground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(labelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 34, 34));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ingrese número interno");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Datos actuales del Vehículo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        buscarNum.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        buscarNum.setForeground(new java.awt.Color(255, 255, 255));
        buscarNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buscarNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        buscarNum.setCaretColor(new java.awt.Color(255, 255, 255));
        buscarNum.setOpaque(false);
        getContentPane().add(buscarNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 120, -1));

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
        getContentPane().add(labelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 28, 28, 27));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo17.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelActualizarMouseEntered
        animacion.eventoMouseEntered(labelActualizar);
    }//GEN-LAST:event_labelActualizarMouseEntered

    private void labelActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelActualizarMouseExited
        animacion.eventoMouseExited(labelActualizar);
    }//GEN-LAST:event_labelActualizarMouseExited

    private void labelActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelActualizarMouseClicked
        
       try{
           
           Vehiculo aux = new Vehiculo();
           
           aux.setNumeroInterno(Integer.parseInt(numInterno.getText()));
           aux.setPlaca(placa.getText());
           aux.setModelo(Integer.parseInt(modelo.getText()));
           aux.setCilindraje(Integer.parseInt(cilindraje.getText()));
           
           actualizarDatos(aux, interno);
           
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Formato no valido en algún campo. Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
       }catch(ClassNotFoundException e){
           
       }
        
    }//GEN-LAST:event_labelActualizarMouseClicked

    private void labelBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarMouseEntered
        animacion.eventoMouseEntered(labelBuscar);
    }//GEN-LAST:event_labelBuscarMouseEntered

    private void labelBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarMouseExited
        animacion.eventoMouseExited(labelBuscar);
    }//GEN-LAST:event_labelBuscarMouseExited

    private void labelBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarMouseClicked
        
        try{
            
            Conexion con = new Conexion();
            
            Vehiculo aux = con.buscarVehiculo(Integer.parseInt(buscarNum.getText()));
            
            if(aux.getNumeroInterno()<=0){
                JOptionPane.showMessageDialog(null, "El número ingresado no existe en la base de datos",null,JOptionPane.ERROR_MESSAGE);
            }else{
                
                limpiarCamposDatos();
                
                
                numInterno.setText(aux.getNumeroInterno()+"");
                placa.setText(aux.getPlaca());
                modelo.setText(aux.getModelo()+"");
                cilindraje.setText(aux.getCilindraje()+"");
                
                
                interno = Integer.parseInt(numInterno.getText());
                activarCampos();
                labelActualizar.setEnabled(true);
                
            }
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Formato no valido en algún campo. Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
        }catch(ClassNotFoundException ex){
            
        }
        
    }//GEN-LAST:event_labelBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarNum;
    private javax.swing.JTextField cilindraje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelActualizar;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField numInterno;
    private javax.swing.JTextField placa;
    // End of variables declaration//GEN-END:variables
}
