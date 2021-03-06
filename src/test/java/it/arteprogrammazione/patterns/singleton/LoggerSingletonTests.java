package it.arteprogrammazione.patterns.singleton;



import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LoggerSingletonTests {

    private final LoggerSingleton logger1 = LoggerSingleton.getInstance();

    @Test
    public void testDebugSingletonLogger() {
        LoggerSingleton logger2 = LoggerSingleton.getInstance();
        logger1.debug("Logger 1 = " + logger1, this.getClass());
        logger2.debug("Logger 2 = " + logger2, this.getClass());
        logger1.debug("Logger 1 = " + logger1.hashCode(), this.getClass());
        logger2.debug("Logger 2 = " + logger2.hashCode(), this.getClass());
        assertEquals(logger1.hashCode(), logger2.hashCode());
    }

    @Test
    public void testErrSingletonLogger() {
        LoggerSingleton logger2 = LoggerSingleton.getInstance();
        logger1.error("Logger 1 = " + logger1, this.getClass());
        logger2.error("Logger 2 = " + logger2, this.getClass());
        logger1.error("Logger 1 = " + logger1.hashCode(), this.getClass());
        logger2.error("Logger 2 = " + logger2.hashCode(), this.getClass());
        assertEquals(logger1.hashCode(), logger2.hashCode());
    }

}