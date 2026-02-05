package UD6SET2;

public class Matrix1 {
    private int[][] arr;
    private final int NR = 10,NC = 7;


   public Matrix1(){
        this.arr = new int[NR][NC];
   }

    public Matrix1(int row, int col){
        if(row > NR || col > NC){
            System.out.println("inputted values exceed the maximum capacity, instantiating with maximum values....");
            this.arr = new int[NR][NC];
            loadByRows(this.arr);
        }
        else {
            this.arr = new int[row][col];
            loadByRows(this.arr);
        }

    }

    protected static void loadByRows(int[][] arr){
        int max=10, min=1;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length ; j++) {
                int random = min +(int)(Math.random()*(max-min+1));
                arr[i][j] = random;
            }

           max+=10;
           min+=10;;
        }

    }

    public void view(){
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[0].length; j++) {
                System.out.print(this.arr[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public void reverseRows(){
        for (int i = 0; i < this.arr.length; i++) {
            int[] reversed = new int[this.arr[0].length];
            int end =this.arr[0].length - 1;
            for (int j = 0; j < this.arr[0].length; j++) {
                reversed[end] = arr[i][j];
                end--;
            }
            this.arr[i] = reversed;
        }

    }

    public void swapRows(int row1, int row2){

    }
}
