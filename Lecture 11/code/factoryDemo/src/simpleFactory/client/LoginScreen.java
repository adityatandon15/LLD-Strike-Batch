package simpleFactory.client;

import simpleFactory.ButtonFactory;
import simpleFactory.product.Button;

public class LoginScreen {

    public void render(String os) {

        // login screen render code....

        Button button = ButtonFactory.createButton(os);
        button.render();
    }
}
