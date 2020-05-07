
package Clases;

import InterfacesUsuario.*;
import Clases.AnimacionesLabels;
import AppPackage.AnimationClass;
import InterfacesUsuario.FormasInternas.RegistroDatosVehiculo;

/**
 *
 * @author Luis Carlos
 */
public class FormaEstandar extends javax.swing.JFrame {

    public FormaEstandar() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        agregarComponentesLabelOpciones();
    }

    AnimacionesLabels animacion = new AnimacionesLabels();
       
    
    
    
    public void agregarComponentesLabelOpciones(){
     labelOpciones.add(labelOpcion1);
     labelOpciones.add(labelOpcion2);
     labelOpciones.add(labelOpcion3);
     labelOpciones.add(labelOpcion4);
     labelOpciones.add(labelOpcion5);
     labelOpciones.add(labelOcultar);
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
        labelOpcion5 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
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

        labelOpciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpciones.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        labelOpciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelOpciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(labelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(-380, 100, 320, 410));

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
        getContentPane().add(labelOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 171, -1, -1));

        labelOpcion1.setBackground(new java.awt.Color(255, 255, 255));
        labelOpcion1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        labelOpcion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcion1.setText("Registrar vehículo");
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
        labelOpcion2.setText("Registrar vehículo");
        labelOpcion2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        labelOpcion2.setOpaque(true);
        getContentPane().add(labelOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 253, 34));

        labelOpcion3.setBackground(new java.awt.Color(255, 255, 255));
        labelOpcion3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        labelOpcion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcion3.setText("Registrar vehículo");
        labelOpcion3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        labelOpcion3.setOpaque(true);
        getContentPane().add(labelOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 253, 34));

        labelOpcion4.setBackground(new java.awt.Color(255, 255, 255));
        labelOpcion4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        labelOpcion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcion4.setText("Registrar vehículo");
        labelOpcion4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        labelOpcion4.setOpaque(true);
        getContentPane().add(labelOpcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 253, 34));

        labelOpcion5.setBackground(new java.awt.Color(255, 255, 255));
        labelOpcion5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        labelOpcion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcion5.setText("Registrar vehículo");
        labelOpcion5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        labelOpcion5.setOpaque(true);
        getContentPane().add(labelOpcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 253, 34));

        panelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelPrincipal.setOpaque(false);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 1010, 630));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo10.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseClicked
       System.exit(0);
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
        
        
    }//GEN-LAST:event_labelOpcion1MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel labelMenuBar;
    private javax.swing.JLabel labelMinimizar;
    private javax.swing.JLabel labelOcultar;
    private javax.swing.JLabel labelOpcion1;
    private javax.swing.JLabel labelOpcion2;
    private javax.swing.JLabel labelOpcion3;
    private javax.swing.JLabel labelOpcion4;
    private javax.swing.JLabel labelOpcion5;
    private javax.swing.JLabel labelOpciones;
    private javax.swing.JPanel panelMenuBar;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
