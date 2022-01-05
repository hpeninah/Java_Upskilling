package com.company;

import com.company.beans.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        cal1.setNum1(5);
        cal1.setNum2(13);

        Calculator cal2 = new Calculator();
        cal2.setNum1(2);
        cal2.setNum2(4);

        int s1 = cal1.add();
        int s2 = cal2.add();

        System.out.println("The sum from calculator 1 is: " + s1);
        System.out.println("The sum from calculator 2 is: " + s2);
    }
}
