/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userlogindemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Administrator
 */
public class UserLoginDemo {

    public static void main(String[]args){
            
    Frame frame = new Frame ("Welcome User");
    Label lblname = new Label("Username");
    Label lblpass = new Label("Password");
    TextField txtName = new TextField();
    TextField txtPass = new TextField();
    Button btn = new Button("Submit");
    
    frame.setVisible(true);
    frame.setSize(250, 250);
    frame.setLayout(new FlowLayout());
    
    txtName.setPreferredSize(new Dimension (100, 27));
    txtPass.setPreferredSize(new Dimension (100, 27));
    txtPass.setEchoChar('*');
    
    
    frame.add(lblname);
    frame.add(lblpass);
    frame.add(txtName);
    frame.add(txtPass);
    frame.add(btn);
    
    frame.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    });
    
    btn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String name = txtName.getText();
            String pass = txtPass.getText();
            
            System.out.println("Your Username is " + name);
            System.out.println("Your password is " + pass);
            
            txtName.setText("");
            txtPass.setText("");
        }
    });
    
    }
    
}

