package UD8;

public class SumNumbers {
    public static void main(String[] args){
        int sum = 0 ,sumexcep = 0 ;

        for (int i = 0; i < args.length; i++) {
            try {
                int x = Integer.parseInt(args[i]);
                sum += x;
            }catch (NumberFormatException nfe){
                System.out.println(args[i] + " Could not be Summed");
                sumexcep++;
            }
        }

        System.out.println("Total sum: " + sum);
        System.out.println("Numbers that could not be summed: " + sumexcep);

    }
}
