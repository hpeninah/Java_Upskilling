package com.company.day2;

import com.company.day2.beans.Calculator;

public class Main {

    public static void main(String[] args) {
        /*
        Commented out example for calculator
        Calculator calc = new Calculator();

        calc.setNum1(5);
        calc.setNum2(10);

        Calculator.brand = "Canon";

        Calculator calc2 = new Calculator();
        calc2.setNum1(6);
        calc2.setNum2(30);


        int s1 = calc.add();
        int s2 = calc2.add();

        System.out.println("Sum given by calculator1 with "+calc.getNum1()+" and "+calc.getNum2()+": " +s1 + " and the brand is "+Calculator.brand+ "");
        System.out.println("Sum given by calculator2 with "+calc2.getNum1()+" and "+calc2.getNum2()+": " +s2 + " and the brand is "+Calculator.brand+ "");
        */

        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setWidth(10);

        double area = rect.getArea();
        double perimeter = rect.getPerimeter();

        System.out.println("A rectangle with length " + rect.getLength() + " and width " + rect.getWidth() + " has an area of " + rect.getArea());
        System.out.println("A rectangle with length " + rect.getLength() + " and width " + rect.getWidth() + " has a perimeter of " + rect.getPerimeter());

    }
}
