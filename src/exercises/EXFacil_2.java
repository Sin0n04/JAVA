package exercises;

public class EXFacil_2 {
    public static void main(String[] args){

        final int n = 10;
        int count = 1, num = 1,increment = 2,sw = 1;

        while( count <= n ){
            if (sw == 1){
                System.out.println(num);
                num = num * increment;


            }
            else{
                System.out.println(num);
                num = num + increment;
                increment++;

            }
            sw *= (-1);
            count++;
        }

    }
}
