package com.company.day6.unitTest.beans;

import lombok.Data;

public class Calc {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        return (double)a/b;
    }
}
