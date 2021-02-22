package com.company;

import java.awt.*;
import java.util.Arrays;

public class Figure {

    MyPoint[] points;
    private String title;

    @Override
    public String toString() {
        return "Figure{" +
                "points=" + Arrays.toString(points) +
                ", title='" + title + '\'' +
                '}';
    }

    public Figure(String title, MyPoint ... points) {
        this.points = points;
        this.title = title;
    }

    public static double calcSide(MyPoint p1, MyPoint p2)
    {
        return Math.sqrt(Math.pow(p1.getX()- p2.getX(),2) +Math.pow(p1.getY()- p2.getY(),2));
    }

    public double calcPerimeter()
    {
        double perimeter=0;

        for (int i = 0; i < points.length; i++) {
          perimeter+=calcSide(points[i], points[(i+1)%points.length]);
        }
        return perimeter;
    }

}
