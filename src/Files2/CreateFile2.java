package Files2;

import java.io.File;
import java.io.IOException;

public class CreateFile2 {
    public static void main(String[] args) throws IOException {

        File file = new File("Text.txt");
        if(file.createNewFile()){
            System.out.printf("Stworzylem nowy plik");

        }
        else {
            System.out.printf("Plik juz istenieje");

        }

    }
}
