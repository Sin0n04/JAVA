package UD9SET2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class EX1 extends JFrame implements MouseListener {
    private File files;
    private String selection;
    Point point;
    private final double margin = 0.2;


    DefaultListModel<Point> model = new DefaultListModel<>();
    JList<Point> list = new JList<>(model);
    JPanel bottom = new JPanel(new GridLayout(1,2));
    JLabel question ;
    JTextField response = new JTextField();


    //Auxiliary methods
    public static String[] getTXT(String[] folder){
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < folder.length; i++) {
            if (!folder[i].endsWith(".txt")){
                continue;
            }
            result.add(folder[i]);
        }
        return result.toArray(new String[0]);
    }


    //class
    public EX1(String folderpathname) throws FileNotFoundException {
        super("Distancias");
        this.setSize(550,500);
        this.setLayout(new GridLayout(3,0));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //textbox
        File folder = new File(folderpathname);
        if (!folder.exists() || !folder.isDirectory()){
            JOptionPane.showMessageDialog(null,"folder is empty or doesnt exist");
            System.exit(0);
        }
        JPanel textpanel = new JPanel();
        textpanel.add(new JLabel("Choose point file:"));


        JComboBox<String> comboBox = new JComboBox<>(getTXT(Objects.requireNonNull(folder.list())));
        comboBox.setSelectedIndex(-1);
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comboBox.getSelectedItem() != null){
                    selection = comboBox.getSelectedItem().toString();
                    files = new File(folder,selection);

                    model.clear();

                    String line;
                    try (BufferedReader br = new BufferedReader(new FileReader(files))){
                        while((line = br.readLine()) != null){
                            String[] values = line.split(",");
                            if(values.length != 2){
                                throw new RuntimeException();
                            }
                            Point point = new Point(Integer.parseInt(values[0]),Integer.parseInt(values[1]));
                            model.addElement(point);
                        }
                    }
                    catch (IOException g){
                        g.printStackTrace();
                    }
                }
            }
        });


        textpanel.add(comboBox);
        this.add(textpanel);
        //central list
        list.addMouseListener(this);
        this.add(list);

        //bottom buttons

        question = new JLabel("");
        bottom.add(question);
        response.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point p = list.getSelectedValue();

                if (p == null) return;

                double answer = Double.parseDouble(response.getText());

                double distance = Math.sqrt(
                        Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2)
                );

                question.setText("");

                if (Math.abs(answer - distance) <= margin) {
                    JOptionPane.showMessageDialog(null, "Correct");
                    model.removeElement(p);
                    response.setText("");
                    response.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect");
                    response.setText("");
                    response.setEnabled(false);
                }
            }
        });
        response.setEnabled(false);
        bottom.add(response);

        this.add(bottom);




        this.setVisible(true);
    }
    public static void main(String[] args) throws FileNotFoundException {
        String pathname = JOptionPane.showInputDialog("input folder to check...");
        EX1 window = new EX1(pathname);


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2){
            Point p = list.getSelectedValue();

            if(p != null){
                question.setText("Distance from " + p + " to (0,0)?");
                response.setEnabled(true);
            }
        }
        question.setText("");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
