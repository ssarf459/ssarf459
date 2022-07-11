package com.Syed;

public class AbstractClass {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();
        Motor_Bike obj1 = new Motor_Bike();
        obj1.start();
    }
}

abstract class Vehicle{
    abstract void start();
}

class Car extends Vehicle{
    void start(){
        System.out.println("Car will start by key.");
    }
}

class Motor_Bike extends Vehicle{
    void start(){
        System.out.println("Bike can start by kick");
    }
}
