package Figures;

public class Figure {
    private double area, perimeter;

    Figure(double area, double perimeter){
        this.area = area;
        this.perimeter = perimeter;
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
