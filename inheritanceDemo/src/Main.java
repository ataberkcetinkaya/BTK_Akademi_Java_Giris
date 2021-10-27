public class Main {

    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new AskerKrediManager());
        //KrediUI üzerinden kısacası aktarma yaparak istediğimiz krediyi alabiliriz
        krediUI.KrediHesapla(new OgretmenKrediManager());
    }
}
