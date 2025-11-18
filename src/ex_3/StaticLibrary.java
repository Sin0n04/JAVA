package ex_3;

public class StaticLibrary {
	
	
	static void showMultipleOf5(int n1, int n2) {
		
		for(int count = n1; count <= n2; count++) {
			if(count % 5 == 0) {
				System.out.println(count);
			}
		}
	}
	
	public static void main(String[] args) {
		int n1,n2;
		
		n1 = Console.readInt();
		n2 = Console.readInt();
		
		StaticLibrary.showMultipleOf5(n1, n2);
	}

}
