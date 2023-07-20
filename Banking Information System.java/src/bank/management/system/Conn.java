
package bank.management.system;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try {   
//            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "Drm2987@#Sql");
            s = c.createStatement();
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
