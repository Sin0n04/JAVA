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
        this.name = name;
    }


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
