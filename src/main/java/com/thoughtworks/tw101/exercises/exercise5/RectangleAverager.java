package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float totalArea = 0.0f;
        for (Rectangle rect : rectangles) {
            totalArea += rect.area();
        }
        // totalArea is a float so that the returned value of the below expression
        // is implicitly cast to float in order to avoid rounding errors
        return totalArea / rectangles.length;
    }
}
