package com.company.beans;

public class Calculator {
    int num1;
    int num2;

    public void setNum1(int arg) {
        if (arg < 5) {
            num1 = 5;
            return;
        }
        if (arg > 20) {
            num1 = 20;
            return;
        }
        num1 = arg;
    }

    public void setNum2(int arg) {
        if (arg < 5) {
            num2 = 5;
            return;
        }
        if (arg > 20) {
            num2 = 20;
            return;
        }
        num2 = arg;
    }

    public int add() {
        int sum ;
        sum = num1 + num2;
        return sum;
    }

    public int subtract() {
        int diff ;
        if(num1 > num2) {
            diff = num1 - num2;
        }
        else {
            diff = num2 - num1;
        }
        return diff;
    }

    public int multiply() {
        int product ;
        product = num1*num2;
        return product;
    }

    public int divide() {
        int quotient ;
        if(num1 > num2) {
           quotient = num1 - num2;
        }
        else {
            quotient = num2 - num1;
        }
        return quotient;
    }

}
