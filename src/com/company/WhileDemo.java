package com.company;

public class WhileDemo {
    public static void main(String[] args) {
        int loan = 10000;
        int emi = 1000;
        int noemis = 0;

        while( loan > 0 ) {
            loan -= emi;
            noemis ++;
            System.out.println("Paying "+emi+" of the installment "+noemis+"");

        }

        System.out.println("You are free from the loan after "+noemis+" installments are paid.");
    }
}
