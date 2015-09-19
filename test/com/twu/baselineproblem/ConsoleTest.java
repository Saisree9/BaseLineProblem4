package com.twu.baselineproblem;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ConsoleTest {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Test
    public void shouldDisplayTheGivenStringInputToDisplay() {
        System.setOut(new PrintStream(output));
        Console display = new Console();
        display.display("WELCOME");

        assertEquals("WELCOME", output.toString());
    }
}


