package com.company.day3.Polygon;

public class Main {

    public static void main(String[] args){
        Polygon rectangle = new Rectangle(5,10);
        Polygon triangle = new Triangle(5,10);

        double rectArea = rectangle.getArea();
        double triArea = triangle.getArea();

        System.out.println("Rectangle Area is: " + rectArea);
        System.out.println("Triangle Area is: " + triArea);
    }
}
