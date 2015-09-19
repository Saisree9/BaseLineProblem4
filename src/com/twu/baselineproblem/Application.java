package com.twu.baselineproblem;


public class Application {
    private Console console = new Console();
    private String[] splitInput;
    private Converter converter;

    public Application(Console console, Converter converter) {
        this.console = console;
        this.converter = converter;
    }

    public void start() {
        setup();
        String input = console.getUserInput();
        splitInput(input);
        for (String aSplitInput : splitInput) {
            converter.toCharacterArray(aSplitInput);
        }


    }

    private void splitInput(String input) {
        splitInput = input.split("\n");
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
