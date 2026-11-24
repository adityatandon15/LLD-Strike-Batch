package factoryMethod.dialog;

import factoryMethod.product.Button;
import factoryMethod.product.MacButton;

public class MacDialog extends Dialog {

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
