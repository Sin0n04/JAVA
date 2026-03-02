package PointList;
import java.util.ArrayList;
import java.util.Iterator;

public class PArrayList {
    private ArrayList<Point> list;

    public PArrayList(){
        this.list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            Point p= new Point(i, i + 1) ;
            this.list.add(p);
        }
    }

    public PArrayList(ArrayList<Point> list){
        this.list = list;
    }

    public void display(){
        for(Point point : this.list){
            System.out.print(point + " | ");
        }
    }
}
