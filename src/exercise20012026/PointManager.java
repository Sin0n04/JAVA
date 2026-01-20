package exercise20012026;

public class PointManager {
	Point[] points;
	int useful_pos;
	
	
	public PointManager(int max_size) {
		this.points = new Point[max_size];
		useful_pos = 0;
	}
	
	public void addPoint(Point other, int position ) {
		
		if(points[position - 1] == null) {
			points[position - 1] = other;
			useful_pos++;
			System.out.println("Point added...");
		}
		else {
			System.out.println("position full, try again...");
		}
		
	}
	
	public void Display() {
		for(int i = 0 ; i < points.length ; i++) {
			if(points[i] != null) {
				System.out.print("(" + points[i].x + ","+ points[i].y+ ")"+   " | ");
			}
			else {
				System.out.print(" Null |");
			}
		}
	}
	
	public Point nearestTo00() {
		//returns nearest point
		Point nearest = new Point(100,100);
		
		for(int i = 0 ; i < points.length ; i++ ) {
			if(points[i] != null) {
				if(points[i].distanceTo00() < nearest.distanceTo00()) {
					nearest = points[i];
				}
			}	
		}
		return nearest;
	}
	
	
	public void compact() {
		//still wrong... Check the logic..
		Point[] compacted = new Point[useful_pos];
		
		for(int i = 0 ; i < this.points.length ;i++) {
			int j = 0;
			if(this.points[i] != null) {
				compacted[j] = points[i];
				j++;
			}
		}
		points = compacted;
	}
	
	
	public static void main(String[] args) {
		
		Point p1 = new Point(4,2);
		Point p2 = new Point(10,1);
		Point p3 = new Point(6,3);
		
		PointManager manager = new PointManager(10);
		
		manager.addPoint(p2, 1);
		manager.addPoint(p1, 5);
		manager.addPoint(p3, 9);
		
		manager.Display();
		
		System.out.println();
		
		System.out.println("nearest to 0,0: " + manager.nearestTo00().x + "," + manager.nearestTo00().y);
		
		manager.compact();
		manager.Display();
	}

}
