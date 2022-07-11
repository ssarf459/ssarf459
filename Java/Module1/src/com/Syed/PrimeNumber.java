package com.Syed;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i = 2;
        boolean flag = false;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = s.nextInt();
        do {
            if(num % i == 0){
                flag = true;
                break;
            }
            i++;
        }while (i <= num/2);
        if(!flag){
            System.out.println(num + " is prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
        }
    }
}
