package simpleFactory;

import simpleFactory.product.Button;
import simpleFactory.product.LinuxButton;
import simpleFactory.product.MacButton;
import simpleFactory.product.WindowsButton;

public class ButtonFactory {

    public static Button createButton(String os) {

        if ("Windows".equalsIgnoreCase(os)) {
            return new WindowsButton();
        }
        else if ("Mac".equalsIgnoreCase(os)) {
            return new MacButton();
        }
        else if ("Linux".equalsIgnoreCase(os)) {
            return new LinuxButton();
        }

        throw new IllegalArgumentException("Unsupported OS: " + os);
    }
}
