import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        getFileInfo();

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
}
