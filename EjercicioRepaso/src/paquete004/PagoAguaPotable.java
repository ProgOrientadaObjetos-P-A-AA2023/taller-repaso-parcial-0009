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
public class PagoAguaPotable {

    private Propiedad tipo;
    private double pago;
    private double tarifaFija ;
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;
    public PagoAguaPotable(double tarif,double mCubicos,double cConsumo){


        tarifaFija =tarif;
        metrosCubicosConsumo=mCubicos;
        costoConsumoCubicos=cConsumo;
    }
    
    public void calcularPago(Propiedad tipo) {
        
        if (tipo.tipo.equals("comercial")) {
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        } else {
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }

     
    }
      public double obtenerPago(){
        return pago;
    }

    @Override
    public String toString() {
       String cadena = String.format("Pago Agua Potable %s: %.2f\n",tipo.tipo, obtenerPago());
       
        return cadena;      
    }
      
}
