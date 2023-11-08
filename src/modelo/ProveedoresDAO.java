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
            ps.setString(0, pr.getCuit());
            ps.setString(1, pr.getNombre());
            ps.setString(2, pr.getTelefono());
            ps.setString(3, pr.getDireccion());
            ps.setString(4, pr.getRazonSocial());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
       public boolean eliminarProveedor(String cuit){
        String sql = "DELETE FROM proveedores WHERE Cuit=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(Cuit);
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
}
