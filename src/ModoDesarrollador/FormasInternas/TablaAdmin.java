
package ModoDesarrollador.FormasInternas;

import Clases.Conexion;
import Clases.RenderButton;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Carlos
 */
public class TablaAdmin extends javax.swing.JInternalFrame {

    public TablaAdmin() {
        initComponents();
        
        tabla.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 14));
        tabla.getTableHeader().setOpaque(false);
        tabla.getTableHeader().setBackground(Color.BLACK);
        tabla.getTableHeader().setForeground(Color.WHITE);
        
        try{
        mostrarTablaAdmin();
        }catch(ClassNotFoundException e){
            
        }
        
    }

    
    DefaultTableModel modelo;
    
    
    
    
    public void crearColumnasAdmin(){
        
        modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int fil, int col){
                return false;
            }
        };
        
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Rol");
        modelo.addColumn("Cambiar contraseña");
        modelo.addColumn("Eliminar admin");
    }
    
    
    
    public void mostrarTablaAdmin()throws ClassNotFoundException{
        
        crearColumnasAdmin();
        
        
        JButton editar = new JButton();
        JButton eliminar = new JButton();
        ImageIcon cambiar = new ImageIcon("src/Imagenes/cambiar 24px.png");
        ImageIcon borrar = new ImageIcon("src/Imagenes/borrar.png");
        
        editar.setIcon(cambiar);
        eliminar.setIcon(borrar);
        
        editar.setName("editar");
        eliminar.setName("eliminar");
        
        try{
            
            Conexion con = new Conexion();
            ResultSet rs = con.datosUsuarios();
            
            tabla.setDefaultRenderer(Object.class, new RenderButton());
            
            while(rs.next()){
                
                Object fila[] = new Object[5];
                
                if(rs.getBoolean("role")){
                    
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
                           fila[i] = editar;
                       }
                       if(i==4){
                           fila[i] = eliminar;
                       }
                    }
                    
                    modelo.addRow(fila);
                }
                
            }
            
            tabla.setModel(modelo);
            
            rs.close();
            
        }catch(SQLException e){
            
        }
    }
    
    
    public void cambiarPasswordAdmin(String nueva, long user){
        
        try{
            
            Conexion con = new Conexion();
            con.cambiarContrasenaUser(nueva, user);
            
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarAdmin(long user){
        
        try{
            
            Conexion con = new Conexion();
            con.eliminarUsuario(user);
            
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
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
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 710, 280));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo35.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 463));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
       
        int columna = tabla.getColumnModel().getColumnIndexAtX(evt.getX());
        int fila = evt.getY()/tabla.getRowHeight();
        
        if(fila<tabla.getRowCount()&&columna>=0&&columna<tabla.getColumnCount()&&columna>=0){
            
            Object value = tabla.getValueAt(fila, columna);
            
            if(value instanceof JButton){
                
                ((JButton)value).doClick();
                
                JButton btn = (JButton) value;
                
                long user = Long.parseLong(String.valueOf(tabla.getValueAt(fila, 0)));
                
                
                
                if(btn.getName().equalsIgnoreCase("editar")){
                  
                    int op = JOptionPane.showConfirmDialog(null, "Se harán cambios permanentes en el registro\n"+
                        "¿Desea cambiar la contraseña?","Advertencia",JOptionPane.WARNING_MESSAGE);
                    
                    if(op==0){
                            
                            String nueva = JOptionPane.showInputDialog("Ingrese la nueva contraseña");
                            
                            if(nueva.equals("")){
                                JOptionPane.showMessageDialog(null, "El campo está vacío, no habrá cambios",null,JOptionPane.ERROR_MESSAGE);
                            }else{
                                
                                cambiarPasswordAdmin(nueva, user);
                                
                                try{
                                
                                    mostrarTablaAdmin();
                                
                                }catch(ClassNotFoundException e){
                                    JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
                                
                                }
                            }
                        
                    }
                    
                }
                
                
                if(btn.getName().equals("eliminar")){
                    
                    int op = JOptionPane.showConfirmDialog(null, "Se borrará el registro permanentemente\n"+
                            "¿Desea eliminar el registro?","Advertencia",JOptionPane.WARNING_MESSAGE);
                    
                    if(op==0){
                        
                        eliminarAdmin(user);
                        
                    }
                    
                }
                
            }
            
        }
        
    }//GEN-LAST:event_tablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
