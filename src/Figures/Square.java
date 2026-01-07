package Figures;

public class Square extends Figure{
    protected double side;
    protected static double total_area_s;

   public Square(double side){
        this.side = side;
        this.area = Math.pow(side,2);
        this.perimeter = side * 4;
        total_area_s =+ this.area;
    }
}
