package objects;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassRoom c1; //null object
		c1 = new ClassRoom();
		c1.name="Clase dw1A";
		c1.floor = 1;
		c1.capacity = 25;
		
		
		ClassRoom c2 = new ClassRoom();
		c2.name = "Dw1B";
		c2.floor = 0;
		c2.capacity = 30;
		
		ClassRoom c3 = new ClassRoom("clase SI1", 0,15);
		c3.floor++;
		c3.name += "(Instituto Ciudad Jardin)";
		
		
			
		
		//System.out.print(c3.name + ": " + c3.floor + " Floor " + c3.capacity + " capacity");
		c1.addCapacity(10);
		c1.display();
		c2.display();
		c3.display();
		
		
				
		boolean acc = c2.isAccesible();
		if(acc == true) {
			System.out.print("it is accesible");
		}
		else {
			System.out.print("it is not accesible");
			
		}// if(c1.Is.Accesible()){}
		
		if(c1.isSimilarTo(c2)) {
			System.out.print("the classes are similar");
		}
		else {
			System.out.print("the classes are not similar");
		}

	}

}
