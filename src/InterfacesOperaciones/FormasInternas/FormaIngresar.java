
package InterfacesOperaciones.FormasInternas;

import Clases.DetectarDispositivos;
import java.awt.Color;
import javax.swing.JOptionPane;
import Clases.Conexion;
import Clases.Fecha;

/**
 *
 * @author Luis Carlos
 */
public class FormaIngresar extends javax.swing.JInternalFrame {

    public FormaIngresar() {
        
        initComponents();
        
        panelIngreso.setVisible(false);
        
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    
                    dispositivo.EscanearNFC();
                    
                    confirmarIngreso();
                    
                    Thread.sleep(1000000);
                    
                } catch (InterruptedException ie) {
                }
            }
        };
        t.start();
        
    }

    
    DetectarDispositivos dispositivo = new DetectarDispositivos();
    
    
    
    public void confirmarIngreso(){
        
        Conexion con = new Conexion();
        
        try{
       
            if(con.verificarDisponibilidadNFC(dispositivo.getDato())){
              JOptionPane.showMessageDialog(null, "Éste código no está asociado a ningún vehículo",null,JOptionPane.ERROR_MESSAGE);
              
              leida.setBackground(Color.RED);
              
            }else{
                
                leida.setBackground(Color.GREEN);
                
                    Fecha fecha = new Fecha();
                    fechaIngreso.setText(fecha.fechaActual());

                        Conexion aux = new Conexion();

                        int numInter = aux.obtenerNumInternoingresado(dispositivo.getDato());

                        numInterno.setText(numInter+"");

                    panelIngreso.setVisible(true);
                
                Conexion registrar = new Conexion();
                
                registrar.registrarIngresoVehiculo(dispositivo.getDato(), numInter, fechaIngreso.getText(), false);
            }
          
        }catch(ClassNotFoundException e){
            
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leida = new javax.swing.JLabel();
        panelIngreso = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fechaIngreso = new javax.swing.JTextField();
        realizado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numInterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle("Ingreso vehículo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leida.setBackground(new java.awt.Color(255, 255, 255));
        leida.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        leida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leida.setText(">> Tarjeta leída <<");
        leida.setOpaque(true);
        getContentPane().add(leida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 260, 60));

        panelIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panelIngreso.setOpaque(false);
        panelIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha ingreso");
        panelIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        fechaIngreso.setEditable(false);
        fechaIngreso.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        fechaIngreso.setForeground(new java.awt.Color(255, 255, 255));
        fechaIngreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fechaIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        fechaIngreso.setOpaque(false);
        panelIngreso.add(fechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 120, -1));

        realizado.setBackground(new java.awt.Color(255, 255, 255));
        realizado.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        realizado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        realizado.setText("Ingreso realizado");
        realizado.setOpaque(true);
        panelIngreso.add(realizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 240, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Número interno");
        panelIngreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        numInterno.setEditable(false);
        numInterno.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        numInterno.setForeground(new java.awt.Color(255, 255, 255));
        numInterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numInterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        numInterno.setOpaque(false);
        panelIngreso.add(numInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 120, -1));

        getContentPane().add(panelIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 350, 190));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Pase la tarjeta por el lector");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 320, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo39.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fechaIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel leida;
    private javax.swing.JTextField numInterno;
    private javax.swing.JPanel panelIngreso;
    private javax.swing.JLabel realizado;
    // End of variables declaration//GEN-END:variables
}
