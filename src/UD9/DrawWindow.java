package UD9;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DrawWindow{
    private static ImageIcon redim(String filepath,int width, int height){
        ImageIcon imgicn = new ImageIcon(filepath);
        Image image = imgicn.getImage();
        Image im = image.getScaledInstance(width,height,0);
        return new ImageIcon(im);
    }

    public static String[] loadStringFromFile(String filepath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while((line = reader.readLine()) != null){
            list.add(line);
        }

        return list.toArray(new String[0]);
    }
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Job Instance");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());

        //North panel
        JPanel panelN = new JPanel();
        panelN.add(new JLabel("Name:"));
        panelN.add(new JTextField("first name"));
        panelN.add(new JTextField("last name"));
        frame.add(panelN,BorderLayout.NORTH);


        //center panel
        JPanel panelC = new JPanel();
        Ciclo[] ciclosobj = {new Ciclo("Web Aplication Development","GS"),new Ciclo("MicroComputer Systems and Networks","GM"),
                new Ciclo("Multiplatform Aplication Development","GS"),new Ciclo("Administrative Management","GM"),
                new Ciclo("Administration and finance","GS"),new Ciclo("Markering and Advertising","GS")
        };
        JList list = new JList<>(ciclosobj);
        list.setFont(new Font("Arial",Font.BOLD,16));
        panelC.add(list);
        frame.add(panelC,BorderLayout.CENTER);

        //west panel
        JPanel panelW = new JPanel();
        panelW.setLayout(new GridLayout(0,1));
        String[] lines = loadStringFromFile("src/UD9/TEXT.txt");
        JCheckBox[] checkBox = new JCheckBox[lines.length];
        for (int i = 0; i < lines.length ; i++) {
            checkBox[i] = new JCheckBox(lines[i],true);
            panelW.add(checkBox[i]);
        }
        frame.add(panelW,BorderLayout.WEST);

        //east panel
        JPanel panelE = new JPanel();
        frame.add(panelE,BorderLayout.EAST);
        panelE.add(new JLabel( redim("src/UD9/Imageicon.jpg",100,500)));
        frame.setVisible(true);

        //south panel
        JPanel panelS = new JPanel(new GridLayout(1,2));
        JButton delete = new JButton("Delete");
        delete.setEnabled(false);
        panelS.add(new JButton("Save"));
        panelS.add(delete);
        frame.add(panelS,BorderLayout.SOUTH);
    }

}
