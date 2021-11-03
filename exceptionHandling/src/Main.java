public class Main {

    public static void main(String[] args) {


	    try { //bu kod bölümü çalışmayı dener.
            int[] sayilar = new int[] {1,2,3};
                System.out.println(sayilar[5]);
        }
        //çalışmazsa yukaridaki hata catch (Exception exception)'a gider
        catch (Exception exception) {
                System.out.println("hata");
        }
        finally { //ister try, ister catch çalışsın; finally blogu her türlü çalışacaktir.
                System.out.println("Ben hep çalişirim");
        }
        //mesela database bağlantısı gerçekleştirirken hata oluştu,
        //ve biz baglantıyı finally içerisinde her zaman kapatabiliriz
        //hata olsa da olmasa da.
    }
}
