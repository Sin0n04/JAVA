package Kitchen;

import java.util.HashSet;

public class Dish {
    private String name;
    private HashSet<Ingredient> ingredients;

    public Dish(String name, HashSet<Ingredient> ingredients){
        this.ingredients = ingredients;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }


    public String getName() {
        return name;
    }

    public HashSet<Ingredient> getIngredients() {
        return ingredients;
    }
}
