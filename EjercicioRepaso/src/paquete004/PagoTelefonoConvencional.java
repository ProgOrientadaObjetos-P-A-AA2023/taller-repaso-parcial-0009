<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;

/**
 *
 * @author reroes
 */
public class PagoTelefonoConvencional {

    private double tarifa;
    private double minutosConsumidos;
    private double costoMinuto;
    private double pago;

    public PagoTelefonoConvencional(double tarif, double mConsumidos, double cConsumido) {
        tarifa = tarif;
        minutosConsumidos = mConsumidos;
        costoMinuto = cConsumido;
    }

    public void calcularPago() {

        double pago = tarifa + (minutosConsumidos * costoMinuto);

    }

    public double obtenerPago() {
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

/**
 *
 * @author reroes
 */
public class PagoTelefonoConvencional {
    
    public double calcularPago(){
        double tarifa = 6.20;
        double minutosConsumidos = 100;
        double costoMinuto = 0.2;
        double pago = tarifa + (minutosConsumidos * costoMinuto);
        return pago;
    }
}
>>>>>>> 373dd689b6ad4900f512f5747c93974c60fc69d1
