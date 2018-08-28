package com.thoughtworks.tw101.exercises.exercise2;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AccumulatorTest {

    // I'm not sure if this is the best way to unit test SysOut, but this way seemed best from the resources I found
    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Test
    public void increment() {
        System.setOut(new PrintStream(outStream));

        Accumulator accumulator = new Accumulator();

        accumulator.increment();
        accumulator.increment();
        accumulator.increment();
        accumulator.total();

        assertEquals("3\r\n", outStream.toString());
    }

    @Test
    public void total() {
        System.setOut(new PrintStream(outStream));

        Accumulator accumulator = new Accumulator();

        accumulator.increment();
        accumulator.total();

        assertEquals("1\r\n", outStream.toString());
    }
}