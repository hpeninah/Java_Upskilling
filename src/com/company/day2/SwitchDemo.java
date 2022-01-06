package com.company.day2;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character :");
        String str = sc.next();
        char ch = str.charAt(0);
        switch(ch) {
            case 'R':
            case 'r':
                System.out.println("RED");
                break;
            case 'G':
            case 'g':
                System.out.println("GREEN");
                break;
            case 'B':
            case 'b':
                System.out.println("BLUE");
                break;
            default:
                System.out.println("Invalid Input");
        }
        System.out.println("Thank you!");
    }
}
