package flying;

public class Parrot extends Bird {
	
	char region;
	String color;
	
	
	Parrot(int a , char s, char reg, String col){
		
		super(s, a);
		this.region = reg;
		this.color = col;
	}
	
	
	void whereAreYouFrom() {
		switch(this.region) {
		case 'N','n':
			System.out.println("North");
			break;
		case 'W', 'w':
			System.out.println("West");
			break;
		case 's', 'S':
			System.out.println("South");
			break;
		case 'e', 'E':
			System.out.println("East");
			break;
		}
	}
	

}
