
package ModoDesarrollador.FormasInternas;

import Clases.AnimacionesLabels;
import Clases.Conexion;
import Clases.RenderButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Luis Carlos
 */
public class ListarTablas extends javax.swing.JInternalFrame {

    public ListarTablas() {
        initComponents();
      
        panelTabla.setVisible(false);
         
        tabla.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 14));
        tabla.getTableHeader().setOpaque(false);
        tabla.getTableHeader().setBackground(Color.BLACK);
        tabla.getTableHeader().setForeground(Color.WHITE);
        
    }

    
    AnimacionesLabels animacion = new AnimacionesLabels();
    DefaultTableModel modelo;
    TableRowSorter trs;
    
    
    public void crearColumnasVehiculos(){
        
        modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int col, int fil){
                return false;
            }
        };
        
        modelo.addColumn("Número interno");
        modelo.addColumn("Placa");
        modelo.addColumn("Modelo");
        modelo.addColumn("Cilindraje");
       
        
    }
    
    
    public void mostrarTablaVehiculo()throws ClassNotFoundException{
        
        crearColumnasVehiculos();
        
        try{
            
            tabla.setDefaultRenderer(Object.class, new RenderButton());
            Conexion con = new Conexion();
            ResultSet rs = con.obtenerDatosTodos();
            
            while(rs.next()){
                
                Object fila[] = new Object[4];
                
                for(int i=0;i<4;i++){
                    
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
                   
                }
                
                modelo.addRow(fila);
            }
            
            tabla.setModel(modelo);
            
            rs.close();
            
            panelTabla.setVisible(true);
            
        }catch(SQLException e){
            
        }
        
    }
    
    
   
    public void crearColumnasUsuarios(){
        
        modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int fil, int col){
                return false;
            }
        };
        
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Rol");
    }
   
    
    public void mostrarTablaUsuario()throws ClassNotFoundException{
        
        crearColumnasUsuarios();
        
        try{
            
            Conexion con = new Conexion();
            ResultSet rs = con.datosUsuarios();
            
            
            while(rs.next()){
                
                Object fila[] = new Object[3];
                
                if(!rs.getBoolean("role")){
                    
                    for(int i=0;i<3;i++){
                    
                        if(i==0){
                            fila[i] = rs.getObject(i+1);
                        }
                        if(i==1){
                            fila[i] = rs.getObject(i+1);
                        }
                        if(i==2){
                            fila[i] = rs.getObject(i+1);
                        }
                    
                    }
                
                    modelo.addRow(fila);
                
                }
                
                
                
            }
            
            tabla.setModel(modelo);
            
            panelTabla.setVisible(true);
            
            rs.close();
            
        }catch(SQLException e){
            
        }
        
    }
    
    
    
    public void crearColumnasCategorias(){
        
        modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int fil, int col){
                return false;
            }
        };
        
        modelo.addColumn("Ide categoria");
        modelo.addColumn("Categoria reparación");
    }
    
    
    public void mostrarTablaCategorias()throws ClassNotFoundException{
        
        crearColumnasCategorias();
        
        try{
            
            Conexion con = new Conexion();
            ResultSet rs = con.obtenerDatosCategorias();
            
            while(rs.next()){
                
                Object fila[] = new Object[2];
                    
                    for(int i=0;i<2;i++){
                    
                        if(i==0){
                            fila[i] = rs.getObject(i+1);
                        }
                        if(i==1){
                            fila[1] = rs.getObject(i+1);
                        }
                    
                    }
                    
                     modelo.addRow(fila);
                
            }
            
            tabla.setModel(modelo);
            
            panelTabla.setVisible(true);
            
            rs.close();
                    
        }catch(SQLException e){
            
        } 
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        labelChequear = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        labelTabla = new javax.swing.JLabel();
        labelFiltrar = new javax.swing.JLabel();
        filtro = new javax.swing.JTextField();
        labelTabla1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panelTabla.setOpaque(false);
        panelTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tabla.setSelectionBackground(java.awt.Color.orange);
        tabla.setShowVerticalLines(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tablaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        panelTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 340));

        getContentPane().add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 880, 360));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel2.setText("Elegir tabla de D.B.");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 22, 130, -1));

        labelChequear.setBackground(new java.awt.Color(255, 255, 255));
        labelChequear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelChequear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chequear 24px.png"))); // NOI18N
        labelChequear.setOpaque(true);
        labelChequear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelChequearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelChequearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelChequearMouseExited(evt);
            }
        });
        getContentPane().add(labelChequear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 17, 29, 27));

        comboBox.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tabla vehículos", "Tabla categoria", "Tabla usuario", "Item 4" }));
        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        labelTabla.setBackground(new java.awt.Color(255, 255, 255));
        labelTabla.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        labelTabla.setText("tabla");
        labelTabla.setOpaque(true);
        getContentPane().add(labelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, -1));

        labelFiltrar.setBackground(new java.awt.Color(255, 255, 255));
        labelFiltrar.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        labelFiltrar.setText("Filtrar");
        labelFiltrar.setOpaque(true);
        getContentPane().add(labelFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        filtro.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        filtro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtroKeyTyped(evt);
            }
        });
        getContentPane().add(filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 16, 110, -1));

        labelTabla1.setBackground(new java.awt.Color(255, 255, 255));
        labelTabla1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        labelTabla1.setText("Filtro");
        labelTabla1.setOpaque(true);
        getContentPane().add(labelTabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 40, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo34.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelChequearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChequearMouseEntered
       animacion.eventoMouseEntered(labelChequear);
    }//GEN-LAST:event_labelChequearMouseEntered

    private void labelChequearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChequearMouseExited
        animacion.eventoMouseExited(labelChequear);
    }//GEN-LAST:event_labelChequearMouseExited

    private void labelChequearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChequearMouseClicked
        
        try{
        
        if(comboBox.getSelectedIndex()==0){
            mostrarTablaVehiculo();
            labelFiltrar.setText("Filtrar por número interno");
            labelTabla.setText("Tabla vehículos");
        }
        if(comboBox.getSelectedIndex()==1){
            mostrarTablaCategorias();
            labelFiltrar.setText("Filtrar por categoria reparación");
            labelTabla.setText("Tabla categoria repaciones");
        }
        if(comboBox.getSelectedIndex()==2){
            mostrarTablaUsuario();
            labelFiltrar.setText("Filtrar por usuario");
            labelTabla.setText("Tabla usuarios");
        }
        
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_labelChequearMouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        
        int columna = tabla.getColumnModel().getColumnIndexAtX(evt.getX());
        int fila = evt.getY()/tabla.getRowHeight();
        
        if(fila<tabla.getRowCount()&&columna>=0&&columna<tabla.getColumnCount()&&columna>=0){
            
            Object value = tabla.getValueAt(fila, columna);
            
            if(value instanceof JButton){
                
                ((JButton)value).doClick();
                
                JButton btn = (JButton) value;
                
                int ide = Integer.parseInt(String.valueOf(tabla.getValueAt(fila, 0)));
                
                
                
                if(btn.getName().equalsIgnoreCase("editarVehiculo")){
                  
                    int op = JOptionPane.showConfirmDialog(null, "Se harán cambios permanentes en los registros\n"+
                        "¿Desea continuar?","Advertencia",JOptionPane.WARNING_MESSAGE);
                    
                    if(op==0){
                        
                    }
                    
                }
                
                
            }
            
        }
        
    }//GEN-LAST:event_tablaMouseClicked

    private void tablaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyTyped
       
        
        
    }//GEN-LAST:event_tablaKeyTyped

    private void filtroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroKeyTyped
        
        filtro.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(KeyEvent ke){
                
               if(comboBox.getSelectedIndex()==1){
                   trs.setRowFilter(RowFilter.regexFilter(filtro.getText(), 1));
               }else{
                   trs.setRowFilter(RowFilter.regexFilter(filtro.getText(), 0));
               }
                
                
            }
        });
        
        trs = new TableRowSorter(modelo);
        tabla.setRowSorter(trs);
    }//GEN-LAST:event_filtroKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTextField filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelChequear;
    private javax.swing.JLabel labelFiltrar;
    private javax.swing.JLabel labelTabla;
    private javax.swing.JLabel labelTabla1;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
