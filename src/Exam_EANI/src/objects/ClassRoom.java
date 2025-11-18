package objects;

public class ClassRoom {
	//template of a classroom
	
	//attributes
	
	String name;
	int floor,capacity;
	
	//constructors(methods for creating classrooms):
	//defaukt contructor exists if no constructor: classRroom
	
	ClassRoom(String n, int f, int c){
		
		System.out.println("Creating ClassRoom");
		
		name = n;
		floor = f;
		capacity = c;
		
	}
	
	ClassRoom(){
		
	}
	
	
	
	
	//other methods:
	//instance method
	void display() {
		
		System.out.print(name +", floor : "+ floor + ", capacity " + capacity );
	
	}
	
	
	boolean isAccesible() {
		
		if(floor == 0 && capacity >20) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//method for adding more capacity
	
	void addCapacity(int extracap){
		
		capacity += extracap;
		
	}
	// a classroom is similar if they are in the same floor and have similar capacity max diff 5
	boolean isSimilarTo(ClassRoom o){
		int diff = capacity - o.capacity;
		if(diff < 0) {
			diff *= -1;
		}
		
		if(floor== o.floor && diff < 5) {
			return true;
		}
		
		return false;
	}
	
	
	

}
