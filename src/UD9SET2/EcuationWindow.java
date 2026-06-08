package UD9SET2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EcuationWindow extends JFrame implements ActionListener {

    private JTextField textA,textB,textC;
    private JLabel posSol,negSol;

    //auxilliary methods
    public QuadraticSolution solution(int a, int b, int c) throws RootException {
        //quadratic formula x = (-b * Math.sqrt(Math.pow(b,2) - 4(a*c)/(2a)
        QuadraticSolution solutions = new QuadraticSolution();


        //checking for potential errors or imaginary solutions

        double root = Math.pow(b, 2) - (4 * a * c);

            if(a == 0){
                throw new RootException("Not a Quadratic equation");
            }

        if(root < 0){
                throw new RootException("imaginary solutions");
        }


        float pos = (float)(((-b) + Math.sqrt(root)) / (2 * a));
        float neg = (float)(((-b) - Math.sqrt(root)) / (2 * a));

        solutions.setNegValue(neg);
        solutions.setPosValue(pos);

        return solutions;
    }
    public EcuationWindow(){
        super("Ecuacion de segundo grado");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200,200);
        this.setLayout(new GridLayout(3,0));


        //create question with three text fields and add to frame
        JPanel questionPanel = new JPanel(new GridLayout(1,0));
        ArrayList<JTextField> fields = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            fields.add(new JTextField());
        }
        for (JTextField f : fields){
            questionPanel.add(f);
            questionPanel.add(new JLabel("x" + fields.indexOf(f)));
        }



        //getting the values from the textfields for the intended method
        for (int i = 0; i < fields.size(); i++) {
            switch (i){
                case 0:
                    this.textA = fields.get(i);
                    break;
                case 1:
                    this.textB = fields.get(i);
                    break;
                case 2:
                    this.textC = fields.get(i);
                    break;
            }
        }
        this.add(questionPanel);


        //create resolve button

        JButton button = new JButton("Resolver");
        button.addActionListener(this);
        this.add(button);

        //create solution panel and labels
        JPanel solupanel = new JPanel(new GridLayout(1,2));
        this.posSol = new JLabel(" x");
        this.negSol = new JLabel(" x");

        this.posSol.setEnabled(false);
        this.negSol.setEnabled(false);
        this.posSol.setBackground(new Color(0xE7B52F));
        this.negSol.setBackground(new Color(0xE7B52F));
        this.posSol.setOpaque(true);
        this.negSol.setOpaque(true);

        solupanel.add(new JLabel("Solucion 1:"));
        solupanel.add(this.posSol);
        solupanel.add(new JLabel("Solucion 2:"));
        solupanel.add(this.negSol);
        this.add(solupanel);

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

            QuadraticSolution s = new QuadraticSolution();
            try{
                s = solution(a,b,c);

            } catch (RootException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
                this.textC.setText(" ");
                this.textA.setText(" ");
                this.textB.setText(" ");

                this.posSol.setText(" ");
                this.negSol.setText(" ");
            }

            this.posSol.setText(String.valueOf(s.posValue));
            this.negSol.setText(String.valueOf(s.negValue));

        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null,"No values of the ecuation can be null...");
        }



    }

    // main
    public static void main(String[] args){
        EcuationWindow eW = new EcuationWindow();
    }
}

