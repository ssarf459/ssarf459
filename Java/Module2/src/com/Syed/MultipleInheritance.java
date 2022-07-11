package com.Syed;

interface Interface1{
    void display();
}

interface Interface2{
    void show();
}

class Sample implements Interface1, Interface2{
    public void display() {
        System.out.println("Display function from Interface1.");
    }
    public void show() {
        System.out.println("Show function from Interface2");
    }
}

public class MultipleInheritance extends Sample{
    public static void main(String[] args) {
        System.out.println("Multiple Inheritance using Interface.");
        Sample sample = new Sample();
        sample.display();
        sample.show();
    }
}
