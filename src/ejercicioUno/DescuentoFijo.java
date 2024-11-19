package ejercicioUno;

public class DescuentoFijo extends Descuento{
    private double cantidadDescuentoFijo;


    @Override
    public void procesarDescuento(double cantidad) {
        this.cantidadDescuentoFijo = cantidad;
        System.out.println("El producto seleccionado tiene un descuento de $" + cantidadDescuentoFijo);
    }
}
