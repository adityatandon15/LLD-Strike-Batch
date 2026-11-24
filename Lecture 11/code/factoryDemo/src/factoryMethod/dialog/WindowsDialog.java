package factoryMethod.dialog;

import factoryMethod.product.Button;
import factoryMethod.product.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
