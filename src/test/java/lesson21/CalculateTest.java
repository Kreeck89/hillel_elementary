package lesson21;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    private Calculate calculate;

    @BeforeEach
    void setUp() {
        calculate = new Calculate();
    }

    @Test
    void calculate() {
        int result = calculate.calculate(10, 20);
        assertEquals(30, result);
    }

    @Test
    void calculateWithDouble() {
        int result = calculate.calculateWithDouble(10, 20);
        assertEquals(60, result);
    }

    @Test
    void calculateWithDoubleWithFirstIsZero() {
        int result = calculate.calculateWithDouble(0, 20);
        assertEquals(40, result);
    }

    @Test
    void calculateWithDoubleWithSecondIsZero() {
        int result = calculate.calculateWithDouble(10, 0);
        assertEquals(20, result);
    }
}
