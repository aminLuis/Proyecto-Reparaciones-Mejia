

package InterfacesAdmin.FormasInternas;

import java.awt.Color;
import java.awt.Font;
import Clases.Conexion;
import Clases.RenderButton;
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
public class FormaTablaNFCs extends javax.swing.JInternalFrame {

    public FormaTablaNFCs() {
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
           public boolean isCellEditable(int fil, int col){
               return false;
           }
       };
       
       modelo.addColumn("Código NFC");
       modelo.addColumn("Número interno");
       modelo.addColumn("Disponibilidad");
       modelo.addColumn("Eliminar");
   }
   
   
   
   public void mostrarTabla()throws ClassNotFoundException{
       
       crearColumnas();
       
       ImageIcon icon = new ImageIcon("src/Imagenes/borrar.png");
       JButton btn = new JButton();
       
       btn.setIcon(icon);
       
       try{
           
           Conexion con = new Conexion();
           ResultSet rs = con.obtenerNFCsRegistrados();
           
           tabla.setDefaultRenderer(Object.class, new RenderButton());
           
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
                       fila[i] = btn;
                   }
                   
               }
               
               modelo.addRow(fila);
           }
           
           tabla.setModel(modelo);
           
           rs.close();
           
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
       }
       
       
   }
   
   
   
   public void eliminarNFC(int numInterno){
       
       try{
           
           Conexion con = new Conexion();
           
           con.eliminarNFC(numInterno);
           
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
        setTitle("Códigos NFC");
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 690, 270));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filtrar por número interno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        filtro.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        filtro.setForeground(new java.awt.Color(255, 255, 255));
        filtro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filtro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        filtro.setCaretColor(new java.awt.Color(255, 255, 255));
        filtro.setOpaque(false);
        filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtroKeyTyped(evt);
            }
        });
        getContentPane().add(filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 90, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo40.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroKeyTyped
       
        filtro.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(KeyEvent ke){
                
                trs.setRowFilter(RowFilter.regexFilter(filtro.getText(), 1));
            }
        });
        
        trs = new TableRowSorter(modelo);
        tabla.setRowSorter(trs);
    }//GEN-LAST:event_filtroKeyTyped

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        
        int columna = tabla.getColumnModel().getColumnIndexAtX(evt.getX());
        int fila = evt.getY()/tabla.getRowHeight();
        
        if(fila<tabla.getRowCount()&&columna>=0&&columna<tabla.getColumnCount()&&columna>=0){
            
            Object value = tabla.getValueAt(fila, columna);
            
            if(value instanceof JButton){
                
                ((JButton)value).doClick();
                
                JButton btn = (JButton) value;
                
               int numInterno = Integer.parseInt(String.valueOf(tabla.getValueAt(fila, 1)));
                
                int op = JOptionPane.showConfirmDialog(null, "Se borrará de forma permamente el registro\n"+
                        "¿Desea continuar?","Advertencia",JOptionPane.WARNING_MESSAGE);
                
                if(op==0){
                   eliminarNFC(numInterno);
                   try{
                   mostrarTabla();
                   }catch(ClassNotFoundException e){}
                }
                
                
            }
            
        }
        
    }//GEN-LAST:event_tablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
