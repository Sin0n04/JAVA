package UD6SET1;

public class ex_8 {

    public static void load(char[] arr){
        char confirm;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("input character: ");
            arr[i] = Console.readChar();
            System.out.println("Do you want to enter another character(Y/N)");
            confirm = Console.readChar();
            if(confirm == 'N')
                break;
        }
    }

    public static void viewArray(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != '\u0000') {
                System.out.print(arr[i] + " | ");
            }
        }
    }

    public static int insertChar(char[] arr, int used) {

        char car;
        int n;

        System.out.println("Enter a character:");
        car = Console.readChar();

        do {
            System.out.println("Enter position (0 to " + used + "):");
            n = Console.readInt();
        } while (n < 0 || n > used);

        // Shift elements to the right
        for (int i = used; i > n; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert character
        arr[n] = car;

        // Increase useful elements
        return used + 1;
    }


    public static void main(String[] args){

        char[] arr = new char[10];

        load(arr);
        viewArray(arr);


    }
}
