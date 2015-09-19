package com.twu.baselineproblem;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ApplicationTest {
    @Test
    public void shouldGetInputFromTheUser() {
        Console console = mock(Console.class);
        Converter converter = new Converter();
        Application application = new Application(console, converter);

        when(console.getUserInput()).thenReturn("XXX\n--X\n");

        application.start();

        verify(console).getUserInput();
    }

    @Test
    public void shouldConvertStringInputtoCharacterArrayAfterGettingInputFromUser() {
        Console console = mock(Console.class);
        Converter converter = mock(Converter.class);
        Application application = new Application(console, converter);

        when(console.getUserInput()).thenReturn("XXX\n--X\n");

        application.start();

        verify(converter).toCharacterArray("XXX");
        verify(converter).toCharacterArray("--X");
    }
}