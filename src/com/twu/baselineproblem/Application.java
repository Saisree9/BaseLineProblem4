package com.twu.baselineproblem;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public void start() {
        Cell[][] twoDimensionalCells = new Cell[4][4];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                twoDimensionalCells[row][column] = new Cell('-');
            }
        }
    }
}
