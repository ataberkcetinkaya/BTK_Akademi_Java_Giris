public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.iCustomerDal = new PostgreSqlCustomerDal();
        customerManager.add();
    }

    //2.YONTEM
    //VEYA
    //CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
    //customerManager.add();
}
