package modelo;

public class carrito {
    private String cliente;
    private int idCarrito;
    private String productos;
    private String fecha;
    private double totalCompra;

    public carrito(String cliente, int idCarrito, String productos, String fecha, double totalCompra) {
        this.cliente = cliente;
        this.idCarrito = idCarrito;
        this.productos = productos;
        this.fecha = fecha;
        this.totalCompra = totalCompra;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public void MostrarCarrito() {
        System.out.println("Nombre del cliente: " + cliente);
        System.out.println("Id del carrito: " + idCarrito);
        System.out.println("Los productos son: " + productos);
        System.out.println("La fecha de compra es: " + fecha);
        System.out.println("El total de su compra es de $:" + totalCompra);
    }

}
