package account1;

public class BankAccount {
    String holder;
    double balance;

    BankAccount(String h){
        this.holder = h;
        this.balance = 0;
    }

    BankAccount(String h, double b){

        this.holder = h;
        this.balance = b;

    }


    void view() {
        System.out.println("Holder: " + holder );
        System.out.println("Balance " + balance+ "€" );

        if(balance >= 1000000) {
            System.out.println("- VIP Account!");
        }

    }

    void withdraw(double wit) {

        if(wit < this.balance) {
            this.balance -= wit;
        }
        else {
            System.out.println("Not Enough Balance to Withdraw....");
        }

    }

    void deposit(double dep) {
        this.balance += dep;
    }

    void transfer(BankAccount other, double ammount){

        if(ammount < this.balance) {
            other.balance += ammount;
            this.balance -= ammount;

        }
        else {
            System.out.println("INSUFITIENT FUNDS TO COMPLETE TRANSACCTION!");
        }

    }


}
