package exercises;

public class EX2_5 {
    public static void main(String[] args){
        int n,digit,num;
        boolean is_binary = true;


        System.out.println("input integer to transform to binary: ");
        n = Console.readInt();

        num = n;

        while(num > 0){
            digit = num % 10;

            if(digit > 1){
                is_binary = false;
            }
            num /= 10;
        }

        if (is_binary){
            String binaryString = Integer.toBinaryString(n);
            System.out.println("Binary Value: " + binaryString);
        }
    }
}
