import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //getFileInfo();
        readFile();

    }
    public static void createFile() {
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("file created");
            }
            else {
                System.out.println("already created");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\javademos\\files\\students.txt");
        if (file.exists()) {
            System.out.println("Dosya ad: " + file.getName());
            System.out.println("Dosya yol: " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi: " + file.canWrite());
            System.out.print("Dosya boyutu: " + file.length()); //byte
        }
    }

    public static void readFile() {
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) { //okunacak satiri bulabildiği sürece
                String line = reader.nextLine(); //nextLine yeni satir var mi diye bakiyor eger varsa okunacak bir sey var demektir ve nextline while'dan devam eder
                System.out.println(line);
//                if (line.equals("kali")) {
//                    System.out.println("var");
//                }
//                else {
//                    System.out.println("yok");
//                }

            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
