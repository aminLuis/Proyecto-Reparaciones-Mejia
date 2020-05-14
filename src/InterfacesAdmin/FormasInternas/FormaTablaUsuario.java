
package InterfacesAdmin.FormasInternas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import Clases.Conexion;
import Clases.RenderButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

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
    TableRowSorter trs;
    
    
    public void crearColumnas(){
        
        modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int col, int fil){
                return false;
            }
            
        };
        
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Cambiar contraseña");
        modelo.addColumn("Eliminar usuario");
    }
    
    
    public void mostrarTabla()throws ClassNotFoundException{
        
        JButton btn1 = new JButton();
        JButton btn2 = new JButton();
        
        ImageIcon borrar = new ImageIcon("src/Imagenes/borrar.png");
        ImageIcon cambiar = new ImageIcon("src/Imagenes/cambiar 24px.png");
        
        
        btn1.setIcon(cambiar);
        btn2.setIcon(borrar);
        
        btn1.setName("cambiar");
        btn2.setName("borrar");
        
        crearColumnas();
        
        try{
            
            Conexion con = new Conexion();
            ResultSet rs = con.datosUsuarios();
            
            tabla.setDefaultRenderer(Object.class, new RenderButton());
            
            while(rs.next()){
                
                Object fila[] = new Object[4];
                 
                if(!rs.getBoolean("role")){
                    
                    for(int i=0;i<4;i++){
                    
                    if(i==0){
                        fila[i] = rs.getObject(i+1);
                    }
                    if(i==1){
                        fila[i] = rs.getObject(i+1);
                    }
                    if(i==2){
                        fila[i] = btn1;
                    }
                    if(i==3){
                        fila[i] = btn2;
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
    
    
    public void cambiarPassword(String pswd, long user){
        
        try{
            
            Conexion con = new Conexion();
            
            con.cambiarContrasenaUser(pswd, user);
            
            mostrarTabla();
            
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void eliminarUsuario(long user){
        
        try{
            
            Conexion con = new Conexion();
            
            con.eliminarUsuario(user);
            
            mostrarTabla();
        }catch(ClassNotFoundException e){
            
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        filtro = new javax.swing.JTextField();
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 780, 330));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Filtar por usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        filtro.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        filtro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filtro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        filtro.setOpaque(false);
        filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtroKeyTyped(evt);
            }
        });
        getContentPane().add(filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 150, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo5.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 490));

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
                
                
                if(btn.getName().equals("cambiar")){
                    
                  int op = JOptionPane.showConfirmDialog(null, "¿Está segur@ que desea cambiar la contraseña?",
                         "Advertencia",JOptionPane.WARNING_MESSAGE);
                    
                    if(op==0){
                        
                            String nueva = JOptionPane.showInputDialog("Ingrese la nueva contraseña");
                        
                            if(nueva.equals("")){
                                JOptionPane.showMessageDialog(null, "El campo está vacío, no habrá cambios",null,JOptionPane.ERROR_MESSAGE);
                            }else{
                                
                                 cambiarPassword(nueva, user);
                                
                                 try{
                                 
                                 mostrarTabla();
                                 
                                 }catch(ClassNotFoundException e){
                                     JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
                                 }
                            }
                        
                    }
                    
                }
                
                
                if(btn.getName().equals("borrar")){
                    
                    int op = JOptionPane.showConfirmDialog(null, "Se borrará de forma permamente el registro\n"+
                        "¿Desea continuar?","Advertencia",JOptionPane.WARNING_MESSAGE);
                    
                    if(op==0){
                        
                        eliminarUsuario(user);
                    }
                    
                }
                
                
                
                
                
            }
            
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void filtroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroKeyTyped
       
        filtro.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(KeyEvent ke){
                
                trs.setRowFilter(RowFilter.regexFilter(filtro.getText(), 0));
            }
        });
        
        trs = new TableRowSorter(modelo);
        tabla.setRowSorter(trs);
        
    }//GEN-LAST:event_filtroKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
