package srp.goodDesign;

import java.math.BigDecimal;

public class InvoiceRepository {

    public void save(Invoice invoice, BigDecimal total) {

        System.out.println("Saving invoice to MySQL with total: "
                + total);
    }
}
