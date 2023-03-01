/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;



public class Conexion {
        Connection con;
        public Connection getConnection(){
            try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro" ,"root", "");
                System.out.println("Conexión exitosa");
            return con;

            }catch(Exception e){  


            } 
            return con;

        }    
           
}
