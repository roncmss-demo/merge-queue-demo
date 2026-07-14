package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void addsTwoNumbers() {
        assertEquals(5, calc.add(2, 3));
    }
}
