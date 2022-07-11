package com.Syed;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int testNum = sc.nextInt();
        if (testNum%2 == 0 && testNum != 0){
            System.out.println(testNum + " is even Number");
        }
        else if (testNum == 0){
            System.out.println("It's zero");
        }
        else {
            System.out.println(testNum + " is odd Number");
        }
    }
}
