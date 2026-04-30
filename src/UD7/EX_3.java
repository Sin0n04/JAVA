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
           int current = bis.read();

           if(current == -1){
               return;
           }

           int count = 1;
           int next;

           while((next= bis.read())!= -1){
               if(next == current && count < 255){
                   count++;
               }
               else{
                   bos.write(current);
                   bos.write(count);

                   current = next;
                   count = 1;
               }
           }

           bos.write(current);
           bos.write(count);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void decompress(String compressedfile, String decompressedfile){
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(decompressedfile));
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(compressedfile))){
            int value;
            while ((value = bis.read()) != - 1){
               int reps = bis.read();

               if (reps == -1){
                   throw new IOException("corrupted file, missing repetition byte");
               }

                for (int i = 0; i < reps; i++) {
                    bos.write(value);
                }
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
