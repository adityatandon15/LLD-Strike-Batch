package dip.goodDesign;

public class OrderService {

    private final OrderConfirmationSender confirmationSender;

    public OrderService(OrderConfirmationSender confirmationSender) {
        this.confirmationSender = confirmationSender;
    }

    public void placeOrder(Order order) {

        System.out.println("Order placed: " + order.getOrderId());

        confirmationSender.sendConfirmation(order);
    }
}
