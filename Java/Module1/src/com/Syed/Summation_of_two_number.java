package com.Syed;

import java.util.Scanner;

public class Summation_of_two_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number1, number2, summation_of_two_number;
        System.out.print("Enter first number: ");
        number1 = s.nextInt();
        System.out.print("Enter second number: ");
        number2 = s.nextInt();
        summation_of_two_number = number1 + number2;
        System.out.println("Sum of the two number = " + summation_of_two_number);
    }
}
