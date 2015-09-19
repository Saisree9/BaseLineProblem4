package com.twu.baselineproblem;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ConsoleTest {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("something\nSome\n!".getBytes());

    @Test
    public void shouldDisplayTheGivenStringInputToDisplay() {
        System.setOut(new PrintStream(output));
        Console display = new Console();
        display.display("WELCOME");

        assertEquals("WELCOME", output.toString());
    }

    @Test
    public void shouldReadInputFromUser() {
        System.setIn(inputStream);
        Console input = new Console();
        assertEquals("something\nSome\n", input.getUserInput());
    }
}


