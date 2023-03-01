/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class PersonaDAO implements Validar {
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    @Override
    public int validar(Persona per) {
       int r=0;
       String sql="select * from persona2 where nombre=? and correo=?";
       try{
           con=cn.getConnection();
           ps=con.prepareStatement(sql);
           ps.setString(1, per.getNom());
           ps.setString(2, per.getCorreo());
           rs=ps.executeQuery();
           
           while(rs.next()){
               r=r+1;
               per.setNom(rs.getString("nombre"));
               per.setCorreo(rs.getString("correo"));  
           }
           if(r==1){
               return 1;
           }else{
               return 0;
           }
       }catch(Exception e){
           return 0;
       }
    }
    
}
