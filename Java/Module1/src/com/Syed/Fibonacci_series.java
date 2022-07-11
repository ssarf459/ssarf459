package com.Syed;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        int i, t1 = 0, t2 = 1, count;
        int nextT = t1 + t2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms to show: ");
        count = s.nextInt();
        System.out.println("Fibonacci series upto " + count + " terms: \n" + t1 + "\n" + t2 + " ");
        for(i = 3; i <= count; i++){
            System.out.println(nextT + " ");
            t1 = t2;
            t2 = nextT;
            nextT = t1 + t2;
        }
    }
}
