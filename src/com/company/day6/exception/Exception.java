package com.company.day6.exception;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = sc.nextInt();

        System.out.println("Enter the second value: ");
        int b = sc.nextInt();

        try{
            int c = a / b;
            System.out.println("The result is " + c);
        } catch(ArithmeticException arithmeticException) {
            System.out.println("Not possible to divide " + arithmeticException);
        }
    }
}
