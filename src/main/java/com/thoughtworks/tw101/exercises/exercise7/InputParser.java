package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class InputParser {
    Scanner inputReader;

    public InputParser () {
        inputReader = new Scanner(System.in);
    }

    public int getUserInput (String promptForUser) {
        System.out.println(promptForUser);
        return Integer.parseInt(inputReader.next());
    }

}
