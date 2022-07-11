package com.Syed;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login extends Frame implements ActionListener {
    Button b1;
    Label l1, l2, l3;
    TextField t1, t2;
    Login(){
        t1 = new TextField("");
        t1.setBounds(90, 70, 130, 24);
        l1 = new Label("Username");
        l1.setBounds(20, 70, 90, 25);
        t2 = new TextField("");
        t2.setBounds(90, 100, 130, 24);
        l2 = new Label("Password");
        l2.setBounds(20, 100, 90, 25);
        b1 = new Button("Log In");
        b1.setBounds(20, 140, 60, 25);
        b1.addActionListener(this);
        l3 = new Label("");
        l3.setBounds(100, 140, 100, 25);
        add(t1);
        add(t2);
        add(l1);
        add(l2);
        add(b1);
        add(l3);
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
        String userName, passWord;
        userName = t1.getText();
        passWord = t2.getText();
        if(e.getSource() == b1){
            if(userName.equals("Syed") && passWord.equals("Sarfaraj")) {
                dispose();
                NewWindow1 myWindow = new NewWindow1();
            }
            else {
                l3.setText("Invalid Password");
            }
        }
    }
    public static void main(String[] args) {
        Login l = new Login();
    }
}
