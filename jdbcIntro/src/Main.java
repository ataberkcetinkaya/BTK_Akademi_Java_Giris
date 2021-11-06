import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        try {
            connection = dbHelper.getConnection();
            System.out.println("connection established");
        }
        catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }
    }
}
