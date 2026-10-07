package modelo;

public class Pedido {
    private int numeroPedido;
    private String nombreCliente;
    private String productos;
    private double precioPedido;

    public Pedido(int numeroPedido, String nombreCliente, String productos, double precioPedido) {
        this.numeroPedido = numeroPedido;
        this.nombreCliente = nombreCliente;
        this.productos = productos;
        this.precioPedido = precioPedido;
    }
    public int getNumeroPedido() {return numeroPedido;}
    public void setNumeroPedido(int numeroPedido) {this.numeroPedido = numeroPedido;}

    public String getNombreCliente() {return nombreCliente;}
    public void setNombreCliente(String nombreCliente) {this.nombreCliente = nombreCliente;}

    public String getProductos() {return productos;}
    public void setProductos(String productos) {this.productos = productos;}

    public double getPrecioPedido() {return precioPedido;}
    public void setPrecioPedido(double precioPedido) {this.precioPedido = precioPedido;}

    //imprimir

    public void mostrarPedido(){
        System.out.println("Numero de pedido: " + numeroPedido);
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Productos: " + productos);
        System.out.println("El total del pedido es: " + precioPedido);
    }
}