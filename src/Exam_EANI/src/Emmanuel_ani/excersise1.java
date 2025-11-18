package Emmanuel_ani;

public class excersise1 {

	public static void main(String[] args) {
		char option;
		int row,rowini,rowcount,count,col,sw = 1,numerator,denominator,countdenominator,spaces = 0,scounter;
		boolean can_divide = true;
		
		System.out.println("input option: ");
		System.out.println("A- view series, B- simplify fraction, C- balanced number, D- end");
		option = Console.readChar();
		
		while (option != 'D') {
			
			while (option != 'A' && option != 'B' && option != 'C') {
				System.out.println("Bad option , input option: ");
				System.out.println("A- view series, B- simplify fraction, C- balanced number, D- end");
				option = Console.readChar();
			}
			
			switch(option) {
			
			case 'A':
				System.out.println("input number of rows to display: ");
				row = Console.readInt();
				while(row < 2) {
					System.out.println("input number of rows to display MUST BE OVER 2: ");
					row = Console.readInt();
				}
				
				count = 1;
				rowini = row *2;
				
				while(count <= row) {
					
					rowcount = 1;
					if (count % 2 !=0) {
						while(rowcount <= rowini) {
							System.out.print("<");
							rowcount++;
						}
						
						sw = sw * -1;
					}
					if(count % 2 == 0) {
						
						scounter = 0;
						while(scounter <= rowini) {
							
							if(scounter == count + spaces) {
								System.out.print("(");
								
							}
							if(scounter == count + spaces/2 ) {
								System.out.print(")");
							
							}
							
								System.out.print(" ");
							
						
						scounter++;
						}
						
						
						
					}
					
					
					System.out.println();
					spaces = spaces + 2;
					rowini = rowini- 2;
					count++;
				}
				break;
				
			case 'B':
				
				count = 2;
				countdenominator = 2;
				System.out.println("input numerator: ");
				numerator = Console.readInt();
				
				System.out.println("input denominator: ");
				denominator = Console.readInt();
				
				while( numerator != 0 || count >= numerator/2 && can_divide  ) {
					while (count <= numerator / 2) {
						
						if(count % numerator == 0) {
							numerator = numerator / count;
						}
						if(count >= numerator) {
							can_divide = false;
						}
						count++;
					}
					
				}
				while( denominator != 0 || countdenominator >= denominator / 2 && can_divide) {
					while (countdenominator <= denominator / 2) {
						
						if(count % denominator == 0) {
							denominator = denominator / countdenominator;
						}
						if(countdenominator >= denominator) {
							can_divide = false;
						}
						
						countdenominator++;
					}
					
				}
				
				System.out.println(numerator + " / "+ denominator);
				
				
			}
			
			
			
			
			
			System.out.println("input option: ");
			System.out.println("A- view series, B- simplify fraction, C- balanced number, D- end");
			option = Console.readChar();
		}
		
	}

}
