package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NegatorTest {

    @Test
    void negatesANumber() {
        assertEquals(-5, new Negator().negate(5));
    }
}
