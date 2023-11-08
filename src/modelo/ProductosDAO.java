/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author USER
 */
public class ProductosDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;


public boolean registrarProducto(Productos prod){
        String sql = "INSERT INTO productos (Codigo, Descripcion, Stock, Precio, Proveedor) VALUES(?, ?, ?, ?, ?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(0, prod.getCodigo());
            ps.setString(1, prod.getDescripcion());
            ps.setInt(2, prod.getStock());
            ps.setFloat(3, prod.getPrecio());
            ps.setString(4, prod.getProveedor());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
}

 public List listarProducto(){
        List<Productos> ListaProd = new ArrayList();
        String sql = "SELECT * FROM productos ";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Productos prod = new Productos();
                prod.setCodigo(rs.getInt("Codigo"));
                prod.setDescripcion(rs.getString("Descripcion"));
                prod.setStock(rs.getInt("Stock"));
                prod.setPrecio(rs.getFloat("Precio"));
                prod.setProveedor(rs.getString("Proveedor"));
                ListaProd.add(prod);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaProd;
    }
  
 
    public boolean eliminarProducto(int Codigo){
        String sql = "DELETE FROM productos WHERE Codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, Codigo);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
     public boolean modificarProducto(Productos prod){
        String sql = "UPDATE productos SET Descripcion=?, Stock=?, Precio=?, Proveedor=? WHERE Codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, prod.getCodigo());
            ps.setString(2, prod.getDescripcion());
            ps.setInt(3, prod.getStock());
            ps.setFloat(4, prod.getPrecio());
            ps.setString(6, prod.getProveedor());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
        
    }
   
}