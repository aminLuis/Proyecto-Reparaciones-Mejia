
package InterfacesAdmin.FormasInternas;

import Clases.AnimacionesLabels;
import Clases.Conexion;
import javax.swing.JOptionPane;
import Clases.Vehiculo;
import java.awt.Color;
import Clases.DetectarDispositivos;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Luis Carlos
 */
public class FormaAsociarNFC extends javax.swing.JInternalFrame {

    public FormaAsociarNFC() {
        initComponents();
    }

    AnimacionesLabels animacion = new AnimacionesLabels();
    DetectarDispositivos dispositivo = new DetectarDispositivos();
    
    public boolean validarCampoBuscar(){
        
        try{
            
            Integer.parseInt(buscar.getText());
            return true;
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Formato de número no válido. Error: "+e.getMessage());
        }
        
        return false;
    }
    
    public void iniciarLabels(){
        label1.setBackground(Color.WHITE);
        label2.setBackground(Color.WHITE);
    }
    
    
    public boolean buscarNumeroInterno(int num){
        
        boolean codigo = false;
        
        try{
            
            Conexion con = new Conexion();
            
           ResultSet rs = con.verificarCodigoEnVehiculo(num);
            
           codigo = rs.next();
           
           if(codigo){
               JOptionPane.showMessageDialog(null, "Éste vehículo ya tiene un código asociado",null,JOptionPane.ERROR_MESSAGE);
           }
           
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
        }
        
        return codigo;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        labelBuscar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green, 2));
        setClosable(true);
        setTitle("Escaneo de NFC");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setBackground(new java.awt.Color(255, 255, 255));
        label2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText(">>  Tarjeta leída  <<");
        label2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        label2.setOpaque(true);
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 330, 130));

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Pase la tarjeta por el lector");
        label1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        label1.setOpaque(true);
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 330, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingrese número interno");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green, 2));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        buscar.setBackground(new java.awt.Color(0, 0, 0));
        buscar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        buscar.setCaretColor(new java.awt.Color(255, 255, 255));
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarKeyTyped(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 200, -1));

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
        getContentPane().add(labelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 33, 33));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo39.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarMouseEntered
        animacion.eventoMouseEntered(labelBuscar);
    }//GEN-LAST:event_labelBuscarMouseEntered

    private void labelBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarMouseExited
        animacion.eventoMouseExited(labelBuscar);
    }//GEN-LAST:event_labelBuscarMouseExited

    private void labelBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarMouseClicked
        
        if(validarCampoBuscar()){
            
            iniciarLabels();
            buscar.setEnabled(false);
            labelBuscar.setEnabled(false);
       
            try{
            
                
            Conexion con = new Conexion();

                Vehiculo datos = con.buscarVehiculo(Integer.parseInt(buscar.getText()));

                if(datos.getNumeroInterno()>0){
                  
                    label1.setBackground(Color.GREEN);
                   
                    Thread t = new Thread() {
                        
                        
                        @Override
                        public void run() {
                            
                                try {
                                    
                                    dispositivo.EscanearNFC();
                                      
                                    if(!dispositivo.getDato().equals("")){
                                        
                                        Conexion buscarNFC = new Conexion();
                                     
                                        label2.setBackground(Color.GREEN);
                                        buscar.setEnabled(true);
                                        labelBuscar.setEnabled(true);
                                        
                                        if(!buscarNFC.verificarDisponibilidadNFC(dispositivo.getDato())){
                                            JOptionPane.showMessageDialog(null, "Éste código NFC ya está siendo usado",null,JOptionPane.ERROR_MESSAGE);
                                        }else{
                                            
                                            if(!buscarNumeroInterno(datos.getNumeroInterno())){
                                              
                                                Conexion guardar = new Conexion();
                                            
                                                guardar.registrarNFCs(dispositivo.getDato(), datos.getNumeroInterno(), false);
                                            }
                                                                                  
                                        }
                                        
                                    }
                                    
                                    Thread.sleep(1000000);

                                } catch (InterruptedException | ClassNotFoundException e) {
                                } 
                            }
                        };
                        t.start();
                      
                }else{
                    JOptionPane.showMessageDialog(null, "El número ingresado no existe en la base de datos",null,JOptionPane.ERROR_MESSAGE);
                    buscar.setEnabled(true);
                }
            
            }catch(ClassNotFoundException e){
              JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        
        
    }//GEN-LAST:event_labelBuscarMouseClicked

    private void buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyTyped
       label1.setBackground(Color.WHITE);
       label2.setBackground(Color.WHITE);       
    }//GEN-LAST:event_buscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel labelBuscar;
    // End of variables declaration//GEN-END:variables
}
