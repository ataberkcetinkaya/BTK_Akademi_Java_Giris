import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("yaşiniz: ");
            int ad = scanner.nextInt();
            System.out.println("yaşiniz " + ad);
        }
        catch (Exception exception) {
            System.out.println("error");
        }
    }
}
