package it.arteprogrammazione.patterns.singleton.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    @Test
    void testSum() {
        int a = 2;
        int b = 3;
        assertEquals(Calculator.sum(a, b), 5);
    }

    @Test
    void testDiff() {
        int a = 2;
        int b = 3;
        assertEquals(Calculator.diff(a, b), -1);
    }
}
