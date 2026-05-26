package UD9;

public class Ciclo {
    String cycle_name,type;

    public Ciclo(String cycle_name,String type) {
        this.cycle_name = cycle_name;
        this.type = type;
    }

    @Override
    public String toString() {
        return cycle_name+"("+  type + " )";
    }
}
