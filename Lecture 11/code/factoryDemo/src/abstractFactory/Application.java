package abstractFactory;

import abstractFactory.factory.GUIFactory;
import abstractFactory.product.Button;
import abstractFactory.product.Checkbox;

public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }
}
