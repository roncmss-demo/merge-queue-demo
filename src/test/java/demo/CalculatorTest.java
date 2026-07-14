package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void addsTwoNumbers() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void multipliesTwoNumbers() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void subtractsTwoNumbers() {
        assertEquals(1, calc.subtract(3, 2));
    }
}
