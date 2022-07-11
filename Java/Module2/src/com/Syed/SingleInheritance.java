package com.Syed;

public class SingleInheritance extends BaseClass{
    public static void main(String[] args) {
        BaseClass obj = new BaseClass();
        obj.Print();
    }
}

class BaseClass{
    void Print(){
        System.out.println("Hello");
    }
}
