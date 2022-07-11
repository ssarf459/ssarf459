package com.Syed;

import java.util.Scanner;

public class AbstractStudent {
    public static void main(String[] args) {
       Student_detail obj = new Student_detail();
       obj.input();
       obj.display();
    }
}

abstract class Student1{
    String name, department;
    int roll_number, semester;

    abstract void input();
    void display(){
        System.out.println("Name of student: " + name);
        System.out.println("Roll no.: " + roll_number);
        System.out.println("Department: " + department);
        System.out.println("Semester: " + semester);
    }
}

class Student_detail extends Student1{
    Scanner s = new Scanner(System.in);
    void input(){
        System.out.print("Enter name: ");
        name = s.nextLine();
        System.out.print("Enter department: ");
        department = s.nextLine();
        System.out.print("Roll No: ");
        roll_number = s.nextInt();
        System.out.print("Semester: ");
        semester = s.nextInt();
    }
}