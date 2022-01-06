package com.company.day2;

public class Rectangle {
    private double length;
    private double width;

    //Empty constructor
    public Rectangle() {}

    //Constructor for rectangle with variables
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Getters
    public double getLength(){
        return length;
    }

    public double getWidth() {
        return width;
    }

    //Setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //Getters for area and perimeter
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return(length*2)*(width*2);
    }
}
