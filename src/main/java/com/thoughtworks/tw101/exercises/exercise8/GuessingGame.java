package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Random;

public class GuessingGame {
    private final int lowerBound, upperBound;
    private final int numberToGuess;
    private int playerLastGuess;
    private final InputParser inputParser;
    private ArrayList<Integer> guesses = new ArrayList<>();
    private boolean gameComplete = false;


    private static class RandomNumber {
        private static final Random random = new Random();

        // assumes both the lower and upper bounds are inclusive
        private static int generateRandom (int lowerBound, int upperBound) {
            return random.nextInt((upperBound - lowerBound) + 1) + lowerBound;
        }
    }

    public GuessingGame () {
        lowerBound = 1;
        upperBound = 100;
        numberToGuess = RandomNumber.generateRandom(lowerBound, upperBound);
        inputParser = new InputParser();
    }

    private int askPlayerForGuess () {
        boolean inputIsValid = false;
        int playerGuess = 0;
        while (!inputIsValid) {
            try {
                playerGuess = inputParser.getUserInput("Guess a number between " + lowerBound + " and " + upperBound + ":");
                inputIsValid = true;
                guesses.add(playerGuess);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number!");
            }
        }
        return playerGuess;
    }

    private String evaluateGuess (int guess) {
        if (guess == numberToGuess) {
            gameComplete = true;
            return "Correct!";
        }
        else if (guess > numberToGuess) {
            return "Too high, guess again!";
        }
        else {
            return "Too low, guess again!";
        }
    }

    public void playGame () {
        while (playerLastGuess != numberToGuess) {
            playerLastGuess = askPlayerForGuess();
            System.out.println(evaluateGuess(playerLastGuess));
            if (gameComplete) {
                System.out.println("\nPlayer Guesses:");
                for (int guess : guesses) {
                    System.out.println(guess);
                }
            }
        }

    }

}
