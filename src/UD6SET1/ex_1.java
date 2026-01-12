package UD6SET1;

public class ex_1 {

    public static float averageArr(float[] arr){
        float sumgrades = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sumgrades += arr[i];
        }
        return sumgrades/(arr.length);
    }
    public static void main(String[] args){
        final int N = 10;
        float grade,max_grade = 0, gradecount = 0;
        float[] grades = new float[N];

        for (int i = 0 ; i < N; i++){
            System.out.println("input grade...");
            grade = Console.readFloat();
            if(grade < 0 || grade > 10){
                while(grade < 0 || grade > 10){
                    System.out.println("Bad grade(1-10), input grade...");
                    grade = Console.readFloat();
                }
            }
            grades[i] = grade;
        }

        float avg = averageArr(grades);

        for (int i = 0 ; i < grades.length ; i++){
            if(grades[i] > avg){
                System.out.println("grade over average at index: " + i + " , grade: " + grades[i]);
            }
            if (grades[i] > max_grade) {
                max_grade = grades[i];
                gradecount = 1;
            }
            else{
                if (grades[i] == max_grade) {
                    gradecount++;
                }
            }
        }
        System.out.println("Current max grade: " + max_grade + " number of times it appeared: " + gradecount);


    }

}
