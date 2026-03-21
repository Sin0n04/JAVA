package Kitchen;

import UD6SET2.Console;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class Chef {
    private ArrayList<Ingredient> ingredients;
    private HashMap<String , Dish> dishes;

    public Chef(ArrayList<Ingredient> ingredients){
        this.dishes = new HashMap<String, Dish>();
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient other){
        if (this.ingredients.contains(other)){
            System.out.println("Same ingredient found. Want to change number of calories?(Y/N)");
            char ans = Console.readChar();
            while(ans != 'Y' && ans != 'y' && ans != 'N' && ans != 'n' ){
                System.out.println("Wong answer input (Y/N): ");
                ans = Console.readChar();
            }

            switch (ans){
                case 'y','Y':
                    System.out.println("input number of calories:");
                    int x = Console.readInt();
                    ingredients.get(ingredients.indexOf(other)).setNcal(x);
                    System.out.println("done...");
                    break;            }
        }
        else {
            ingredients.add(other);
            System.out.println("done...");
        }
    }

    public void addIngredients(ArrayList<Ingredient> other){
        for (Ingredient i : other){
            this.addIngredient(i);
        }
    }

    public void addDish(Dish other){
        Iterator<String> it = this.dishes.keySet().iterator();
        String r = "";
        while(it.hasNext()) {
            r = it.next();
            if (r.equals(other.getName())) {
                System.out.println("Dish already exists...");
            }
        }
        //at this point i should be able to add the dish to the map...

        this.dishes.put(other.getName(), other);

    }

    //check again later...
    public void addRandomDish(String name, int n){
        HashSet<Ingredient> toAdd = new HashSet<>(n);
        for (int i = 0; i < n;) {
            int index = (int)(Math.random() * this.ingredients.size());
            Ingredient in = this.ingredients.get(index);
            if (!toAdd.contains(in)){
                toAdd.add(in);
                i++;
            }
        }

        Dish random = new Dish(name,toAdd);

        if (this.dishes.containsKey(name)){
            System.out.println("Dish already exists...");
        }
        else {
            if (this.dishes.containsValue(random)) {
                System.out.println("A dish with the same ingredients already exists...");
                return;
            }

        }

        this.dishes.put(name,random);
    }

    //double ccheck...
    public void removeCalories(){
        int n = 650;

        Iterator<String> it =  this.dishes.keySet().iterator();
        String key= "";

        while(it.hasNext()) {
            key = it.next();
            Dish d = this.dishes.get(key);

            for (Ingredient i : d.getIngredients()){
                if (i.getNcal() >= n){
                    this.dishes.get(key).getIngredients().remove(i);
                }
            }



        }
    }

}
