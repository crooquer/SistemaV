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
public class VentasDAO {
     Conexion cn = new Conexion();
     Connection con;
     PreparedStatement ps;
     ResultSet rs;
     
     
    public List listarVentas(){
        List<Ventas> ListaVent = new ArrayList();
        String sql = "SELECT * FROM ventas";
        try {
           
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Ventas ven = new Ventas();
                ven.setID(rs.getInt("ID"));
                ven.setCliente(rs.getString("Cliente"));
                ven.setVendedor(rs.getString("Vendedor"));
                ven.setTotal(rs.getFloat("Total"));
                ListaVent.add(ven);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaVent;
    }

}
