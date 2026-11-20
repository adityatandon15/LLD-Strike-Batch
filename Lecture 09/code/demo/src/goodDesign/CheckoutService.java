package goodDesign;

class CheckoutService {

    private final IPriceCalculator priceCalculator;
    private final DiscountCalculator discountCalculator;
    private final PaymentService paymentService;
    private final OrderRepository orderRepository;
    private final OrderNotifier orderNotifier;

    public CheckoutService(
            IPriceCalculator priceCalculator,
            DiscountCalculator discountCalculator,
            PaymentService paymentService,
            OrderRepository orderRepository,
            OrderNotifier orderNotifier) {

        this.priceCalculator = priceCalculator;
        this.discountCalculator = discountCalculator;
        this.paymentService = paymentService;
        this.orderRepository = orderRepository;
        this.orderNotifier = orderNotifier;
    }

    public Order placeOrder(CheckoutRequest request) {

        if (request == null ||
                request.getItems() == null ||
                request.getItems().isEmpty()) {
            throw new IllegalArgumentException("Cart is empty");
        }

        // 1. Calculate subtotal
        double subtotal = priceCalculator.calculateSubtotal(
                request.getItems()
        );

        // 2. Calculate discount
        double discount = discountCalculator.calculateDiscount(
                subtotal,
                request.getCouponCode()
        );

        double total = Math.max(0, subtotal - discount);

        // 3. Process payment
        paymentService.processPayment(
                request.getPaymentMethod(),
                request.getPaymentDetails(),
                total
        );

        // 4. Save the order
        Order order = orderRepository.save(
                total,
                request.getEmail()
        );

        // 5. Send confirmation
        orderNotifier.sendOrderConfirmation(order);

        return order;
    }

    public Order findOrder(int id) {
        return orderRepository.find(id);
    }
}
