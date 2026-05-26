package UD9;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;

public class AlbumWindow extends JFrame {
    public AlbumWindow(String filepath) throws HeadlessException {
        super("Album");
        this.setSize(550,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        File folder = new File(filepath);

        //photo section
        JPanel panelphoto = new JPanel(new GridLayout(0,3));
        if (folder.list() == null){
            JOptionPane.showMessageDialog(null,"the folder is empty");
            System.exit(0);
        }
        String[] photos = folder.list();
        for (int i = 0; i < photos.length; i++) {
            int extdot = photos[i].indexOf(".");
            if (extdot == -1){
                continue;
            }
            String extension = photos[i].substring(extdot);

            if (extension.equals(".jpg")){
                panelphoto.add(new JLabel(new ImageIcon(filepath+"/"+photos[i])));
            }
        }
        this.add(panelphoto,BorderLayout.CENTER);

        //combobox..
        JPanel panelbox = new JPanel(new GridLayout(3,0));
        String[] combo = new String[photos.length];
        for (int i = 0; i < combo.length; i++) {
            combo[i] = filepath+"/"+photos[i];
        }
        panelbox.add(new JComboBox<>(combo),0);

        JTextArea area = new JTextArea();
        area.setBackground(new Color(0xC78C8C));
        panelbox.add(area,1);

        panelbox.add(new JButton("SAVE"),2);

        this.add(panelbox,BorderLayout.WEST);


        this.setVisible(true);
    }
    public static void main(String[] args){
            String entrada = JOptionPane.showInputDialog("input Image filepath...");
            File folder = new File(entrada);
            if(!folder.isDirectory() || !folder.exists()){
                JOptionPane.showMessageDialog(null,"Folder doesnt exist or is not a directory...");
                System.exit(0);
            }

            AlbumWindow window = new AlbumWindow(entrada);




    }
}
