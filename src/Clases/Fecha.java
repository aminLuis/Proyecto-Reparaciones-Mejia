
package Clases;

import java.util.Date;

/**
 *
 * @author Luis Carlos
 */
public class Fecha {
    
    
public String fechaActual(){
    
    Date fecha = new Date();
    
        String actual;

        actual = fecha.getDay()+"/"+fecha.getMonth()+"/"+fecha.getYear();
    
    return actual;
}    
    
    
    
}
