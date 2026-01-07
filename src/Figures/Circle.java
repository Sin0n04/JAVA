package Figures;

public class Circle extends Figure{
    protected double radius;
    protected static double total_area_c;

    public Circle(double radius){
        this.radius = radius;
        this.area = (Math.PI * Math.pow(radius,2));
        this.perimeter = (2 * Math.PI * radius);
        total_area_c =+ this.area;
    }


}
