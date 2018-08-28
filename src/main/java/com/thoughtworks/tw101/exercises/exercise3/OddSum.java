package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        // I made the assumption that 'start' and 'end' are inclusive
        int sum = 0;
        for (int i = start; i < end+1; i++) {
            if (i%2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
