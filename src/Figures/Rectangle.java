package Figures;

public class Rectangle extends Figure {
    protected double base, height;
    protected static double total_area_r;

   public Rectangle(double base, double height ){
        this.base = base;
        this.height = height;
        this.area = base * height;
        this.perimeter = (2 * base) + (2 * height);
        total_area_r =+ this.area;
    }
}
