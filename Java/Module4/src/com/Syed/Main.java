package com.Syed;

import java.lang.*;

class thread1 extends Thread{
    public void run(){
        System.out.println("Hello World");
    }
}

public class Main extends thread1{
    public static void main(String[] args){
	    thread1 obj = new thread1();
        obj.start();
    }
}
