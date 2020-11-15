package it.arteprogrammazione.patterns.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {

    private final static Logger logger = LoggerFactory.getLogger(Logging.class);

    public void debug() {
        logger.debug("TEST LOGGING");
    }

}
