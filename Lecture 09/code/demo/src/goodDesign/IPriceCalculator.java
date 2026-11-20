package goodDesign;

import java.util.List;

public interface IPriceCalculator {

    double calculateSubtotal(List<CartItem> items);
}
