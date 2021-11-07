import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        PreparedStatement statement = null; //sql sorgularinin işlemlerini yapacak yer
        ResultSet resultSet;  //sorgularin sonucunda gelecek data resultset'tir

        try {
            connection = dbHelper.getConnection();
            //System.out.println("connection established");
            String sql = "delete from city where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4088);
            statement.executeUpdate();
                System.out.println("Deleted.");
        }
        catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }
    }
    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        Statement statement = null; //sql sorgularinin işlemlerini yapacak yer
        ResultSet resultSet;  //sorgularin sonucunda gelecek data resultset'tir

        try {
            connection = dbHelper.getConnection();
            //System.out.println("connection established");
            statement = connection.createStatement(); //farklı db'lerle çalisilan projede karismaması için buradaki 'connection.createStatement()' diyoruz.
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) { //tek tek gezecek datayi
                countries.add(new Country(resultSet.getString("Code"), resultSet.getString("Name"), resultSet.getString("Continent"), resultSet.getString("Region")));
                //System.out.println(countries);
                System.out.println(resultSet.getString("name"));
            }
        }
        catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }
    }

    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        PreparedStatement statement = null; //sql sorgularinin işlemlerini yapacak yer
        ResultSet resultSet;  //sorgularin sonucunda gelecek data resultset'tir

        try {
            connection = dbHelper.getConnection();
            //System.out.println("connection established");
            String sql = "insert into city (Name,CountryCode,District,Population) values (?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Nilufer");
            statement.setString(2, "TUR");
            statement.setString(3, "Bursa, Marmara");
            statement.setInt(4, 570542);
            statement.executeUpdate();
            System.out.println("Added.");
        }
        catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }
    }

    public void updateData() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        PreparedStatement statement = null; //sql sorgularinin işlemlerini yapacak yer
        ResultSet resultSet;  //sorgularin sonucunda gelecek data resultset'tir

        try {
            connection = dbHelper.getConnection();
            //System.out.println("connection established");
            String sql = "update city set population = 670000 where id=?"; //ayni anda farkli colonlarda update edilebilir; ,district'new_district'
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4088); //executeUpdate üzerinde herhangi bir yerde (statement'tan sonra)
            statement.executeUpdate();
            System.out.println("Updated.");
        }
        catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }
    }
}
