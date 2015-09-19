package com.twu.baselineproblem;

public class Converter {
    public Character[] toCharacterArray(String string) {
        if (string == null) {
            return null;
        }
        int len = string.length();
        Character[] array = new Character[len];
        for (int index = 0; index < len; index++) {
            array[index] = string.charAt(index);
        }

        return array;
    }
}
