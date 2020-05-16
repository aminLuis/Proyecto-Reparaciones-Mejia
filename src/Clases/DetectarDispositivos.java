
package Clases;

import javax.swing.JOptionPane;
import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;


/**
 *
 * @author Luis Carlos
 */
public class DetectarDispositivos {
    
    
private String dato;    
    

public DetectarDispositivos(){
    dato = "";
}


public void setDato(String dat){
    dato = dat;
}
public String getDato(){
    return dato;
}


public String ObtenerPuerto() {

        String defport = "";
        String[] ports = SerialPortList.getPortNames();
        for (String name : ports) {
            for (int i = 0; i < ports.length; i++) {
                defport = ports[i];
            }
        }
        return defport;
    }



public boolean EscanearNFC() {
        boolean estado = false;
        SerialPort serialPort = new SerialPort("COM5");
        
        try {
           
            serialPort.openPort();
            serialPort.setParams(9600, 8, 1, 0);
            setDato(serialPort.readString(8));
            serialPort.closePort();
            estado = true;
            
        } catch (SerialPortException e) {
           // JOptionPane.showMessageDialog(null, "Ha ocurrido un error: "+ e.getMessage(),null, JOptionPane.ERROR_MESSAGE);
        } 
        
        System.out.print(getDato());
        return estado;

    }

    public void cerrarPuerto() {
        
        SerialPort serialPort = new SerialPort("COM5");
     
        try{
        
        if(serialPort.isOpened()){
            serialPort.closePort();
        }
        
        }catch(SerialPortException e){
            JOptionPane.showMessageDialog(null, "Error al cerrar puerto. Error: "+e.getMessage());
        }
    }

}
