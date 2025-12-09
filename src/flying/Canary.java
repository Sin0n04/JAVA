package flying;

public class Canary extends Bird {
	double size;
	
	Canary(char s, int a){
		super(s,a);
	}
	
	Canary(char s, int a, double size){
		super(s,a);
		this.size = size;
	}
	
	void height() {
		
		if( this.size < 15) {
			System.out.println("Short");
		}
		else {
			if(this.size < 30) {
				System.out.println("Medium");
			}
			else {
				System.out.println("Tall");
			}
		}
		
	}

}
