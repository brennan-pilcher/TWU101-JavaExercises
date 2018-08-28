package com.thoughtworks.tw101.exercises.exercise5;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleAveragerTest {

    @Test
    public void averageArea() {
        Rectangle[] rectangles = {
                new Rectangle(4, 5),
                new Rectangle(5, 5),
                new Rectangle(6, 5)
        };

        float average = new RectangleAverager().averageArea(rectangles);

        assertEquals(25.0f, average, 0.0f);

    }
}