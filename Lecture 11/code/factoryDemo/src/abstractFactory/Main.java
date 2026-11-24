package abstractFactory;

import abstractFactory.factory.GUIFactory;
import abstractFactory.factory.LinuxFactory;
import abstractFactory.factory.MacFactory;
import abstractFactory.factory.WindowsFactory;

public class Main {

    public static void main(String[] args) {

        String os = "Mac";

        GUIFactory factory;

        if ("Windows".equalsIgnoreCase(os)) {
            factory = new WindowsFactory();
        }
        else if ("Mac".equalsIgnoreCase(os)) {
            factory = new MacFactory();
        }
        else if ("Linux".equalsIgnoreCase(os)) {
            factory = new LinuxFactory();
        }
        else {
            throw new IllegalArgumentException("Unsupported OS: " + os);
        }

        Application application = new Application(factory);
        application.renderUI();
    }
}
