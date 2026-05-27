import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {

    Connection c;

    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/touristmanagementsystem",
                    "root",
                    "your_password");

            System.out.println("Database Connected");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
