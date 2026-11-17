package srp.goodDesign;

import java.math.BigDecimal;

public class InvoiceService {

    private final InvoiceCalculator calculator;
    private final InvoiceRepository repository;
    private final InvoiceEmailSender emailSender;

    public InvoiceService(InvoiceCalculator calculator,
                          InvoiceRepository repository,
                          InvoiceEmailSender emailSender) {

        this.calculator = calculator;
        this.repository = repository;
        this.emailSender = emailSender;
    }

    public void issueInvoice(Invoice invoice) {
        BigDecimal total = calculator.calculateTotal(invoice);
        repository.save(invoice, total);
        emailSender.send(invoice, total);
    }
}
