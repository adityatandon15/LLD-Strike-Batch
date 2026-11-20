package goodDesign;

import java.util.List;

public class SimplePriceCalculator implements IPriceCalculator {

    public double calculateSubtotal(List<CartItem> items) {
        double subtotal = 0;

        for (CartItem item : items) {
            subtotal += item.getPrice() * item.getQuantity();
        }

        return subtotal;
    }
}
