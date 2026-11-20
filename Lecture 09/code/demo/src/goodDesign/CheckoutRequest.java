package goodDesign;

import java.util.List;

public class CheckoutRequest {

    private final List<CartItem> items;
    private final String couponCode;
    private final String paymentMethod;
    private final String paymentDetails;
    private final String email;

    public CheckoutRequest(
            List<CartItem> items,
            String couponCode,
            String paymentMethod,
            String paymentDetails,
            String email) {

        this.items = items;
        this.couponCode = couponCode;
        this.paymentMethod = paymentMethod;
        this.paymentDetails = paymentDetails;
        this.email = email;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public String getEmail() {
        return email;
    }
}
