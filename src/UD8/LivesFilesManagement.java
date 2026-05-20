package UD8;

import java.io.*;
import java.util.HashMap;

public class LivesFilesManagement {
    public static int checkLives(String filename){
        int lives = 0;
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename));){
            byte data;
            while((data = (byte)bis.read()) != -1){
                if (data == 1){
                    lives++;
                }
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        return lives;
    }

    public static HashMap<>
}
