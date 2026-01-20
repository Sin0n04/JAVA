package UD6SET1;

public class ex_2 {
    public static void main(String[] args){

       String[] arr = new String[100];
       
       int i = 0;
       while((arr[i] != "QUIT" || arr[i] != "quit") || i < 100 ) {
    	   System.out.println("input String... ");
    	   arr[i] = Console.readString();
    	   i++;
       }
       
       String[] reverse = new String[i];
       for(int j = 0 ; i >= j ; i--) {
    	   
    	   String first = arr[i].substring(0, 0);
    	   reverse[j] = first.toUpperCase() + arr[i].substring(1);
    	   j++;
       }
       
       for(int z = 0 ; i < reverse.length ; i++) {
    	   System.out.println(reverse[i]);
       }

    }
}
	