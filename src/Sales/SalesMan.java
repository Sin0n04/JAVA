package Sales;

import java.io.Serial;
import java.io.Serializable;

public class SalesMan implements Serializable {
    private String name;
    private Mobilephone phone;
    private double salary;

    @Serial
    private static final long serialVersionUID = 1L;

    public SalesMan(String name, Mobilephone phone, double salary){
        this.name = name;
        this.salary = salary;
        this.phone = phone;
    }

    public SalesMan(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void view(){
        System.out.println("Number: " + this.phone + " salary: " + this.salary + " name: " + name);
    }

    public void work(){
        this.salary += 10;
        this.phone.call(15);
    }

    public void work(int inc , int m){
        this.salary += inc;
        this.phone.call(m);
    }

    public String getName() {
        return name;
    }
}
