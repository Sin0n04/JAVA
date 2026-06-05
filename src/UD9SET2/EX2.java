package UD9SET2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.util.ArrayList;

import UD9.DrawWindow;
import UD9.DrawWindow.*;

public class EX2 extends JFrame {
    final int N = 7;
    private File icon;
    private ArrayList<JButton> wrongNumbersBin = new ArrayList<>();
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
            //adding action listener to butons
            buttons[i].addActionListener(new MultiplyListener(icons[i]));


            panel.add(buttons[i]);
            panel.add(icons[i]);
        }

        //closing window operation
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                String answer = JOptionPane.showInputDialog("input name to register mistaken numbers...");
                String failednumbersfile = answer + ".bin";
                try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(failednumbersfile))){
                    for (JButton b : wrongNumbersBin){
                        oos.writeObject(b);
                    }
                }catch (IOException exception){
                    exception.printStackTrace();
                }
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });


        this.add(panel);
        //set window visible
        this.setVisible(true);
    }

    private class MultiplyListener implements ActionListener {
        private JLabel label;
        private int counter;
        public MultiplyListener(JLabel label){
            this.label = label;
            this.counter = 0;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            int buttonValue = Integer.parseInt(button.getText());
            int randomValue = 1 + (int)(Math.random() * 10);

            String answer = JOptionPane.showInputDialog(buttonValue + " X " + randomValue);

            int result = buttonValue * randomValue;
            if (answer != null && result == Integer.parseInt(answer)){
                //get the right answer
                this.label = new JLabel(DrawWindow.redim("UD9SET2/GreenCheck.png",200,200));
                ((JButton) e.getSource()).setEnabled(false);
            }else {
                counter++;
            }

            if (this.counter == 3){
                //got the wrong answer 3 times
                ((JButton) e.getSource()).setEnabled(false);
                JButton buttonWrong = (JButton) e.getSource();
                wrongNumbersBin.add(buttonWrong);
                this.label.setVisible(false);
            }
        }
    }
}
