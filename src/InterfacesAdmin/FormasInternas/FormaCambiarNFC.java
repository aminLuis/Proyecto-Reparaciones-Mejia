
package InterfacesAdmin.FormasInternas;


import Clases.AnimacionesLabels;
import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Luis Carlos
 */
public class FormaCambiarNFC extends javax.swing.JInternalFrame {

    public FormaCambiarNFC() {
        initComponents();
    }

    AnimacionesLabels animacion = new AnimacionesLabels();
    
    
    public boolean validarCampo(){
        
        try{
            
            Integer.parseInt(numInterno.getText());
            return true;
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Formato de número no válido",null,JOptionPane.ERROR_MESSAGE);
        }
     
        return false;
    }
    
    
    public String buscarEnCodigos(){
        
        String nfc = "";
        
        try{
            
            Conexion con = new Conexion();
            ResultSet rs =  con.verificarCodigoEnVehiculo(Integer.parseInt(numInterno.getText()));
           
            while(rs.next()){
                nfc = rs.getString("codigo");
            }
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
        }
        
        return nfc;
    }
    
    
    public String buscarEnHistorial(){
        
        String nfc = "";
        
        try{
            
            Conexion con = new Conexion();
            ResultSet rs = con.obtenerHistorialVehiculo(Integer.parseInt(numInterno.getText()));
            
            while(rs.next()){
                
                nfc = rs.getString("codigo");
            }
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
        }
        
        return nfc;
    }
    
    
    public void cambiarNFC(){
        
        try{
            
            Conexion con = new Conexion();
            
            con.cambiarNFCenHistorial(Integer.parseInt(numInterno.getText()), nuevo.getText());
            
        }catch(ClassNotFoundException e){
            
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numInterno = new javax.swing.JTextField();
        buscar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        viejo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nuevo = new javax.swing.JTextField();
        cambiar = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        setClosable(true);
        setTitle("Cambiar NFC en historial");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numInterno.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        numInterno.setForeground(new java.awt.Color(255, 255, 255));
        numInterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numInterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        numInterno.setCaretColor(new java.awt.Color(255, 255, 255));
        numInterno.setOpaque(false);
        getContentPane().add(numInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 70, -1));

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda 24px.png"))); // NOI18N
        buscar.setOpaque(true);
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarMouseExited(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 26, 27, 27));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingrese número interno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Código NFC actual");

        viejo.setEditable(false);
        viejo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        viejo.setForeground(new java.awt.Color(255, 255, 255));
        viejo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        viejo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        viejo.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Será cambiado a");

        nuevo.setEditable(false);
        nuevo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        nuevo.setForeground(new java.awt.Color(255, 255, 255));
        nuevo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        nuevo.setOpaque(false);

        cambiar.setBackground(new java.awt.Color(255, 255, 255));
        cambiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cambiar 24px.png"))); // NOI18N
        cambiar.setOpaque(true);
        cambiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cambiarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viejo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(cambiar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 290, 150));

        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo17.jpg"))); // NOI18N
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 371, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseEntered
        animacion.eventoMouseEntered(buscar);
    }//GEN-LAST:event_buscarMouseEntered

    private void buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseExited
        animacion.eventoMouseExited(buscar);
    }//GEN-LAST:event_buscarMouseExited

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
       
        
        if(validarCampo()){
            
            
            if(buscarEnCodigos().equals("")||buscarEnHistorial().equals("")){
                
                if(buscarEnCodigos().equals("")){
                    JOptionPane.showMessageDialog(null, "El número interno no existe en la tabla 'codigosnfc'",null,JOptionPane.ERROR_MESSAGE);
                }
                
                if(buscarEnHistorial().equals("")){
                    JOptionPane.showMessageDialog(null, "El número interno no existe en la tabla 'historial'",null,JOptionPane.ERROR_MESSAGE);
                }
                
            }else{
                
                if(buscarEnCodigos().equals(buscarEnHistorial())){
                    JOptionPane.showMessageDialog(null, "El NFC de la tabla 'codigosnfc' es igual al de la tabla 'historial'\n"+
                            "Debe eliminar el código de NFCs asociados primero",
                            null,JOptionPane.ERROR_MESSAGE);
                }else{
                    
                    viejo.setText(buscarEnHistorial());
                    nuevo.setText(buscarEnCodigos());
                    numInterno.setEnabled(false);
                    
                }
                
                
            }
            
            
        }
        
    }//GEN-LAST:event_buscarMouseClicked

    private void cambiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarMouseEntered
        animacion.eventoMouseEntered(cambiar);
    }//GEN-LAST:event_cambiarMouseEntered

    private void cambiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarMouseExited
        animacion.eventoMouseExited(cambiar);
    }//GEN-LAST:event_cambiarMouseExited

    private void cambiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarMouseClicked
        
        if(viejo.getText().equals("")||nuevo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "El número interno no fue hallado en una de las tablas"
            ,null,JOptionPane.ERROR_MESSAGE);
        }else{
            cambiarNFC();
        }
        
    }//GEN-LAST:event_cambiarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscar;
    private javax.swing.JLabel cambiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JTextField nuevo;
    private javax.swing.JTextField numInterno;
    private javax.swing.JTextField viejo;
    // End of variables declaration//GEN-END:variables
}
