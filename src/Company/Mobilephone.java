package Company;

import java.io.Serializable;

public class Mobilephone implements Serializable {
    String number;
    double balance;

    public Mobilephone(String number,double balance) {
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "Number:" + number + " Balance: " + balance;
    }
}
