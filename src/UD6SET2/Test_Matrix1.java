package UD6SET2;

public class Test_Matrix1 {
    public static void main(String[] args){
        Matrix1 m1 = new Matrix1();

        System.out.println("input what rows to swap: ");
        int row1,row2;

        System.out.println("input first row: ");
        row1 = Console.readInt();

        System.out.println("input second row: ");
        row2 = Console.readInt();

        m1.swapRows(row1,row2);
        System.out.println("Swapping........");

        m1.view();

       int middle = m1.getArr().length /2;
        m1.swapColumns(1,middle);

        m1.view();


        Matrix1[] arrMatrices = new Matrix1[4];

        for (int i = 0; i < arrMatrices.length; i++) {
            arrMatrices[i] = new Matrix1(i + 3 , 7);
        }

        for (int i = 0; i < arrMatrices.length; i++) {
            int[][] transposed = arrMatrices[i].transpose();
            for (int j = 0; j < transposed.length; j++) {
                for (int k = 0; k < transposed[0].length; k++) {
                    System.out.println(transposed[j][k] + " | ");
                }
            }

        }


    }
}
