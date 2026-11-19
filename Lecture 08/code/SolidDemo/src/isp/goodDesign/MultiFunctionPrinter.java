package isp.goodDesign;

public class MultiFunctionPrinter
        implements Printable, Scannable, Faxable {

    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan() {
        System.out.println("Scanning document");
    }

    @Override
    public void fax(String document) {
        System.out.println("Faxing: " + document);
    }
}
