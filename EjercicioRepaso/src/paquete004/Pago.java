
package paquete004;

/**
 *
 * @author luisa
 */
public abstract class Pago {
    protected double pago;
     public abstract void calcularPago() ;

    public double obtenerPago() {
        return pago;
    }
}
