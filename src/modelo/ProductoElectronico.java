package modelo;

public class ProductoElectronico extends Producto implements Vendible {

    public ProductoElectronico(String nombreProducto, int codigo, double precio,
                               String categoria, String cantidadProducto) {

        super(nombreProducto, codigo, precio, categoria, cantidadProducto);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo de producto: Electrónico");
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * 1.13;
    }
}