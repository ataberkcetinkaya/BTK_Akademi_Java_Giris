public abstract class GameCalculator {
    public abstract void hesapla();
    //public abstract kelimesini eklediğimizde hesapla'yı her kim kullanıyorsa
    //hesaplayı içermek zorunda VE OVERRIDE ETMEK ZORUNDA YANI;
    //KENDI HESAPLAMASINI YAZMAK ZORUNDA

    //KISACASI ABSTRACT CLASSLARIN NORMAL CLASSLARDAN FARKI;
    // NEW'LENEMEZ, ZORUNLU OPERASYONLARI EKLIYORUZ.

    public final void gameOver() { //Burada ise yine final keyword'u ile kimse bunu override edemez.
        System.out.println("Game Over."); //HERKES ICIN OYUNUN BITISI AYNIDIR. !!!!!
    }
}
