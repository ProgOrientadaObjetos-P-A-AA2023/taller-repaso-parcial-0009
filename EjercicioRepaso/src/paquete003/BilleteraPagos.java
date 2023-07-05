<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import java.util.ArrayList;
import paquete001.Persona;
import paquete004.Pago;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;

/**
 *
 * @author reroes
 */
public class BilleteraPagos {

    public Persona persona;
    public double gastoPagos;
    public String mes;
    public ArrayList<Pago> pagos = new ArrayList<>();

    public BilleteraPagos(Persona per, String m) {
        persona = per;
        mes = m;
        
    }
     public Persona obtenerPersona(){
         return persona;
     }
     public double obtenerGastoPagos(){
         return gastoPagos;
     }
     public String obtenerMes(){
         return mes;
     }
     public ArrayList<Pago> obtenerArrayList(){
         return pagos;
     }

    public String toString() {
        /*
            Se debe presentar el reporte que incluya
            información correspondiente oportuna
         */
        String cadena= "Reporte\n";
        for (int i = 0; i < pagos.size(); i++) {
            cadena=String.format("%s\n",cadena);
            
            
        }
        return "Presentar Reporte";
    }

}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import paquete001.Persona;
/**
 *
 * @author reroes
 */
public class BilleteraPagos {
    
    public Persona persona;
    public double gastoPagos;
    public String mes;

    public String toString(){
        /*
            Se debe presentar el reporte que incluya
            información correspondiente oportuna
        */
        return "Presentar Reporte";
    }
    
}
>>>>>>> 373dd689b6ad4900f512f5747c93974c60fc69d1
