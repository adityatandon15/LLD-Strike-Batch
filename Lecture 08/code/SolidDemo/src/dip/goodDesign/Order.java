package dip.goodDesign;

public class Order {

    private final String orderId;
    private final String customerEmail;
    private final String customerPhone;

    public Order(String orderId, String customerEmail, String customerPhone) {
        this.orderId = orderId;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }
}
