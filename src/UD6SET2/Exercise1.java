package UD6SET2;

public class Exercise1 {
	
	public static void loadM(int[][]m ) {
		for (int i = 0; i < m.length; i++) {
			//going through every row
			System.out.println("Student number " + i);
			for(int j = 0 ; j < m[i].length; j++) {
				//for each row, filling the array inside the row(column)
				System.out.println("input grade for subject " + j);
				m[i][j] = Console.readInt();
			}
			
		}
		
		System.out.println("Done...");
	}
	
	public static void view(int[][]m ) {
		for(int i = 0 ; i < m.length ; i++) {
			System.out.println("Student" + i + " | ");
			
			for(int j = 0; j < m[0].length; j++){
				System.out.println(m[i][j] + " | ");
			}
		}
	}
	
	
	

	public static void main(String[] args) {
		int nstudent,nsubjects;
		
		System.out.println("input how many students are there: ");
		nstudent = Console.readInt();
		
		System.out.println("input how many subjects are there: ");
		nsubjects= Console.readInt();
		
		int[][] m = new int[nstudent][nsubjects];
		
	}

}
