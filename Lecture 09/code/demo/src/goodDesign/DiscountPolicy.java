package goodDesign;

public interface DiscountPolicy {

    boolean supports(String couponCode);

    double calculateDiscount(double subtotal);
}
