package account1;

public class test {
	public static void main(String[] args) {
		BankAccount c1,c2,c3;
		
		c1 = new BankAccount("Juan Lopez");
		c2 = new BankAccount("Ana Aguirre");
		c3 = new BankAccount("Jorge Gil", 800);
		
		
		c1.view();
		c2.view();
		c3.view();
		System.out.println();
		c1.deposit(500);
		c2.deposit(2000);
		c3.deposit(100);
		System.out.println();
		c1.view();
		c2.view();
		c3.view();
		System.out.println();
		c1.withdraw(100);
		c2.withdraw(100);
		c3.withdraw(100);
		System.out.println();
		c1.view();
		c2.view();
		c3.view();
		System.out.println();
		c1.withdraw(500);
		c2.withdraw(500);
		c3.withdraw(500);
		
		
		c3.deposit(200000000);
		System.out.println();
		c1.view();
		c2.view();
		c3.view();
		System.out.println();
		c3.transfer(c1, 100);
		
		c1.view();
		c2.view();
		c3.view();
		
		
	}

}
