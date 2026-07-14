package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SquarerTest {

    @Test
    void squaresANumber() {
        assertEquals(16, new Squarer().square(4));
    }
}
