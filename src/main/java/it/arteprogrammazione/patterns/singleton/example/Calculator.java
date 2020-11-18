package it.arteprogrammazione.patterns.singleton.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    private final static Logger logger = LoggerFactory.getLogger(Calculator.class);
    private DatabaseService databaseService = new DatabaseService();


    public  int sum(int a, int b) {
        int result = a + b;
        logger.debug("SUM: "+ a +" + "+ b +" = " + result);
        return result;
    }

    public int diff(int a, int b) {
        int result = a - b;
        logger.debug("SUM: "+ a +" - "+ b +" = " + result);

        if (databaseService.save())
            logger.debug("Result salvato");
        else
            logger.debug("Result non salvato");

        return result;
    }
}
