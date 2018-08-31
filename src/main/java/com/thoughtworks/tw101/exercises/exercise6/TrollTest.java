package com.thoughtworks.tw101.exercises.exercise6;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TrollTest {

    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Test
    public void takeDamage() {
        System.setOut(new PrintStream(outStream));
        Troll troll = new Troll(); // starts with 40hp

        troll.takeDamage(20); // trolls take half damage, so...

        troll.reportStatus();

        assertEquals("Troll 30\r\n", outStream.toString());
    }

    @Test
    public void reportStatus() {
        System.setOut(new PrintStream(outStream));
        Troll troll = new Troll(); // starts with 40hp

        troll.reportStatus();

        assertEquals("Troll 40\r\n", outStream.toString());
    }
}