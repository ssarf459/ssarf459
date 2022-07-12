package com.Syed;

import java.lang.*;

class MultithreadingDemo implements Runnable{
    public void run(){
        try {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            MultithreadingDemo obj1 = new MultithreadingDemo();
            Thread obj = new Thread(new MultithreadingDemo());
            obj.start();
        }
    }
}
