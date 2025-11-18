package accountperson;

public class Person {
	String name;
	int age;
	char gender;
	
	Person(String n,int a, char g){
		
		this.name = n;
		this.age = a;
		this.gender = g;
	}
	Person(){
		
	}
	
	void display() {
		System.out.println("Name of the Holder: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Gender: "+ this.gender);
	}

}
