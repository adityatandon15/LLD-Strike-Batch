package simpleFactory.client;

import simpleFactory.ButtonFactory;
import simpleFactory.product.Button;

public class SettingsScreen {

    public void render(String os) {

        Button button = ButtonFactory.createButton(os);
        button.render();
    }
}
