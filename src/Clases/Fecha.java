
package Clases;


import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 *
 * @author Luis Carlos
 */
public class Fecha {
    
    
public String fechaActual(){
    
    Calendar date = new GregorianCalendar();
    String actual;
    
        int anio = date.get(Calendar.YEAR);
        int mes = date.get(Calendar.MONTH);
        mes = mes+1;
        int dia = date.get(Calendar.DAY_OF_MONTH);
    
    
    actual = dia +"/"+mes+"/"+anio;
    
    return actual;
}    
    
    
    
}
