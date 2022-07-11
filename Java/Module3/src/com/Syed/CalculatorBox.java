package com.Syed;

import java.awt.*;
import java.awt.event.*;

public class CalculatorBox extends Frame implements ActionListener{
    Button addBtn, subBtn, divBtn, mulBtn;
    TextField tf1, tf2, resultField;
    Label l1, l2, resultLabel;
    CalculatorBox(){
        addBtn = new Button("Add");
        addBtn.setBounds(300, 40, 70, 70);
        subBtn = new Button("Subtract");
        subBtn.setBounds(300, 120, 70, 70);
        divBtn = new Button("Divide");
        divBtn.setBounds(300, 200, 70, 70);
        mulBtn = new Button("Multiply");
        mulBtn.setBounds(300, 280, 70, 70);
        l1 = new Label("First Number");
        l1.setBounds(10, 40, 80, 30);
        tf1 = new TextField("");
        tf1.setBounds(130, 40, 120, 24);
        l2 = new Label("Second Number");
        l2.setBounds(10, 80, 100, 30);
        tf2 = new TextField("");
        tf2.setBounds(130, 80, 120, 24);
        resultField = new TextField("");
        resultField.setBounds(130, 120, 120, 24);
        resultLabel = new Label("Result");
        resultLabel.setBounds(10, 120, 100, 30);

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        divBtn.addActionListener(this);
        mulBtn.addActionListener(this);

        add(addBtn);
        add(subBtn);
        add(divBtn);
        add(mulBtn);
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(resultField);
        add(resultLabel);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e){
        double a = Double.parseDouble(tf1.getText());
        double b = Double.parseDouble(tf2.getText());
        double d;
        if(e.getSource() == addBtn){
            d = a + b;
            resultField.setText(String.valueOf(d));
        }
        else if(e.getSource() == subBtn){
            d = a - b;
            resultField.setText(String.valueOf(d));
        }
        else if (e.getSource() == mulBtn){
            d = a * b;
            resultField.setText(String.valueOf(d));
        }
        else if (e.getSource() == divBtn){
            d = a / b;
            resultField.setText(String.valueOf(d));
        }
    }

    public static void main(String[] args) {
        new CalculatorBox();
    }
}

