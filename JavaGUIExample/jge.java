package JavaGUIExample;

import javax.swing.*;

public class jge {
    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JLabel label = new JLabel("Hello, World!");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}