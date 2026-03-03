package PointList;
import java.util.ArrayList;
import java.util.Iterator;

public class PArrayList {
    private ArrayList<Point> list;

    public PArrayList(){
        this.list = new ArrayList<>();
        list.add(new Point(0, 0));
        list.add(new Point(-1, 1));
        list.add(new Point(2, 1));
        list.add(new Point(2, 3));
        list.add(new Point(3, 1));
        list.add(new Point(3, 2));
        list.add(new Point(1, 3));
    }

    public PArrayList(ArrayList<Point> list){
        this.list = list;
    }

    public void display(){
        for(Point point : this.list){
            System.out.print(point + " | ");
        }
    }
    
    public ArrayList<Point> reverseOrder(){
    	ArrayList<Point> reversed = new ArrayList<Point>();
    	//DONT FORGET TO ADD -1 TO THE LIST SIZE IF YOUR USING IT AS AN INDEX!!!!
    	for(int i = this.list.size()- 1; i >= 0 ; i-- ) {
    		reversed.add(this.list.get(i));
    	}
    	
    	return reversed;
    }
    
    
    public Point first2Quad() {// returns the first point in the second quadrant within the list if no point is found return null... 
    	Iterator<Point> it = this.list.iterator();
    	while(it.hasNext()) {
    		Point p = it.next();
    		if (p.getX() < 0 && p.getY() > 0) {
    			return p; 
    		}
    		
    	}
    	return null;
    }
    
    public void first11() {
    	Point p = new Point(1,1);
    	if(this.list.contains(p)) {
    		System.out.println("The point is inside the arraylist");
    	}
    	else {
    		System.out.println("The point is not inside the arraylist");
    	}
    }
    
    
    public void first00() {
    	Iterator<Point> it = this.list.iterator();
    	
    	while(it.hasNext()) {
    		Point p = it.next();
    		if(p.getX() == 0 && p.getY() == 0) {
    			System.out.println("Index of the first (0,0): " + this.list.indexOf(p));
    			return;
    		}
    	}
    	System.out.println("The ArrayList does not contain any (0,0) Points...");
    	
    }
    
    public void deleteover10() {
    	for(int i = 0 ; i < this.list.size() ; i++) {
    		if(list.get(i).distance00() < 10) {
    			this.list.remove(i);
    			System.out.println("Done....");
    			return;
    			
    		}
    	}
    	System.out.println("Not able to remove any point...");
    }
    
    
    public void remove4Qua() {//removes points located in the 4th quadrant..
    	Iterator<Point> it = this.list.iterator();
    	while(it.hasNext()) {
    		Point p = it.next();
    		if(p.getX() >= 0 && p.getY() < 0 ) {
    			it.remove();
    		}
    	}
    	
    }
    
    
    public static void main(String[] args) {
    	PArrayList list = new PArrayList();
    	
    	list.display();
    	
    	ArrayList<Point> list2 = new ArrayList<Point>();
    	
    	int i = 1;
    	while(list2.size() < 10) {
    		list2.add(new Point(i, i+1));
    		i++;
    	}
    	
    	PArrayList list3 = new PArrayList(list2);
    	
    	System.out.println();
    	
    	list3.display();
    	
    	System.out.println();
    	
    	ArrayList<Point> listreversed = list.reverseOrder();
    	
    	
    	for(Point p : listreversed) {
    		System.out.print(p.toString() + " | ");;
    	}
    	
    	System.out.println();
    	
    	System.out.println(list.first2Quad().toString());
    	
    	
    	
    	
    }
}
