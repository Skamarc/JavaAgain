import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            System.out.println("Before reading file");
            readFile("C:\\Users\\M-ska\\Desktop\\IT\\Repozytoria\\Java kurs\\src\\test.txt");


        } catch (FileNotFoundException e) {
            System.out.println("Wyjatek sie pojawil");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Closing file");
        }
    }

    public static void readFile (String path) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(path);


    }
}
