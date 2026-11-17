package ocp;

import ocp.badDesign.PaymentProcessor;
import ocp.goodDesign.PaymentMethod;
import ocp.goodDesign.UpiPayment;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//        PaymentProcessor paymentProcessor =
//                new PaymentProcessor();
//        paymentProcessor.processPayment("CREDIT_CARD", 100);


        // Good Design .......................

        ocp.goodDesign.PaymentProcessor processor = new ocp.goodDesign.PaymentProcessor();

        PaymentMethod paymentMethod = new UpiPayment();

        processor.processPayment(paymentMethod, new BigDecimal("1000.00"));

    }
}

