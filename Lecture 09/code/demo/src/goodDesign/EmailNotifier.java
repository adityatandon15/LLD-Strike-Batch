package goodDesign;

public class EmailNotifier implements OrderNotifier {

    public void sendOrderConfirmation(Order order) {

        System.out.println("Sending confirmation email to: " +
                order.getEmail());

    }
}
