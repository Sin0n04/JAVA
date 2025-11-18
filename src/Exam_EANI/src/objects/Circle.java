package objects;

public class Circle {
	
	double radius;
	String color;
	static final double PI = 3.14;
	
	//the particular instance calling the method
	Circle(int radius, String color){
		System.out.println();
		
		System.out.println("Creating Circle...");
		this.radius = radius;
		this.color = color;
	}
	
	Circle(){
		
	}
	
	
	double Circlearea() {
		double area = PI *(radius * radius);
		return area;
		
	}
	
	void Displayper() {
		
		 double per = 2*(PI * radius);
		 
		 System.out.print("the perimeter of the circle is:  " + per);
		 
	
	}
	
	
	boolean isAWheel(){
		
		boolean iswheel = false;
		
		if(this.radius >=50 && this.radius <= 80
				&& this.color.equalsIgnoreCase("Black")) {
			iswheel = true;
		}
		
		return iswheel;
	}
	
	void display() {
		System.out.println("Circle radius: " + radius);
		System.out.println("Circle color: " + color);
	}
	
	

}
