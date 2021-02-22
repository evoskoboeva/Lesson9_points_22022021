package com.company;

public class Main {

    public static void main(String[] args) {
    Figure figure = new Figure("TR", new MyPoint(1,2,"M"), new MyPoint(2,2,"K"), new MyPoint(6,3,"O"));
        System.out.println(Figure.calcSide(figure.points[0], figure.points[2]));
        System.out.println(figure.calcPerimeter());
    }
}
