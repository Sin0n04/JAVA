package School;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

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
	
	//main
	
	public static void main(String[] args) {
		
		Group g = new Group("DW1");
		
		Student s1 = new Student("Ramon", LocalDate.now(), 6);
		Student s2 = new Student("Lorea", LocalDate.now(), 6);
		Student s3 = new Student("Juan", LocalDate.now(), 6);
		
		g.addStudent(s1);
		g.addStudent(s2);
		g.addStudent(s3);
		
		g.view();
		
		System.out.println("the best student in the group " + g.name + " is "+ g.bestStudent());
		
		Collections.sort(g.group);
		
		g.view();
		
		ComparatorByGrade comparegrade = new ComparatorByGrade();
		
		Collections.sort(g.group, comparegrade);
		
	}
	

}
