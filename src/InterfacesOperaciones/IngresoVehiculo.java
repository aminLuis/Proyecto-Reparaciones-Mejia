
package InterfacesOperaciones;


import Clases.AnimacionesLabels;
import InterfacesOperaciones.FormasInternas.ReparacionesRealizadas;
import InterfacesOperaciones.FormasInternas.FormaIngresar;
import javax.swing.JOptionPane;
import InterfacesOperaciones.FormasInternas.CodigosNFC;


/**
 *
 * @author Luis Carlos
 */
public class IngresoVehiculo extends javax.swing.JFrame {

    public IngresoVehiculo() {
        initComponents();
    }

    
    AnimacionesLabels animacion = new AnimacionesLabels();
    ReparacionesRealizadas reparaciones;
    CodigosNFC codigos;
    
    
    public int mostrandoComponentes(){
        
        int cont = 0;
        
        try{
            if(reparaciones.isShowing()){
                cont++;
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(codigos.isShowing()){
                cont++;
            }
        }catch(NullPointerException e){
            
        }
        
        return cont;
    }
    
    
    public void validarComponentes(){
        
        try{
            if(reparaciones.isShowing()){
                reparaciones.dispose();
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(codigos.isShowing()){
                codigos.dispose();
            }
        }catch(NullPointerException e){
            
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMinimizar = new javax.swing.JLabel();
        labelCerrar = new javax.swing.JLabel();
        labelMenuBar = new javax.swing.JLabel();
        labelMenu = new javax.swing.JLabel();
        labelSalida = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelIngreso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelOpciones = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        labelMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pulsorAbajo 32px.png"))); // NOI18N
        labelMinimizar.setOpaque(true);
        labelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMinimizarMouseExited(evt);
            }
        });
        getContentPane().add(labelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 40, 33));

        labelCerrar.setBackground(new java.awt.Color(255, 255, 255));
        labelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar 32px.png"))); // NOI18N
        labelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelCerrar.setOpaque(true);
        labelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCerrarMouseExited(evt);
            }
        });
        getContentPane().add(labelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 40, 33));

        labelMenuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo9.png"))); // NOI18N
        getContentPane().add(labelMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 2770, 33));

        labelMenu.setBackground(new java.awt.Color(255, 255, 255));
        labelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu 32px.png"))); // NOI18N
        labelMenu.setOpaque(true);
        labelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMenuMouseExited(evt);
            }
        });
        getContentPane().add(labelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 33));

        labelSalida.setBackground(new java.awt.Color(255, 255, 255));
        labelSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida 64px.png"))); // NOI18N
        labelSalida.setOpaque(true);
        labelSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSalidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSalidaMouseExited(evt);
            }
        });
        getContentPane().add(labelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 69, 71));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Salida");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 60, -1));

        labelIngreso.setBackground(new java.awt.Color(255, 255, 255));
        labelIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingreso 64px.png"))); // NOI18N
        labelIngreso.setOpaque(true);
        labelIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelIngresoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelIngresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelIngresoMouseExited(evt);
            }
        });
        getContentPane().add(labelIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 69, 71));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingreso");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 130, 60, -1));

        labelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(labelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 870, 120));

        panelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelPrincipal.setOpaque(false);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1348, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 1350, 520));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo 29.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 1370, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizarMouseEntered
        animacion.eventoMouseEntered(labelMinimizar);
    }//GEN-LAST:event_labelMinimizarMouseEntered

    private void labelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizarMouseExited
        animacion.eventoMouseExited(labelMinimizar);
    }//GEN-LAST:event_labelMinimizarMouseExited

    private void labelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelCerrarMouseClicked

    private void labelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseEntered
        animacion.eventoMouseEntered(labelCerrar);
    }//GEN-LAST:event_labelCerrarMouseEntered

    private void labelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseExited
        animacion.eventoMouseExited(labelCerrar);
    }//GEN-LAST:event_labelCerrarMouseExited

    private void labelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuMouseClicked

       
       
    }//GEN-LAST:event_labelMenuMouseClicked

    private void labelMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuMouseEntered
        animacion.eventoMouseEntered(labelMenu);
    }//GEN-LAST:event_labelMenuMouseEntered

    private void labelMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuMouseExited
        animacion.eventoMouseExited(labelMenu);
    }//GEN-LAST:event_labelMenuMouseExited

    private void labelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizarMouseClicked
       this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_labelMinimizarMouseClicked

    private void labelIngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIngresoMouseEntered
       animacion.eventoMouseEntered(labelIngreso);
    }//GEN-LAST:event_labelIngresoMouseEntered

    private void labelIngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIngresoMouseExited
       animacion.eventoMouseExited(labelIngreso);
    }//GEN-LAST:event_labelIngresoMouseExited

    private void labelSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalidaMouseEntered
       animacion.eventoMouseEntered(labelSalida);
    }//GEN-LAST:event_labelSalidaMouseEntered

    private void labelSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalidaMouseExited
        animacion.eventoMouseExited(labelSalida);
    }//GEN-LAST:event_labelSalidaMouseExited

    private void labelSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalidaMouseClicked
        
        if(mostrandoComponentes()>0){
            
            int op = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la forma actual?","Advertencia",JOptionPane.WARNING_MESSAGE);
            
            if(op==0){
                
                validarComponentes();
                
                reparaciones = new ReparacionesRealizadas();
                panelPrincipal.add(reparaciones);
                reparaciones.setLocation(300, 20);
                reparaciones.setVisible(true);
            }
        }else{
                reparaciones = new ReparacionesRealizadas();
                panelPrincipal.add(reparaciones);
                reparaciones.setLocation(300, 20);
                reparaciones.setVisible(true);
        }
        
    }//GEN-LAST:event_labelSalidaMouseClicked

    private void labelIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIngresoMouseClicked
        
        if(mostrandoComponentes()>0){
            
            int op = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la forma actual?","Advertencia",JOptionPane.WARNING_MESSAGE);
            
            if(op==0){
                
                validarComponentes();
                
                codigos = new CodigosNFC();
                panelPrincipal.add(codigos);
                codigos.setLocation(490, 20);
                codigos.setVisible(true);
            }
            
        }else{
            
                codigos = new CodigosNFC();
                panelPrincipal.add(codigos);
                codigos.setLocation(490, 20);
                codigos.setVisible(true);
        }
        
    }//GEN-LAST:event_labelIngresoMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelIngreso;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel labelMenuBar;
    private javax.swing.JLabel labelMinimizar;
    private javax.swing.JLabel labelOpciones;
    private javax.swing.JLabel labelSalida;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
