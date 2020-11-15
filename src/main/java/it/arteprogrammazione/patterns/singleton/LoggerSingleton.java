package it.arteprogrammazione.patterns.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerSingleton {

    private static final Logger logger = LoggerFactory.getLogger("it.arteprogrammazione.patterns");

    private static LoggerSingleton instance;

    private LoggerSingleton() {
    }

    public static LoggerSingleton getInstance() {
        if (instance != null)
            return instance;
        instance = new LoggerSingleton();
        return instance;
    }

    public void debug(String message, Class clazz) {
        System.out.println("Class: " + clazz.getCanonicalName() + " - Message: " + message);
    }

    public void error(String message, Class clazz) {
        System.err.println("Class: " + clazz.getCanonicalName() + " - Message: " + message);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
