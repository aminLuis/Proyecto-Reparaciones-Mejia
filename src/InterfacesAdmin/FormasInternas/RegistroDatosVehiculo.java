
package InterfacesAdmin.FormasInternas;

import Clases.AnimacionesLabels;
import Clases.Conexion;
import Clases.Vehiculo;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Carlos
 */
public class RegistroDatosVehiculo extends javax.swing.JInternalFrame {

    public RegistroDatosVehiculo() {
        initComponents();
     
    }


    AnimacionesLabels animacion = new AnimacionesLabels();    
    
    public void limpiarCamposDatos(){
        numInterno.setText("");
        placa.setText("");
        modelo.setText("");
        cilindraje.setText("");
    }
    
    
    public boolean registrarVehiculo(Vehiculo vehiculo)throws ClassNotFoundException{
        
        Conexion con = new Conexion();
        
         if(con.buscarVehiculo(vehiculo.getNumeroInterno()).getNumeroInterno()==0){
             con.agregarVehiculo(vehiculo);
             return true;
         }else{
             return false;
         }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cilindraje = new javax.swing.JTextField();
        numInterno = new javax.swing.JTextField();
        placa = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        labelGuardar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green, 2));
        setClosable(true);
        setTitle("Ingrese datos del vehículo");
        setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cilindraje");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 230, 70, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Número interno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Placa");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Modelo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        cilindraje.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cilindraje.setForeground(new java.awt.Color(255, 255, 255));
        cilindraje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cilindraje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        cilindraje.setCaretColor(new java.awt.Color(255, 255, 255));
        cilindraje.setOpaque(false);
        getContentPane().add(cilindraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 120, -1));

        numInterno.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        numInterno.setForeground(new java.awt.Color(255, 255, 255));
        numInterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numInterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        numInterno.setCaretColor(new java.awt.Color(255, 255, 255));
        numInterno.setOpaque(false);
        getContentPane().add(numInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 120, -1));

        placa.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        placa.setForeground(new java.awt.Color(255, 255, 255));
        placa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        placa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        placa.setCaretColor(new java.awt.Color(255, 255, 255));
        placa.setOpaque(false);
        getContentPane().add(placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 120, -1));

        modelo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        modelo.setForeground(new java.awt.Color(255, 255, 255));
        modelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        modelo.setCaretColor(new java.awt.Color(255, 255, 255));
        modelo.setOpaque(false);
        getContentPane().add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 120, -1));

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
        getContentPane().add(labelGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 34, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo17.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseEntered
        animacion.eventoMouseEntered(labelGuardar);
    }//GEN-LAST:event_labelGuardarMouseEntered

    private void labelGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseExited
        animacion.eventoMouseExited(labelGuardar);
    }//GEN-LAST:event_labelGuardarMouseExited

    private void labelGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseClicked
       
        Vehiculo vehiculo = new Vehiculo();
        
        try{
            
            vehiculo.setNumeroInterno(Integer.parseInt(numInterno.getText()));
            vehiculo.setPlaca(placa.getText());
            vehiculo.setModelo(Integer.parseInt(modelo.getText()));
            vehiculo.setCilindraje(Integer.parseInt(cilindraje.getText()));
            
            
            if(registrarVehiculo(vehiculo)){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                limpiarCamposDatos();
            }else{
                JOptionPane.showMessageDialog(null, "El número interno ya existe en la base de datos",null,JOptionPane.ERROR_MESSAGE);
                numInterno.setForeground(Color.red);
            }
            
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Formato no valido en algún campo. Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            
        }
        
    }//GEN-LAST:event_labelGuardarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cilindraje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelGuardar;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField numInterno;
    private javax.swing.JTextField placa;
    // End of variables declaration//GEN-END:variables
}
