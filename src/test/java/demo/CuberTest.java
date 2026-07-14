package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CuberTest {

    @Test
    void cubesANumber() {
        assertEquals(27, new Cuber().cube(3));
    }
}
