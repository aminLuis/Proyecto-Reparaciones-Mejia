
package Clases;

import gnu.io.CommPort;
import java.util.Enumeration;
import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;

/**
 *
 * @author Luis Carlos
 */
public class DetectarDispositivos {
    
public void detectarPuerto() throws PortInUseException{
    
   Enumeration commports = CommPortIdentifier.getPortIdentifiers();
    
   CommPortIdentifier myCPI = null;
   
   while(commports.hasMoreElements()){
       
      myCPI = (CommPortIdentifier) commports.nextElement();
       
       if(myCPI.getName().equals("COM1")||myCPI.getName().equals("COM2")){
         break;
       }
   }
    
   CommPort puerto =   myCPI.open("Puerto serial",1000);
   SerialPort mySp = (SerialPort) puerto;
   
}
    
    
}
