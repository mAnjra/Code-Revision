package mooc;

import mooc.logic.ApplicationLogic;
import mooc.ui.TextUserInterface;
import mooc.ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface(); // We load up TextUserInterfaces update method into interface variable reference ui
        new ApplicationLogic(ui).execute(3);
    }
}
