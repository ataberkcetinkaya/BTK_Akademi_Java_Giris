import java.sql.*; //veya sadece connection

public class DbHelper {
    private String userName = "root";
    private String password = "1234";
    private  String dbUrl = "jdbc:mysql://localhost:3306/world"; //buradan sonra libraries'e mysql connector eklemeyi unutma!!!
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }
    
    public void showErrorMessage(SQLException exception) {
        System.out.println(exception.getMessage());
        System.out.println(exception.getErrorCode());
    }
}
