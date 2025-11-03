package exercises;

public class EX3_3 {
    public static void main(String[] args){
        int a,b,r,gcd;
        boolean gcd_found = false;

        System.out.println("input first number: ");
        a = Console.readInt();

        System.out.println("input second number: ");
        b = Console.readInt();

        gcd = 0;
        while(!gcd_found){
            r = a % b;
            if (r == 0){
                gcd_found = true;
                gcd = b;
            }
            else{
                a = b;
                b = r;
            }



        }
        System.out.println("gcd is : " + gcd);

    }
}
