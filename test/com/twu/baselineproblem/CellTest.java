package com.twu.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class CellTest {
    @Test
    public void shouldEqualToItself() {
        Cell cell = new Cell('X');
        assertEquals(cell, cell);
    }

    @Test
    public void shouldNotEqualToNull() {
        Cell cell = new Cell('X');
        assertNotEquals(null, cell);
    }

    @Test
    public void shouldEqualToOtherCellOnlyWhenStateOfTheCellIsSame() {
        Cell cell1 = new Cell('X');
        Cell cell2 = new Cell('X');
        assertEquals(cell1, cell2);
    }

    @Test
    public void shouldNotEqualToOtherCellWhenStateOfTheCellIsNotSame() {
        Cell cell1 = new Cell('X');
        Cell cell2 = new Cell('-');
        assertNotEquals(cell1, cell2);
    }

    @Test
    public void shouldHaveEqualHashCodeOnlyStateIsEqual() {
        Cell cell1 = new Cell('X');
        Cell cell2 = new Cell('X');
        assertEquals(cell1.hashCode(), cell2.hashCode());
    }

    @Test
    public void shouldHasValidState() {
        Cell cell = new Cell('Y');
        assertFalse(cell.hasValidState());
    }

    @Test
    public void shouldHasStateAlive() {
        Cell cell = new Cell('X');
        assertTrue(cell.hasValidState());
    }

    @Test
    public void shouldHasStateDead() {
        Cell cell = new Cell('-');
        assertTrue(cell.hasValidState());
    }
}
