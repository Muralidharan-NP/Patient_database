import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void main(String[] args) {
         try {
            String url="jdbc:mysql://localhost:3306/myloki";
           String user="root";
           String pass="root";
           Connection con =DriverManager.getConnection(url,user,pass);
           System.out.println("Connection success");
           String delete = "DELETE FROM lokesh WHERE age = ?";
           PreparedStatement pre = con.prepareStatement(delete);
           pre.setInt(1, 20);
           pre.executeUpdate();
           System.out.println("Delete successfull");
           
        } 
        catch (SQLException s) {
            System.out.println(s);

        }
    }
}
