package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Passes on its own because Calculator.multiply exists on main.
 * If PR #6 (which renames multiply -> product) is ahead in the merge queue,
 * this file no longer compiles -> the merge group build fails.
 */
class MultiplyUsageTest {

    @Test
    void usesMultiply() {
        assertEquals(6, new Calculator().multiply(2, 3));
    }
}
