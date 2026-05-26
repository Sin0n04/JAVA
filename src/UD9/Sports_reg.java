package UD9;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Sports_reg extends JFrame {
    static HashMap<String,Integer> map = new HashMap<>(){
        //done.
        map.put("Swimming",12);
        map.put("Running",40);
        map.put("Weight-lifting",70);
    };
    public Sports_reg(Member[] members) throws HeadlessException {
        super("SPORT REGISTRATION");
        this.setLayout(new GridLayout(4,members.length));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550,500);


        //name and photos
        for (int i = 0; i < members.length; i++) {
            this.add( new JLabel(members[i].name));
            this.add(new JLabel(String.valueOf(members[i].age())));
            this.add(new JLabel(map.get))//to revise later....
        }

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
