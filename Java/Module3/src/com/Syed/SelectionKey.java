// A JAVA PROGRAMME TO SHOW THE USE OF RADIO BUTTON, CHECK BOX, SCROLL BARS, PANELS AND FRAMES.
package com.Syed;

import javax.swing.*;
import java.awt.*;


public class SelectionKey {
    JFrame frame;
    JRadioButton radioButton;
    Checkbox checkbox;
    Scrollbar scrollbar;
    Panel panel;
    SelectionKey(){
        frame = new JFrame("Selection Window");
        radioButton = new JRadioButton("Hello");
        radioButton.setBounds(36, 48, 60, 20);

        frame.add(radioButton);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SelectionKey();
    }
}
