package isp.goodDesign;


public class DocumentPrintService {

    private final Printable printer;

    public DocumentPrintService(Printable printer) {
        this.printer = printer;
    }

    public void printDocument(String document) {
        printer.print(document);
    }
}
