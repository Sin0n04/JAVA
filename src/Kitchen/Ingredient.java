package Kitchen;

import java.util.Objects;

public class Ingredient {
    private String name;
    private int ncal;

    Ingredient(String name, int ncal){
        this.name = name;
        this.ncal = ncal;
    }

    @Override
    public String toString(){
        return "Name: " + name + " number of calories: " + ncal;
    }

    public int getNcal() {
        return ncal;
    }

    public String getName() {
        return name;
    }

    public void setNcal(int ncal) {
        this.ncal = ncal;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return ncal == that.ncal && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ncal);
    }
}
