package com.thoughtworks.tw101.exercises.exercise5;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void area() {
        Rectangle rectangle = new Rectangle(5, 6);
        assertEquals(30, rectangle.area());
    }
}