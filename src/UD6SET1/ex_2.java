package UD6SET1;

public class ex_2 {
    public static void main(String[] args){

       String[] arr = new String[100];
        //useful positions are checked with i...

        int usefulpos = 0;

       for (int i = 0 ; i < 100;i++){

           System.out.println("Current position: "+ (i+1) +" input next position...");
    	   arr[i] = Console.readString();

           if(arr[i].equals("quit")|| arr[i].equals("QUIT")) {
               break;
           }
           usefulpos++;
       }
       
       String[] reverse = new String[usefulpos];
       int pos = 0;
       for(int j = usefulpos-1 ; j >= 0 ; j--) {
    	   String first = arr[j].substring(0,1).toUpperCase();
    	   reverse[pos] = first+ arr[j].substring(1);
    	   pos++;
       }
       
       for(int z = 0 ; z < reverse.length ; z++) {
    	   System.out.print(reverse[z] + " | ");
       }

    }
}
