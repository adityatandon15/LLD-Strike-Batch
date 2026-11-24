package factoryMethod.dialog;

import factoryMethod.product.AndroidButton;
import factoryMethod.product.Button;

public class AndroidDialog extends Dialog {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
