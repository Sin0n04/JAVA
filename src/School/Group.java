package School;
import java.util.ArrayList;

public class Group {
	private String name;
	private ArrayList<Student> group;
	
	
	public Group(String name) {
		this.name = name;
		this.group = new ArrayList<Student>();
		
	}
	
	//methods
	
	public void addStudent(Student other) {
		for(Student s : this.group ) {
			if (s.equals(other)) {
				System.out.println(" Student already in the group...");
			}
		}
		
		group.add(other);
		System.out.println("Student Added.");
		
	}
	
	public Student bestStudent() {
		float maxgrade = 0; 
		Student best = null; 
		for(Student s : this.group) {
			
			float grade = s.averageGrade();
			
			if(grade > maxgrade) {
				maxgrade = grade;
				best = s;
			}
		}
		return best;
	}
	
	public void view() {
		
	}

}
