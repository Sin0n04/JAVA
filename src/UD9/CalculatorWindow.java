package UD9;

import javax.swing.*;
import java.awt.*;

public class CalculatorWindow extends JFrame {
    private static final String[] Stringbuttons = {
            "Decimal",
            "Binary",
            "Octal",
            "Hexadecimal"
    };
    public CalculatorWindow(){
        super("Calculator");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550,500);

        //north panel

        JTextField result = new JTextField("0",20);
        result.setEditable(false);
        result.setSize(550,150);
        result.setHorizontalAlignment(JTextField.RIGHT);
        result.setFont(new Font("Arial",Font.BOLD,20));
        result.setBackground(new Color(0xD29740));
        this.add(result,BorderLayout.NORTH);

        //center area
        JButton[] buttons = new JButton[10];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf(i));
        }
        JPanel panelC = new JPanel(new GridLayout(0,3));
        for (int i = 0; i < buttons.length; i++) {
            panelC.add(buttons[i]);
        }

        this.add(panelC,BorderLayout.CENTER);

        //west area
        JPanel panelW = new JPanel(new GridLayout(0,1));
        panelW.setName("System");
        JRadioButton[] radioButtons = new JRadioButton[Stringbuttons.length];
        for (int i = 0; i < radioButtons.length; i++) {
            radioButtons[i] = new JRadioButton(Stringbuttons[i]);
            if (i == 0){
                radioButtons[i].setSelected(true);
            }
            else
                radioButtons[i].setSelected(false);
            panelW.add(radioButtons[i]);
        }
        panelW.setBorder(BorderFactory.createTitledBorder("SYSTEM"));
        this.add(panelW,BorderLayout.WEST);

        //south buttons
        JPanel panelS = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelS.add(new JButton("+"));
        panelS.add(new JButton("-"));
        panelS.add(new JButton("X"));
        panelS.add(new JButton("/"));
        panelS.add(new JButton("="));

        this.add(panelS,BorderLayout.SOUTH);


        //set frame visible
        this.setVisible(true);
    }

    public static void main(String[] args){
        CalculatorWindow window = new CalculatorWindow();
    }
}
