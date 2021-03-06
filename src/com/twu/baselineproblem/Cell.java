package com.twu.baselineproblem;

//cell has state which defines ,is it alive or dead
public class Cell {
    private Character state;

    public Cell(char state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;

        Cell thatCell = (Cell) that;

        return this.state.equals(thatCell.state);
    }

    @Override
    public int hashCode() {
        return state != null ? state.hashCode() : 0;
    }

    public boolean hasValidState() {
        return this.state == 'X' || this.state == '-';
    }
}
