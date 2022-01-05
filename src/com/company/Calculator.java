package com.company;

public class Calculator {
    int num1;
    int num2;
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
