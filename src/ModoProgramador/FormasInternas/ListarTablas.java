
package ModoProgramador.FormasInternas;

import Clases.AnimacionesLabels; 
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;
import Clases.Conexion;
import Clases.RenderButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Luis Carlos
 */
public class ListarTablas extends javax.swing.JInternalFrame {

    public ListarTablas() {
        initComponents();
        
        tabla.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 14));
        tabla.getTableHeader().setOpaque(false);
        tabla.getTableHeader().setBackground(Color.BLACK);
        tabla.getTableHeader().setForeground(Color.WHITE);
        
    }

    
    AnimacionesLabels animacion = new AnimacionesLabels();
    
    DefaultTableModel modelo;
    ImageIcon cambiar = new ImageIcon("src/Imagenes/cambiar 24px.png");
    ImageIcon eliminar = new ImageIcon("src/Imagenes/borrar.png");
    
    
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
        modelo.addColumn("Editar");
        modelo.addColumn("Eliminar");
        
    }
    
    
    public void mostrarTablaVehiculo()throws ClassNotFoundException{
        
        JButton editar = new JButton();
        JButton eliminar = new JButton();
        
        editar.setName("editar");
        eliminar.setName("eliminar");
        
        
        crearColumnasVehiculos();
        
        try{
            
            tabla.setDefaultRenderer(Object.class, new RenderButton());
            Conexion con = new Conexion();
            ResultSet rs = con.obtenerDatosTodos();
            
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
                    if(i==0){
                        fila[i] = editar;
                    }
                    if(i==0){
                        fila[i] = eliminar;
                    }
                }
                
                modelo.addRow(fila);
            }
            
            tabla.setModel(modelo);
            
            rs.close();
            
        }catch(SQLException e){
            
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        labelChequear = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 800, 340));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel2.setText("Elegir tabla de D.B.");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 22, 130, -1));

        comboBox.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel3.setText("tabla");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, -1));

        labelChequear.setBackground(new java.awt.Color(255, 255, 255));
        labelChequear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelChequear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chequear 24px.png"))); // NOI18N
        labelChequear.setOpaque(true);
        getContentPane().add(labelChequear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 17, 29, 27));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo34.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelChequear;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
