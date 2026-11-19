package isp.goodDesign;

public class Main {
    public static void main(String[] args) {
        Printable printer = new BasicPrinter();

        DocumentPrintService service = new DocumentPrintService(printer);

        service.printDocument("INVOICE-101");
    }
}
