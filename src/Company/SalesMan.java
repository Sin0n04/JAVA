package Company;

import java.io.Serializable;

public class SalesMan implements Serializable {
    String name;
    double salary;
    Mobilephone phone;

    public SalesMan(String name, double salary, Mobilephone phone) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public SalesMan(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setPhone(Mobilephone phone) {
        this.phone = phone;
    }

    @Override
    public String toString(){
        return "name: " + name + "phone: " + phone.toString() + "salary: " + salary;
    }
}
