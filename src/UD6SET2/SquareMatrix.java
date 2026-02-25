package UD6SET2;

public class SquareMatrix extends Matrix1 {

    public SquareMatrix(){
       super();
    }

    public SquareMatrix(int size){
        super(size,size);
    }

    protected void loadIdentity(){
        System.out.println("loading matrix....");
        int[][] matrix = this.getArr();

        for (int i = 0; i < this.getArr().length; i++) {
            for (int j = 0; j < this.getArr()[0].length; j++) {
                if(i == j){
                    matrix[i][j] = 1;
                }else {
                    matrix[i][j] = 0;
                }
            }
        }

        this.setArr(matrix);
        System.out.println("matrix loaded.");
    }

    protected boolean isMagicSquare(){
        int[][] matrix = this.getArr();

        int sum = 0;
        for (int i = 0; i < 1; i++) {
           sum += matrix[0][i];
        }


        //checking rows
        for (int i = 0; i < matrix.length; i++) {
            int rowsum = 0;
            for (int j = 0; j < matrix.length; j++) {
                rowsum += matrix[i][j];
            }
            if (rowsum != sum){
                return false;
            }
        }

        //checking columns, to do so j=you just need to reverse the order of the indexes [a][b] -> [b][a] to traverse the same columns of the matrix

        for (int i = 0; i < matrix.length; i++) {
            int colsum = 0;
            for (int j = 0; j < matrix.length; j++) {
                colsum += matrix[j][i];
            }
            if (colsum != sum)
                return false;

        }

        int maindiag = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j){
                    maindiag += matrix[i][j];
                }
            }
        }
        if (maindiag != sum){
            return false;
        }

        int secDiag = 0;
        for (int i = 0; i < matrix.length; i++) {
           secDiag = matrix[i][matrix.length - 1 - i];
           //important formula to travrse the second diagonal [n - 1 - i] where n is the length fo the matrix
        }
        if (secDiag != sum)
            return false;


        return true;
    }

    public boolean isSymmetric(){
        int[][] m1 = this.getArr();
        int n = m1.length;
        // to check for symmetric matrix no need to transpose, just check if they are the same with the values reversed -> if(arr[i][j] == arr[i][j]) they are symmetric.(only works with square matrix)


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (m1[i][j] != m1[j][i]){
                    return false;
                }
            }
        }

        return true;
    }


}
