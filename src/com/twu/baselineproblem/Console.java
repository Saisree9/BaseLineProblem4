package com.twu.baselineproblem;

import java.util.Objects;
import java.util.Scanner;

//Console display the output and get input from the user
public class Console {
    private String string1 = "";

    public void display(String input) {
        System.out.print(input);
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);

        String string;
        while (!Objects.equals(string = scanner.next(), "!")) {
            string1 += string;
            string1 += "\n";
        }
        return string1;
    }
}
