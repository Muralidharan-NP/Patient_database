import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Updatedata {
    public static void main(String[] args) {
         try {
            String url="jdbc:mysql://localhost:3306/myloki";
           String user="root";
           String pass="root";
           Connection con =DriverManager.getConnection(url,user,pass);
           System.out.println("Connection success");
           String update="update lokesh set name=? ,age=?,  address=?, disease=? where patient_id=?";
           PreparedStatement pre=con.prepareStatement(update);
           
           pre.setString(1,"pravin");
           pre.setInt(2,20);
           pre.setString(3,"Aim street");
           pre.setString(4, "heartpain");
           pre.setInt(5, 5);


    

           pre.executeUpdate();
           System.out.println("Updated success");
           
        } 
        catch (SQLException s) {
            System.out.println(s);

        }
    }
}
