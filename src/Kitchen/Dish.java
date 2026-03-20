package Kitchen;

import java.util.HashSet;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Objects.equals(getName(), dish.getName()) && Objects.equals(getIngredients(), dish.getIngredients());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getIngredients());
    }

    public HashSet<Ingredient> getIngredients() {
        return ingredients;
    }
}
