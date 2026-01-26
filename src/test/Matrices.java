package test;

public class Matrices {
	
	public static void viewZ(int[][] matrix) {
		int rowlimit = matrix.length;
		int collimit = matrix[0].length;
		
		//last row->->
		for(int i = collimit - 1; i >= 0; i--) {
			System.out.println(matrix[rowlimit-1][i] + " \t ");
		} 
		
		//diagonal
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
