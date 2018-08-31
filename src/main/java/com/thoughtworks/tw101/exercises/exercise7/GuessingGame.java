package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

public class GuessingGame {
    private final int lowerBound, upperBound;
    private final int numberToGuess;
    private int playerLastGuess;
    private final InputParser inputParser;


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
        int playerGuess = inputParser.getUserInput("Guess a number between " + lowerBound + " and " + upperBound + ":");
        return playerGuess;
    }

    private String evaluateGuess (int guess) {
        if (guess == numberToGuess) {
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
        }

    }

}
