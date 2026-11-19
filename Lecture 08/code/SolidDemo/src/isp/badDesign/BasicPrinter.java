package isp.badDesign;

public class BasicPrinter implements OfficeMachine {

    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Scanning not supported");
    }

    @Override
    public void fax(String document) {
        throw new UnsupportedOperationException("Fax not supported");
    }
}
