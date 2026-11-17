package srp.goodDesign;

import java.math.BigDecimal;

public class InvoiceEmailSender {

    public void send(Invoice invoice, BigDecimal total) {

        System.out.println("Sending invoice of " + total
                        + " to " + invoice.getCustomerEmail());
    }
}
