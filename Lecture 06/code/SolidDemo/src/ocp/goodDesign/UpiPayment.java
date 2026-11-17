package ocp.goodDesign;

import java.math.BigDecimal;

public class UpiPayment implements PaymentMethod {

    @Override
    public void pay(BigDecimal amount) {

        System.out.println("Processing UPI payment: " + amount);
    }
}
