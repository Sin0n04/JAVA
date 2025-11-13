package Exercises_1st_term;

public class exercise1_2 {
    public static void main(String[] args) {
        System.out.println("input operator");

        char option;
        for(option = Console.readChar(); option != '+' && option != '-' && option != 'x' && option != ':'; option = Console.readChar()) {
            System.out.println("wrong operator chose one of these (+,-,x,:)");
        }

        System.out.println("input first number");
        float n1 = Console.readFloat();
        System.out.println("input second number");
        float n2 = Console.readFloat();
        float result;
        if (option == '+') {
            result = n1 + n2;
        } else if (option == '-') {
            result = n1 - n2;
        } else if (option == 'x') {
            result = n1 * n2;
        } else {
            result = n1 / n2;
        }

        System.out.println("the result is : ");
        System.out.println(result);
    }
}
