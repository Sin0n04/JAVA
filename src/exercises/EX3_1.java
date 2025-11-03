package exercises;

public class EX3_1 {
    public static void main(String[] args){

        int n,num,avg,sumprime,count,pd,current;

        System.out.println("input starting number: ");
        num = Console.readInt();
        System.out.println("input ammount of prime numbers to display: ");
        n = Console.readInt();
        System.out.println();

        sumprime = 0;

        count = 1;
        current = num ;
        while(count<=n){

            boolean is_prime = true;
            pd = 2;
            while(pd <= current/2){
                if ((current % pd) == 0) {
                    is_prime = false;
                    break;
                }
                pd++;
            }

            if(is_prime){
                System.out.println(current);
                sumprime += current;
                count++;
            }
            current++;
        }
        avg = sumprime / n;
        System.out.println("the average of the prime numbers given is : " + avg);
    }
}
