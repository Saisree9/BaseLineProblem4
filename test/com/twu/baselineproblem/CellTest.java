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

    @Test
    public void shouldEqualToOtherCellOnlyWhenStateOfTheCellIsSame() {
        Cell cell1 = new Cell("Alive");
        Cell cell2 = new Cell("Alive");
        assertEquals(cell1, cell2);
    }

    @Test
    public void shouldNotEqualToOtherCellWhenStateOfTheCellIsNotSame() {
        Cell cell1 = new Cell("Alive");
        Cell cell2 = new Cell("Dead");
        assertNotEquals(cell1, cell2);
    }

    @Test
    public void shouldHaveEqualHashCodeOnlyStateIsEqual() {
        Cell cell1 = new Cell("Alive");
        Cell cell2 = new Cell("Alive");
        assertEquals(cell1.hashCode(), cell2.hashCode());
    }
}
