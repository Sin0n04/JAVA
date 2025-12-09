package flying;

public class Bird {
	char sex;
	int age,newbirdcount = 0 ;
	
	
	Bird(char s, int a){
		this.sex = s;
		this.age = a;
		newbirdcount++;
	}
	
	
	
	int newbirds() {
		return newbirdcount;
	}
	
	
	void whoAmI() {
		System.out.println("sex: " + this.sex + " age: " + this.age);
	}
	

}
