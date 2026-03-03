package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    public  static void loadArrayList(ArrayList<Integer> list){
        int max=100, min= -100;

        for (int i = 0; i < 20 ; i++) {
            Integer random = (int)(Math.random()*(max-min +1)) + min;
            list.add(random);
        }

    }

    public static void loadDivisors(ArrayList<Integer> list, int n){
        int numfound = 0,numcheck = 1;
        while(numfound < 10  && (numcheck <= n/2) ){
            if (n % numcheck == 0){
                list.add(numcheck);
                numfound++;
            }

            numcheck++;
        }
    }

    public static void loadNoDuplicate(ArrayList<Integer> list){
    	//checks if the list is less that 20(attribute from Arraylists)...
        while(list.size() < 20) {
            int max = 20,min = -20;
            int random = (int)(Math.random()*(max - min + 1)) + min;

            if (!list.contains(random)){
                list.add(random);
            }
           
        }
    }

    public static void display(ArrayList<Integer> list){
    	for(int num : list) {
    		System.out.print(num + " | ");
    	}
    }




    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        loadArrayList(list);
        display(list);
        list.clear();
        display(list);
        loadDivisors(list,50);
        display(list);
        list.clear();

    }

}
