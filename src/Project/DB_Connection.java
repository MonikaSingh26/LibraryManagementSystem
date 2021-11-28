/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB_Connection 
{

    public static Connection getConnection;
    
    public static Connection getConnection() 
    {  
         Connection con=null;
         try 
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
               System.out.println("loaded");
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","monika.26");
              System.out.println("connected");
         } catch (ClassNotFoundException ex) 
         {
             Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) 
         {
             Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
         }
     
      return con; 
    }
    public static void main(String[] args) 
    {
        
        Connection con = DB_Connection.getConnection();
        System.out.println("DB Connected successfully !!");
        
         
    }
}