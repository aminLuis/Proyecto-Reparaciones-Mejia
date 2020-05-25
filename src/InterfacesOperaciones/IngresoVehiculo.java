
package InterfacesOperaciones;


import Clases.AnimacionesLabels;
import InterfacesOperaciones.FormasInternas.ReparacionesRealizadas;
import InterfacesOperaciones.FormasInternas.FormaIngresar;
import javax.swing.JOptionPane;
import InterfacesOperaciones.FormasInternas.FormaDarSalida;
import InterfacesOperaciones.FormasInternas.FormaTablaIngresos;
import InterfacesOperaciones.FormasInternas.FormaTablaHistorial;
import Login.Log;

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
    FormaDarSalida salida;
    FormaIngresar ingreso;
    FormaTablaIngresos tabla;
    FormaTablaHistorial tablaHistorial;
            
            
    
    public int mostrandoComponentes(){
        
        int cont = 0;
        
        try{
            if(reparaciones.isShowing()){
                cont++;
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(salida.isShowing()){
                cont++;
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(ingreso.isShowing()){
                cont++;
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(tabla.isShowing()){
                cont++;
            }
        }catch(NullPointerException e){
            
        }
        
         try{
            if(tablaHistorial.isShowing()){
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
            if(salida.isShowing()){
                salida.dispose();
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(ingreso.isShowing()){
                ingreso.dispose();
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(tabla.isShowing()){
                tabla.dispose();
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(tablaHistorial.isShowing()){
                tablaHistorial.dispose();
            }
        }catch(NullPointerException e){
            
        }
        
    }
    
    
    
    public void validarGuardadoHistorial(){
        
        try{
        
            if(salida.getAgregado()){

                JOptionPane.showMessageDialog(null, "Se agregaron categorias a un vehículo\n"+
                        "Será eliminado de la lista de ingresos",null,JOptionPane.WARNING_MESSAGE);
                
                
                salida.eliminarDeListaIngreso();
                salida.setAgregado(false);
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
        labelLista = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelHistorial = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelOpciones = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelInicio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        getContentPane().add(labelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 69, 71));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Historial");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 70, -1));

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
        getContentPane().add(labelIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 69, 71));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("En lista");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 70, -1));

        labelLista.setBackground(new java.awt.Color(255, 255, 255));
        labelLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listado 64px.png"))); // NOI18N
        labelLista.setOpaque(true);
        labelLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelListaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelListaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelListaMouseExited(evt);
            }
        });
        getContentPane().add(labelLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 69, 71));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingreso");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 60, -1));

        labelHistorial.setBackground(new java.awt.Color(255, 255, 255));
        labelHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historial 64px.png"))); // NOI18N
        labelHistorial.setOpaque(true);
        labelHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHistorialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelHistorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelHistorialMouseExited(evt);
            }
        });
        getContentPane().add(labelHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 69, 71));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Salida");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 70, -1));

        labelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(labelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 492, 120));

        panelPrincipal.setOpaque(false);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 1350, 520));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelInicio.setBackground(new java.awt.Color(255, 255, 255));
        labelInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/finalizar 32px.png"))); // NOI18N
        labelInicio.setOpaque(true);
        labelInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelInicioMouseExited(evt);
            }
        });
        jPanel1.add(labelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 33, 33));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Salir");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 50, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acceso directo.png"))); // NOI18N
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 33, 33));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 70, 130, 70));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo10.jpg"))); // NOI18N
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
        
        int op = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?",null,JOptionPane.WARNING_MESSAGE);
        
        if(op==0){
            
            try{
        
        
            if(salida.getAgregado()){

                JOptionPane.showMessageDialog(null, "Se agregaron categorias a un vehículo\n"+
                        "Será eliminado de la lista de ingresos",null,JOptionPane.WARNING_MESSAGE);

                salida.eliminarDeListaIngreso();
                
                 System.exit(0);
                
            }else{
                System.exit(0);
            }

        
        }catch(NullPointerException e){
            System.exit(0);
        }
            
            
            
            
        }
        
        
        
        
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
                
                validarGuardadoHistorial();
                
                validarComponentes();
                
                salida = new FormaDarSalida();
                panelPrincipal.add(salida);
                salida.setLocation(290, 20);
                salida.setVisible(true);
            }
        }else{
               
                salida = new FormaDarSalida();
                panelPrincipal.add(salida);
                salida.setLocation(290, 20);
                salida.setVisible(true);
        }
        
    }//GEN-LAST:event_labelSalidaMouseClicked

    private void labelIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIngresoMouseClicked
        
        if(mostrandoComponentes()>0){
            
            int op = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la forma actual?","Advertencia",JOptionPane.WARNING_MESSAGE);
            
            if(op==0){
                
                validarGuardadoHistorial();
                
                validarComponentes();
                
                ingreso = new FormaIngresar();
                panelPrincipal.add(ingreso);
                ingreso.setLocation(490, 20);
                ingreso.setVisible(true);
            }
            
        }else{
            
                ingreso = new FormaIngresar();
                panelPrincipal.add(ingreso);
                ingreso.setLocation(490, 20);
                ingreso.setVisible(true);
        }
        
    }//GEN-LAST:event_labelIngresoMouseClicked

    private void labelListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelListaMouseEntered
       animacion.eventoMouseEntered(labelLista);
    }//GEN-LAST:event_labelListaMouseEntered

    private void labelListaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelListaMouseExited
        animacion.eventoMouseExited(labelLista);
    }//GEN-LAST:event_labelListaMouseExited

    private void labelListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelListaMouseClicked
        
        if(mostrandoComponentes()>0){
            
             int op = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la forma actual?","Advertencia",JOptionPane.WARNING_MESSAGE);
            
            if(op==0){
                
                validarGuardadoHistorial();
                
                validarComponentes();
                
                tabla = new FormaTablaIngresos();
                panelPrincipal.add(tabla);
                tabla.setLocation(300, 10);
                tabla.setVisible(true);
            }
            
        }else{
            
                tabla = new FormaTablaIngresos();
                panelPrincipal.add(tabla);
                tabla.setLocation(300, 10);
                tabla.setVisible(true);
        }
        
    }//GEN-LAST:event_labelListaMouseClicked

    private void labelHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHistorialMouseEntered
       animacion.eventoMouseEntered(labelHistorial);
    }//GEN-LAST:event_labelHistorialMouseEntered

    private void labelHistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHistorialMouseExited
        animacion.eventoMouseExited(labelHistorial);
    }//GEN-LAST:event_labelHistorialMouseExited

    private void labelHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHistorialMouseClicked
        
        if(mostrandoComponentes()>0){
            
             int op = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la forma actual?","Advertencia",JOptionPane.WARNING_MESSAGE);
            
            if(op==0){
                
                validarGuardadoHistorial();
                
                validarComponentes();
                
                tablaHistorial = new FormaTablaHistorial();
                panelPrincipal.add(tablaHistorial);
                tablaHistorial.setLocation(250, 10);
                tablaHistorial.setVisible(true);
            }
            
        }else{
            
                tablaHistorial = new FormaTablaHistorial();
                panelPrincipal.add(tablaHistorial);
                tablaHistorial.setLocation(250, 10);
                tablaHistorial.setVisible(true);    
        }
        
    }//GEN-LAST:event_labelHistorialMouseClicked

    private void labelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInicioMouseClicked
       
        int op = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?",null,JOptionPane.WARNING_MESSAGE);
        
        if(op==0){
         
            Log login = new Log();
        
             login.setVisible(true);

            this.dispose();
        }
        
        
    }//GEN-LAST:event_labelInicioMouseClicked

    private void labelInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInicioMouseEntered
        animacion.eventoMouseEntered(labelInicio);
    }//GEN-LAST:event_labelInicioMouseEntered

    private void labelInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInicioMouseExited
        animacion.eventoMouseExited(labelInicio);
    }//GEN-LAST:event_labelInicioMouseExited

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelHistorial;
    private javax.swing.JLabel labelIngreso;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel labelLista;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel labelMenuBar;
    private javax.swing.JLabel labelMinimizar;
    private javax.swing.JLabel labelOpciones;
    private javax.swing.JLabel labelSalida;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
