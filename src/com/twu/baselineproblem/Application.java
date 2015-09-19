package com.twu.baselineproblem;


public class Application {
    Console console=new Console();

    public Application(Console console) {
        this.console = console;
    }

    public void start() {
        setup();
        String input=console.getUserInput();
    }

    private void setup() {
        Cell[][] twoDimensionalCells = new Cell[4][4];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                twoDimensionalCells[row][column] = new Cell('-');
            }
        }
    }
}
