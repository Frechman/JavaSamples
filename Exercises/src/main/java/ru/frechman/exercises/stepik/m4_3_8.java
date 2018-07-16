package ru.frechman.exercises.stepik;

import java.util.logging.*;

public class m4_3_8 {

    private static void configureLogging() {
        Logger LOGGER1 = Logger.getLogger("org.stepic.java.logging.ClassA");
        LOGGER1.setLevel(Level.ALL);
        Logger LOGGER2 = Logger.getLogger("org.stepic.java.logging.ClassB");
        LOGGER2.setLevel(Level.WARNING);

        Logger LOGGER3 = Logger.getLogger("org.stepic.java");
        LOGGER3.setLevel(Level.ALL);
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new XMLFormatter());
        LOGGER3.addHandler(consoleHandler);
        LOGGER3.setUseParentHandlers(false);
    }
}
