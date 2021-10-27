public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new OracleDatabaseManager();
        //customerManager'ın databasemanager'ı oracle'dır deyip newliyoruz


        customerManager.getCustomers();
    }
}
