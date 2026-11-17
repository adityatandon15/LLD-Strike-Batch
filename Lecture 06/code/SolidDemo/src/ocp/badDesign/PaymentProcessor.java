package ocp.badDesign;

public class PaymentProcessor {

    public void processPayment(String paymentType, double amount) {

        if (paymentType.equals("CREDIT_CARD")) {
            System.out.println("Processing credit card payment");

        } else if (paymentType.equals("UPI")) {
            System.out.println("Processing UPI payment");
        }
        else if(paymentType.equals("WALLET")) {

        }
    }
}
