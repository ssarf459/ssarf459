package com.Syed;

interface I1{
    void show();
}

public class Interface implements I1{
    public void show(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Interface T = new Interface();
        T.show();
    }
}