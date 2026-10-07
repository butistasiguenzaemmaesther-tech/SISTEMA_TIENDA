package main;

import modelo.*;

public class Main {
    public static void main(String[] args) {

        // ============================================================
        // ENCABEZADO DEL PROYECTO
        // ============================================================

        System.out.println("============================================================");
        System.out.println("                  SISTEMA DE TIENDA");
        System.out.println("                  LABORATORIO 2");
        System.out.println("       Herencia - Abstracción - Polimorfismo - Interfaces");
        System.out.println("============================================================");
        System.out.println();

        // ============================================================
        // CREACIÓN DE LA TIENDA
        // ============================================================

        Tienda tienda = new Tienda(
                "Electro Villanueva",
                "San Salvador",
                "2222-4444"
        );

        // ============================================================
        // CREACIÓN DEL CLIENTE
        // ============================================================

        Cliente cliente = new Cliente(
                "Kevin Villanueva",
                22,
                "6134-0000",
                "Kevin.villanueva@uped.edu.sv",
                "San Salvador"
        );

        // ============================================================
        // HERENCIA Y CLASE ABSTRACTA
        // Producto es una clase abstracta.
        // ProductoElectronico y ProductoAccesorio heredan de Producto.
        // ============================================================

        Producto producto1 = new ProductoElectronico(
                "Computadora Lenovo",
                3108,
                1000.00,
                "Aparato electronico",
                "1"
        );

        Producto producto2 = new ProductoAccesorio(
                "Mouse",
                8,
                25.00,
                "Accesorios",
                "2"
        );

        Producto producto3 = new ProductoAccesorio(
                "Teclado",
                8,
                25.00,
                "Accesorios",
                "2"
        );

        // ============================================================
        // CREACIÓN DEL CARRITO
        // ============================================================

        carrito carrito = new carrito(
                cliente.getNombreCliente(),
                4,
                "Computadora Lenovo, Mouse",
                "27/08/2026",
                1025.00
        );

        // ============================================================
        // CREACIÓN DEL PEDIDO
        // ============================================================

        Pedido pedido = new Pedido(
                30,
                cliente.getNombreCliente(),
                "Computadora Lenovo, Mouse, Teclado",
                1070.00
        );

        // ============================================================
        // CREACIÓN DE LA FACTURA
        // ============================================================

        Factura factura = new Factura(
                2666,
                cliente.getNombreCliente(),
                "Computadora Lenovo, Mouse, Teclado",
                1070.00
        );

        // ============================================================
        // DATOS DE LA TIENDA
        // ============================================================

        System.out.println("============================================================");
        System.out.println("                    DATOS DE LA TIENDA");
        System.out.println("============================================================");

        tienda.mostrarTienda();
        System.out.println();

        // ============================================================
        // DATOS DEL CLIENTE
        // ============================================================

        System.out.println("============================================================");
        System.out.println("                    DATOS DEL CLIENTE");
        System.out.println("============================================================");

        cliente.mostrarCliente();
        System.out.println();

        // ============================================================
        // HERENCIA Y ABSTRACCIÓN
        // ============================================================

        System.out.println("============================================================");
        System.out.println("             1. HERENCIA Y CLASE ABSTRACTA");
        System.out.println("============================================================");
        System.out.println("ProductoElectronico hereda de Producto.");
        System.out.println("ProductoAccesorio hereda de Producto.");
        System.out.println("Producto es una clase abstracta.");
        System.out.println();

        System.out.println("--- Producto electrónico ---");
        producto1.mostrarProducto();
        System.out.println();

        System.out.println("--- Producto accesorio: Mouse ---");
        producto2.mostrarProducto();
        System.out.println();

        System.out.println("--- Producto accesorio: Teclado ---");
        producto3.mostrarProducto();
        System.out.println();

        // ============================================================
        // SOBRESCRITURA
        // mostrarTipo() es sobrescrito por cada subclase.
        // calcularPrecioFinal() también es sobrescrito.
        // ============================================================

        System.out.println("============================================================");
        System.out.println("                 2. SOBRESCRITURA (@Override)");
        System.out.println("============================================================");
        System.out.println("Cada subclase proporciona su propia implementación.");
        System.out.println();

        System.out.println("--- ProductoElectronico ---");
        producto1.mostrarTipo();
        System.out.println("Precio final: $" + producto1.calcularPrecioFinal());
        System.out.println();

        System.out.println("--- ProductoAccesorio ---");
        producto2.mostrarTipo();
        System.out.println("Precio final: $" + producto2.calcularPrecioFinal());
        System.out.println();

        // ============================================================
        // SOBRECARGA
        // mostrarProducto() tiene diferentes versiones.
        // ============================================================

        System.out.println("============================================================");
        System.out.println("                 3. SOBRECARGA DE MÉTODOS");
        System.out.println("============================================================");

        System.out.println("--- Sobrecarga sin parámetros ---");
        producto1.mostrarProducto();
        System.out.println();

        System.out.println("--- Sobrecarga con boolean ---");
        producto1.mostrarProducto(true);
        System.out.println();

        System.out.println("--- Sobrecarga con String ---");
        producto2.mostrarProducto("Información adicional del producto:");
        System.out.println();

        // ============================================================
        // INTERFAZ Y POLIMORFISMO
        // Vendible es una interfaz implementada por las subclases.
        // ============================================================

        System.out.println("============================================================");
        System.out.println("             4. INTERFAZ Y POLIMORFISMO");
        System.out.println("============================================================");
        System.out.println("La interfaz Vendible define calcularPrecioFinal().");
        System.out.println("ProductoElectronico y ProductoAccesorio la implementan.");
        System.out.println();

        Vendible vendible1 = (ProductoElectronico) producto1;
        Vendible vendible2 = (ProductoAccesorio) producto2;

        System.out.println("--- Polimorfismo con ProductoElectronico ---");
        System.out.printf("Precio final: $%.2f%n", vendible1.calcularPrecioFinal());
        System.out.println();

        System.out.println("--- Polimorfismo con ProductoAccesorio ---");
        System.out.printf("Precio final: $%.2f%n", vendible2.calcularPrecioFinal());
        System.out.println();

        // ============================================================
        // DATOS DEL CARRITO
        // ============================================================

        System.out.println("============================================================");
        System.out.println("                    DATOS DEL CARRITO");
        System.out.println("============================================================");

        carrito.MostrarCarrito();
        System.out.println();

        // ============================================================
        // DATOS DEL PEDIDO
        // ============================================================

        System.out.println("============================================================");
        System.out.println("                     DATOS DEL PEDIDO");
        System.out.println("============================================================");

        pedido.mostrarPedido();
        System.out.println();

        // ============================================================
        // DATOS DE LA FACTURA
        // ============================================================

        System.out.println("============================================================");
        System.out.println("                    DATOS DE LA FACTURA");
        System.out.println("============================================================");

        factura.mostrarFactura();
        System.out.println();

        // ============================================================
        // FINAL
        // ============================================================

        System.out.println("============================================================");
        System.out.println("             FIN DE LA DEMOSTRACIÓN DEL LAB 2");
        System.out.println("============================================================");
    }
}