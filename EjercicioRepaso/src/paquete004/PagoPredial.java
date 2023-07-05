<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;
import paquete002.Propiedad;

/**
 *
 * @author reroes
 */
public class PagoPredial {
    private int valorPropiedad;
    private int porcentaje;
   private  double pago;

    public PagoPredial(int vPropiedad, int p) {
        valorPropiedad = vPropiedad;
        porcentaje = p;
    }
    
    public void calcularPago(){
       pago = valorPropiedad - ((valorPropiedad*porcentaje)/100);
    }
    public double obtenerPago(){
        return pago;
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;
import paquete002.Propiedad;

/**
 *
 * @author reroes
 */
public class PagoPredial {
    public double calcularPago(){
        double valorPropiedad = 56000;
        double porcentaje = 10;
        double pago = valorPropiedad - ((valorPropiedad*porcentaje)/100);
        return pago;
    }
}
>>>>>>> 373dd689b6ad4900f512f5747c93974c60fc69d1
