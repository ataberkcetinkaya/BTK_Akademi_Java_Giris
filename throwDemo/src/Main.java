public class Main {

    public static void main(String[] args) throws Exception {
        AccountManager accountManager = new AccountManager();
        System.out.println("your balance " + accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("your balance " + accountManager.getBalance());
        accountManager.withdraw(120);
        // ^ throws Exception veya try-catch ^
        // try {
        //      accountManager.withdraw(90);
        // }
        // catch (Exception exception) {
        //      System.out.println(exception.getMessage());
        // }
        System.out.println("your balance " + accountManager.getBalance());
    }
}
