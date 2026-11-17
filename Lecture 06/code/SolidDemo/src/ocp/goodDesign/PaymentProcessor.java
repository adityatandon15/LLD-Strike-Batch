package ocp.goodDesign;

import java.math.BigDecimal;

public class PaymentProcessor {

    public void processPayment(PaymentMethod paymentMethod,
                               BigDecimal amount) {

        paymentMethod.pay(amount);
    }
}
