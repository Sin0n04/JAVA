package exercises;

public class EX2_2 {
    public static void main(String[] args) {
        final int N = 10;
        int employ,rev,count = 1 ,tax;
        double discount;
        while(count <= N ){
            discount =0;
            System.out.println("input number of employees: ");
            employ = Console.readInt();
            System.out.println("input revenue: ");
            rev = Console.readInt();

            tax = ((rev * 10)/100);

             if (employ >= 1 && employ <= 2){
             }
             else{
                 if (employ >= 3 && employ <= 5){
                     discount = (tax * 0.05)* employ;

                 }
                 else {
                     discount = (tax * 0.07)* employ;
                 }
             }
             System.out.println("A business with " + rev + " in revenue and " + employ + " employee/s would pay " + (tax - discount) );


            count++;
        }



    }
}
