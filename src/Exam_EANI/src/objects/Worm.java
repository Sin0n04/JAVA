package objects;

public class Worm {
	//instance attributes each worm has its own
	String name;
	int size;
	boolean layed;
	
	//static attributes all worms share these
	static int totalworms=0;
	
	
	Worm(String name, int size, boolean layed){
		this.name = name;
		this.size = size;
		this.layed = layed;
		totalworms++;
	}
	
	Worm(String name){//for worm newborns
		this.name = name;
		this.size = 1;
		this.layed = true;
		totalworms++;
	}
	
	void feed(int amount, char type) {
		
		//iff we feed a worm with grass( g or G) size +1* amount
		// iff we feed a worm with a leaf(l or L) size 2+ amount
		// if fed by something else it does not grow
		
		switch(type) {
			
			case 'G','g':
				System.out.println("thanks for the grass!");
				this.size += amount;
				break;
			case 'l','L': 
				System.out.println("thanks for the leaves!");
				this.size += (2*amount);
				break;
			default: System.out.println("i just want grass or leaves!");
				
		}
		
	}
	
	void show(){
		
		String position;
		/*
		 * if(layed) { position= "layed"; } else { position = "standing"; }
		 */
		
		position = (layed == true)?"layed":"standing";
		
		
		System.out.print(name + ", size " + size + " position " + position+ "\t");
		
		drawBody();
		
		System.out.println();
		
	}
	
	void drawBody() {
		
		if(layed) {
			for(int c=1;c<=size;c++) {
				System.out.print("O");
			}
		}
		else {
			for(int i = 1; i<= size ; i++ ) {
				System.out.println("O");
			}
			
		}
		
		
		
	}
	
	boolean dance(int min){
		//each minute dancing it looses -2 size
		//if its laying it can't dance
		//it returns whether its been able to dance till the end
		
		if(layed) {
			return false;
			
		}

		if(this.size -(min*2) < 0) {
				return false;
		}
		else {
			return true;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Worm w1 = new Worm("mariano", 5, true);
		w1.show();
		
		Worm w2 = new Worm("Jonathan");
		
		
		//System.out.println(Worm.totalworms);
		w1.show();
		w1.feed(5,'G');
		w1.show();
		boolean ok = w1.dance(5);
		if(ok) {
			System.out.println("good dancing");
		}
		else {
			System.out.println("impossible to dance");
		}
	}

}
