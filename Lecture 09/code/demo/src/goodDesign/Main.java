package goodDesign;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Register the available discount policies.
        List<DiscountPolicy> discounts = Arrays.asList(
                new Save10Discount(),
                new Flat100Discount()
        );

        // Register the available payment processors.
        List<PaymentProcessor> payments = Arrays.asList(
                new CardPaymentProcessor(),
                new UpiPaymentProcessor()
        );

        OrderRepository orderRepository = new InMemoryOrderRepository();

        CheckoutService checkoutService = new CheckoutService(
                new SimplePriceCalculator(),
                new DiscountCalculator(discounts),
                new PaymentService(payments),
                orderRepository,
                new EmailNotifier()
        );

        List<CartItem> items = Arrays.asList(
                new CartItem("Keyboard", 1500, 1),
                new CartItem("Mouse", 700, 2)
        );

        // Original checkout: same result after all refactorings.
        CheckoutRequest firstRequest = new CheckoutRequest(
                items, "SAVE10", "UPI",
                "rahul@upi", "rahul@example.com"
        );

        Order firstOrder = checkoutService.placeOrder(firstRequest);

        System.out.println("Order placed: " + firstOrder.getId());
        System.out.println("Final amount: " + firstOrder.getTotal());

    }
}
