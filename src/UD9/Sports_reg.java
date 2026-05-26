package UD9;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Sports_reg extends JFrame {
    //DONE
    static HashMap<String,Integer> map = new HashMap<String,Integer>(){{
        put("swimming",12);
        put("running",40);
        put("weight-lifting",70);
    }};

    private static ImageIcon redim(String filepath,int width, int height){
        ImageIcon imgicn = new ImageIcon(filepath);
        Image image = imgicn.getImage();
        Image im = image.getScaledInstance(width,height,0);
        return new ImageIcon(im);
    }

    public Sports_reg(Member[] members) throws HeadlessException {
        super("SPORT REGISTRATION");
        this.setLayout(new GridLayout(members.length,4));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550,500);


        //name and photos
        JButton[] buttons = new JButton[members.length];
        for (int i = 0; i < members.length; i++) {
            if (members[i].photofilepath == null){
                this.add( new JLabel(members[i].name));
            }
            else
                this.add( new JLabel(new ImageIcon(redim(members[i].photofilepath,150,50).getImage())));
            this.add(new JLabel(String.valueOf(members[i].age()) + "Years old"));
            buttons[i] = new JButton("ENROLL");
            if (members[i].age() <= map.get("swimming")){
                this.add(new JLabel("Swimming"));
            }
            else {
                if (members[i].age() <= map.get("running") && members[i].age() > map.get("swimming")){
                    this.add(new JLabel("Running"));
                }
                else {
                    if(members[i].age() > map.get("running") && members[i].age() <= map.get("weight-lifting") ){
                        this.add(new JLabel("weight-lifting"));
                    }
                    else
                        buttons[i].setEnabled(false);

                }
            }

            this.add(buttons[i]);

        }

        this.setVisible(true);

        //age panel
    }
    public static void main(String[] args){
        Sports_reg window = new Sports_reg(
                new Member[]{
                    new Member("Ana Montoya",1995),
                    new Member("Pedro de la Real",1995,"src/UD9/member1.jpg"),
                    new Member("Manuel Carrasco", 2017),
                }
        );
    }
}
