package Ships;

public class Ship {
    private double speed, fuel;
    private Point3D location;
    private boolean started;
    private final double MAXFUEL = 10000;


    public Ship(double speed, double fuel, Point3D location) {
        this.speed = speed;
        this.fuel = fuel;
        this.location = location;
        this.started = false;
    }


    public Ship(double speed) {
        this.speed = speed;
        this.location = new Point3D(((Math.random()* 11) + 1),((Math.random()* 11) + 1),((Math.random()* 11) + 1));
        this.fuel = 0;
        this.started = false;
    }

    @Override
    public String toString(){
       return "Speed: " + this.speed + " Location: " + this.location.toString() + " Fuel: " + this.fuel + " is it started: " + this.started;
    }

    public void refuel(double ammount){
        if (this.fuel + ammount > MAXFUEL){
            System.out.println("Overfueled, try Again...");
        }
        else
            this.fuel += ammount;
    }

    public void start_Stop(){
        if (fuel > 0 && !this.started){
            System.out.println("Starting...");
            this.started = true;
        }
        else{
            if (this.fuel <= 0){
                System.out.println("Insufficient fuel...");
                return;
            }
            if (this.started){
                System.out.println("Stopping....");
                this.started = false;
            }
        }
    }

    public void ascend_Descend(Double distance){

    }
}
