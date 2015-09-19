package com.twu.baselineproblem;

public class GameOfLife {
    public static void main(String[] args) {
        Console console = new Console();
        Converter converter = new Converter();
        Application application = new Application(console, converter);
        application.start();
    }
}
