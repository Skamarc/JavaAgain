package Files2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        Scanner myreader = new Scanner(file);
        while (myreader.hasNextLine()) {
            System.out.println(myreader.nextLine());

        }
        myreader.close();


    }

}
