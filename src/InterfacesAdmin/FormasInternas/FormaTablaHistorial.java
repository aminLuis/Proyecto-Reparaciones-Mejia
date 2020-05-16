
package InterfacesAdmin.FormasInternas;

import Clases.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import Clases.AnimacionesLabels;
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
    
    
    
    public void crarColumnas(){
        
        modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int fil, int col){
                return false;
            }
        };
        
        modelo.addColumn("Códino NFC");
        modelo.addColumn("Número interno");
        modelo.addColumn("Tipo Reparación");
        modelo.addColumn("Fecha ingreso");
        modelo.addColumn("Fecha de salida");
        modelo.addColumn("Cambiar NFC");
    }
    
    
    
    public void mostrarTabla(int numInterno)throws ClassNotFoundException{
        
        
        try{
            
            Conexion con = new Conexion();
            ResultSet rs = con.obtenerHistorialVehiculo(numInterno);
            
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
                        fila[i] = rs.getObject(i+1);
                    }
                      
                       if(i==4){
                        fila[i] = rs.getObject(i+1);
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
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        numInterno = new javax.swing.JTextField();
        buscar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 840, 340));

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
            }catch(ClassNotFoundException e){}
        }
        
    }//GEN-LAST:event_buscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numInterno;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
