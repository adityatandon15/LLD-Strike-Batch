package goodDesign;

import java.util.HashMap;
import java.util.Map;

public class InMemoryOrderRepository implements OrderRepository {

    private final Map<Integer, Order> orders = new HashMap<>();
    private int nextId = 1;

    public Order save(double total, String email) {

        Order order = new Order(nextId++, total, email);

        orders.put(order.getId(), order);

        System.out.println("Order saved: " + order.getId());

        return order;
    }

    public Order find(int id) {
        return orders.get(id);
    }
}
