package exercises;

public class EX2_5 {
    public static void main(String[] args){
        int base,digit,num,decimal;
        boolean is_binary = true;


        System.out.println("input integer to transform to binary: ");
        num = Console.readInt();

        base = 1 ;
        decimal = 0;

        while (num > 0 && is_binary){

            digit = num % 10;

            if (digit != 1 && digit != 0){
                is_binary = false;
            }

            decimal += (base*digit);
            base *= 2;
            num /= 10;
        }

        if (is_binary){
            System.out.println("decimal equivalent: " + decimal);
        }
        else{
            System.out.println("Not a Binary number");
        }



    }
}
