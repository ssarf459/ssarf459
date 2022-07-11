package com.Syed;

import java.awt.*;
import java.awt.event.*;

public class EventListener extends Frame implements ActionListener{
    TextField tf;
    EventListener(){
        tf = new TextField();
        tf.setBounds(63, 50, 170, 20);
        Button b = new Button("Click here");
        b.setBounds(105, 120, 80, 30);
        b.addActionListener(this);
        add(b);
        add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        new EventListener();
    }
}
