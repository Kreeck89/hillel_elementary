package lesson22.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class CalculatorServiceImplTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorServiceImpl();
    }

    @Test
    void sum() {
        int sum = calculatorService.sum(10, 20);
        assertEquals(30, sum);
    }

    @Test
    void sumWithMinusParam() {
        int sum = calculatorService.sum(-10, -12);
        assertEquals(-22, sum);
    }

    @Test
    void difference() {
        int difference = calculatorService.difference(10, 15);
        assertEquals(-5, difference);
    }

    @Test
    void multiplication() {
        int multiplication = calculatorService.multiplication(100, 0);
        assertEquals(0, multiplication);
    }

    @Test
    void division() {
        int division = calculatorService.division(10, 2);
        assertEquals(5, division);
    }

    @Test
    void divisionToZero() {
        assertThrows(ArithmeticException.class, () -> calculatorService.division(10, 0), "division by zero");
    }
}
