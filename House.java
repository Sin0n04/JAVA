package city;

public class House {
	int yearOfConstruction;
	double area;
	String address;
	
	House(int y, double a, String add){
		this.address = add;
		this.area = a;
		this.yearOfConstruction = y;
		
		
		
	}
	
	House(String address, double area){
		this.address = address;
		this.area = area;
		
	}
	
	
	boolean isNew() {
		return (this.yearOfConstruction > 2000);
	}
	
	 double valuation() {
		if(this.yearOfConstruction >2000) {
			return (2100 * this.area);
		}
		return (1300 * this.area);
	}
	
	

}
