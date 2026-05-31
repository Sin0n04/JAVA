package UD9SET2;

import javax.swing.*;
import java.awt.*;
import java.io.File;

import UD9.DrawWindow;
import UD9.DrawWindow.*;

public class EX2 extends JFrame {
    final int N = 7;
    private File icon;
    EX2(){
        //initialization...
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550,500);

        //central panel
        JPanel panel = new JPanel(new GridLayout(0,2));
        JButton[] buttons = new JButton[N];
        JLabel[] icons = new JLabel[N];

        //starting button and label values
        for (int i = 0; i < N; i++) {
            buttons[i] = new JButton(String.valueOf(2 + (int)(Math.random() * 20)));
            icons[i] = new JLabel(DrawWindow.redim("src/UD9SET2/cross.jpg",200,200));

            panel.add(buttons[i]);
            panel.add(icons[i]);
        }



        this.add(panel);
        //set window visible
        this.setVisible(true);
    }
}
