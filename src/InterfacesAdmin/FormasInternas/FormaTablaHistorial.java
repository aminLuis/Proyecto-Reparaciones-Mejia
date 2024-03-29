
package InterfacesAdmin.FormasInternas;

import Clases.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import Clases.AnimacionesLabels;
import Clases.RenderButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Carlos
 */
public class FormaTablaHistorial extends javax.swing.JInternalFrame {

    public FormaTablaHistorial() {
        initComponents();
        
        tabla.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 14));
        tabla.getTableHeader().setOpaque(false);
        tabla.getTableHeader().setBackground(Color.BLACK);
        tabla.getTableHeader().setForeground(Color.WHITE);
        
        panel.setVisible(false);
        
    }

    
    DefaultTableModel modelo;
    AnimacionesLabels animacion = new AnimacionesLabels();
    int interno;
    
    
    
    
    
    public void crearColumnas(){
        
        modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int fil, int col){
                return false;
            }
        };
        
        modelo.addColumn("Ide Historial");
        modelo.addColumn("Códino NFC");
        modelo.addColumn("Número interno");
        modelo.addColumn("Tipo Reparación");
        modelo.addColumn("Fecha ingreso");
        modelo.addColumn("Fecha de salida");
        modelo.addColumn("Eliminar");
    }
    
    
    
    public void mostrarTabla(int numInterno)throws ClassNotFoundException{
        
        
        crearColumnas();
        
        JButton btn = new JButton();
        ImageIcon icon = new ImageIcon("src/Imagenes/borrar.png");
        
        btn.setIcon(icon);
        
        
        try{
            
            Conexion con = new Conexion();
            ResultSet rs = con.obtenerHistorialVehiculo(numInterno);
            
            tabla.setDefaultRenderer(Object.class, new RenderButton());
            
            while(rs.next()){
                
                Object fila[] = new Object[7];
                
                for(int i=0;i<7;i++){
                    
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
                      
                       if(i==6){
                        fila[i] = btn;
                    }    
                }
                
                modelo.addRow(fila);
            }
            
            tabla.setModel(modelo);
            panel.setVisible(true);
            rs.close();
            
        }catch(SQLException e){
            
        }
        
        
    }
    
    
    public boolean validarCampo(){
        
        try{
            
            Integer.parseInt(numInterno.getText());
            return true;
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Formato de número no válido",null,JOptionPane.ERROR_MESSAGE);
        }
        
        return false;
    }
    
    
    
    
    public void mostrarTablaPorFecha(){
        
        crearColumnas();
        
        int m = mes.getMonth()+1;
        
        String date = dia.getValue()+"/"+m+"/"+anio.getYear();
        
       
        JButton btn = new JButton();
        ImageIcon icon = new ImageIcon("src/Imagenes/borrar.png");
        
        btn.setIcon(icon);
        
        
        try{
            
            Conexion con = new Conexion();
            ResultSet rs = con.buscarHistorialPorFecha(interno, date);
            tabla.setDefaultRenderer(Object.class, new RenderButton());
            
            while(rs.next()){
                
                Object fila[] = new Object[7];
             
                 for(int i=0;i<7;i++){
                    
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
                    
                    if(i==6){
                        fila[i] = btn;
                    }
                }
                
                 modelo.addRow(fila);
                 
            }
            
            tabla.setModel(modelo);
            
            rs.close();
            
        }catch(ClassNotFoundException | SQLException e){
            
        }
    }
    
    
    
    public void eliminarHistorial(int ide){
        
        try{
            
            Conexion con = new Conexion();
            con.eliminarHistorialPorIde(ide);
            mostrarTabla(interno);
            
        }catch(ClassNotFoundException e){
           
        }
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dia = new com.toedter.components.JSpinField();
        jLabel7 = new javax.swing.JLabel();
        mes = new com.toedter.calendar.JMonthChooser();
        jLabel6 = new javax.swing.JLabel();
        anio = new com.toedter.calendar.JYearChooser();
        filtro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numInterno = new javax.swing.JTextField();
        buscar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

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
        tabla.setSelectionBackground(java.awt.Color.red);
        tabla.setShowVerticalLines(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Filtrar por fecha de salida");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Día");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Mes");

        mes.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Año");

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
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
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
                    .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 840, 370));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese número interno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 30, -1, -1));

        numInterno.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        numInterno.setForeground(new java.awt.Color(255, 255, 255));
        numInterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numInterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        numInterno.setCaretColor(new java.awt.Color(255, 255, 255));
        numInterno.setOpaque(false);
        getContentPane().add(numInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 120, -1));

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
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 27, 27, 27));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo41.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 470));

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
            
            try{
            mostrarTabla(Integer.parseInt(numInterno.getText()));
            interno = Integer.parseInt(numInterno.getText());
            }catch(ClassNotFoundException e){}
        }
        
    }//GEN-LAST:event_buscarMouseClicked

    private void filtroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtroMouseClicked

        mostrarTablaPorFecha();
    }//GEN-LAST:event_filtroMouseClicked

    private void filtroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtroMouseEntered
        animacion.eventoMouseEntered(filtro);
    }//GEN-LAST:event_filtroMouseEntered

    private void filtroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtroMouseExited
        animacion.eventoMouseExited(filtro);
    }//GEN-LAST:event_filtroMouseExited

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        
        int columna = tabla.getColumnModel().getColumnIndexAtX(evt.getX());
        int fila = evt.getY()/tabla.getRowHeight();
        
        if(fila<tabla.getRowCount()&&columna>=0&&columna<tabla.getColumnCount()&&columna>=0){
            
            Object value = tabla.getValueAt(fila, columna);
            
            if(value instanceof JButton){
                
                ((JButton)value).doClick();
                
                JButton btn = (JButton) value;
                
                int ide = Integer.parseInt(String.valueOf(tabla.getValueAt(fila, 0)));
                
                int op = JOptionPane.showConfirmDialog(null, "Se borrará de forma permamente el registro\n"+
                        "¿Desea continuar?","Advertencia",JOptionPane.WARNING_MESSAGE);
                
                if(op==0){
                  eliminarHistorial(ide);
                }
                
                
            }
            
        }
        
    }//GEN-LAST:event_tablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JYearChooser anio;
    private javax.swing.JLabel buscar;
    private com.toedter.components.JSpinField dia;
    private javax.swing.JLabel filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private com.toedter.calendar.JMonthChooser mes;
    private javax.swing.JTextField numInterno;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
