package UD6SET1;

public class ex_6 {
    public static void main(String[] args){

        float[] arr = new float[10];

        System.out.println("input numbers in descending order..");

        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Input " + (i+1) + " position....");
            arr[i] = Console.readFloat();
            while(i !=0 && arr[i] > arr[i-1]){
                System.out.println("Wrong value, input a number lower than  " + arr[i-1]);
                arr[i] = Console.readFloat();
            }
        }

        System.out.println("full array:  ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }


    }

}
