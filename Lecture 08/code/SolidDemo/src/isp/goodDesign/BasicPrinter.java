package isp.goodDesign;

public class BasicPrinter implements Printable {

    @Override
    public void print(String document) {

        System.out.println("Printing: " + document);
    }
}
