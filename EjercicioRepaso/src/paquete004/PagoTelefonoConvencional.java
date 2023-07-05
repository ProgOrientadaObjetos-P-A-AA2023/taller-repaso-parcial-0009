
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
