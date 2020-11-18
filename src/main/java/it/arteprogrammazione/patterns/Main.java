package it.arteprogrammazione.patterns;

import it.arteprogrammazione.patterns.singleton.example.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(2, 3);
        calculator.diff(2, 3);
    }
}
