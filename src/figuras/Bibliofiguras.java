package figuras;

public class Bibliofiguras {

    static void DrawC(Figura f1){
        int row = f1.dim,count = 1;

        while (count <= row) {

            if (count == 1 || count == row){
                for (int col = 1 ; col <= row;col++){
                    System.out.print(" x ");
                }
                count++;
            }
            else {
                System.out.print(" x ");
                count++;
            }
        }


    }
    static void DrawT(Figura f1){
        int row = f1.dim;

        for(int count = 1;count <= row;count++){
            for (int scol = 1 ; scol <= row;scol++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row;col++){
                System.out.print("x");
            }
        }


    }
}
