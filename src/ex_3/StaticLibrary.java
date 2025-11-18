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
        if( l >=  )
    }


	
	public static void main(String[] args) {
		int n1 = 1,n2 = 1;

        while(n1 != 0 && n2 != 0){
            System.out.println("input two numbers: ");
            n1 = Console.readInt();
            n2 = Console.readInt();

            StaticLibrary.showMultipleOf5(n1,n2);
        }





	}

}
