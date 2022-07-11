package com.Syed;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        int reverse = 0, number, remainder;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        number = s.nextInt();
        while(number != 0){
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reverse of the entered number is " + reverse);
    }
}
