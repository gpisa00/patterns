package it.arteprogrammazione.patterns.singleton;

import org.junit.jupiter.api.Test;

public class LoggingTests {

    @Test
    void testError(){
        Logging l = new Logging();
        l.debug();
    }
}
