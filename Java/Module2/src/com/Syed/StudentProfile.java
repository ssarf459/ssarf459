package com.Syed;

import java.util.Scanner;

public class StudentProfile {
    private String name;
    private int age;
    StudentProfile(String name, int age){
        this.name = name;
        this.age = age;
    }
    StudentProfile(StudentProfile std){
        this.name = std.name;
        this.age = std.age;
    }
    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        StudentProfile std = new StudentProfile(name, age);
        System.out.println("Contents from original object");
        std.display();
        StudentProfile copy_std = new StudentProfile(std);
        System.out.println("Contents from copied object");
        copy_std.display();
    }
}
