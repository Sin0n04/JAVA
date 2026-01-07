package Figures;

public class Figure {
    protected double area, perimeter;
    public static double total_area;

    Figure(double area, double perimeter){
        this.area = area;
        this.perimeter = perimeter;
        total_area =+ this.area;
    }

    Figure(){
    }

    static void getTotal_area(){
        System.out.println(total_area);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }

}
