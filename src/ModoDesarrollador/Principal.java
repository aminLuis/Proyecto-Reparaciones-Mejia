
package ModoDesarrollador;

import Clases.AnimacionesLabels;
import ModoDesarrollador.FormasInternas.ListarTablas;
import javax.swing.JOptionPane;
import ModoDesarrollador.FormasInternas.CrearAdmin;
import ModoDesarrollador.FormasInternas.TablaAdmin;
import ModoDesarrollador.FormasInternas.BorrarTablas;
import InterfacesAdmin.PresentacionAdmin;
import InterfacesOperaciones.IngresoVehiculo;
import Login.Log;

/**
 *
 * @author Luis Carlos
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        
        agregarLabels();
    }

    
    AnimacionesLabels animacion = new AnimacionesLabels();
    ListarTablas listar;
    CrearAdmin admin;
    TablaAdmin tablaAdmin;
    BorrarTablas borrar;
    
    
    
    public int mostrandoComponentes(){
        
        int cont = 0;
        
        try{
            if(listar.isShowing()){
                cont++;
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(admin.isShowing()){
                cont++;
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(tablaAdmin.isShowing()){
                cont++;
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(borrar.isShowing()){
                cont++;
            }
        }catch(NullPointerException e){
            
        }
        
        return cont;
    }
    
    
    
    public void validarComponentes(){
        
        try{
            if(listar.isShowing()){
                listar.dispose();
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(admin.isShowing()){
                admin.dispose();
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(tablaAdmin.isShowing()){
                tablaAdmin.dispose();
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(borrar.isShowing()){
                borrar.dispose();
            }
        }catch(NullPointerException e){
            
        }
        
    }
    
    
    
    public void agregarLabels(){
        
        labelOpcion.add(labelOpcion1);
        labelOpcion.add(labelOpcion2);
        
        labelOpcion1.setLocation(25, 20);
        labelOpcion2.setLocation(25, 80);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCerrar = new javax.swing.JLabel();
        labelMinimizar = new javax.swing.JLabel();
        labelMenu = new javax.swing.JLabel();
        labelMenuBar = new javax.swing.JLabel();
        labelBd = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelUsuarios = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelAdmin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelBorrar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelOpciones = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        labelOpcion2 = new javax.swing.JLabel();
        labelOpcion1 = new javax.swing.JLabel();
        labelOpcion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelInicio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        labelMenuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo9.png"))); // NOI18N
        getContentPane().add(labelMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, 1560, 33));

        labelBd.setBackground(new java.awt.Color(255, 255, 255));
        labelBd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/base de datos 64px.png"))); // NOI18N
        labelBd.setOpaque(true);
        labelBd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelBdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelBdMouseExited(evt);
            }
        });
        getContentPane().add(labelBd, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 80, 80));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Borrar tablas");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 80, -1));

        labelUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        labelUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarios 64px.png"))); // NOI18N
        labelUsuarios.setOpaque(true);
        labelUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelUsuariosMouseExited(evt);
            }
        });
        getContentPane().add(labelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 80, 80));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Users admin");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 80, -1));

        labelAdmin.setBackground(new java.awt.Color(255, 255, 255));
        labelAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario 64px.png"))); // NOI18N
        labelAdmin.setOpaque(true);
        labelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAdminMouseExited(evt);
            }
        });
        getContentPane().add(labelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 80, 80));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Base de datos");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 80, -1));

        labelBorrar.setBackground(new java.awt.Color(255, 255, 255));
        labelBorrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete db 64px.png"))); // NOI18N
        labelBorrar.setOpaque(true);
        labelBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBorrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelBorrarMouseExited(evt);
            }
        });
        getContentPane().add(labelBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 80, 80));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Crear admin");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 80, -1));

        labelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(labelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 550, 140));

        panel.setOpaque(false);
        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 1270, 520));

        labelOpcion2.setBackground(new java.awt.Color(255, 255, 255));
        labelOpcion2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        labelOpcion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcion2.setText("Continuar como usuario");
        labelOpcion2.setOpaque(true);
        labelOpcion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelOpcion2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelOpcion2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelOpcion2MouseExited(evt);
            }
        });
        getContentPane().add(labelOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, 40));

        labelOpcion1.setBackground(new java.awt.Color(255, 255, 255));
        labelOpcion1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        labelOpcion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcion1.setText("Continuar con admin");
        labelOpcion1.setOpaque(true);
        labelOpcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelOpcion1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelOpcion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelOpcion1MouseExited(evt);
            }
        });
        getContentPane().add(labelOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 40));

        labelOpcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(labelOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 40, 300, 140));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelInicio.setBackground(new java.awt.Color(255, 255, 255));
        labelInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio 32px.png"))); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inicio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 50, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acceso directo.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 33, 33));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 70, 130, 70));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo32.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 1370, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuMouseClicked
            
            if(labelOpcion.getX()==0){
                animacion.desplazarLabelIzquierda(labelOpcion, 0, -300);
            }else{
             animacion.desplazarLabelDerecha(labelOpcion, -300, 0);   
            }
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

    private void labelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizarMouseEntered
        animacion.eventoMouseEntered(labelMinimizar);
    }//GEN-LAST:event_labelMinimizarMouseEntered

    private void labelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizarMouseExited
        animacion.eventoMouseExited(labelMinimizar);
    }//GEN-LAST:event_labelMinimizarMouseExited

    private void labelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseClicked
       int op = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?",null,JOptionPane.WARNING_MESSAGE);
        
        if(op==0){
            System.exit(0);
        }
    }//GEN-LAST:event_labelCerrarMouseClicked

    private void labelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseEntered
        animacion.eventoMouseEntered(labelCerrar);
    }//GEN-LAST:event_labelCerrarMouseEntered

    private void labelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseExited
        animacion.eventoMouseExited(labelCerrar);
    }//GEN-LAST:event_labelCerrarMouseExited

    private void labelUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUsuariosMouseEntered
       animacion.eventoMouseEntered(labelUsuarios);
    }//GEN-LAST:event_labelUsuariosMouseEntered

    private void labelUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUsuariosMouseExited
        animacion.eventoMouseExited(labelUsuarios);
    }//GEN-LAST:event_labelUsuariosMouseExited

    private void labelBdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBdMouseEntered
        animacion.eventoMouseEntered(labelBd);
    }//GEN-LAST:event_labelBdMouseEntered

    private void labelBdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBdMouseClicked
      
      
      if(mostrandoComponentes()>0){
          
          int op = JOptionPane.showConfirmDialog(null,"¿Desea cerrar la forma actual?", "Advertencia", JOptionPane.WARNING_MESSAGE);
          
          if(op==0){
     
              validarComponentes();
              
              listar = new ListarTablas();
              panel.add(listar);
              listar.setVisible(true);
          }
      }else{
              listar = new ListarTablas();
              panel.add(listar);
              listar.setVisible(true);
           
      }
      
              
    }//GEN-LAST:event_labelBdMouseClicked

    private void labelBdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBdMouseExited
        animacion.eventoMouseExited(labelBd);
    }//GEN-LAST:event_labelBdMouseExited

    private void labelAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAdminMouseEntered
        animacion.eventoMouseEntered(labelAdmin);
    }//GEN-LAST:event_labelAdminMouseEntered

    private void labelAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAdminMouseExited
        animacion.eventoMouseExited(labelAdmin);
    }//GEN-LAST:event_labelAdminMouseExited

    private void labelUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUsuariosMouseClicked
       
        if(mostrandoComponentes()>0){
            
            int op = JOptionPane.showConfirmDialog(null,"¿Desea cerrar la forma actual?", "Advertencia", JOptionPane.WARNING_MESSAGE);
            
            if(op==0){
                
                validarComponentes();
                
                tablaAdmin = new TablaAdmin();
                panel.add(tablaAdmin);
                tablaAdmin.setVisible(true);
            }
        }else{
            
                tablaAdmin = new TablaAdmin();
                panel.add(tablaAdmin);
                tablaAdmin.setVisible(true);
        }
    }//GEN-LAST:event_labelUsuariosMouseClicked

    private void labelAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAdminMouseClicked
        
        if(mostrandoComponentes()>0){
            
            int op = JOptionPane.showConfirmDialog(null,"¿Desea cerrar la forma actual?", "Advertencia", JOptionPane.WARNING_MESSAGE);
            
            if(op==0){
                
                validarComponentes();
                
                admin = new CrearAdmin();
                panel.add(admin);
                admin.setVisible(true);
            }
        }else{
            
                admin = new CrearAdmin();
                panel.add(admin);
                admin.setVisible(true);
        }
        
    }//GEN-LAST:event_labelAdminMouseClicked

    private void labelBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBorrarMouseEntered
        animacion.eventoMouseEntered(labelBorrar);
    }//GEN-LAST:event_labelBorrarMouseEntered

    private void labelBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBorrarMouseExited
        animacion.eventoMouseExited(labelBorrar);
    }//GEN-LAST:event_labelBorrarMouseExited

    private void labelBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBorrarMouseClicked
       
        if(mostrandoComponentes()>0){
            
            int op = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la forma actual?","Advertencia",JOptionPane.ERROR_MESSAGE);
            
            if(op==0){
                
                validarComponentes();
                
                borrar = new BorrarTablas();
                panel.add(borrar);
                borrar.setVisible(true);
            }
        }else{
            
                borrar = new BorrarTablas();
                panel.add(borrar);
                borrar.setVisible(true);
        }
        
    }//GEN-LAST:event_labelBorrarMouseClicked

    private void labelOpcion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion1MouseEntered
        animacion.eventoMouseEntered(labelOpcion1);
    }//GEN-LAST:event_labelOpcion1MouseEntered

    private void labelOpcion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion1MouseExited
        animacion.eventoMouseExited(labelOpcion1);
    }//GEN-LAST:event_labelOpcion1MouseExited

    private void labelOpcion2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion2MouseEntered
        animacion.eventoMouseEntered(labelOpcion2);
    }//GEN-LAST:event_labelOpcion2MouseEntered

    private void labelOpcion2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion2MouseExited
        animacion.eventoMouseExited(labelOpcion2);
    }//GEN-LAST:event_labelOpcion2MouseExited

    private void labelOpcion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion1MouseClicked
        
        PresentacionAdmin adm = new PresentacionAdmin();
        
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelOpcion1MouseClicked

    private void labelOpcion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion2MouseClicked
        
        IngresoVehiculo vehiculo = new IngresoVehiculo();
        
        vehiculo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelOpcion2MouseClicked

    private void labelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInicioMouseClicked
       
        Log login = new Log();
        
        login.setVisible(true);
        this.dispose();
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
    private javax.swing.JLabel labelAdmin;
    private javax.swing.JLabel labelBd;
    private javax.swing.JLabel labelBorrar;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel labelMenuBar;
    private javax.swing.JLabel labelMinimizar;
    private javax.swing.JLabel labelOpcion;
    private javax.swing.JLabel labelOpcion1;
    private javax.swing.JLabel labelOpcion2;
    private javax.swing.JLabel labelOpciones;
    private javax.swing.JLabel labelUsuarios;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
