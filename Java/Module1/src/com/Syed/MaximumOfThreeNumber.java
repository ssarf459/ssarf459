package com.Syed;

import java.util.Scanner;

public class MaximumOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.print("Maximum number is " + num1);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.print("Maximum number is " + num2);
        }
        else {
            System.out.print("Maximum number is " + num3);
        }
        sc.close();
    }
}
