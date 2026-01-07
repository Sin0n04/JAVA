package UD5SET2;

public class Point {
    private double x, y;

    Point(double x , double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        //return to string override
        return "Point representation: ( " + this.x +" , " + this.y + " )";
    }

    public double distanceToOrigin(){
        // calculates distance to point (0,0) from instantiated point
        double distance;
        distance = Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
        return distance;
    }

    public double calculateDistance(Point other){
        return Math.sqrt((Math.pow((this.x - other.x),2) + (Math.pow((this.y - other.y),2))));
    }

    public int calculateQuadrant(){
        if(this.x > 0 && this.y > 0 ){
            return 1;
        }
        if(this.x < 0 && this.y > 0 ){
            return 2;
        }
        if(this.x < 0 && this.y < 0 ){
            return 3;
        }
        if(this.x > 0 && this.y < 0 ){
            return 4;
        }
        return 0;
    }
}
