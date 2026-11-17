package srp.goodDesign;

import java.math.BigDecimal;

public class InvoiceCalculator {

    public BigDecimal calculateTotal(Invoice invoice) {

        BigDecimal taxRate = new BigDecimal("0.18");

        BigDecimal tax = invoice.getSubtotal()
                .multiply(taxRate);

        return invoice.getSubtotal().add(tax);
    }
}
