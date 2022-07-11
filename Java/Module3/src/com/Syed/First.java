package com.Syed;

import java.awt.*;
import java.awt.event.*;

public class First extends Frame {
    First(){
        Button b = new Button("Click here");
        TextField t1 = new TextField("");
        TextField t2 = new TextField("");
        Label l1 = new Label("Username");
        Label l2 = new Label("Password");
        l1.setBounds(100, 130, 80, 30);
        l2.setBounds(100, 190, 80, 30);
        t1.setBounds(180, 135, 120, 20);
        t2.setBounds(180, 195, 120, 20);
        b.setBounds(190, 260, 80, 30);
        add(b);
        add(l2);
        add(l1);
        add(t1);
        add(t2);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        First f = new First();
    }
}