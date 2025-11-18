package overdraftaccount;

public class BankAccount {
	String holder;
	double balance;
	boolean IsOverdrawn;
	
	BankAccount(String h){
		this.holder = h;
		this.balance = 0;
		this.IsOverdrawn = false;
	}
	
	BankAccount(String h, double b){
		
		this.holder = h;
		this.balance = b;
		this.IsOverdrawn = false;
		
	}
	
	
	void view() {
		System.out.println("Holder: " + holder );
		System.out.println("Balance " + balance+ "€" );
		
		if(balance >= 1000000) {
			System.out.println("- VIP Account!");
		}
		
	}
	
	void withdraw(double wit) {

		this.balance -= wit;
		
		if(this.balance < 0) {
			this.IsOverdrawn = true;
			System.out.println("Account Overdrawed by : " + (this.balance*-1)+ "€");

		}
		
		
	}
	
	void deposit(double dep) {
		double bal;
		bal = this.balance + dep;
		this.balance += dep;
		
		if(bal < 0) {
			this.IsOverdrawn = true;
			System.out.println("Overdrawed account...");
		}
	
	}
	
	void transfer(BankAccount other, double ammount){
		
		if(ammount < this.balance) {
			other.balance += ammount;
			this.balance -= ammount;
			
		}
		else {
			other.balance += ammount;
			this.balance -= ammount;
			this.IsOverdrawn = true;
			System.out.println("Account Overdrawed by : " + (this.balance*-1)+ "€");
		}
		
	}
	

}
