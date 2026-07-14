package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Passes on its own because Calculator.add exists on main.
 * If PR #9 (which renames add -> sum) is ahead in the merge queue,
 * this file no longer compiles -> the merge group build fails and this PR
 * (the culprit) is ejected from the queue.
 */
class LegacyAddTest {

    @Test
    void usesAdd() {
        assertEquals(5, new Calculator().add(2, 3));
    }
}
