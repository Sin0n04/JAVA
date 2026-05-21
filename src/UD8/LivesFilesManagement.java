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

    public static HashMap<String, Integer> livesMap(String filename){
        HashMap<String, Integer> map = new HashMap<>();
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            while((line = br.readLine()) != null){
                String[] parts = line.split(":");
                String character = parts[0].trim();
                String[] values = parts[1].trim().split(" ");

                int lives = 0;
                for (int i = 0; i < values.length; i++) {
                    if (Integer.parseInt(values[i]) == 1){
                        lives++;
                    }
                }
                map.put(character,lives);
            }
        }
        catch (IOException e ){
            e.printStackTrace();
        }
        return map;
    }

}
