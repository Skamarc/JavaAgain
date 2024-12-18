package docs;

public class DocumentChecker {
    public static void main(String[] args) {
        Document doc = new ExelDocument();
        doc.getDescription();

        Document doc2 = new PDFDocument();
        doc2.getDescription();

    }
}
