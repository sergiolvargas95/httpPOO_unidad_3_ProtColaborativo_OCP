package aplicacionOCP.sistemaPagosConExtensionNuevosMetodos;

public class ProcesadorPago {
    public void realizarPago(Pago metodoPago, double monto) {
        metodoPago.procesarPago(monto);
    }
}
