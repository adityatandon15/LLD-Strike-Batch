package dip.goodDesign;

public class EmailConfirmationSender implements OrderConfirmationSender {

    @Override
    public void sendConfirmation(Order order) {

        System.out.println("Sending email to: "
                + order.getCustomerEmail());

    }
}
