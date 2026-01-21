package UD6SET1;

public class OpArray {
    private int[] arr;
    final private int[] forbidden= {10};

    OpArray(){
        this.arr = new int[forbidden.length];
    }

    OpArray(int size){
        this.arr = new int[size];
    }

    private void loadArray(){
        int input;
        int i = 0;
        while(i < this.arr.length){
            input = Console.readInt();
            //check if the input is zero...
            if(input == 0)
                break;

            boolean forbiddenvalue;
            do {
                forbiddenvalue = false;

                for (int j = 0; j < forbidden.length; j++) {
                    if (input == forbidden[j]) {
                        System.out.println("Forbidden number, input again:");
                        input = Console.readInt();
                        forbiddenvalue = true;
                        break;
                    }
                }

            }while(forbiddenvalue);
            //by this point the input must be valid so we add it o the array...
            this.arr[i] = input;
            System.out.println("number loaded to array");
            i++;
        }
    }

    private void display(){
        for (int i =0 ; i < arr.length ; i++)
            System.out.print(arr[i] + " | ");
    }

    @Override
    public String toString(){
        String result="";
        for (int i = 0 ; i < this.arr.length ; i++ )
            result +=(char)arr[i];
        return result;
    }

    public boolean isPrime(int num_tocheck){
        boolean isPrime = false;

        if(num_tocheck <= 1)
            return false;

        if(num_tocheck == 2)
            return isPrime = true;

        if(num_tocheck % 2 == 0)
            return false;

        isPrime = true;
        for(int i = 3 ; i < (num_tocheck/2 ); i++ ){
            if(num_tocheck % i == 0){
                return isPrime = false;
            }
        }
        return isPrime;
    }


    public int primeIndex(){

        for (int i = 0 ; i < arr.length ; i++){
            if(isPrime(arr[i])){
                return i;
            }
        }

        return -1;
    }





}
