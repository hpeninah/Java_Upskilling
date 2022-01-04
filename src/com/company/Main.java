package com.company;

import java.util.Scanner;

public class Main {

    //Method for finding area and perimeter of a triangle
    static void TriangleAreaPerimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the triangle:");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double height = sc.nextDouble();
        System.out.println("Enter the length of the triangle:");
        double length = sc.nextDouble();

        double area = (base * height)/2;
        System.out.println("The area of the triangle is: " + area);

        double perimeter = base + height + length;
        System.out.println("The perimeter of the triangle is: " + perimeter);
    }

    //Method for finding area and perimeter of rectangle
    static void RectangleAreaPerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle:");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the rectangle:");
        double height = sc.nextDouble();

        double area = base * height;
        System.out.println("The area of the rectangle is: " + area);

        double perimeter = (2*base) + (2*height);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

    //Method for finding area and perimeter of circle
    static void CircleAreaPerimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle:");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("The area of a circle is: " + area);

        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of a circle is: " + circumference);
    }

    //Method for Temperature Conversion
    static void CelsiusToFahrenheit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * (9/5)) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }

    static void FahrenheitToCelsius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * (5/9);
        System.out.println("The temperature in Celsius is: " + celsius);
    }


    //Method for Distance Conversion (inch to centimeter)

    public static void main(String[] args) {
        //TriangleAreaPerimeter();
        //RectangleAreaPerimeter();
        //CircleAreaPerimeter();
        //CelsiusToFahrenheit();
        FahrenheitToCelsius();
    }
}
