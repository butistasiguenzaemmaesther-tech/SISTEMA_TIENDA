package modelo;

public class Tienda {
    private String nombreTienda;
    private String Ubicacion;
    private String telefono;

    public Tienda(String nombreTienda, String direccion, String telefono) {
        this.nombreTienda = nombreTienda;
        this.Ubicacion = direccion;
        this.telefono = telefono;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccion() {
        return Ubicacion;
    }

    public void setDireccion(String direccion) {
        this.Ubicacion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrarTienda() {
        System.out.println("Nombre de tienda: " + nombreTienda);
        System.out.println("Ubicación: " + Ubicacion);
        System.out.println("Contacto: " + telefono);
    }
}