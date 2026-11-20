package goodDesign;

public class MySqlOrderRepository implements OrderRepository {
    @Override
    public Order save(double total, String email) {

        System.out.println("Order saved to MySQL");

        return new Order(1, total, email);
    }

    @Override
    public Order find(int id) {
        return null;
    }
}
