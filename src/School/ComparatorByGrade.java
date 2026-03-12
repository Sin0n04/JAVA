package School;

import java.util.Comparator;

public class ComparatorByGrade implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.averageGrade() > o2.averageGrade()) {
			return 1;
		}
		else {
			if(o1.averageGrade() < o2.averageGrade()) {
				return - 1;
			}
		}
		return 0;
	}

}
