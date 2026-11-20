package badDesign;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<CartItem> items = Arrays.asList(
                new CartItem("Keyboard", 1500, 1),
                new CartItem("Mouse", 700, 2)
        );

        CheckoutRequest request = new CheckoutRequest(
                items,
                "SAVE10",
                "UPI",
                "aditya@upi",
                "aditya@example.com"
        );

        CheckoutService checkoutService = new CheckoutService();

        Order order = checkoutService.placeOrder(request);

        System.out.println("Order placed: " + order.getId());
        System.out.println("Final amount: " + order.getTotal());
    }
}


