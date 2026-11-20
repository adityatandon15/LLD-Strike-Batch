package goodDesign;

public interface OrderRepository {

    Order save(double total, String email);

    Order find(int id);
}
