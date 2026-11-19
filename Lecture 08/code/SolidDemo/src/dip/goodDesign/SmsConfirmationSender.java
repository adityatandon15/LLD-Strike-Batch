package dip.goodDesign;

public class SmsConfirmationSender implements OrderConfirmationSender {

    @Override
    public void sendConfirmation(Order order) {

        System.out.println("Sending SMS to: "
                + order.getCustomerPhone());
    }
}
