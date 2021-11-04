public class BalanceInsufficentException extends Exception {

    String message;
    public BalanceInsufficentException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }

    //Main.java içerisinde artik 'BalanceInsufficentException'
    //catch içerisinde kullanılabilir
}
