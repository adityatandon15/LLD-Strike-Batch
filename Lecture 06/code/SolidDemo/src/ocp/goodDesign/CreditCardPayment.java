package ocp.goodDesign;

import java.math.BigDecimal;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(BigDecimal amount) {

        System.out.println("Processing credit card payment: "
                 + amount);
    }
}
