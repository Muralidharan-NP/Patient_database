
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Creatcon {
    public static void main(String[] args) {
        
        try {
           String url="jdbc:mysql://localhost:3306/myloki";
           String user="root";
           String pass="root";
           Connection con =DriverManager.getConnection(url,user,pass);
           System.out.println("Connected");
           String c_table= "CREATE TABLE lokesh (" +
                                    "patient_id INT PRIMARY KEY AUTO_INCREMENT, " +
                                    "name VARCHAR(100) NOT NULL, " +
                                    "age INT NOT NULL, " +
                                    "address VARCHAR(255), " +
                                    "disease VARCHAR(100), " +
                                    "admission_date DATE, " +
                                    "discharge_date DATE" +
                                    ");";
           Statement s=con.createStatement();
           s.executeUpdate(c_table);
           System.out.println("Table created Successfully");

        } 
        catch (SQLException s) {
            System.out.println(s);
        }
    }
}
