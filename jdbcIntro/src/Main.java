import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        Statement statement = null; //sql sorgularinin işlemlerini yapacak yer
        ResultSet resultSet;  //sorgularin sonucunda gelecek data resultset'tir

        try {
            connection = dbHelper.getConnection();
            //System.out.println("connection established");
            statement = connection.createStatement(); //farklı db'lerle çalisilan projede karismaması için buradaki 'connection.createStatement()' diyoruz.
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
            while (resultSet.next()) { //tek tek gezecek datayi
                System.out.println(resultSet.getString("Name"));
            }
        }
        catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }
    }
}
