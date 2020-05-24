
package InterfacesOperaciones.FormasInternas;


import Clases.DetectarDispositivos;
import Clases.Conexion;
import Clases.Fecha;
import Clases.Historial;
import Clases.RenderButton;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Clases.AnimacionesLabels;



/**
 *
 * @author Luis Carlos
 */
public class FormaDarSalida extends javax.swing.JInternalFrame {


    public FormaDarSalida() {
        initComponents();
        agregado = false;
        salir.setVisible(false);
       
        
        tabla.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 14));
        tabla.getTableHeader().setOpaque(false);
        tabla.getTableHeader().setBackground(Color.BLACK);
        tabla.getTableHeader().setForeground(Color.WHITE);
        
        panel.setVisible(false);
        
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    dispositivo.EscanearNFC();
                    
                    verificarIngreso();
                    
                    Thread.sleep(1000000);
                    
                } catch (InterruptedException ie) {
                }
            }
        };
        t.start();
    
    }

  
    DetectarDispositivos dispositivo = new DetectarDispositivos();
    private ResultSet resultSet;
    DefaultTableModel modelo;
    AnimacionesLabels animacion = new AnimacionesLabels();
  
    private  boolean agregado;
    
    public void verificarIngreso(){
        
        try{
            
            Conexion con = new Conexion();
            ResultSet rs = con.obetenerIngresoVehiculo(dispositivo.getDato());
            
            
            if(rs.next()){
                
                leida.setBackground(Color.GREEN);
                JOptionPane.showMessageDialog(null, "Vehículo encontrado\n"+
                        "Usuario: Una vez agragada una o varias categorias y cerrada la forma\n"+
                        "el vehículo será eliminado permanentemente de la lista de ingresados.",
                        null,JOptionPane.WARNING_MESSAGE);
                
                interno.setText(rs.getInt("numInterno")+"");
                
                mostrarTabla();
                
                setCapturarDatos(rs);
                
            }else{
                leida.setBackground(Color.RED);
                JOptionPane.showMessageDialog(null, "Código NFC no encontrado",null,JOptionPane.ERROR_MESSAGE);
                salir.setVisible(true);
            }
            
            
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
    public void setCapturarDatos(ResultSet result){
       resultSet = result;
    }
    
    public ResultSet getCapturarDatos(){
        return resultSet;
    }
    
    
    public void setAgregado(boolean estado){
        agregado = estado;
    }
    public boolean getAgregado(){
        return agregado;
    }
    
    
    public void crearColumnas(){
        
        modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int fil, int col){
                return false;
            }
            
        };
        
        modelo.addColumn("Ide categoría");
        modelo.addColumn("Categoría");
        modelo.addColumn("Agregar categoría");
    }
    
    
    
    public void mostrarTabla(){
        
        crearColumnas();
        
        JButton btn = new JButton();
        ImageIcon icon = new ImageIcon("src/Imagenes/chequear 24px.png");
        
        btn.setIcon(icon);
        
        
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
            
            panel.setVisible(true);
            
        }catch(ClassNotFoundException | SQLException e){
            
        }
    }
    
    
    
    public void agregarHistorial(String reparacion){
        
        Fecha fecha = new Fecha();
        
        try{
            
            Conexion buscar = new Conexion();
            
            ResultSet rs = buscar.obetenerIngresoVehiculo(dispositivo.getDato());
            
            Historial temp = new Historial();
            
            if(rs.next()){
                
                temp.setCodigo(rs.getString("codigo"));
                temp.setNumInterno(rs.getInt("numInterno"));
                temp.setTipo_reparacion(reparacion);
                temp.setFechaIngreso(rs.getString("fecha"));
                temp.setFechaSalida(fecha.fechaActual());
            }
            
            Conexion con = new Conexion();
            con.registrarHistorialVehiculo(temp);
            cambiarEstadoSalida();
            
        }catch(SQLException | ClassNotFoundException e){
         JOptionPane.showMessageDialog(null,"Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
    public void eliminarDeListaIngreso(){
      
        Conexion con = new Conexion();
           
           try{
           con.eliminarIngresoVehiculo(Integer.parseInt(interno.getText()));
           }catch(ClassNotFoundException e){
               
           }
    
    }
    
    
    public void cambiarEstadoSalida(){
        try{
            Conexion estado = new Conexion();
            estado.cambiarEstadoSalida(Integer.parseInt(interno.getText()), true);
            }catch(ClassNotFoundException e){}
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        leida = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        interno = new javax.swing.JTextField();
        finalizar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green, 2));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pase la tarjeta por el lector");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 300, -1));

        leida.setBackground(new java.awt.Color(255, 255, 255));
        leida.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        leida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leida.setText(">> Tarjeta leída <<");
        leida.setOpaque(true);
        getContentPane().add(leida, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 302, 30));

        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panel.setOpaque(false);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 680, 210));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Número interno");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        interno.setEditable(false);
        interno.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        interno.setForeground(new java.awt.Color(255, 255, 255));
        interno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        interno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        interno.setOpaque(false);
        panel.add(interno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 70, -1));

        finalizar.setBackground(new java.awt.Color(255, 255, 255));
        finalizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        finalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/finalizar 32px.png"))); // NOI18N
        finalizar.setOpaque(true);
        finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                finalizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                finalizarMouseExited(evt);
            }
        });
        panel.add(finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 40, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Finalizar");
        jLabel5.setOpaque(true);
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 60, -1));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 698, 310));

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/finalizar 32px.png"))); // NOI18N
        salir.setOpaque(true);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 40, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo39.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 450));

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
                
                String cate = String.valueOf(tabla.getValueAt(fila, 1));
                
                int op = JOptionPane.showConfirmDialog(null, "Se guardará la categoría en la base de datos\n"+
                        "¿Desea continuar?","Advertencia",JOptionPane.WARNING_MESSAGE);
                
                if(op==0){
                  
                    agregarHistorial(cate);
                   
                   agregado = true;
                   
                   JOptionPane.showMessageDialog(null, "Se ha guardado la catagoría en historial");
                    
                }
                
                
            }
            
        }
        
    }//GEN-LAST:event_tablaMouseClicked

    private void finalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarMouseEntered
        animacion.eventoMouseEntered(finalizar);
    }//GEN-LAST:event_finalizarMouseEntered

    private void finalizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarMouseExited
        animacion.eventoMouseExited(finalizar);
    }//GEN-LAST:event_finalizarMouseExited

    private void finalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarMouseClicked
        
       if(!agregado){
           JOptionPane.showMessageDialog(null, "No se agregó ninguna categoría\n"+
                   "El vehículo seguirá en la lista de ingresos",null,JOptionPane.WARNING_MESSAGE);
          
           this.dispose();
       }else{
           
           Conexion con = new Conexion();
         
             eliminarDeListaIngreso();
            agregado = false;
           this.dispose();
           
       }
        
    }//GEN-LAST:event_finalizarMouseClicked

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        animacion.eventoMouseEntered(salir);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        animacion.eventoMouseExited(salir);
    }//GEN-LAST:event_salirMouseExited

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
       this.dispose();
    }//GEN-LAST:event_salirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel finalizar;
    private javax.swing.JTextField interno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel leida;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel salir;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
