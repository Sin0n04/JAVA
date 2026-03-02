package Collections;
import java.util.ArrayList;

public class test1 {
    public  static void loadByRows(ArrayList list){
        int max=100, min= -100;
        Integer random = (int) (Math.random()*(max-min +1));
        for (int i = 0; i < 20 ; i++) {
            list.set(i, random);
        }

    }

    public static void display(ArrayList arr){
        System.out.println(arr);
    }
    public static void clear(ArrayList arr){
        ArrayList<Integer> list = new ArrayList<>();
    }


    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

    }

}
