import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/myloki";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection success");

            // Insert data into the table
            String insert = "INSERT INTO lokesh (name, age, address, disease, admission_date, discharge_date) " +
                               "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insert);
            pstmt.setString(1, "Loki");
            pstmt.setInt(2, 25);
            pstmt.setString(3, "ADKME Street");
            pstmt.setString(4, "Sleeping disorder");
            pstmt.setDate(5, java.sql.Date.valueOf("2024-09-18"));
            pstmt.setDate(6, java.sql.Date.valueOf("2024-08-25"));
            pstmt.executeUpdate();

            System.out.println("Inserted successfully");

        } catch (SQLException s) {
            System.out.println(s);
        }
    }
}