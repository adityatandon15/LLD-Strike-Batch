package goodDesign;

class Flat100Discount implements DiscountPolicy {

    public boolean supports(String couponCode) {
        return "FLAT100".equals(couponCode);
    }

    public double calculateDiscount(double subtotal) {
        return 100;
    }
}