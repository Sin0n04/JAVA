
package exercises;

public class Exercise1_4 {
    public static void main(String[] args) {
        System.out.println("input first number");
        float n1 = Console.readFloat();
        System.out.println("input second number");
        float n2 = Console.readFloat();
        System.out.println("input thind number");

        float n3;
        for(n3 = Console.readFloat(); n1 == n2 || n2 == n3 || n3 == n1; n3 = Console.readFloat()) {
            System.out.println("input DIFFERENT numbers");
            n1 = Console.readFloat();
            n2 = Console.readFloat();
        }

        if (n3 > n2) {
            n2 = n3;
        }

        if (n2 > n1) {
            n2 = n1;
        }

        System.out.println(n2);
        System.out.println("this is the median number");
    }
}
