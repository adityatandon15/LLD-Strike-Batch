package isp.badDesign;

public class Main {
    public static void main(String[] args) {

        OfficeMachine machine = new BasicPrinter();

        DocumentPrintService service = new DocumentPrintService(machine);

        service.printDocument("Invoice 123");
    }
}
