package UD7;

import java.io.*;
import java.util.Random;

public class EX_3 {
    public static void crearRandomBinary(String filename){
        Random rand = new Random();
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filename))){
            for (int i = 0; i < 100 ; i++) {

                byte value = (byte)rand.nextInt(127);
                int reps = rand.nextInt(100);

                for (int j = 0; j < reps; j++) {
                    bos.write(value);
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void compress(String orgfile,String compressedfile){
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(compressedfile));
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(orgfile))){
            while(true){
                try {
                    byte prevalue = (byte) bis.read();
                    byte value = (byte) bis.read();
                    int reps = 0;
                    while (value == prevalue) {
                        prevalue = (byte) bis.read();
                        value = (byte) bis.read();
                        reps++;
                    }
                    bos.write(prevalue + reps);
                }
                catch(EOFException e ){
                    break;
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
