package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class test1 {
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
        for (int i = 0; i < 20; i++) {
            int max = 20,min = -20;
            int random = (int)(Math.random()*(max - min + 1)) + min;

            if (!list.contains(random)){
                list.add(random);
            }
            else {
                while(list.contains(random)){
                    random = (int)(Math.random()*(max - min + 1)) + min;
                }
                list.add(random);
            }
        }
    }

    public static void display(ArrayList<Integer> arr){
        System.out.println(arr);
    }


    public static void clear(ArrayList<Integer> arr){
        arr.clear();
    }


    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        loadArrayList(list);
        display(list);
        clear(list);
        display(list);
        loadDivisors(list,50);
        display(list);
        clear(list);

    }

}
