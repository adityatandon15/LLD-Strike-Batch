package goodDesign;

public class UpiPaymentProcessor implements PaymentProcessor {

    public String method() {
        return "UPI";
    }

    public void pay(String details, double amount) {

        if (details == null ||
                !details.contains("@")) {

            throw new IllegalArgumentException(
                    "Invalid UPI ID"
            );
        }

        System.out.println(
                "Collecting UPI payment: " + amount
        );
    }
}
