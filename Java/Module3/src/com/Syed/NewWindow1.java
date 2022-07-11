package com.Syed;

import javax.swing.*;
import java.awt.*;

public class NewWindow1 {
    JFrame frame = new JFrame();
    Label label = new Label("Hello");
    NewWindow1(){

        label.setBounds(0,0,100,50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
