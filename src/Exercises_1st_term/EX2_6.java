package Exercises_1st_term;

public class EX2_6 {
    public static void main(String[] args){

        int n1,n2 = 0,divsum,divsum2=0,pd=1,pd2 = 1,number1=0;

        System.out.println("input number to check if it has an amicable number: ");
        n1 = Console.readInt();

        number1 = n1;
        divsum = 0;

        while(pd < n1){
            if ( number1 % pd == 0 ){
               divsum += pd;
            }

            pd++;
        }
        n2 = divsum;

        while(pd2<n2){
            if ( n2 % pd2 == 0 ){
                divsum2 += pd2;
            }

            pd2++;
        }
        if(divsum2 == n1){
            System.out.println("the number " + n1 + " is an amicable number with: " + divsum);
        }
        else{
            System.out.println("the number " + n1 + " is not an amicable number.");
        }







    }
}
