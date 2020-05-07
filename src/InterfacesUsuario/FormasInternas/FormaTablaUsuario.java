
package InterfacesUsuario.FormasInternas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import Clases.Conexion;
import Clases.Render;
import javax.swing.JButton;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Luis Carlos
 */
public class FormaTablaUsuario extends javax.swing.JInternalFrame {

    public FormaTablaUsuario() {
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
        
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Role");
        modelo.addColumn("Cambiar contraseña");
        modelo.addColumn("Eliminar usuario");
    }
    
    
    public void mostrarTabla()throws ClassNotFoundException{
        
        JButton btn1 = new JButton();
        JButton btn2 = new JButton();
        
        crearColumnas();
        
        try{
            
            Conexion con = new Conexion();
            ResultSet rs = con.datosUsuarios();
            
            tabla.setDefaultRenderer(Object.class, new Render());
            
            while(rs.next()){
                
                Object fila[] = new Object[5];
                
                for(int i=0;i<5;i++){
                    
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
                        fila[i] = btn1;
                    }
                    if(i==4){
                        fila[i] = btn2;
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

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 780, 330));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo5.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
