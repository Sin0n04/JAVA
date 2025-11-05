package exercises;

public class EXFACIL_1 {
    public static void main(String[] args){
        final int n = 10;
        int count = 1, num = 1;

        while(count <= n ){

            System.out.println(num);
            num = num * count;

            count++;
        }

    }
}
