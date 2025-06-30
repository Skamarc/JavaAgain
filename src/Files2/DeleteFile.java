package Files2;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.exists()) {
            file.delete();
            System.out.printf("File %s deleted successfully\n", file.getAbsolutePath());
        }
        else {
            System.out.printf("File %s does not exist\n", file.getAbsolutePath());

        }
    }
}
