
package InterfacesUsuario.FormasInternas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import Clases.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import Clases.Render;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;



/**
 *
 * @author Luis Carlos
 */
public class FormaTablaMostrar extends javax.swing.JInternalFrame {

    public FormaTablaMostrar() {
        initComponents();
        
        tablaVehiculo.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 14));
        tablaVehiculo.getTableHeader().setOpaque(false);
        tablaVehiculo.getTableHeader().setBackground(Color.BLACK);
        tablaVehiculo.getTableHeader().setForeground(Color.WHITE);
        
        try{
        mostrarTabla();
        }catch(ClassNotFoundException e){
            
        }
        
    }
    
    
    
    
    DefaultTableModel modelo;
    TableRowSorter trs;
    
    public void crearColumnas(){
        
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
    
    
    
    
    public void mostrarTabla()throws ClassNotFoundException{
        
        crearColumnas();
    
        try{
            
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
            
            tablaVehiculo.setModel(modelo);
           
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        filtro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVehiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaVehiculo.setFocusable(false);
        tablaVehiculo.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablaVehiculo.setRowHeight(25);
        tablaVehiculo.setSelectionBackground(java.awt.Color.red);
        tablaVehiculo.setShowVerticalLines(false);
        tablaVehiculo.getTableHeader().setReorderingAllowed(false);
        tablaVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVehiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVehiculo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 860, 400));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filtrar por número interno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        filtro.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        filtro.setForeground(new java.awt.Color(255, 255, 255));
        filtro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filtro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        filtro.setCaretColor(new java.awt.Color(255, 255, 255));
        filtro.setOpaque(false);
        filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtroKeyTyped(evt);
            }
        });
        getContentPane().add(filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 120, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo12.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVehiculoMouseClicked
        
        
        int columna = tablaVehiculo.getColumnModel().getColumnIndexAtX(evt.getX());
        int fila = evt.getY()/tablaVehiculo.getRowHeight();
        
        if(fila<tablaVehiculo.getRowCount()&&columna>=0&&columna<tablaVehiculo.getColumnCount()&&columna>=0){
            
            Object value = tablaVehiculo.getValueAt(fila, columna);
            
            if(value instanceof JButton){
                
                ((JButton)value).doClick();
                
                JButton btn = (JButton) value;
                
                
                int numInterno = Integer.parseInt(String.valueOf(tablaVehiculo.getValueAt(fila, 0)));
                
                JOptionPane.showMessageDialog(null, "Número interno: "+numInterno);
            }
            
        }
        
    }//GEN-LAST:event_tablaVehiculoMouseClicked
    
    private void filtroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroKeyTyped
        
        filtro.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(KeyEvent ke){
                
                trs.setRowFilter(RowFilter.regexFilter(filtro.getText(), 0));
            }
        });
        
        trs = new TableRowSorter(modelo);
        tablaVehiculo.setRowSorter(trs);
        
    }//GEN-LAST:event_filtroKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVehiculo;
    // End of variables declaration//GEN-END:variables
}
