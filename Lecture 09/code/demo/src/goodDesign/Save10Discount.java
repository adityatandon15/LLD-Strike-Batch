package goodDesign;

class Save10Discount implements DiscountPolicy {

    public boolean supports(String couponCode) {
        return "SAVE10".equals(couponCode);
    }

    public double calculateDiscount(double subtotal) {
        return subtotal * 0.10;
    }
}
