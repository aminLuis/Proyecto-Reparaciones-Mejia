
package Clases;

/**
 *
 * @author Luis Carlos
 */
public class Vehiculo {

private int numeroInterno;
private String placa;
private int modelo;
private int cilindraje;


public Vehiculo(){
    numeroInterno = 0;
    placa = "";
    modelo = 0;
    cilindraje = 0;
}

    public int getNumeroInterno() {
        return numeroInterno;
    }

    public void setNumeroInterno(int numeroInterno) {
        this.numeroInterno = numeroInterno;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }





    
}
