package it.arteprogrammazione.patterns.singleton;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LoggerTests {

    private static final Logger logger1 = LoggerFactory.getLogger(LoggerTests.class);

    @Test
    public void testNotSameLogger() {
        Logger logger2 = LoggerFactory.getLogger(LoggerSingletonTests.class);
        logger1.debug("Logger 1 = " + logger1.hashCode());
        logger2.debug("Logger 2 = " + logger2.hashCode());
        assertNotEquals(logger1.hashCode(), logger2.hashCode());
    }

    @Test
    public void testSameLogger() {
        Logger logger2 = LoggerFactory.getLogger(LoggerTests.class);
        logger1.debug("Logger 1 = " + logger1.hashCode());
        logger2.debug("Logger 2 = " + logger2.hashCode());
        assertEquals(logger1.hashCode(), logger2.hashCode());
    }

    @Test
    public void testNotSameLoggerByName() {
        Logger logger2 = LoggerFactory.getLogger("it.arteprogrammazione.patterns.singleton");
        logger1.debug("Logger 1 = " + logger1.hashCode());
        logger2.debug("Logger 2 = " + logger2.hashCode());
        assertNotEquals(logger1.hashCode(), logger2.hashCode());
    }

    @Test
    public void testSameLoggerByName() {
        Logger logger2 = LoggerFactory.getLogger("it.arteprogrammazione.patterns.singleton");
        Logger logger3 = LoggerFactory.getLogger("it.arteprogrammazione.patterns.singleton");
        logger1.debug("Logger 2 = " + logger2.hashCode());
        logger2.debug("Logger 3 = " + logger3.hashCode());
        assertEquals(logger2.hashCode(), logger3.hashCode());
    }

}