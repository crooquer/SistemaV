/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    private Connection conexion;
    
    public Conexion(){
        String jdbcUrl = "jdbc:mysql://localhost:3307/sistemaventas?serverTimeZone=UTC";
        
        try {
            conexion = DriverManager.getConnection(jdbcUrl, "root", "");
            System.out.println("Conexion exitosa a la base de datos");
        } catch (SQLException e){
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
    
    public Connection getConexion() {
        return conexion;
    }
    
    public void cerrarConexion(){
        try {
            if (conexion != null){
            conexion.close();
            System.out.println("Conexion cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion: " + e.getMessage());
        }
    }
    
}