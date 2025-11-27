package words;

public class Palindromic {
    long num;

    Palindromic(){

    }

    Palindromic(long n){
        this.num = n;
    }

    long digitCount(){
        int digit = 0;
        long x = this.num;
        while(x > 0){
            x /= 10;
            digit ++;
        }
        return digit;
    }

    long digitAtPosition(int position){

        long storage = this.num,digit = 0;
        for (int count = 1 ; count <= position ; count ++){
            if(count == position){
                digit = storage % 10;

            }
           storage = this.num / 10;


        }
        return digit;
    }

    boolean isPalindrome(){
        boolean ispal = true;
        long digits = this.digitCount(),enddig,startdig,startnum,endnum;
        endnum = this.num;

        int count = 1;
        while (endnum != 0){
            enddig = this.digitAtPosition(count);

            long countstart = this.digitCount();
            startnum = this.num;
            while(startnum != 0){

                enddig = this.digitAtPosition((int)countstart);

                startnum /= 10;
                countstart--;
            }

            endnum /= 10;
            count++;
        }


        return true;
    }
}
