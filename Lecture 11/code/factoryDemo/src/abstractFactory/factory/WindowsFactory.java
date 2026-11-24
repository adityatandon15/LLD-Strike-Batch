package abstractFactory.factory;

import abstractFactory.product.Button;
import abstractFactory.product.Checkbox;
import abstractFactory.product.WindowsButton;
import abstractFactory.product.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
