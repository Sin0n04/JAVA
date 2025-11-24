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

    static int summation(int x){
        int sum = 0;
        for (int count = 1 ; count < x;count ++){
            sum += count;

        }
        return sum;

    }

    static void showTable(int x){
        for (int count = 1 ; count <= 10 ; count ++){
            System.out.println(x + " * " + count + " = " + count * x );
        }
    }

    static boolean showRestrictedTable(int x){

        if(x >= 1 && x <= 20){
            for (int count = 1 ; count <= 10 ; count ++){
                System.out.println(x + " * " + count + " = " + count * x );
            }
            return true;
        }
        System.out.println("Not able to show multiplication table.....");
        return false;

    }


	
	public static void main(String[] args) {
		int n1 = 1,n2 = 1, base,x;
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


        x = Console.readInt();
        double summation = 0;
        for(int count = 1 ; count <= 8 ; count ++){
            summation = summation + (StaticLibrary.giveMePower(x,count)/StaticLibrary.summation(count));

        }

        System.out.println("Input number to show multiplication table: ");
        x = Console.readInt();

        while(x > 10 || x < 0 ){
            System.out.println("Wrong base, input a number between 1-10");
            x = Console.readInt();
        }
        StaticLibrary.showTable(x);


        x = 1;
        while(x != 0){
            System.out.println("Input integer to show restricted table: ");
            x = Console.readInt();
            StaticLibrary.showRestrictedTable(x);
        }








	}

}
