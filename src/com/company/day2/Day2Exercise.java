package com.company.day2;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Day2Exercise {

    //Method to find greatest of 3 given numbers using if...else
    static void GreatestOf3() {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();

        if(a >= b && a >= c) {
            System.out.println(a + " is the greatest number.");
        }
        else if(b>=a && b>=c) {
            System.out.println(b + " is the greatest number.");
        }
        else {
            System.out.println(c + " is the greatest number.");
        }
    }

    //Method for while loop with rate of interest in loan and EMI
    static void LoanEmiInterest() {
        int loan = 10000;
        int emi = 1000;
        int noemis = 0;
        double interestRate = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interest rate in decimal form (ex. (0.12)): ");
        interestRate = sc.nextDouble();

        while( loan > 0 ) {
            loan += ((interestRate/100) * loan) - emi;
            noemis ++;
            System.out.println("Paying "+emi+" of the installment "+noemis+"");
            System.out.println("Remaining payment: " + loan);
        }

        System.out.println("You are free from the loan after "+noemis+" installments are paid.");
    }

    //Method to display numbers from 1 to n (even or odd)
    static void EvenOrOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to count to: ");

        int n = sc.nextInt();
        System.out.println("Numbers are: ");
        for(int i=1; i <=n; i++) {
            if(i%2 == 0) {
                System.out.println(i + " is even.");
            }
            else{
                System.out.println(i+ " is odd.");
            }
        }
    }

    /*

    display numbers from 1 to n (n is the range given
    by the user during the execution) and display
    even/odd next to each number[
     */

    public static void main(String[] args) {
        GreatestOf3();
        LoanEmiInterest();
        EvenOrOdd();
    }
}
