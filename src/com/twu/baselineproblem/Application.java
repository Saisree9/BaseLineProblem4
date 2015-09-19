package com.twu.baselineproblem;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public void start() {
        List<List<Cell>> twoDimensionalCells=new ArrayList<>();
        List<Cell> rowOneCells=new ArrayList<>();
        rowOneCells.add(new Cell('X'));
        rowOneCells.add(new Cell('X'));
        rowOneCells.add(new Cell('-'));
        rowOneCells.add(new Cell('X'));
        List<Cell> rowTwoCells=new ArrayList<>();
        rowTwoCells.add(new Cell('-'));
        rowTwoCells.add(new Cell('X'));
        rowTwoCells.add(new Cell('X'));
        rowTwoCells.add(new Cell('-'));
        twoDimensionalCells.add(rowOneCells);
        twoDimensionalCells.add(rowTwoCells);
        

    }
}
