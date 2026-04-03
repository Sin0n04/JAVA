package I_OStreams;
import java.io.*;
public class Exercise1 {

    public static void copyByte(String input,String output) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(input));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(output));
        int data;
        while((data = bis.read()) != -1){
            bos.write(data);
        }
        bis.close();
        bos.close();

    }

    public static void copyBlocks(String input, String output) throws IOException{
        int N = 512;

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(input));
        BufferedOutputStream bos = new BufferedOutputStream( new FileOutputStream(output));

        byte[] buffer = new byte[N];
        int bytesread;

        while((bytesread = bis.read(buffer)) != -1){
            bos.write(buffer,0,bytesread);
        }

        bis.close();
        bos.close();

    }

    public static void copySingle(String input, String output) throws IOException{

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(input));
        BufferedOutputStream bos = new BufferedOutputStream( new FileOutputStream(output));
         int lgn = bis.read();
         byte[] buffer = new byte[lgn];
         int bytesread;

         while((bytesread = bis.read(buffer)) != -1){
             bos.write(buffer,0,bytesread);
         }
         bis.close();
         bos.close();
    }

    public static String changeName(String input){
        int dot = input.lastIndexOf('.');
        return input.substring(0,dot) + "_CPY" + input.substring(dot);
    }

    public static void main(String[] args) throws IOException{
        if(args.length != 1){
            System.out.println("provide file name....");
            return;
        }
        String inputfile = args[0];
        String outputfile = changeName(inputfile);

        copyByte(inputfile, "byte_" + outputfile);

    }
}
