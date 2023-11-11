package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;



public class ProveedoresDAO {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet  rs;
       
    public boolean registrarProveedor(Proveedores pr){
        String sql = "INSERT INTO proveedores(Cuit, Nombre, Telefono, Direccion, RazonSocial) VALUES(?, ?, ?, ?, ?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(0,pr.getID());
            ps.setString(1, pr.getCuit());
            ps.setString(2, pr.getNombre());
            ps.setString(3, pr.getTelefono());
            ps.setString(4, pr.getDireccion());
            ps.setString(5, pr.getRazonSocial());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
       public boolean eliminarProveedor(String Cuit){
        String sql = "DELETE FROM proveedores WHERE Cuit=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,Cuit);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public List listaProveedor(){
        List<Proveedores> listaPr = new ArrayList();
        String sql = "SELECT * FROM proveedor";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Proveedores pr = new Proveedores();
                pr.setCuit(rs.getString("Cuit"));
                pr.setNombre(rs.getString("Nombre"));
                pr.setTelefono(rs.getString("telefono"));
                pr.setDireccion(rs.getString("Direccion"));
                pr.setRazonSocial(rs.getString("RazonSocial"));
                listaPr.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaPr;
    }
    
    public boolean modificarProveedor(Proveedores pr){
        String sql = "UPDATE proveedores SET Nombre=?, Telefono=?, Direccion=?, RazonSocial=? WHERE Cuit=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(0,pr.getNombre());
            ps.setString(1, pr.getTelefono());
            ps.setString(2, pr.getDireccion());
            ps.setString(3, pr.getRazonSocial());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
        
    }
}
