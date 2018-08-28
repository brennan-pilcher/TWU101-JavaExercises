package com.thoughtworks.tw101.exercises.exercise3;

import org.junit.Test;
import static org.junit.Assert.*;

public class OddSumTest {

    @Test
    public void of() {
        OddSum oddSum = new OddSum();

        assertEquals(25,oddSum.of(1,10));
    }
}