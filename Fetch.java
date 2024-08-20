import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/myloki";
            String user = "root";
            String pass = "root";
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection success");

            String fetch = "SELECT * FROM lokesh";
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery(fetch);

            // Process the ResultSet
            while (r.next()) {
                System.out.println("Patient ID: " + r.getInt("patient_id") +
                        ", Name: " + r.getString("name") +
                        ", Age: " + r.getInt("age") +
                        ", Address: " + r.getString("address") +
                        ", Disease: " + r.getString("disease") +
                        ", Admission Date: " + r.getDate("admission_date") +
                        ", Discharge Date: " + r.getDate("discharge_date"));
            }

            System.out.println("Fetch success");

            // Close resources
            r.close();
            s.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
