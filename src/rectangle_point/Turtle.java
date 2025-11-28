package rectangle_point;

public class Turtle {
        int x, y;
        double angle;

        Turtle(int x, int y, double a){
            this.x = x;
            this.y = y;
            this.angle = a % 360;
            if(this.angle < 0 ){
                this.angle += 360;
            }
        }

        Turtle(int x, int y){
            this.x = x;
            this.y = y;
            this.angle = 0;
        }

        Turtle(double a){
            this.angle = a;
            this.x = 0;
            this.y = 0;
        }


        void faceRight(){
            this.angle = 0;
        }
        void faceLeft(){
            this.angle = 180;
        }
        void faceUp(){
            this.angle = 90;
        }
        void faceDown(){
            this.angle = 270;
        }

        void turnLeft(double degrees){
            this.angle += degrees;
            if (this.angle > 360){
                this.angle -= 360;
            }
        }
        void turnRight(double degrees){
            this.angle -= degrees;
            if (this.angle < 0){
                this.angle *= -1;
            }
        }

        void forward(int distance){

        }




}
