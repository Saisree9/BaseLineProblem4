package com.twu.baselineproblem;

//cell has state which defines ,is it alive or dead
public class Cell {
    String state;

    public Cell(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object that) {
        return this == that;
    }
    
}
