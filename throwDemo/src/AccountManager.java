public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws Exception {
        if (balance >= amount) {        //throws BalanceInsufficentException
                balance = getBalance() - amount;
        }
        else {
            //System.out.println("yetersiz hesap");
            //throw new Exception("yetersiz hesap");
            //CUSTOM EXCEPTION;
            throw new BalanceInsufficentException("yetersiz hesap");

        }
    }


    public double getBalance() {
        return balance;
    }
}
