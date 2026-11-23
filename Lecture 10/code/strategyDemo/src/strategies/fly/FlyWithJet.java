package strategies.fly;

public class FlyWithJet implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Flies using a jetpack!");
    }
}
