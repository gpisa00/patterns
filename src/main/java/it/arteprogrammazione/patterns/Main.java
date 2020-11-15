package it.arteprogrammazione.patterns;

import it.arteprogrammazione.patterns.singleton.example.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator.sum(2, 3);
        Calculator.diff(2, 3);
    }
}
