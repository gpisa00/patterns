package it.arteprogrammazione.patterns.singleton.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    private final static Logger logger = LoggerFactory.getLogger(Calculator.class);

    public final static int sum(int a, int b) {
        int result = a + b;
        logger.debug("SUM: "+ a +" + "+ b +" = " + result);
        return result;
    }

    public final static int diff(int a, int b) {
        int result = a - b;
        logger.debug("SUM: "+ a +" - "+ b +" = " + result);
        return result;
    }
}
