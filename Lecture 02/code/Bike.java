class Bike extends Vehicle {

    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Bike engine started");
    }
}