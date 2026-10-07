package modelo;

public class ProductoAccesorio extends Producto implements Vendible {

    public ProductoAccesorio(String nombreProducto, int codigo, double precio,
                             String categoria, String cantidadProducto) {

        super(nombreProducto, codigo, precio, categoria, cantidadProducto);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo de producto: Accesorio");
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * 1.10;
    }
}