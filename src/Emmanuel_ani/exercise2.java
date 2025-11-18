package Emmanuel_ani;

public class exercise2 {

	public static void main(String[] args) {
		
	int n,count = 1, h, m,duration,tickets,tcounter,age,adultcounter=0,triphours,dursum= 0,under24=0;
	float price,max_price = 0;
	char id,max_id = '\n';
	boolean all_adults = true;
	
	
	System.out.println("input number of trains");
	n = Console.readInt();
	
	while( count <= n ) {
		System.out.println("input number identifier");
		id = Console.readChar();
		System.out.println("input departure time(hours + minutes ");
		
		h = Console.readInt();
		while( h < 0 || h > 23) {
			System.out.println("input departure time(hours):");
			h = Console.readInt();
			
		}
		m = Console.readInt();
		while( m < 0 || m > 59) {
			System.out.println("input departure time(minutes):");
			m = Console.readInt();
			
		}
		
		System.out.println("input trip duration in minutes: ");
		duration = Console.readInt();
		
		triphours = duration / 60;
		
		
		if(h+triphours < 24 ) {
			dursum = dursum + duration;
			under24++;
		}
		
		System.out.println("input number of tickets sold");
		tickets = Console.readInt();
		tcounter = 1;
		
		while(tcounter <= tickets) {
			System.out.println("input age: ");
			age = Console.readInt();
			if (age < 18) {
				all_adults = false;
			}
			
			System.out.println("input price paid");
			price = Console.readInt();
			if(price > max_price) {
				max_price = price;
				max_id = id;
			}
			tcounter++;
		}
		if(all_adults) {
			adultcounter++;
		}
		
		count++;
	}
	System.out.println("the percentage of all adult trais is:" + ((adultcounter /100)*n));
	System.out.println("the average time for trains tha arrive on the same day is "+ ((dursum/under24)/60)+ "H AND " +((dursum/under24)/60) + "M");
	System.out.println("the identifyer of the trai with the highest price is"+ max_id+ " with the price of: "+ max_price);

	
	
	

	}

}
