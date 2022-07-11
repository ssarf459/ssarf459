package com.Syed;

import java.util.Scanner;

public class Student {

    static int english, mathematics, science, roll, total;
    static float average;
    static String name;
    static void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = s.nextLine();
        System.out.print("Enter noll no.: ");
        roll = s.nextInt();
        System.out.print("Enter marks for English: ");
        english = s.nextInt();
        System.out.print("Enter marks for Mathematics: ");
        mathematics = s.nextInt();
        System.out.print("Enter marks for Science: ");
        science = s.nextInt();
        s.close();
    }

    static void result(){
        total = english + mathematics + science;
        System.out.println("Total: " + total);
        average = total/3;
        System.out.println("Average: " + average);
    }
    
    static void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + roll);
        System.out.println("Marks obtained in");
        System.out.println("English: " + english);
        System.out.println("Mathematics: " + mathematics);
        System.out.println("Science: " + science);
    }
    public static void main(String[] args) {
        input();
        display();
        result();
    }
}
