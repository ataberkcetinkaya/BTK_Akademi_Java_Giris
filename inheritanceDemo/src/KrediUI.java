public class KrediUI {
    public void KrediHesapla(BaseKrediManager baseKrediManager) {
        baseKrediManager.Hesapla();
    } //BaseKrediManager olarak ana krediManager'ı, yani anneyi verip çocuklarından istediğimizi
      //yollayabiliriz. Bunu referans tip olması yapıyor.
}
