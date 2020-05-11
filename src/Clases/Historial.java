
package Clases;

/**
 *
 * @author Luis Carlos
 */
public class Historial {


private String codigo;
private String tipo_reparacion;
private String fechaIngreso;
private String fechaSalida;
    

public Historial(){
    codigo = "";
    tipo_reparacion = "";
    fechaIngreso = "";
    fechaSalida = "";
}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo_reparacion() {
        return tipo_reparacion;
    }

    public void setTipo_reparacion(String categoria) {
        this.tipo_reparacion = categoria;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }


    
}
