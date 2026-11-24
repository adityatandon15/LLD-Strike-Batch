package abstractFactory.factory;

import abstractFactory.product.Button;
import abstractFactory.product.Checkbox;
import abstractFactory.product.MacButton;
import abstractFactory.product.MacCheckbox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
