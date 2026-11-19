package dip.goodDesign;

public class Main {

    public static void main(String[] args) {

        Order order = new Order("ORD-101",
                "customer@gmail.com",
                "9876543210"
        );

        OrderConfirmationSender sender = new SmsConfirmationSender();

        OrderService orderService = new OrderService(sender);

        orderService.placeOrder(order);
    }
}
