
package Clases;

import gnu.io.CommPort;
import java.util.Enumeration;
import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Luis Carlos
 */
public class DetectarDispositivos {
    
public void detectarPuerto() throws PortInUseException, IOException, UnsupportedCommOperationException{
    
   Enumeration commports = CommPortIdentifier.getPortIdentifiers();
    
   CommPortIdentifier myCPI = null;
   
   Scanner entrada;
   PrintStream salida;
   
   
   while(commports.hasMoreElements()){
       
      myCPI = (CommPortIdentifier) commports.nextElement();
       
       if(myCPI.getName().equals("COM5")){
         break;
       }
   }
    
   CommPort puerto =   myCPI.open("Puerto serial",1000);
   SerialPort mySp = (SerialPort) puerto;
   
   mySp.setSerialPortParams(19200, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
   
   entrada = new Scanner(mySp.getInputStream());
   salida = new PrintStream(mySp.getOutputStream());
   
   
    while(!entrada.hasNext()){
        
        entrada.close();
        entrada = null;
        entrada = new Scanner(mySp.getInputStream());
    }
    
    String codigo = entrada.next();
   
}
    
    
}
