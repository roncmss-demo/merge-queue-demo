package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TriplerTest {

    @Test
    void triplesANumber() {
        assertEquals(12, new Tripler().triple(4));
    }
}
