import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //Add exception to method signature (ampulden)
        //bunu try-catch içerisine alinmasi gerektigi bilinsin. (try-catch'a almak zorunlu kılınıyor)

        //veya Surround with try/catch (ampulden)

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\javademos\\readingFileDemo\\src\\sayilar.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            reader.close(); //throws IOException
        }
        //ozellikle dosya okuma ile ilgili olan check exceptionlar için
        //java bize bunları mutlaka try-catch içerisine almamız gerektigini
        //söyler. Almazsak bunu kullanacak kişiye "throws IOException"
        //uyarı verdirteceğiz ve onun try-catch içerisine almasını sağlayacağız.
    }
}
