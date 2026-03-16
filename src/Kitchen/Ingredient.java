package Kitchen;

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
}
