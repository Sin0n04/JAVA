package School;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate birthday;
    private float[] grades;
    private int absence;

    public Student(String name, LocalDate birthday, int subjects){
        this.absence = 0;
        this.birthday = birthday;
        this.grades = new float[subjects];
        loadRandomGrades(this.grades);
        this.name = name;
    }
    
    
    
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		if (birthday == null) {
			if (other.birthday != null) {
				return false;
			}
		} else if (!birthday.equals(other.birthday)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}




	//methods
    public static void loadRandomGrades(float[] other) {
    	for(int f = 0 ; f < other.length ; f++ ) {
    		other[f] = (float)Math.random()*(11);
    	}
    }
    
    public float averageGrade() {
    	float sum = 0;
    	
    	for(float f : this.grades) {
    		sum += f;
    	}
    	
    	float average = sum / this.grades.length;
    	
    	for(int i = 0 ; i < this.absence ; i ++) {
    		if(i % 10 == 0)
    			average -= 0.5; 
    	}
    	
    	return average;
    	
    }
    
    @Override
    public String toString() {
    	
    	String grades = "";
    	
    	for(Float f : this.grades) {
    		grades.concat(f.toString()); 
    	}
    	
    	return this.name + " born on " + this.birthday + " grades:  " + grades + " And " + this.absence +" Absences";
    }

    
    //setters  and getters
    public float[] getGrades() {
        return grades;
    }

    public int getAbsence() {
        return absence;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }
}
