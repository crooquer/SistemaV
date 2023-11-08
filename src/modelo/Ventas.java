/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Ventas {
    private int ID;
    private String Cliente;
    private String Vendedor;
    private float Total;

    public Ventas() {
    }

    public Ventas(int ID, String Cliente, String Vendedor, float Total) {
        this.ID = ID;
        this.Cliente = Cliente;
        this.Vendedor = Vendedor;
        this.Total = Total;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }
    
    
}