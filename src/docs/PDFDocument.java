package docs;

public class PDFDocument implements Dokument{
    @Override
    public void getDescription() {
        System.out.println("Im PDF document");
    }
}
