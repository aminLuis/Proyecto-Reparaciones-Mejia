
package InterfacesOperaciones.FormasInternas;

import javax.swing.table.DefaultTableModel;
import Clases.Conexion;
import Clases.RenderButton;
import java.sql.ResultSet;
import javax.swing.JCheckBox;
import Clases.RenderCheckBox;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Luis Carlos
 */
public class ReparacionesRealizadas extends javax.swing.JInternalFrame {

    public ReparacionesRealizadas() {
        initComponents();
        
        tabla.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 14));
        tabla.getTableHeader().setOpaque(false);
        tabla.getTableHeader().setBackground(Color.BLACK);
        tabla.getTableHeader().setForeground(Color.WHITE);
        
        try{
            mostrarTabla();
        }catch(ClassNotFoundException e){
            
        }
    }

    DefaultTableModel modelo;
    
    
    
    public void crearColumnas(){
        
        modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int col, int fil){
                return false;
            }
            
        };
        
        modelo.addColumn("Ide categoría");
        modelo.addColumn("Categoría");
        modelo.addColumn("Selecione categoría");
        
    }
    
    
    public void mostrarTabla()throws ClassNotFoundException{
         
        JButton btn = new JButton();
        ImageIcon icon = new ImageIcon("src/Imagenes/seleccionar 24px.png");
        
        btn.setIcon(icon);
        
        crearColumnas();
        
        try{
            
           tabla.setDefaultRenderer(Object.class, new RenderButton());
            
            Conexion con = new Conexion();
            ResultSet rs = con.obtenerDatosCategorias();
            
            while(rs.next()){
                
                Object fila[] = new Object[3];
                
                for(int i=0;i<3;i++){
                    
                    if(i==0){
                        fila[i] = rs.getObject(i+1);
                    }
                    if(i==1){
                        fila[i] = rs.getObject(i+1);
                    }
                    if(i==2){
                        fila[i] = btn;
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
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white, 2));
        setClosable(true);
        setTitle("Selección de categoría");
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
        tabla.setSelectionBackground(java.awt.Color.red);
        tabla.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 700, 320));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo31.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
