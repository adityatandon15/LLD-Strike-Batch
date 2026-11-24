package factoryMethod.product;

public class AndroidButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering Android Button");
    }
}
