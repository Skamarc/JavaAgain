package Files2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("test.txt");
        writer.write("Cokolwiek2");
        writer.close();




    }





    public WriteToFile() throws IOException {
    }


}
