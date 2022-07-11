package com.Syed;

import java.awt.*;
import java.awt.event.*;

public class JavaAWTList extends Frame {
    JavaAWTList(){
        List li1 = new List();
        li1.setBounds(125,70,80,95);
        li1.add("Item1");
        li1.add("Item2");
        li1.add("Item3");
        li1.add("Item4");
        li1.add("Item5");
        li1.add("Item6");
        add(li1);
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
        new JavaAWTList();
    }
}
