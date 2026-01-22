package UD6SET1;

public class ex_7 {



    public static void display(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print( arr[i] + " | ");
        }
    }

	public static void main(String[] args) {
        int[] arrayLeft = new int[10];
        int[] arrayright = new int[10];

        System.out.println("Fill first array");
        for (int i = 0; i < 10 ; i++) {
            //fill first array.
            System.out.println("fill position " + i);
            arrayright[i] = Console.readInt();
            while(i !=0 && arrayright[i] < arrayright[i-1]){
                System.out.println("Wrong value, input a number higher than  " + arrayright[i-1]);
                arrayright[i] = Console.readInt();
            }
        }

        //fill second array.
        System.out.println("Fill second array");
        for (int i = 0; i < 10 ; i++) {
            System.out.println("fill position " + i);
            arrayLeft[i] = Console.readInt();
            while(i !=0 && arrayLeft[i] < arrayLeft[i-1]){
                System.out.println("Wrong value, input a number higher than  " + arrayLeft[i-1]);
                arrayLeft[i] = Console.readInt();
            }
        }

        int[] fusion = new int[arrayright.length + arrayLeft.length];

        int j = 0;
        int z = 0;
        int i = 0;

        while(i < arrayright.length && j < arrayLeft.length){
            if(arrayright[i] < arrayLeft[j]){
                fusion[z] = arrayright[i];
                z++;
                i++;
            }
            else {
                fusion[z] = arrayLeft[j];
                z++;
                j++;
            }
        }

        while(i < arrayright.length){
            fusion[z] = arrayright[i];
            z++;
            i++;
        }
        while(j < arrayLeft.length){
            fusion[z] = arrayLeft[j];
            z++;
            j++;
        }

        display(fusion);






    }

}
