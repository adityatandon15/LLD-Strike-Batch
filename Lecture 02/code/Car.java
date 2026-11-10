class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Car engine started");
    }
}