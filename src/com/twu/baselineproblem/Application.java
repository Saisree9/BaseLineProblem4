package com.twu.baselineproblem;


//Starts the Game of life
public class Application {
    private Console console = new Console();
    private String[] splitInput;
    private Converter converter;
    private Cell[][] twoDimensionalCells = new Cell[4][4];
    private Character[][] characterArray = new Character[4][4];


    public Application(Console console, Converter converter) {
        this.console = console;
        this.converter = converter;
    }

    public void start() {
        setup();
        String input = console.getUserInput();
        splitInput(input);
        for (String aSplitInput : splitInput) {
            for (int i = 0; i < characterArray.length; i++) {
                characterArray[i] = converter.toCharacterArray(aSplitInput);
            }
        }
        addArraysToTwoDimensionalCells(characterArray);
        
    }


    private void addArraysToTwoDimensionalCells(Character[][] characterArray) {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                twoDimensionalCells[row][column] = new Cell(characterArray[row][column]);
            }
        }
    }

    private void splitInput(String input) {
        splitInput = input.split("\n");
    }

    private void setup() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                twoDimensionalCells[row][column] = new Cell('-');
            }
        }
    }

}
