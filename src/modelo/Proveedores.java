package modelo;


public class Proveedores {
    private String Cuit;
    private String Nombre;
    private String Telefono;
    private String Direccion;
    private String RazonSocial;

    public Proveedores() {
    }

    public Proveedores(String Cuit, String Nombre, String Telefono, String Direccion, String RazonSocial) {
        this.Cuit = Cuit;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.RazonSocial = RazonSocial;
    }

    public String getCuit() {
        return Cuit;
    }

    public void setCuit(String Cuit) {
        this.Cuit = Cuit;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }
    
    
}
