package com.thoughtworks.tw101.exercises.exercise6;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class OrcTest {

    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Test
    public void takeDamage() {
        System.setOut(new PrintStream(outStream));
        Orc orc = new Orc(); // starts with 20hp

        orc.takeDamage(10);

        orc.reportStatus();

        assertEquals("Orc 10\r\n", outStream.toString());
    }

    @Test
    public void reportStatus() {
        System.setOut(new PrintStream(outStream));
        Orc orc = new Orc(); // starts with 20hp

        orc.reportStatus();

        assertEquals("Orc 20\r\n", outStream.toString());
    }
}