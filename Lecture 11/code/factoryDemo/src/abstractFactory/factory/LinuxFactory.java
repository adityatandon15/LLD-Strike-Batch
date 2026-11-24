package abstractFactory.factory;

import abstractFactory.product.Button;
import abstractFactory.product.Checkbox;
import abstractFactory.product.LinuxButton;
import abstractFactory.product.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
