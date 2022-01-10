package com.company.day4.arrays;

import org.w3c.dom.ls.LSInput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many arrays?");
        int m = sc.nextInt();
        int[][] arr = new int[m][];

        int sum;
        int i;
        for(sum = 0; sum < m; sum++){
            System.out.println("How many elements in " + sum + " array? ");
            i = sc.nextInt();
            arr[sum] = new int[i];
        }

        System.out.println("Enter the value of each element: ");

        for(sum = 0; sum < arr.length; sum++){
            for(i = 0; i < arr[sum].length; i++) {
                arr[sum][i] = sc.nextInt();
            }
        }

        System.out.println("The multidimensional array looks like this: ");

        for(sum = 0; sum < arr.length; sum++){
            for(i = 0; i < arr[sum].length; i++){
                System.out.println(arr[sum][i]+ " ");
            }
            System.out.println();
        }

        sum = 0;
        System.out.println("Sum of all the elements: ");

        for(i = 0; i < m; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum+= arr[i][j];
            }
        }

        System.out.println(sum);
    }
}
