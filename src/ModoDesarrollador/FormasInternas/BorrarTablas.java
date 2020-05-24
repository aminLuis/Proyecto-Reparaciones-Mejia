
package ModoDesarrollador.FormasInternas;


import Clases.AnimacionesLabels;
import Clases.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Carlos
 */
public class BorrarTablas extends javax.swing.JInternalFrame {

    public BorrarTablas() {
        initComponents();
        
        cargarCantidades();
    }

    
    AnimacionesLabels animacion = new AnimacionesLabels();
    
    
    public void cargarCantidades(){
        
        try{
            
            Conexion con = new Conexion();
            
            numVehiculos.setText(con.contarRegistrosVehiculos()+"");
            numReparaciones.setText(con.contarRegistrosReparaciones()+"");
            numUsuarios.setText(con.contarRegistrosUsuarios()+"");
            numHistorial.setText(con.contarRegistrosHistorial()+"");
            numCodigos.setText(con.contarRegistrosCodigosNFC()+"");
            numIngresos.setText(con.contarRegistrosIngresos()+"");
            
        }catch(ClassNotFoundException e){
            
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numVehiculos = new javax.swing.JTextField();
        borrar1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numReparaciones = new javax.swing.JTextField();
        borrar2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numHistorial = new javax.swing.JTextField();
        borrar3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numCodigos = new javax.swing.JTextField();
        borrar4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        numUsuarios = new javax.swing.JTextField();
        borrar5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        borrar6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        numIngresos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Tabla vehiculo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 14))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/base de datos 64px.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel3.setText("Total registros");

        numVehiculos.setEditable(false);
        numVehiculos.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        numVehiculos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        borrar1.setBackground(new java.awt.Color(255, 255, 255));
        borrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete 64px.png"))); // NOI18N
        borrar1.setOpaque(true);
        borrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(borrar1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numVehiculos))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(borrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 170));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Tabla categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 14))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/base de datos 64px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel5.setText("Total registros");

        numReparaciones.setEditable(false);
        numReparaciones.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        numReparaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        borrar2.setBackground(new java.awt.Color(255, 255, 255));
        borrar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete 64px.png"))); // NOI18N
        borrar2.setOpaque(true);
        borrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrar2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(borrar2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(numReparaciones))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(borrar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numReparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 50, 230, 170));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Tabla historial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 14))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/base de datos 64px.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel7.setText("Total registros");

        numHistorial.setEditable(false);
        numHistorial.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        numHistorial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        borrar3.setBackground(new java.awt.Color(255, 255, 255));
        borrar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete 64px.png"))); // NOI18N
        borrar3.setOpaque(true);
        borrar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrar3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(borrar3)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numHistorial))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(borrar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(numHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 230, 170));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Tabla codigosnfc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 14))); // NOI18N
        jPanel4.setOpaque(false);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/base de datos 64px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel9.setText("Total registros");

        numCodigos.setEditable(false);
        numCodigos.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        numCodigos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        borrar4.setBackground(new java.awt.Color(255, 255, 255));
        borrar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete 64px.png"))); // NOI18N
        borrar4.setOpaque(true);
        borrar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrar4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrar4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrar4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(borrar4)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)
                        .addComponent(numCodigos))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(borrar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(numCodigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 230, 170));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Tabla usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 14))); // NOI18N
        jPanel5.setOpaque(false);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/base de datos 64px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel11.setText("Total registros");

        numUsuarios.setEditable(false);
        numUsuarios.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        numUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        borrar5.setBackground(new java.awt.Color(255, 255, 255));
        borrar5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete 64px.png"))); // NOI18N
        borrar5.setOpaque(true);
        borrar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrar5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrar5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrar5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(borrar5)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(10, 10, 10)
                        .addComponent(numUsuarios))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(borrar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(numUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 250, 230, 170));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Tabla ingreso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 14))); // NOI18N
        jPanel6.setOpaque(false);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/base de datos 64px.png"))); // NOI18N

        borrar6.setBackground(new java.awt.Color(255, 255, 255));
        borrar6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete 64px.png"))); // NOI18N
        borrar6.setOpaque(true);
        borrar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrar6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrar6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrar6MouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel13.setText("Total registros");

        numIngresos.setEditable(false);
        numIngresos.setBackground(new java.awt.Color(240, 240, 240));
        numIngresos.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        numIngresos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borrar6)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(numIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrar6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(numIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 230, 170));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo36.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar1MouseEntered
       animacion.eventoMouseEntered(borrar1);
    }//GEN-LAST:event_borrar1MouseEntered

    private void borrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar1MouseExited
        animacion.eventoMouseExited(borrar1);
    }//GEN-LAST:event_borrar1MouseExited

    private void borrar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar2MouseEntered
        animacion.eventoMouseEntered(borrar2);
    }//GEN-LAST:event_borrar2MouseEntered

    private void borrar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar2MouseExited
        animacion.eventoMouseExited(borrar2);
    }//GEN-LAST:event_borrar2MouseExited

    private void borrar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar3MouseEntered
        animacion.eventoMouseEntered(borrar3);
    }//GEN-LAST:event_borrar3MouseEntered

    private void borrar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar3MouseExited
        animacion.eventoMouseExited(borrar3);
    }//GEN-LAST:event_borrar3MouseExited

    private void borrar4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar4MouseEntered
        animacion.eventoMouseEntered(borrar4);
    }//GEN-LAST:event_borrar4MouseEntered

    private void borrar4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar4MouseExited
        animacion.eventoMouseExited(borrar4);
    }//GEN-LAST:event_borrar4MouseExited

    private void borrar5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar5MouseEntered
        animacion.eventoMouseEntered(borrar5);
    }//GEN-LAST:event_borrar5MouseEntered

    private void borrar5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar5MouseExited
        animacion.eventoMouseExited(borrar5);
    }//GEN-LAST:event_borrar5MouseExited

    private void borrar6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar6MouseEntered
        animacion.eventoMouseEntered(borrar6);
    }//GEN-LAST:event_borrar6MouseEntered

    private void borrar6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar6MouseExited
        animacion.eventoMouseExited(borrar6);
    }//GEN-LAST:event_borrar6MouseExited

    private void borrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar1MouseClicked
        
        int op = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea borrar todos los registros de ésta tabla?",
                null,JOptionPane.WARNING_MESSAGE);
        
        if(op==0){
            
            try{
            Conexion con = new Conexion();
            con.borrarTablaVehiculo();
            
            }catch(ClassNotFoundException e){
                
            }
        }
        
    }//GEN-LAST:event_borrar1MouseClicked

    private void borrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar2MouseClicked
        
        int op = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea borrar todos los registros de ésta tabla?",
                null,JOptionPane.WARNING_MESSAGE);
        
        if(op==0){
            
            try{
            Conexion con = new Conexion();
            con.borrarTablaReparaciones();
            
            }catch(ClassNotFoundException e){
                
            }
        }
        
    }//GEN-LAST:event_borrar2MouseClicked

    private void borrar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar3MouseClicked
       
        int op = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea borrar todos los registros de ésta tabla?",
                null,JOptionPane.WARNING_MESSAGE);
        
        if(op==0){
            
            try{
            Conexion con = new Conexion();
            con.borrarTablaHistorial();
            
            }catch(ClassNotFoundException e){
                
            }
        }
    }//GEN-LAST:event_borrar3MouseClicked

    private void borrar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar4MouseClicked
       
        int op = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea borrar todos los registros de ésta tabla?",
                null,JOptionPane.WARNING_MESSAGE);
        
        if(op==0){
            
            try{
            Conexion con = new Conexion();
            con.borrarTablaCodigosNFC();
            
            }catch(ClassNotFoundException e){
                
            }
        }
    }//GEN-LAST:event_borrar4MouseClicked

    private void borrar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar5MouseClicked
        
        
        int op = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea borrar todos los registros de ésta tabla?",
                null,JOptionPane.WARNING_MESSAGE);
        
        if(op==0){
            
            try{
            Conexion con = new Conexion();
            con.borrarTablaUsuario();
            
            }catch(ClassNotFoundException e){
                
            }
        }
    }//GEN-LAST:event_borrar5MouseClicked

    private void borrar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrar6MouseClicked
       
        int op = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea borrar todos los registros de ésta tabla?",
                null,JOptionPane.WARNING_MESSAGE);
        
        if(op==0){
            
            try{
            Conexion con = new Conexion();
            con.borrarTablaIngreso();
            
            }catch(ClassNotFoundException e){
                
            }
        }
    }//GEN-LAST:event_borrar6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel borrar1;
    private javax.swing.JLabel borrar2;
    private javax.swing.JLabel borrar3;
    private javax.swing.JLabel borrar4;
    private javax.swing.JLabel borrar5;
    private javax.swing.JLabel borrar6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField numCodigos;
    private javax.swing.JTextField numHistorial;
    private javax.swing.JTextField numIngresos;
    private javax.swing.JTextField numReparaciones;
    private javax.swing.JTextField numUsuarios;
    private javax.swing.JTextField numVehiculos;
    // End of variables declaration//GEN-END:variables
}
