package com.Syed;

import java.awt.*;
import java.awt.event.*;

public class additionUsingGui extends Frame implements ActionListener{
    TextField tf1, tf2, tf3;
    Label l1, l2, l3;
    Button b1, b2, b3, b4;
    additionUsingGui(){
        tf1 = new TextField();
        tf1.setBounds(140, 50, 50, 20);
        tf2 = new TextField();
        tf2.setBounds(140, 80, 50, 20);
        l1 = new Label("Enter 1st Number");
        l1.setBounds(30, 50, 110, 20);
        add(l1);
        l2 = new Label("Enter 2nd Number");
        l2.setBounds(30, 80, 110, 20);
        add(l2);
        l3 = new Label("Result");
        l3.setBounds(30, 200, 50, 20);
        add(l3);
        b1 = new Button("Add");
        b1.setBounds(25, 120, 80, 30);
        b1.addActionListener(this);
        add(b1);
        b2 = new Button("Subtract");
        b2.setBounds(135, 120, 80, 30);
        b2.addActionListener(this);
        add(b2);
        b3 = new Button("Product");
        b3.setBounds(25, 160, 80, 30);
        b3.addActionListener(this);
        add(b3);
        b4 = new Button("Quotient");
        b4.setBounds(135, 160, 80, 30);
        b4.addActionListener(this);
        add(b4);
        add(tf1);
        add(tf2);
        tf3 = new TextField("");
        tf3.setBounds(90, 200, 70, 20);
        add(tf3);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        int c;
        float d;
        if(e.getSource() == b1){
            c = a + b;
            tf3.setText(String.valueOf(c));
        }
        else if(e.getSource() == b2){
            c = a - b;
            tf3.setText(String.valueOf(c));
        }
        else if(e.getSource() == b3){
            c = a * b;
            tf3.setText(String.valueOf(c));
        }
        else if(e.getSource() == b4){
            d = a / b;
            tf3.setText(String.valueOf(d));
        }
    }

    public static void main(String[] args) {
        new additionUsingGui();
    }
}
