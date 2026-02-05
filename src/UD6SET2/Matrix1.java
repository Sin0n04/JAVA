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
        }
        else
            this.arr = new int[row][col];
    }

    protected void loadByRows(){

    }
}
