package com.Syed;

import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame implements ActionListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
    TextField t1;
    String intialDisplay;
    String initDisp, assignval, compval;

    calculator() {
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button("/");
        b12 = new Button("*");
        b13 = new Button("-");
        b14 = new Button("+");
        b15 = new Button(".");
        b16 = new Button("=");
        b17 = new Button("AC");
        b18 = new Button("C");
        t1 = new TextField("");
        t1.setBounds(40, 50, 240, 40);
        add(t1);
        b1.setBounds(40, 100, 80, 30);
        add(b1);
        b1.addActionListener(this);
        b2.setBounds(120, 100, 80, 30);
        add(b2);
        b2.addActionListener(this);
        b3.setBounds(200, 100, 80, 30);
        add(b3);
        b3.addActionListener(this);
        b4.setBounds(40, 130, 80, 30);
        add(b4);
        b4.addActionListener(this);
        b5.setBounds(120, 130, 80, 30);
        add(b5);
        b5.addActionListener(this);
        b6.setBounds(200, 130, 80, 30);
        add(b6);
        b6.addActionListener(this);
        b7.setBounds(40, 160, 80, 30);
        add(b7);
        b7.addActionListener(this);
        b8.setBounds(120, 160, 80, 30);
        add(b8);
        b8.addActionListener(this);
        b9.setBounds(200, 160, 80, 30);
        add(b9);
        b9.addActionListener(this);
        b10.setBounds(40, 190, 80, 30);
        add(b10);
        b10.addActionListener(this);
        b11.setBounds(120, 190, 80, 30);
        add(b11);
        b11.addActionListener(this);
        b12.setBounds(200, 190, 80, 30);
        add(b12);
        b12.addActionListener(this);
        b13.setBounds(40, 220, 80, 30);
        add(b13);
        b13.addActionListener(this);
        b14.setBounds(120, 220, 80, 30);
        add(b14);
        b14.addActionListener(this);
        b15.setBounds(200, 220, 80, 30);
        add(b15);
        b15.addActionListener(this);
        b16.setBounds(40, 250, 80, 30);
        add(b16);
        b16.addActionListener(this);
        b17.setBounds(120, 250, 80, 30);
        add(b17);
        b17.addActionListener(this);
        b18.setBounds(200, 250, 80, 30);
        add(b18);
        b18.addActionListener(this);
        setSize(330, 350);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            initDisp = t1.getText();
            assignval = "1";
            compval = initDisp + assignval;
            t1.setText(compval);
        } else if (e.getSource() == b2) {
            initDisp = t1.getText();
            assignval = "2";
            compval = initDisp + assignval;
            t1.setText(compval);
        } else if (e.getSource() == b3) {
            initDisp = t1.getText();
            assignval = "3";
            compval = initDisp + assignval;
            t1.setText(compval);
        } else if (e.getSource() == b4) {
            initDisp = t1.getText();
            assignval = "4";
            compval = initDisp + assignval;
            t1.setText(compval);
        } else if (e.getSource() == b5) {
            initDisp = t1.getText();
            assignval = "5";
            compval = initDisp + assignval;
            t1.setText(compval);
        } else if (e.getSource() == b6) {
            initDisp = t1.getText();
            assignval = "6";
            compval = initDisp + assignval;
            t1.setText(compval);
        } else if (e.getSource() == b7) {
            initDisp = t1.getText();
            assignval = "7";
            compval = initDisp + assignval;
            t1.setText(compval);
        } else if (e.getSource() == b8) {
            initDisp = t1.getText();
            assignval = "8";
            compval = initDisp + assignval;
            t1.setText(compval);
        } else if (e.getSource() == b9) {
            initDisp = t1.getText();
            assignval = "9";
            compval = initDisp + assignval;
            t1.setText(compval);
        } else if (e.getSource() == b10) {
            initDisp = t1.getText();
            assignval = "0";
            compval = initDisp + assignval;
            t1.setText(compval);
        }

        else if(e.getSource() == b17){
            t1.setText("");
        }

    }

    public static void main(String[] args) {
        new calculator();
    }
}
