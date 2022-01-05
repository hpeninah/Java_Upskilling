package com.company;

import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        //finding the input value is even or odd
        if(num%2 == 0) {
            System.out.println(num + " is even.");
        }
        else{
            System.out.println(num+ " is odd.");
        }
    }
}
