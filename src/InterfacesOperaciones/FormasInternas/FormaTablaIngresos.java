
package InterfacesOperaciones.FormasInternas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;
import Clases.Conexion;
import java.sql.ResultSet;

/**
 *
 * @author Luis Carlos
 */
public class FormaTablaIngresos extends javax.swing.JInternalFrame {

    public FormaTablaIngresos() {
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
         modelo.addColumn("Fecha ingreso"); 
         modelo.addColumn("Dada de alta");
     
     }
     
     
     public void mostrarTabla()throws ClassNotFoundException{
         
         crearColumnas();
         
         try{
             
             Conexion con = new Conexion();
             ResultSet rs = con.obtenerVehiculosIngresados();
             
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
             
         }catch(SQLException e){
             
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
        setTitle("Sin dada de alta");
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
        tabla.setSelectionBackground(java.awt.Color.green);
        tabla.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 770, 320));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filtrar por número interno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

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
        getContentPane().add(filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 140, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo31.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 460));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
