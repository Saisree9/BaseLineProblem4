package com.twu.baselineproblem;

import java.util.Scanner;

//Console display the output and get input from the user
public class Console {
    public void display(String input) {
        System.out.print(input);
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
