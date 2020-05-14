
package InterfacesAdmin;

import Clases.AnimacionesLabels;
import Login.Log;

/**
 *
 * @author Luis Carlos
 */
public class PresentacionAdmin extends javax.swing.JFrame {

    public PresentacionAdmin() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }

    AnimacionesLabels animacion = new AnimacionesLabels();
    
    
    
    public void quitarOpacidadLabels(){
        labelOpcion1.setOpaque(false);
        labelOpcion2.setOpaque(false);
        labelSalir.setOpaque(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelOpcion2 = new javax.swing.JLabel();
        labelOpcion1 = new javax.swing.JLabel();
        labelSalir = new javax.swing.JLabel();
        labelOpcion3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 51, 102));
        jPanel1.setOpaque(false);

        labelOpcion2.setBackground(new java.awt.Color(255, 255, 255));
        labelOpcion2.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        labelOpcion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcion2.setText("Ir a Registro categorias");
        labelOpcion2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        labelOpcion1.setBackground(new java.awt.Color(255, 255, 255));
        labelOpcion1.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        labelOpcion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcion1.setText("Ir a Registros de vehículos");
        labelOpcion1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        labelSalir.setBackground(new java.awt.Color(255, 255, 255));
        labelSalir.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        labelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalir.setText("Salir");
        labelSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        labelSalir.setOpaque(true);
        labelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSalirMouseExited(evt);
            }
        });

        labelOpcion3.setBackground(new java.awt.Color(255, 255, 255));
        labelOpcion3.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        labelOpcion3.setForeground(new java.awt.Color(51, 51, 51));
        labelOpcion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcion3.setText("Ir a crear usuario");
        labelOpcion3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(labelOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(labelOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(labelOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(labelSalir)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 370, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo25.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 852, 545));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelOpcion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion1MouseEntered
        animacion.eventoMouseEntered(labelOpcion1);
    }//GEN-LAST:event_labelOpcion1MouseEntered

    private void labelOpcion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion1MouseExited
        animacion.eventoMouseExited(labelOpcion1);
    }//GEN-LAST:event_labelOpcion1MouseExited

    private void labelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseClicked
        
        Log login = new Log();
        
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelSalirMouseClicked

    private void labelOpcion2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion2MouseEntered
        animacion.eventoMouseEntered(labelOpcion2);
    }//GEN-LAST:event_labelOpcion2MouseEntered

    private void labelOpcion2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion2MouseExited
        animacion.eventoMouseExited(labelOpcion2);
    }//GEN-LAST:event_labelOpcion2MouseExited

    private void labelSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseEntered
        animacion.eventoMouseEntered(labelSalir);
    }//GEN-LAST:event_labelSalirMouseEntered

    private void labelSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseExited
        animacion.eventoMouseExited(labelSalir);
    }//GEN-LAST:event_labelSalirMouseExited

    private void labelOpcion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion1MouseClicked
       
        RegistroVehiculo vehiculo = new RegistroVehiculo();
        vehiculo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelOpcion1MouseClicked

    private void labelOpcion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion2MouseClicked
        
        RegistroCategorias categorias = new RegistroCategorias();
        categorias.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelOpcion2MouseClicked

    private void labelOpcion3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion3MouseEntered
        animacion.eventoMouseEntered(labelOpcion3);
    }//GEN-LAST:event_labelOpcion3MouseEntered

    private void labelOpcion3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion3MouseExited
        animacion.eventoMouseExited(labelOpcion3);
    }//GEN-LAST:event_labelOpcion3MouseExited

    private void labelOpcion3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOpcion3MouseClicked
    
        RegistroUsuarios usuario = new RegistroUsuarios();
        
        usuario.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_labelOpcion3MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelOpcion1;
    private javax.swing.JLabel labelOpcion2;
    private javax.swing.JLabel labelOpcion3;
    private javax.swing.JLabel labelSalir;
    // End of variables declaration//GEN-END:variables
}
