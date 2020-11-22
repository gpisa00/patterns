package it.arteprogrammazione.patterns.singleton.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTests {

    @InjectMocks
    private Calculator calculator;

    @Mock
    private DatabaseService databaseService;

    @Test
    public void testSum() {
        int a = 2;
        int b = 3;
        assertEquals(calculator.sum(a, b), 5);
    }

    @Test
    public void testDiff() {
        when(databaseService.save()).thenReturn(false);
        int a = 2;
        int b = 3;
        assertEquals(calculator.diff(a, b), -1);
    }

    @Test
    public void testDiff2() {
        when(databaseService.save()).thenReturn(true);
        int a = 2;
        int b = 3;
        assertEquals(calculator.diff(a, b), -1);
    }

    @Test
    public void testMultiply() {
        int a = 2;
        int b = 3;
        assertEquals(calculator.multiply(a, b), 6);
    }
}
