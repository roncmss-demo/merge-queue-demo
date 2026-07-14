package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DoublerTest {

    @Test
    void doublesANumber() {
        assertEquals(10, new Doubler().doubleIt(5));
    }
}
