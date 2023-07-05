<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;
import paquete002.Ciudad;

/**
 *
 * @author reroes
 */
public class PagoLuzElectrica {

    private Ciudad tipo;
    private double pago;
    private double tarifaBase;
    private double kilovatiosConsumidos;
    private double costoKilovatio;

    public PagoLuzElectrica(double tarif, double kConsumidos, double cKilovatios) {

        tarifaBase = tarif;
        kilovatiosConsumidos = kConsumidos;
        costoKilovatio = cKilovatios;
    }

    public void calcularPago(Ciudad tipo) {

        if (tipo.equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }

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
public class PagoLuzElectrica {

    public double calcularPago() {
        
        double pago = 0;
        double tarifaBase = 10.20;
        double kilovatiosConsumidos = 80;
        double costoKilovatio = 0.5;
        String ciudad = "Loja";
        if (ciudad.equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }

        return pago;
    }
}
>>>>>>> 373dd689b6ad4900f512f5747c93974c60fc69d1
