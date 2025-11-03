package exercises;

public class EX2_9 {
    public static void main(String[] args){
        int col,row,space,count;

        System.out.println("input height: ");
        row = Console.readInt();

        count = row;

        while (count >= 1){

            space = 1;

            while(space <= row-count){
                System.out.print(" ");
                space++;
            }

            col = 1;
            while (col <= count ){
                System.out.print("*");
                col++;
            }
        System.out.println();
        count--;
        }

    }
}
