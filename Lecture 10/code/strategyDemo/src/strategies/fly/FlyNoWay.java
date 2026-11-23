package strategies.fly;

public class FlyNoWay implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Cannot fly!");
    }
}
