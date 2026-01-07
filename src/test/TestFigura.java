package test;

import Figures.Circle;
import Figures.Rectangle;
import Figures.Square;
import Figures.Figure;

public class TestFigura {
    public static void main(String[] args){
        Circle c1,c2,c3;
        Circle total_area =

        c1 = new Circle(3);
        System.out.println("area of the circle: " + c1.getArea());
        Square square = new Square(3);
        System.out.println("area of the Square: " + square.getArea());
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println("area of the rectangle: " + rectangle.getArea());

        System.out.println("Total area of figures created: ");
        System.out.println(Figure.total_area);



    }
}
