package srp.goodDesign;

import java.math.BigDecimal;

public class Invoice {

    private final BigDecimal subtotal;
    private final String customerEmail;

    public Invoice(BigDecimal subtotal, String customerEmail) {
        this.subtotal = subtotal;
        this.customerEmail = customerEmail;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
