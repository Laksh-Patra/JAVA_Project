
package university.management.system;

import java.sql.*;


public class Conn {
    
    Connection c; //2 Creating a connection string 
    Statement s;
    
    Conn () {
        try {
            //1.Register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","123456");
            //creating the statement
            s =c.createStatement();//For execution of my sql query
        } catch (Exception e){
            e.printStackTrace(); //Tell us about exception
        }
    }
    
}
