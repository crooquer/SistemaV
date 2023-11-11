package modelo;

public class Productos {
    private int ID;
    private int Codigo;
    private String Descripcion;
    private int Stock;
    private float Precio;
    private String Proveedor;

    public Productos() {
    }

    public Productos(int ID, int Codigo, String Descripcion, int Stock, float Precio, String Proveedor) {
        this.ID = ID;
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Stock = Stock;
        this.Precio = Precio;
        this.Proveedor = Proveedor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }
    
    
}
