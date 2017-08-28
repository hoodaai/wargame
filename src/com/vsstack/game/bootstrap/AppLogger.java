package com.vsstack.game.bootstrap;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Wrapper class for Java logging. Adds logging handler.
 */
public class AppLogger {

    private static Logger LOGGER;

    public static Logger getLogger(String name) {
        LOGGER = Logger.getLogger(name);

        Handler fileHandler = null;
        try {
            fileHandler = new FileHandler("output.log");

        } catch (IOException e) {
            e.printStackTrace();
        }

        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        LOGGER.addHandler(fileHandler);

        return LOGGER;
    }
}
