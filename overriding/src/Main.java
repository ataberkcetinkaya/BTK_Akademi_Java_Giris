public class Main {

    public static void main(String[] args) {
//        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//        System.out.println(ogretmenKrediManager.hesapla(1000));
        //BU SEKILDE DE TEK TEK KULLANILABILIR
        //VEYA DAHA PROFESYONEL VE POLIMERFIK OLMASI ICIN;

        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[] {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager krediManager : baseKrediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }
    }
}
