package ex_3;

import java.util.Scanner;

public class StaticLibrary {
	
	
	static void showMultipleOf5(int n1, int n2) {
		
		for(int count = n1; count <= n2; count++) {
			if(count % 5 == 0) {
				System.out.println(count);
			}
		}
	}

    static int charType(char l){
        if((int)l <= 90  && (int)l>= 65 ){
            return 1;
        }
        if ((int)l >= 97 && (int)l <= 122){
            return 2;
        }
        return -1;

    }

    static double giveMePower(double bases, int power){
        double x = 0;
        for (double count = 1; count <= power; count++){
            x *= bases;
        }

        return  x;
    }


	
	public static void main(String[] args) {
		int n1 = 1,n2 = 1, base;
        char input;

        while(n1 != 0 && n2 != 0){
            System.out.println("input two numbers: ");
            n1 = Console.readInt();
            n2 = Console.readInt();

            StaticLibrary.showMultipleOf5(n1,n2);
        }

        for (int count = 1; count <= 5; count++){
             System.out.println("input number: ");
             input = Console.readChar();

             switch (StaticLibrary.charType(input)){
                 case 1:
                     System.out.println("Its Uppercase");
                     break;
                 case 2 :
                     System.out.println("its Lowercase");
                     break;
                 default:
                     System.out.println("its not a letter.....");
             }


        }

        System.out.println("input number to display n powers of 7: ");
        base = Console.readInt();

        for(int count = 1 ; count <= base ; count++){
            System.out.println(giveMePower(7,count));
        }





	}

}
