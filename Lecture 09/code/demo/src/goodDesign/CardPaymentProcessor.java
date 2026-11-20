package goodDesign;

public class CardPaymentProcessor implements PaymentProcessor {

    public String method() {
        return "CARD";
    }

    public void pay(String details, double amount) {

        if (details == null ||
                !details.startsWith("card_")) {

            throw new IllegalArgumentException(
                    "Invalid card token"
            );
        }

        System.out.println("Charging card: " + amount);
    }
}
