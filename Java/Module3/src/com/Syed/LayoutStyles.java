package com.Syed;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LayoutStyles extends Frame{
    Button bt1, bt2, bt3, bt4, bt5;
    void flowLayout(){
        Panel panel = new Panel();
        bt1 = new Button("India");
        bt2 = new Button("Pakistan");
        bt3 = new Button("Japan");
        bt4 = new Button("China");
        bt5 = new Button("Russia");
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        setLayout(new FlowLayout());
        setSize(300, 300);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    void gridLayout(){
        Panel panel = new Panel();
        bt1 = new Button("India");
        bt2 = new Button("Pakistan");
        bt3 = new Button("Japan");
        bt4 = new Button("China");
        bt5 = new Button("Russia");
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        setLayout(new GridLayout());
        setSize(300, 300);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
    //    LayoutStyles obj = new LayoutStyles();
    //    obj.flowLayout();
    //    LayoutStyles obj1 = new LayoutStyles();
    //    obj1.gridLayout();
        GUI obj2 = new GUI();
    }
}


class GUI extends JFrame {
    GUI(){
        JPanel pa = new JPanel();
        pa.setLayout(new BorderLayout());
        pa.add(new JButton("Welcome"), BorderLayout.NORTH);
        pa.add(new JButton("Geeks"), BorderLayout.SOUTH);
        pa.add(new JButton("Layout"), BorderLayout.EAST);
        pa.add(new JButton("Border"), BorderLayout.WEST);
        pa.add(new JButton("Geeks For Geeks"), BorderLayout.CENTER);
        add(pa);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }
}
