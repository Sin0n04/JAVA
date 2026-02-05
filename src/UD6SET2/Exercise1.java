package UD6SET2;

public class Exercise1 {
	
	public static void loadM(int[][]m ) {
		for (int i = 0; i < m.length; i++) {
			//going through every row
			System.out.println("Student number " + i);
			for(int j = 0 ; j < m[i].length; j++) {
				//for each row, filling the array inside the row(column)
				System.out.println("input grade for subject " + j);
				m[i][j] = Console.readInt();
			}
			
		}
		
		System.out.println("Done...");
	}
	
	public static void view(int[][]m ) {
		for(int i = 0 ; i < m.length ; i++) {
			System.out.println("Student" + i + " | ");
			
			for(int j = 0; j < m[0].length; j++){
				System.out.println(m[i][j] + " | ");
			}
		}
	}

    public static int highAvg(int[][] other){
        double maxavg = 0;
        int maxsub = 0;
        //checking every column
        for (int i = 0; i < other[0].length; i++) {
            //checking every row
            double sum = 0;
            for (int j = 0; j < other.length; j++) {
                sum += other[j][i];
            }
            double avg = sum / other.length;

            if(avg > maxavg){
                maxavg = avg;
                maxsub = i;
            }
        }

        return maxsub + 1;
    }


    public static double[] fails(int[][] other){
        double[] grades = new double[other.length];
        for (int i = 0; i < other.length; i++) {
            double sum = 0;
            for (int j = 0; j < other[0].length; j++) {
                if(other[i][j] < 5){
                    sum++;
                }
            }
            grades[i] = (sum * 100) / other.length;
        }
        return grades;
    }


    public static int[][] merits(int[][] arr){
        int[][] merits = new int[arr.length][4];

        for (int i = 0; i < merits.length; i++) {
            int fails = 0;
            int pass = 0;
            int good = 0;
            int excellent = 0;
            for (int j = 0; j < arr[0].length; j++) {
                int grade = arr[i][j];
                if(grade < 5){
                    fails++;
                }
                else if (grade < 7) {
                    pass++;
                } else if (grade < 9) {
                    good++;

                }
                else {
                    excellent++;
                }
            }

            merits[i][0] = fails;
            merits[i][1] = pass;
            merits[i][2] = good;
            merits[i][3] = excellent;

        }


        return merits;
    }

	
	

	public static void main(String[] args) {
		int nstudent,nsubjects;
		
		System.out.println("input how many students are there: ");
		nstudent = Console.readInt();
		
		System.out.println("input how many subjects are there: ");
		nsubjects= Console.readInt();
		
		int[][] m = new int[nstudent][nsubjects];
		
	}

}
