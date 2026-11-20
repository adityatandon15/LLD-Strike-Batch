package goodDesign;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentService {

    private final Map<String, PaymentProcessor> processors = new HashMap<>();

    public PaymentService(List<PaymentProcessor> availableProcessors) {

        for (PaymentProcessor processor : availableProcessors) {
            if (processors.put(processor.method(), processor) != null) {
                throw new IllegalArgumentException(
                        "Duplicate payment method: " + processor.method()
                );
            }
        }
    }

    public void processPayment(String method, String details,
                               double amount) {

        PaymentProcessor processor = processors.get(method);

        if (processor == null) {
            throw new IllegalArgumentException(
                    "Unsupported payment method"
            );
        }

        processor.pay(details, amount);
    }
}
