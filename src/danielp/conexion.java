/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielp;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aran
 */
public class conexion {
    Connection cx;
    Connection c;
   // String bd="daniel";
    String url="jbdc:mysql://localhost/";
    String user="root";
    String pass="628288";
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cx=(Connection)DriverManager.getConnection(url,user,pass);
            System.out.println("Se Conecto");
        }catch(ClassNotFoundException|SQLException ex){
        
            System.out.println("no se Conecto");        }
        
        return cx;
    }
    
     public void desconectar(){
        try {
            c.close();
            System.out.println("Se desconecto");
        } catch (SQLException ex) {
            System.out.println("no se pudo cerrar coneccion");        }
     }
     
     
     public Connection connectDb(){
   try{
     try{
        //Registro del driver de mysql (el que se agrego previamente)
        Class.forName("com.mysql.jdbc.Driver"); 
      }catch(ClassNotFoundException ex){
          System.out.println("Error al registrar el driver de mysql. Posibles causas: "+ex);
       }
       //Si el registro sale bien, se procede a conectar con mysql
        
       c =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/daniel","root","628288");
       boolean v = c.isValid(50000);
       System.out.println(v ? "Conexión Exitosa" : "Conexción Fallida");
   }catch(java.sql.SQLException sqle){
      System.out.println("Error: "+ sqle);
   }
   return c;
}
}
   
