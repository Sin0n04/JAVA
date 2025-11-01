package exercises;

public class EX2_8 {
    public static void main(String[] args){

        int num,bnum,pd;

        System.out.println("input number to display its prime factorization:");
        num = Console.readInt();

        System.out.print(num + " = 1");

        bnum = num;
        pd = 2;

        while(bnum != 1){
            if(bnum % pd == 0){
                System.out.print(" * " + pd );
                bnum = bnum / pd;

            }
            else{
                pd++;
            }
        }
    }
}
