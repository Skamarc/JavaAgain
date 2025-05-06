package docs;

public class DokumentChecker {

    public static void main(String[] args) {
        Dokument pdfDoc = new PDFDocument();
        pdfDoc.getDescription();

        Dokument exelDoc = new ExelDocument();
        exelDoc.getDescription();

    }
}
