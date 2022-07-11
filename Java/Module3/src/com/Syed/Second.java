package com.Syed;

import java.awt.*;

public class Second extends Frame {
    Second(){
        Button b = new Button("Click me");
        b.setBounds(10, 90, 80, 30);
        add(b);
        List l = new List();
        l.setBounds(40, 130, 150, 80);
        l.add("Java");
        l.add("Operating System");
        l.add("Discrete Mathematics");
        add(l);
        Checkbox ch1 = new Checkbox("Java");
        Checkbox ch2 = new Checkbox("C++");
        ch1.setBounds(300, 190, 90, 20);
        ch2.setBounds(300, 150, 90, 20);
        add(ch1);
        add(ch2);
        TextField t = new TextField();
        t.setBounds(200, 100, 90, 30);
        add(t);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Second secObj= new Second();
    }
}
