public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws Exception {
        if (balance >= amount) {
                balance = getBalance() - amount;
        }
        else {
            //System.out.println("yetersiz hesap");
            throw new Exception("yetersiz hesap");
        }
    }


    public double getBalance() {
        return balance;
    }
}
