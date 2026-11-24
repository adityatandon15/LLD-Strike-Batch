package simpleFactory;

import simpleFactory.client.LoginScreen;
import simpleFactory.client.SettingsScreen;

public class Main {

    public static void main(String[] args) {

        String os = "Mac";

        LoginScreen loginScreen = new LoginScreen();
        loginScreen.render(os);

        SettingsScreen settingsScreen = new SettingsScreen();
        settingsScreen.render(os);
    }
}
