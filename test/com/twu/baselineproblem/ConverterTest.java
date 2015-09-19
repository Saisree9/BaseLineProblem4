package com.twu.baselineproblem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test
    public void shouldConvertStringToCharacterArray() {
        Converter converter = new Converter();
        Character[] array = converter.toCharacterArray("SAISREE");
        assertEquals("[S, A, I, S, R, E, E]", Arrays.toString(array));
    }

    @Test
    public void shouldReturnNullIfInputIsNull() {
        Converter converter = new Converter();
        Character[] array = converter.toCharacterArray(null);
        Character[] nullArray=null;
        assertEquals(Arrays.toString(nullArray), Arrays.toString(array));
    }
}