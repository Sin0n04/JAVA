package UD6SET1;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Rectangle {
    private int side1, side2;

    Rectangle(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;

    }

    Rectangle(){
        //use this to generate a random number between a range.----->
        int max = 90, min = 2;
        Random rand1 = new Random();

        this.side1 = rand1.nextInt(max-min+1)+min;;
        this.side2 = rand1.nextInt(max-min+1)+min;;

    }

    public double areaR(){
        return this.side1 * this.side2;
    }


    @Override
    public String toString(){
        return "Side 1 : " + side1 + " side 2 : " + side2;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2(){
        return side2;
    }
}
