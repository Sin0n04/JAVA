package Exercises_1st_term;

public class EXEXAMEN_1 {
    public static void main(String[] args) {
        int row,col,sw,increment,scounter;
        char option;
        boolean keep_going = true;

        System.out.println("input option(A- show series, B- simplify fraction, C- balanced number, D- Exit)");
        option = Console.readChar();


        while (option != 'A' && option != 'B' && option != 'C' && option != 'D') {

            System.out.println("Bad option.");
            System.out.println("input option(A- show series, B- simplify fraction, C- balanced number, D- Exit)");
            option = Console.readChar();
        }

        while (keep_going) {
            switch (option) {
                case 'A':
                    System.out.println("input amount of rows");
                    row = Console.readInt();
                    sw = 1;
                    increment = 0;

                    for (;row >=1;row--){
                        for (scounter = 0;scounter <=increment;scounter++){
                            System.out.print(" ");

                        }
                        if (sw == 1){
                            for (col = (row*2); col >= 1 ; col--){
                                System.out.print("<");
                            }
                            sw *= (-1);
                        }
                        else{
                            for (col =(row * 2); col >= 1; col--){
                                if(col == 1){
                                    System.out.print(")");
                                }
                                if (col == (row * 2)){
                                    System.out.print("(");
                                }
                                if(col >= 2 && col <=((row *2)-1)){
                                    System.out.print(" ");
                                }
                            }
                            sw *= (-1);
                        }
                        for (scounter = (col - increment);scounter <=increment;scounter++){
                            System.out.print(" ");

                        }
                        System.out.println();
                        increment += 1;
                    }




                    break;
                case 'D':
                    keep_going = false;
                    break;




            }
            System.out.println("input option(A- show series, B- simplify fraction, C- balanced number, D- Exit)");
            option = Console.readChar();
        }
    }
}