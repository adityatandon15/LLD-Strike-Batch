package goodDesign;

class Order {

    private final int id;
    private final double total;
    private final String email;

    public Order(int id, double total, String email) {
        this.id = id;
        this.total = total;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public String getEmail() {
        return email;
    }
}
