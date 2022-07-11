package com.Syed;

import java.util.Scanner;

public class StudentDetail extends Marks {
    public static void main(String[] args) {
        int roll_no, semester;
        String name, branch;
        Scanner s = new Scanner(System.in);
        Sport obj1 = new Sport();
        System.out.println("Enter details of student");
        System.out.print("Name: ");
        name = s.nextLine();
        System.out.print("Branch: ");
        branch = s.nextLine();
        System.out.print("Roll Number: ");
        roll_no = s.nextInt();
        System.out.print("Semester: ");
        semester = s.nextInt();
        obj1.input_marks();
        obj1.input_sport_mark();
        obj1.student_details(name, roll_no, branch, semester);
        obj1.display_mark();
        obj1.display_sport_mark();
    }
}

class Student{
    void student_details(String name, int roll_no, String branch, int semester) {
        System.out.println("Name of the student: " + name);
        System.out.println("Roll number: " + roll_no);
        System.out.println("Branch: " + branch);
        System.out.println("Semester: " + semester);
    }
}

class Marks extends Student{
    int sub1, sub2, sub3, total;
    void input_marks(){
        Scanner s = new Scanner(System.in);
        System.out.print("Subject 1: ");
        sub1 = s.nextInt();
        System.out.print("Subject 2: ");
        sub2 = s.nextInt();
        System.out.print("Subject 3: ");
        sub3 = s.nextInt();
        total = sub1 + sub2 + sub3;
    }
    void display_mark(){
        System.out.println("Total marks: " + total);
        double average_marks = (double) total/3;
        System.out.println("Average marks: " + average_marks);
    }
}

class Sport extends Marks{
    int sport_mark;
    void input_sport_mark(){
        Scanner s = new Scanner(System.in);
        System.out.print("Sport Mark: ");
        sport_mark = s.nextInt();
    }
    void display_sport_mark(){
        System.out.println("Sport Marks: " + sport_mark);
    }
}