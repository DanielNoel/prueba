/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Paquete;

/********************** @author User ****************************************/
import java.sql.*;
public class Conexion { 
  //******************************ATRIBUTOS*************************************  
  static String bd="mibdempleados";static String login="root";
  static String password="daniel";static String url="jdbc:mysql://localhost/"+bd;  
  static public Connection cnx=null;static public Statement st=null;
  static public ResultSet rs=null; 
  //******************************ATRIBUTOS*************************************
  
  //******************************METODO****************************************
  public Conexion(){
   try{Class.forName("com.mysql.jdbc.Driver");
    cnx=DriverManager.getConnection(url,login,password);    
   }
   catch(SQLException ex){System.out.println(ex);}
   catch(ClassNotFoundException ex){System.out.println(ex); }            
  }
 //******************************METODO****************************************  
}
