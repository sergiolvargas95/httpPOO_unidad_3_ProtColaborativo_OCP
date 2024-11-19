package ejercicioUno;

public class DescuentoPorcentaje extends Descuento {
    private double cantidadDescuento;

    @Override
    public void procesarDescuento(double cantidad) {
        this.cantidadDescuento = cantidad;

        System.out.println("El producto seleccionado tiene un descuento de " + this.cantidadDescuento + "%");
    }
}
