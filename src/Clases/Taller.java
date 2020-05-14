

package Clases;


import InterfacesAdmin.PresentacionAdmin;
import InterfacesOperaciones.IngresoVehiculo;
import ModoDesarrollador.Principal;
import Login.Log;

/**
 *
 * @author Luis Carlos
 */
public class Taller {


    public static void main(String[] args) throws ClassNotFoundException {
    
        PresentacionAdmin admin = new PresentacionAdmin();
        IngresoVehiculo ingreso = new IngresoVehiculo();
        Principal root = new Principal();
        Log login = new Log();
        
        //admin.setVisible(true);
        //ingreso.setVisible(true);
        //root.setVisible(true);
        login.setVisible(true);
        
    }
    
}
