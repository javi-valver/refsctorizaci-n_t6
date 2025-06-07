public class Tarea6EDClase {
    private static final double DESCUENTO_MAYOR_CANTIDAD = 5.0;
    private static final double PORCENTAJE_DESCUENTO = 0.8;
    private static final double PORCENTAJE_DESCUENTO_CERO = 0.95;

    public void calcularTotalConDescuento(double precioProducto, int numProductos) {
        double precioFinal = obtenerPrecioConDescuento(precioProducto, numProductos);
        System.out.println("El total a pagar es: " + precioFinal);
        System.out.println("Enviado");
    }

    private double obtenerPrecioConDescuento(double precioProducto, int numProductos) {
        if (numProductos > 3) {
            precioProducto -= DESCUENTO_MAYOR_CANTIDAD;
        }
        if (numProductos != 0) {
            return precioProducto * PORCENTAJE_DESCUENTO;
        } else {
            return precioProducto * PORCENTAJE_DESCUENTO_CERO;
        }
    }
}




public static void main(String[] args) {

    Tarea6EDClase miCarrito = new Tarea6EDClase();

    miCarrito.calcularTotalConDescuento(100, 5);
}
