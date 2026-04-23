package Sales;


public class Mobilephone {
    private String number;
    private double balance;

    public Mobilephone(String number,double balance){
        this.balance = balance;
        this.number = number;
    }
    public Mobilephone(String number){
        this.balance = 0;
        this.number = number;
    }

    public void view(){
        System.out.println("Number: " + this.number + " balance: " + balance);
    }

    public void topUp(double ammount){
        this.balance += ammount;
    }

    public void call(int minutes){
        int price = minutes * 2;
        if(this.balance < price){
            System.out.println("not enough balance to make call....");
            return;
        }
        for (int i = minutes; i > 0 ; i--) {
            this.balance -= 2;
        }
    }





    //getters and setters....
    public double getBalance() {
        return balance;
    }

    public String getNumber() {
        return number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
