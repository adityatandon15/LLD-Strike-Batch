package factoryMethod;

import factoryMethod.dialog.AndroidDialog;
import factoryMethod.dialog.Dialog;
import factoryMethod.dialog.MacDialog;
import factoryMethod.dialog.WindowsDialog;

public class Main {

    public static void main(String[] args) {

        Dialog dialog = new WindowsDialog();
        dialog.render();

        System.out.println("------------------");

        dialog = new MacDialog();
        dialog.render();

        System.out.println("------------------");

        // New platform added without modifying the
        // existing creators.
        dialog = new AndroidDialog();
        dialog.render();
    }
}
