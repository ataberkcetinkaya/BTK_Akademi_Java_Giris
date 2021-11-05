import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    static String username = "root";
    static String password = "1234";
    static String dburl = "jdbc:mysql://localhost:3306/world";
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dburl, username, password);
            System.out.println("connection established");
        }
        catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        finally {
            connection.close();
        }
    }
}
