package com.Syed;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventExample extends JFrame implements ActionListener{
    private int count = 0;
    JLabel lblData;
    EventExample(){
        setLayout(new FlowLayout());
        lblData = new JLabel("Button Clicked 0 times");
        JButton btnClick = new JButton("Click Me");
        add(lblData);
        add(btnClick);
    }
    public void actionPerformed(ActionEvent e){
        count++;
        lblData.setText("Button Clicked " + count + " Times");
    }
}
class EventHandlingJavaExample{
    public static void main(String[] args) {
        EventExample frame = new EventExample();
        frame.setTitle("Event Handling Java Example");
        frame.setBounds(200, 150, 180, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
