package exercise20012026;

public class Point {
	int x,y;
	
	//constructor
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	//calculates distance to (0,0)....
	
	public double distanceTo00() {
		double result;
		
		result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) );
		
		return result;
	}
	
	
}
