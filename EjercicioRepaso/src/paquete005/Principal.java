/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;

import paquete001.Persona;
import paquete002.Ciudad;
import paquete003.BilleteraPagos;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        Ciudad ciu = new Ciudad("Loja");
        Persona p= new Persona("Juan", "Juerez", 29, "19552454", ciu);
        BilleteraPagos pago = new BilleteraPagos("");
        System.out.println(pago);
    }
}
