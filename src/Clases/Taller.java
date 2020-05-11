

package Clases;


import InterfacesUsuario.PresentacionAdmin;
import InterfacesOperaciones.IngresoVehiculo;

/**
 *
 * @author Luis Carlos
 */
public class Taller {


    public static void main(String[] args) throws ClassNotFoundException {
    
        PresentacionAdmin admin = new PresentacionAdmin();
        IngresoVehiculo ingreso = new IngresoVehiculo();
        
        //admin.setVisible(true);
        ingreso.setVisible(true);
        
        
    }
    
}
