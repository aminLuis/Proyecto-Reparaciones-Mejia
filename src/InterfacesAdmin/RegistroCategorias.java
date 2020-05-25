
package InterfacesAdmin;


import Clases.AnimacionesLabels;
import AppPackage.AnimationClass;
import InterfacesAdmin.FormasInternas.CrearCategoria;
import InterfacesAdmin.FormasInternas.CambiarCategoria;
import InterfacesAdmin.FormasInternas.FormaTablaCategorias;
import javax.swing.JOptionPane;
import InterfacesAdmin.FormasInternas.FormaTablaEliminarCate;

/**
 *
 * @author Luis Carlos
 */
public class RegistroCategorias extends javax.swing.JFrame {

    public RegistroCategorias() {
        initComponents();
        
        //this.setExtendedState(MAXIMIZED_BOTH);
        agregarComponentesLabelOpciones();
        bajarTitulo();
    }

    AnimacionesLabels animacion = new AnimacionesLabels();
    CrearCategoria categoria;   
    CambiarCategoria cambiar;
    FormaTablaCategorias tablaCategorias;
    FormaTablaEliminarCate eliminarCate;
    
    
    public void agregarComponentesLabelOpciones(){
     labelOpciones.add(labelOpcion1);
     labelOpciones.add(labelOpcion2);
     labelOpciones.add(labelOpcion3);
     labelOpciones.add(labelOpcion4);
     labelOpciones.add(labelOcultar);
    }
    
    
    public int mostrandoComponentes(){
        
        int cont = 0;
        
        try{
            if(categoria.isShowing()){
                cont++;
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(cambiar.isShowing()){
                cont++;
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(tablaCategorias.isShowing()){
                cont++;
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(eliminarCate.isShowing()){
                cont++;
            }
        }catch(NullPointerException e){
            
        }
        
        return cont;
    }
    
    
    public void validarComponentes(){
        
        try{
            if(categoria.isShowing()){
                categoria.dispose();
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(cambiar.isShowing()){
                cambiar.dispose();
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(tablaCategorias.isShowing()){
                tablaCategorias.dispose();
            }
        }catch(NullPointerException e){
            
        }
        
        try{
            if(eliminarCate.isShowing()){
                eliminarCate.dispose();
            }
        }catch(NullPointerException e){
            
        }
        
    }
    
    public void bajarTitulo(){
        animacion.desplazarLabelAbajo(titulo, -100, 40);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenuBar = new javax.swing.JPanel();
        labelMinimizar = new javax.swing.JLabel();
        labelMenu = new javax.swing.JLabel();
        labelCerrar = new javax.swing.JLabel();
        labelMenuBar = new javax.swing.JLabel();
        labelOpciones = new javax.swing.JLabel();
        labelOcultar = new javax.swing.JLabel();
        labelOpcion1 = new javax.swing.JLabel();
        labelOpcion2 = new javax.swing.JLabel();
        labelOpcion3 = new javax.swing.JLabel();
        labelOpcion4 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelInicio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        labelMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pulsorAbajo 32px.png"))); // NOI18N
        labelMinimizar.setOpaque(true);
        labelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMinimizarMouseExited(evt);
            }
        });
        panelMenuBar.add(labelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 40, 33));

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
        panelMenuBar.add(labelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 37, 33));

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
        panelMenuBar.add(labelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 40, 33));

        labelMenuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo9.png"))); // NOI18N
        panelMenuBar.add(labelMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 2780, 33));

        getContentPane().add(panelMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 33));

        labelOpciones.setForeground(new java.awt.Color(255, 255, 255));
        labelOpciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpciones.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Menú categorías", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        labelOpciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelOpciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(labelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(-380, 100, 295, 360));

        labelOcultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/izquierda.png"))); // NOI18N
        labelOcultar.setOpaque(true);
        labelOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelOcultarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelOcultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelOcultarMouseExited(evt);
            }
        });
        getContentPane().add(labelOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 288, -1, -1));

        labelOpcion1.setBackground(new java.awt.Color(255, 255, 255));
        labelOpcion1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        labelOpcion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcion1.setText("Registrar categoria");
        labelOpcion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
        getContentPane().add(labelOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 253, 34));

        labelOpcion2.setBackground(new java.awt.Color(255, 255, 255));
        labelOpcion2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        labelOpcion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcion2.setText("Editar categoría");
        labelOpcion2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
        getContentPane().add(labelOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 253, 34));

        labelOpcion3.setBackground(new java.awt.Color(255, 255, 255));
        labelOpcion3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        labelOpcion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcion3.setText("Mostrar registro categorias");
        labelOpcion3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        labelOpcion3.setOpaque(true);
        labelOpcion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelOpcion3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelOpcion3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelOpcion3MouseExited(evt);
            }
        });
        getContentPane().add(labelOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 253, 34));

        labelOpcion4.setBackground(new java.awt.Color(255, 255, 255));
        labelOpcion4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        labelOpcion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcion4.setText("Eliminar categoría");
        labelOpcion4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        labelOpcion4.setOpaque(true);
        labelOpcion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelOpcion4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelOpcion4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelOpcion4MouseExited(evt);
            }
        });
        getContentPane().add(labelOpcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 253, 34));

        panelPrincipal.setOpaque(false);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 1010, 510));

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

        titulo.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Reparaciones Mejía");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, -100, 370, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo10.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 1370, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void labelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizarMouseEntered
        animacion.eventoMouseEntered(labelMinimizar);
    }//GEN-LAST:event_labelMinimizarMouseEntered

    private void labelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizarMouseExited
       animacion.eventoMouseExited(labelMinimizar);
    }//GEN-LAST:event_labelMinimizarMouseExited

    private void labelMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuMouseEntered
        animacion.eventoMouseEntered(labelMenu);
    }//GEN-LAST:event_labelMenuMouseEntered

    private void labelMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuMouseExited
        animacion.eventoMouseExited(labelMenu);
    }//GEN-LAST:event_labelMenuMouseExited

    private void labelOcultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseEntered
        animacion.eventoMouseEntered(labelOcultar);
    }//GEN-LAST:event_labelOcultarMouseEntered

    private void labelOcultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseExited
        animacion.eventoMouseExited(labelOcultar);
    }//GEN-LAST:event_labelOcultarMouseExited

    private void labelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuMouseClicked
     
        AnimationClass ani = new AnimationClass();
        ani.jLabelXRight(-380, 0, 5, 10, labelOpciones);
        
        if(labelOpciones.getX()==0){
           
               ani.jLabelXLeft(0, -380, 5, 10, labelOpciones);
        }
        
        bajarTitulo();
    }//GEN-LAST:event_labelMenuMouseClicked

    private void labelOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseClicked
        
        if(labelOpciones.getX()==0){
            animacion.desplazarLabelIzquierda(labelOpciones, 0, -380);
        }
    }//GEN-LAST:event_labelOcultarMouseClicked

    private void labelOpcion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion1MouseEntered
        animacion.eventoMouseEntered(labelOpcion1);
    }//GEN-LAST:event_labelOpcion1MouseEntered

    private void labelOpcion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion1MouseExited
        animacion.eventoMouseExited(labelOpcion1);
    }//GEN-LAST:event_labelOpcion1MouseExited

    private void labelOpcion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion1MouseClicked
        
        if(mostrandoComponentes()>0){
            
             int op = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la forma actual?",null,JOptionPane.WARNING_MESSAGE);
            
           if(op==0){
           
             validarComponentes();
            
            categoria = new CrearCategoria();
        
            panelPrincipal.add(categoria);
            categoria.setLocation(140, 50);
            categoria.setVisible(true);
           }
            
        }else{
        
            categoria = new CrearCategoria();

            panelPrincipal.add(categoria);
            categoria.setLocation(140, 50);
            categoria.setVisible(true);
        
        }
    }//GEN-LAST:event_labelOpcion1MouseClicked

    private void labelOpcion2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion2MouseEntered
        animacion.eventoMouseEntered(labelOpcion2);
    }//GEN-LAST:event_labelOpcion2MouseEntered

    private void labelOpcion2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion2MouseExited
        animacion.eventoMouseExited(labelOpcion2);
    }//GEN-LAST:event_labelOpcion2MouseExited

    private void labelOpcion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion2MouseClicked
        
        if(mostrandoComponentes()>0){
            
            
           int op = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la forma actual?",null,JOptionPane.WARNING_MESSAGE);
            
           if(op==0){
               
               validarComponentes();
            
            cambiar = new CambiarCategoria();
            panelPrincipal.add(cambiar);
            cambiar.setLocation(140, 50);
            cambiar.setVisible(true);
           }
            
        }else{
            
            cambiar = new CambiarCategoria();
            panelPrincipal.add(cambiar);
            cambiar.setLocation(140, 50);
            cambiar.setVisible(true);
        }
    }//GEN-LAST:event_labelOpcion2MouseClicked

    private void labelOpcion3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion3MouseEntered
        animacion.eventoMouseEntered(labelOpcion3);
    }//GEN-LAST:event_labelOpcion3MouseEntered

    private void labelOpcion3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion3MouseExited
        animacion.eventoMouseExited(labelOpcion3);
    }//GEN-LAST:event_labelOpcion3MouseExited

    private void labelOpcion3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion3MouseClicked
       
        if(mostrandoComponentes()>0){
            
           int op = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la forma actual?",null,JOptionPane.WARNING_MESSAGE);
            
           if(op==0){
               validarComponentes();
               
               tablaCategorias = new FormaTablaCategorias();
               panelPrincipal.add(tablaCategorias);
               tablaCategorias.setLocation(50, 10);
               tablaCategorias.setVisible(true);
           }
        }else{
               tablaCategorias = new FormaTablaCategorias();
               panelPrincipal.add(tablaCategorias);
               tablaCategorias.setLocation(50, 10);
               tablaCategorias.setVisible(true);
        }
        
    }//GEN-LAST:event_labelOpcion3MouseClicked

    private void labelOpcion4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion4MouseEntered
        animacion.eventoMouseEntered(labelOpcion4);
    }//GEN-LAST:event_labelOpcion4MouseEntered

    private void labelOpcion4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion4MouseExited
        animacion.eventoMouseExited(labelOpcion4);
    }//GEN-LAST:event_labelOpcion4MouseExited

    private void labelOpcion4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion4MouseClicked
        
        if(mostrandoComponentes()>0){
            
            int op = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la forma actual?",null,JOptionPane.WARNING_MESSAGE);
            
           if(op==0){
               
               validarComponentes();
               
               eliminarCate = new FormaTablaEliminarCate();
               panelPrincipal.add(eliminarCate);
               eliminarCate.setLocation(50, 10);
               eliminarCate.setVisible(true);
           }
            
        }else{
               eliminarCate = new FormaTablaEliminarCate();
               panelPrincipal.add(eliminarCate);
               eliminarCate.setLocation(50, 10);
               eliminarCate.setVisible(true);
        }
    }//GEN-LAST:event_labelOpcion4MouseClicked

    private void labelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInicioMouseClicked
        PresentacionAdmin presentacion = new PresentacionAdmin();
        presentacion.setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel labelMenuBar;
    private javax.swing.JLabel labelMinimizar;
    private javax.swing.JLabel labelOcultar;
    private javax.swing.JLabel labelOpcion1;
    private javax.swing.JLabel labelOpcion2;
    private javax.swing.JLabel labelOpcion3;
    private javax.swing.JLabel labelOpcion4;
    private javax.swing.JLabel labelOpciones;
    private javax.swing.JPanel panelMenuBar;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
