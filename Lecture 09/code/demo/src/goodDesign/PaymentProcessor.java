package goodDesign;

public interface PaymentProcessor {

    String method();

    void pay(String paymentDetails, double amount);

}
