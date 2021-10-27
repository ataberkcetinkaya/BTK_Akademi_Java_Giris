public class CustomerManager {

    BaseDatabaseManager baseDatabaseManager;
    //kullanırken hangi db'yi verirsek onun datasi calisir

    public void getCustomers() {
        baseDatabaseManager.getData();
        //BaseDatabaseManager içindeki "public abstract void getData()" yı kullanan
        //Oracle ve sql server bilgileri çeker, biz de buradan yani CustomerManager'dan
        //Main'e aktarırız??
    }
}
