package objects;

public class test_circle {

	public static void main(String[] args) {
		
		Circle c1;
		c1 = new Circle();
		c1.radius = 70;
		c1.color = "White";
		
		Circle c2 = new Circle(65,"Black");
		
		c1.display();
		c2.display();
		c1.Displayper();
		System.out.println(c1.Circlearea());
		
		

	}

}
