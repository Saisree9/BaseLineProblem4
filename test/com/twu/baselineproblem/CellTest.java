package com.twu.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CellTest {
    @Test
    public void shouldEqualToItself() {
        Cell cell = new Cell("Alive");
        assertEquals(cell, cell);
    }

    @Test
    public void shouldNotEqualToNull() {
        Cell cell = new Cell("Alive");
        assertNotEquals(null, cell);
    }
}
