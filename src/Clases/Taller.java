

package Clases;


import InterfacesUsuario.RegistroVehiculo;
import InterfacesUsuario.RegistroCategorias;
import InterfacesUsuario.PresentacionAdmin;
import InterfacesUsuario.RegistroUsuarios;


/**
 *
 * @author Luis Carlos
 */
public class Taller {


    public static void main(String[] args) throws ClassNotFoundException {
    
        RegistroVehiculo registro = new RegistroVehiculo();
        RegistroCategorias categorias = new RegistroCategorias();
        PresentacionAdmin admin = new PresentacionAdmin();
        RegistroUsuarios usuario = new RegistroUsuarios();
        
        //registro.setVisible(true);
        //categorias.setVisible(true);
        admin.setVisible(true);
        //usuario.setVisible(true);
    }
    
}
