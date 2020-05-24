
package InterfacesOperaciones.FormasInternas;

import java.awt.Color;
import java.awt.Font;
import Clases.AnimacionesLabels;
import javax.swing.table.DefaultTableModel;
import Clases.Conexion;
import java.sql.SQLException;
import Clases.DetectarDispositivos;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author Luis Carlos
 */
public class FormaTablaHistorial extends javax.swing.JInternalFrame {

    public FormaTablaHistorial() {
        initComponents();
        
        panel.setVisible(false);
        
        tabla.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 14));
        tabla.getTableHeader().setOpaque(false);
        tabla.getTableHeader().setBackground(Color.BLACK);
        tabla.getTableHeader().setForeground(Color.WHITE);
        
        
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    
                    dispositivo.EscanearNFC();
                   
                    validarNFC();
                    
                    Thread.sleep(1000000);
                    
                } catch (InterruptedException ie) {
                }
            }
        };
        t.start();
        
        
    }

    
    AnimacionesLabels animacion = new AnimacionesLabels();
    DefaultTableModel modelo;
    DetectarDispositivos dispositivo = new DetectarDispositivos();
   
    
    public void validarNFC(){
        
        try{
            
            Conexion con = new Conexion();
            
            ResultSet rs = con.obtenerHistorialVehiculo(dispositivo.getDato());
            
            if(rs.next()){
                
                leida.setBackground(Color.GREEN);
                
                mostrarTabla();
                
            }else{
                leida.setBackground(Color.RED);
                JOptionPane.showMessageDialog(null,"El código no fue encontrado",null,JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(ClassNotFoundException | SQLException e){
            
        }
        
    }
    
    
    
    public void crearColumnas(){
        
        modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int fil, int col){
                return false;
            }
        };
        
        modelo.addColumn("Ide historial");
        modelo.addColumn("Código NFC");
        modelo.addColumn("Número interno");
        modelo.addColumn("Tipo de reparación");
        modelo.addColumn("Fecha de ingreso");
        modelo.addColumn("Fecha de salida");
        
    }
    
    
    
    public void mostrarTabla(){
        
        crearColumnas();
        
        try{
            
            Conexion con = new Conexion();
            ResultSet rs = con.obtenerHistorialVehiculo(dispositivo.getDato());
            
            while(rs.next()){
                
                Object fila[] = new Object[6];
                
                for(int i=0;i<6;i++){
                    
                    if(i==0){
                        fila[i] = rs.getObject(i+1);
                    }
                    if(i==1){
                        fila[i] = rs.getObject(i+1);
                    }
                    if(i==2){
                        fila[i] = rs.getObject(i+1);
                    }
                    if(i==3){
                        fila[i] = rs.getObject(i+1);
                    }
                    if(i==4){
                        fila[i] = rs.getObject(i+1);
                    }
                    if(i==5){
                        fila[i] = rs.getObject(i+1);
                    }
                    
                }
                
                modelo.addRow(fila);
                
            }
            
            tabla.setModel(modelo);
            
            rs.close();
            
            panel.setVisible(true);
            
        }catch(SQLException | ClassNotFoundException e){
            
        }
        
    }
    
    
    
    public void mostrarTablaPorFecha(){
        
        crearColumnas();
        
        int m = mes.getMonth()+1;
        
        String date = dia.getValue()+"/"+m+"/"+anio.getYear();
        
        try{
            
            Conexion con = new Conexion();
            ResultSet rs = con.buscarHistorialPorFecha(dispositivo.getDato(), date);
            
            while(rs.next()){
                
                Object fila[] = new Object[6];
             
                 for(int i=0;i<6;i++){
                    
                    if(i==0){
                        fila[i] = rs.getObject(i+1);
                    }
                    if(i==1){
                        fila[i] = rs.getObject(i+1);
                    }
                    if(i==2){
                        fila[i] = rs.getObject(i+1);
                    }
                    if(i==3){
                        fila[i] = rs.getObject(i+1);
                    }
                    if(i==4){
                        fila[i] = rs.getObject(i+1);
                    }
                    if(i==5){
                        fila[i] = rs.getObject(i+1);
                    }
                    
                }
                
                 modelo.addRow(fila);
                 
            }
            
            tabla.setModel(modelo);
            
            rs.close();
            
        }catch(ClassNotFoundException | SQLException e){
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        dia = new com.toedter.components.JSpinField();
        jLabel5 = new javax.swing.JLabel();
        mes = new com.toedter.calendar.JMonthChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        anio = new com.toedter.calendar.JYearChooser();
        filtro = new javax.swing.JLabel();
        leida = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panel.setOpaque(false);

        tabla.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setFocusable(false);
        tabla.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabla.setRowHeight(25);
        tabla.setSelectionBackground(java.awt.Color.green);
        tabla.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tabla);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Filtrar por fecha de salida");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Día");

        mes.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Año");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Mes");

        filtro.setBackground(new java.awt.Color(255, 255, 255));
        filtro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filtro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 32px.png"))); // NOI18N
        filtro.setOpaque(true);
        filtro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filtroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                filtroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                filtroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filtro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 177, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 847, 350));

        leida.setBackground(new java.awt.Color(255, 255, 255));
        leida.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        leida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leida.setText(">> Tarjeta leída <<");
        leida.setOpaque(true);
        getContentPane().add(leida, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 260, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pase la tarjeta por el lector");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 260, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo12.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtroMouseEntered
        animacion.eventoMouseEntered(filtro);
    }//GEN-LAST:event_filtroMouseEntered

    private void filtroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtroMouseExited
        animacion.eventoMouseExited(filtro);
    }//GEN-LAST:event_filtroMouseExited

    private void filtroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtroMouseClicked
        
       mostrarTablaPorFecha();
        
    }//GEN-LAST:event_filtroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JYearChooser anio;
    private com.toedter.components.JSpinField dia;
    private javax.swing.JLabel filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel leida;
    private com.toedter.calendar.JMonthChooser mes;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
