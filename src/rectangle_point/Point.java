package rectangle_point;

public class Point {
    int x,y;


    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    void show(){
        System.out.println(" ( " + this.x + " , " + this.y + " ) ");
    }
}
