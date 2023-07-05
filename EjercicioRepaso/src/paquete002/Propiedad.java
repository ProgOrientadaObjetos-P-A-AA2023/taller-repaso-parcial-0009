
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

/**
 *
 * @author reroes
 */
public class Propiedad {
    public double costoPropiedad;
    public String tipo;

    public Propiedad(double cPropiedad, String t) {
        costoPropiedad = cPropiedad;
        tipo = t;
    }
    
    public void establecerCostoPropiedad(double cost){
        costoPropiedad=cost;
    }
    public double obtenerCostoPropiedad(){
        return costoPropiedad;
    }
    public void establecerTipo(String t){
        tipo=t;
    }
    public String obtenerTipo(){
        return tipo;
    }
}
