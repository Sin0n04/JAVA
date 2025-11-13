package Exercises_1st_term;

public class EX3_2 {
    public static void main(String[] args){
        int amount,c,rate,years,n,count;
        float r,power,payment,total;

        System.out.println("input amount to be financed: ");
        amount = Console.readInt();

        System.out.println("input anual interest rate(0-100): ");
        rate = Console.readInt();

        System.out.println("input number of years to repay loan: ");
        years = Console.readInt();

        power = 1;
        n = years * 12;
        c = amount;
        r = (float) rate / 100;
        count = 1;

        while(count <= n){
            power *= (1/(1+r));
            count++;
        }

        payment = ((c*r)/(1-power));
        total = payment * n;

        System.out.println("if we borrow " + amount + " at " +rate+ "% interest to be paid in " + years+ " years, the monthly payment would be " + payment +" and the total payment: " + total  );

    }
}
