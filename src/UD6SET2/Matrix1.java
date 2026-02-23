package UD6SET2;

public class Matrix1 {
    private int[][] arr;
    private final int NR = 10,NC = 7;


   public Matrix1(){
        this.arr = new int[NR][NC];
        loadByRows(this.arr);
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

    public boolean swapRows(int row1, int row2){
       int[] temp = this.arr[row1 -1];

       if((row1 < 0 || row2 < 0) || (row1 > this.arr.length + 1 || row2 > arr.length + 1)){
           return false;
       }
       else{
           this.arr[row1 - 1] = this.arr[row2 - 1];
           this.arr[row2 - 1] = temp;
           return true;
       }

    }


    public boolean swapColumns(int col1 , int col2){
       if(col1==col2){
           return false;
       }

        for (int i = 0; i < this.arr.length; i++) {
            int temp = this.arr[i][col1];

            this.arr[i][col1] = this.arr[i][col2];
            this.arr[i][col2] = temp;
        }
        return true;
    }

    public int[][] transpose(){
        int rows = this.arr.length;
        int cols = this.arr[0].length;
       int[][] result = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows ; j++) {
                result[i][j] = this.arr[j][i];

            }
        }



       return result;
    }

    public int[][] getArr(){
       return this.arr;
    }
}
