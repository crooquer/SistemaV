/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        Conexion cn = new Conexion();
        
        public LoginDAO(){
        }
        
        public Login autenticar(String Correo, String Pasword){
        Login l = null;
        
        
        String sql = "SELECT * From usuario WHERE Correo = ? AND Pasword = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, Correo);
            ps.setString(2, Pasword);
            rs = ps.executeQuery();
            if (rs.next()){
                l = new Login();
                l.setID (rs.getInt("ID"));
                l.setNombre (rs.getString("Nombre"));
                l.setCorreo (rs.getString("Correo"));
                l.setPasword(rs.getString("Pasword"));
            }
        }catch (SQLException e){
            System.out.println(e.toString());
        }finally{
            try{
                if(rs != null){
                    rs.close();
                }
                if(ps != null){
                    ps.close();
                }
                if(con != null){
                    con.close();
                }
            }catch (SQLException e){
                System.out.println(e.toString());
            }
            
            
        }    
        return l;
}
}