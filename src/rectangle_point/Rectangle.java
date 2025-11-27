package rectangle_point;

public class Rectangle {
	Point ref_point;
    int width,height;

    Rectangle(Point r , int w, int h){
        this.height = h;
        this.width = w;
        this.ref_point = r;
    }

    Rectangle(int w, int h){
        this.height = h;
        this.width = w;
    }


    Rectangle(int w, int h, int x, int y){
        this.height = h;
        this.width = w;
        this.ref_point = new Point(x,y);
    }

    int area(){
        return this.height * this.width;
    }

    boolean isSquare(){
        return this.width == this.height;
    }

    void show(){
        System.out.println("Rectangle: height " + this.height + " width: " + this.width + "Ref Point: " + this.ref_point);
    }





	

}
