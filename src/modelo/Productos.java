package modelo;

public class Productos {
    private int Codigo;
    private String Descripcion;
    private int Stock;
    private float Precio;
    private String Proveedor;

    public Productos() {
    }
    
     public Productos(int Codigo, String Descripcion, int Stock, float Precio, String Proveedor) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Stock = Stock;
        this.Precio = Precio;
        this.Proveedor = Proveedor;
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
