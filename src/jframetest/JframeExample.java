package jframetest;

import javax.swing.JFrame;

public class JframeExample {
    public static void main(String[] args){
        //create window
        JFrame ventana = new JFrame("mi nueva ventana");
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
