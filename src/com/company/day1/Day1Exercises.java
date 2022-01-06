package com.company.day1;

import java.util.Scanner;

public class Day1Exercises {

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
        double fahrenheit = ((celsius*9)/5)+32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }

    static void FahrenheitToCelsius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit-32)*5/9;
        System.out.println("The temperature in Celsius is: " + celsius);
    }


    //Method for Distance Conversion (inch to centimeter)
    static void InchToCent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in inches:");
        double inches = sc.nextDouble();
        double centimeter = inches * 2.54;
        System.out.println("The distance in centimeters is: " + centimeter);
    }

    static void CentToInch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in centimeters:");
        double centimeters = sc.nextDouble();
        double inches = centimeters/2.54;
        System.out.println("The distance in centimeters is: " + inches);
    }

    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        //Main Menu
        System.out.println("Choose your option:");
        System.out.println("1. Calculate Triangle Area and Perimeter");
        System.out.println("2. Calculate Rectangle Area and Perimeter");
        System.out.println("3. Calculate Circle Area and Perimeter");
        System.out.println("4. Celsius to Fahrenheit Conversion");
        System.out.println("5. Fahrenheit to Celsius Conversion");
        System.out.println("6. Inches to Centimeter Conversion");
        System.out.println("7. Centimeter to Inches Conversion");
        System.out.println("Enter option (1-7): ");
        option = sc.nextInt();

        if(option == 1){
            TriangleAreaPerimeter();
        } else if(option == 2) {
            RectangleAreaPerimeter();
        } else if(option == 3) {
            CircleAreaPerimeter();
        } else if(option == 4) {
            CelsiusToFahrenheit();
        } else if(option == 5) {
            FahrenheitToCelsius();
        } else if(option == 6) {
            InchToCent();
        } else if(option == 7) {
            CentToInch();
        } else {
            System.out.println("Not an option, please try again.");
        }
    }
}
