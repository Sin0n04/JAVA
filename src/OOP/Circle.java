package OOP;

public class Circle {
    static final double PI = 3.14;

    double radius;
    String color;

    Circle(double radius, String color){
        this.color = color;
        this.radius= radius;
    }

    void DisplayPer(){
        double per = 2 * PI * this.radius;
        System.out.println(per);

    }

    double circlearea(){
        double area = 2 * (this.radius * this.radius);
        return area;
    }

    void Display(){
        System.out.println("radius: " + radius + " color: " + color);
    }
}
