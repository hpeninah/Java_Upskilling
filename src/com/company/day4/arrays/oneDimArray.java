package com.company.day4.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class oneDimArray {
    public static void main(String[] args) {
        int[] marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements? ");
        int size = sc.nextInt();
        marks = new int[size];
        for(int i=0; i<marks.length; i++) {
            System.out.println("Enter element: ");
            marks[i] = sc.nextInt();
        }
        System.out.println("Elements entered: ");
        for(int j=0; j<marks.length; j++){
            System.out.println(marks[j]);
        }

        Arrays.sort(marks);
        System.out.println("The maximum element is " + marks[0]);
        System.out.println("The minimum element is " + marks[marks.length-1]);
    }
}
