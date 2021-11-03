import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //Sadece <String, String> almak zorunda değil <String, int> <String, class> vs.'de alabilir
        HashMap<String, String> sozluk = new HashMap<String, String>();

        Cars cars = new Cars();
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");

        sozluk.put("ILYC", cars.getCars());

        System.out.println(sozluk.size());

        for (String item : sozluk.keySet()) {
            System.out.println("Eleman " + item + " Değer " + sozluk.get(item));
        }

        //sozluk.remove("table");
        //sozluk.clear();
        System.out.println(sozluk.get("table"));
    }
}
