package badDesign;

import java.util.HashMap;
import java.util.Map;

class CheckoutService {

    private final Map<Integer, Order> orders = new HashMap<>();
    private int nextId = 1;

    public Order placeOrder(CheckoutRequest request) {

        if (request.getItems() == null || request.getItems().isEmpty()) {
            throw new IllegalArgumentException("Cart is empty");
        }

        // Step 1: Calculate subtotal
        double subtotal = 0;

        for (CartItem item : request.getItems()) {
            subtotal += item.getPrice() * item.getQuantity();
        }

        // Step 2: Apply discount
        double discount = 0;

        if ("SAVE10".equals(request.getCouponCode())) {
            discount = subtotal * 0.10;
        } else if ("FLAT100".equals(request.getCouponCode())) {
            discount = 100;
        }

        double total = Math.max(0, subtotal - discount);

        // Step 3: Process payment
        if ("CARD".equals(request.getPaymentMethod())) {

            if (request.getPaymentDetails() == null ||
                    !request.getPaymentDetails().startsWith("card_")) {
                throw new IllegalArgumentException("Invalid card token");
            }

            System.out.println("Charging card: " + total);

        } else if ("UPI".equals(request.getPaymentMethod())) {

            if (request.getPaymentDetails() == null ||
                    !request.getPaymentDetails().contains("@")) {
                throw new IllegalArgumentException("Invalid UPI ID");
            }

            System.out.println("Collecting UPI payment: " + total);

        } else {
            throw new IllegalArgumentException(
                    "Unsupported payment method"
            );
        }

        // Step 4: Save order
        Order order = new Order(nextId++, total, request.getEmail());
        orders.put(order.getId(), order);

        System.out.println("Order saved: " + order.getId());

        // Step 5: Send confirmation
        System.out.println("Sending confirmation email to: " + request.getEmail());

        return order;
    }

    public Order findOrder(int id) {
        return orders.get(id);
    }
}
