package com.twu.baselineproblem;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ApplicationTest {
    @Test
    public void shouldGetInputFromTheUser() {
        Console console = mock(Console.class);
        Application application = new Application(console);

        application.start();

        verify(console).getUserInput();
    }
}