package exercises;

public class Ex2_3 {
    public static void main(String[] args){
        boolean keep_going = true;
        char option,gender,continent;
        int age,height,max = 0, sumheight = 0, ewomen = 0;


        while(keep_going){
            System.out.println("input gender: M/H: ");
            gender = Console.readChar();
            while(gender != 'M' && gender != 'H'){
                System.out.println("Bad Input, input gender: M/H: ");
                gender = Console.readChar();
            }

            System.out.println("input age(must be over 18):  ");
            age = Console.readInt();
            while(age < 18 || age > 120){
                System.out.println("Bad Input, input age: ");
                age = Console.readChar();
            }

            System.out.println("input Continent: (E - europe, A - Africa): ");
            continent = Console.readChar();
            while(continent != 'A' && continent != 'E'){
                System.out.println("Bad Input, input continent:(E - europe, A - Africa): ");
                continent = Console.readChar();
            }

            System.out.println("input height: ");
            height = Console.readInt();
            while(height < 30 || height > 250){
                System.out.println("Bad Input, input height: ");
                height = Console.readChar();
            }

            if ((age <30 && age > 20) && (height > max) && continent == 'A' && gender == 'H' ){
                max = height;
            }

            if (gender == 'M'){
                if (continent == 'E'){
                    ewomen++;
                    sumheight += height;
                    if (height >= 167){
                        System.out.println("this persons height is over the average");


                    }
                    else{
                        System.out.println("this persons height is under the average");

                    }
                }
                else{
                    if (height >= 165){
                        System.out.println("this persons height is over the average");
                    }
                    else{
                        System.out.println("this persons height is under the average");

                    }

                }
            }
            else {
                if (continent == 'E'){
                    if (height >= 179){
                        System.out.println("this persons height is over the average");
                    }
                    else{
                        System.out.println("this persons height is under the average");

                    }

                }
                else{
                    if (height >= 180){
                        System.out.println("this persons height is over the average");
                    }
                    else{
                        System.out.println("this persons height is under the average");

                    }

                }

            }






            System.out.println("add another person? Y/N?: ");
            option = Console.readChar();
            if(option == 'N' || option == 'n') {
                keep_going = false;
            }
        }
        System.out.println("the maximum height for african men is: " + max );
        System.out.println("the average height for european women is: " + (sumheight/ewomen) );


    }
}
