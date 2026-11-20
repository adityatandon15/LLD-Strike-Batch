package goodDesign;

import java.util.ArrayList;
import java.util.List;

class DiscountCalculator {

    private final List<DiscountPolicy> policies;

    public DiscountCalculator(List<DiscountPolicy> policies) {
        this.policies = new ArrayList<>(policies);
    }

    public double calculateDiscount(double subtotal,
                                    String couponCode) {

        for (DiscountPolicy policy : policies) {

            if (policy.supports(couponCode)) {
                return policy.calculateDiscount(subtotal);
            }
        }

        return 0;
    }
}