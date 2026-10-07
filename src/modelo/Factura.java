package modelo;

public class Factura {
    private int numeroFactura;
    private String nombreCliente;
    private String productos;
    private double precioFactura;

    public Factura(int numeroFactura, String nombreCliente,
                   String productos, double precioFactura) {

        this.numeroFactura = numeroFactura;
        this.nombreCliente = nombreCliente;
        this.productos = productos;
        this.precioFactura = precioFactura;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public double getPrecioFactura() {
        return precioFactura;
    }

    public void setPrecioFactura(double precioFactura) {
        this.precioFactura = precioFactura;
    }

    public void mostrarFactura() {
        System.out.println("Codigo de factura: " + numeroFactura);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Productos: " + productos);
        System.out.println("Total en factura: $" + precioFactura);
    }

}

