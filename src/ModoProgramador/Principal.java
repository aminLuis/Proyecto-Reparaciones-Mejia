
package ModoProgramador;

import Clases.AnimacionesLabels;

/**
 *
 * @author Luis Carlos
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    
    AnimacionesLabels animacion = new AnimacionesLabels();
    
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
        labelOpciones = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        getContentPane().add(labelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 40, 33));

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
        getContentPane().add(labelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 40, 33));

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
        });
        getContentPane().add(labelBd, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 80, 80));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Base de datos");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 80, -1));

        labelUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        labelUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarios 64px.png"))); // NOI18N
        labelUsuarios.setOpaque(true);
        labelUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelUsuariosMouseExited(evt);
            }
        });
        getContentPane().add(labelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 80, 80));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Usuarios");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 80, -1));

        labelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(labelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 600, 140));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo32.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 1360, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        animacion.eventoMouseExited(labelBd);
    }//GEN-LAST:event_labelBdMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelBd;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel labelMenuBar;
    private javax.swing.JLabel labelMinimizar;
    private javax.swing.JLabel labelOpciones;
    private javax.swing.JLabel labelUsuarios;
    // End of variables declaration//GEN-END:variables
}
