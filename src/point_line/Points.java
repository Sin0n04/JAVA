package point_line;


public class Points {
        double x,y;

        Points(int x ,int y ){
            this.x = x;
            this.y = y;

        }




    int Quadrant(){
            if(this.x > 0 && this.y >0){
                return 1;
            }
            if(this.x < 0 && this.y >0 ){
                return 2;
            }
            if(this.x < 0 && this.y < 0){
                return 3;
            }
            if(this.x > 0 && this.y < 0){
                return 4;
            }
            return 0;
        }


    void show(){
        System.out.print("( " + this.x + " , " + this.y + " )" );
    }

    public static void main(String[] args){


    }
}



