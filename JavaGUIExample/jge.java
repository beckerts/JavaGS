package JavaGUIExample;

import java.awt.BorderLayout;

import javax.swing.*;

public class jge {
    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JLabel label = new JLabel("Hello, GUI World!");
        label.setHorizontalAlignment(JLabel.CENTER);
        JButton button1 = new JButton("Press Me!");
        frame.getContentPane().add(BorderLayout.NORTH, label);
        frame.getContentPane().add(BorderLayout.CENTER, button1);
        frame.setVisible(true);
    }
}