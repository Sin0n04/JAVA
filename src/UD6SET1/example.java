package UD6SET1;

import java.lang.reflect.Array;

public class example {
// collection of data structures....

    public static void display(String other){
        System.out.println(other);
    }

    public static void gnomeSort(int[] arr, int n){
        int index = 0 ;
        while(index < n ){
            if(index == 0){
                index++;
            }
            if(arr[index] >= arr[index - 1]){
                index++;
            }
            else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }


    }
}
