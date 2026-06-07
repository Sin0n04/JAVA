package UD9SET2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcuationWindow extends JFrame implements ActionListener {

    private JTextField textA,textB,textC;
    private JLabel posSol,negSol;

    //auxilliary methods
    public QuadraticSolution solution(int a, int b, int c){
        //quadratic formula x = (-b * Math.sqrt(Math.pow(b,2) - 4(a*c)/(2a)
        QuadraticSolution solutions = new QuadraticSolution();

        double root = Math.pow(b, 2) - (4 * a * c);
        float pos = (float)(((-b) + Math.sqrt(root)) / (2 * a));
        float neg = (float)(((-b) - Math.sqrt(root)) / (2 * a));

        solutions.setNegValue(pos);
        solutions.setPosValue(neg);

        return solutions;
    }
    public EcuationWindow(){
        super("Ecuacion de seggundo grado");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200,200);
        this.setLayout(new GridLayout(0,3));

        //create question with three text fields and add to frame
        JPanel questionPanel = new JPanel(new GridLayout(1,0));
        questionPanel.add(new JTextField());

        this.ad

        //create resolve button
        JButton button = new JButton("Resolver");
        button.addActionListener(this);

        //set window visible
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //after pressing button
        try {
            int a = Integer.parseInt(textA.getText());
            int b = Integer.parseInt(textB.getText());
            int c = Integer.parseInt(textC.getText());

            if
        } catch (NumberFormatException ex) {
            throw new RuntimeException(ex);
        }
    }
}

