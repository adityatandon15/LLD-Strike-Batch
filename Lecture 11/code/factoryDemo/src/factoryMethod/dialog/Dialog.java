package factoryMethod.dialog;

import factoryMethod.product.Button;

public abstract class Dialog {

    public void render() {

        System.out.println("Initializing Dialog");

        Button button = createButton();
        button.render();

        System.out.println("Displaying Dialog");
    }

    public abstract Button createButton();
}
