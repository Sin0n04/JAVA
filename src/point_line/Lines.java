package point_line;

public class Lines {

    int thickness;
    double x,y;
    Points sp,ep;

    Lines(int t, Points p1, Points p2){
        this.thickness = t;
        this.sp = p1;
        this.ep = p2;
        //finish at home BEFORE saturday.
    }

    Lines(int t, int x1, int x2,int y1,int y2){
        this.thickness = t;
        this.sp = new Points(x1, y1);
        this.ep = new Points(x2,y2);
    }

    boolean isVertical(){
        return ep.x == sp.x;
    }

    boolean isHorizontal(){
        return sp.y == ep.y;

    }

    void show(){
        System.out.println("thickness: " + thickness);
        sp.show();
        ep.show();
    }

    double length(){
        double c1,c2;
        c1 = sp.y - ep.y;
        c2 = sp.x - ep.x;
        return Math.sqrt((c1*c1)+(c2*c2));
    }


}
