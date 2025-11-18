package objects;

public class House {
	
	String address;
	double area;
	char type;
	
	
	
	
	
	
	void show() {
		switch(type) {
		case 'f':
			System.out.println("Flat at c/ " + this.address +", Area: " + this.area  +  "m2");
			break;
		case 'd':
			System.out.println("house at c/ " + this.address +", Area: " + this.area + "m2");
			break;
		default:
			System.out.println("not a valid type of house....");
		}
	}
	
	double giveMeTax(){
		double tax = 0;
		if(this.area <60) {
			tax = 0;
		}
		if(this.area >= 60 && this.area <= 80) {
			tax = this.area * 4.5;
		}
		if(this.area > 80) {
			tax = this.area * 5.5;
		}
		
		return tax;
	}
	
	
	boolean canBeSold(){
		if(this.type =='d') {
			return true;
		
		}
		
		if(this.type == 'f') {
			if(this.area >= 100) {
				return true;
			}
		}
			
		return false;
		}
	
	boolean IsSimilar( House other ) {
		
		if(this.type == other.type) {
			if((this.area - other.area) >= (-10)&& (this.area - other.area ) <= 10) {
				return true;
			}
			return false;
		}
		return false;
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		House h1 = new House();
		h1.address = " C/ Rioja, 18";
		h1.area = 65;
		h1.type = 'f';
		
		House h2 = new House();
		h2.address = "C/ Alava, 5 ";
		h2.area = 150;
		h2.type = 'd' ;
		
		House h3 = new House();
		h3.address = " /C Gorbea, 23";
		h3.area = 105.5;
		h3.type = 'f';
		
		
		h1.show();
		h2.show();
		h3.show();
		
		h2.area -= 5;
		
		
		h1.show();
		h2.show();
		h3.show();
		
		System.out.println("the tax to pay for house 1 is : " + h1.giveMeTax()) ;
		System.out.println("the tax to pay for house 2 is : " + h2.giveMeTax()) ;
		System.out.println("the tax to pay for house 3 is : " + h3.giveMeTax()) ;
		
		
		System.out.println("is house 1 sellable? : " + h1.canBeSold() );
		System.out.println("is house 2 sellable? : " + h2.canBeSold() );
		System.out.println("is house 3 sellable? : " + h3.canBeSold() );
		
		System.out.println("is house 2 similar to house 3?: " + h2.IsSimilar(h3));
		System.out.println("is house 1 similar to house 3?: " + h1.IsSimilar(h3));
		
		h1.area += 35;
		System.out.println("is house 1 similar to house 3?: " + h1.IsSimilar(h3));
		
		
		
		
		
		
	}

}
