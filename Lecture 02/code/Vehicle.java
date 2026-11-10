abstract class Vehicle implements Drivable {

    private final String brand;
    private int speed;

    public Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void accelerate(int amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException();
        }

        speed += amount;
    }

    @Override
    public void brake(int amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException();
        }

        speed = Math.max(0, speed - amount);
    }

    // start() remains abstract through Drivable
}