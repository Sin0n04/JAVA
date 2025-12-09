package city;

public class Apartment extends House {
    private int floor;
    private boolean has_elevator;


    Apartment(int y, double a, String add, int floor, boolean has_elevator){
        super(y,a,add);
        this.floor = floor;
        this.has_elevator = has_elevator;
    }

    Apartment(){

    }

    void view(){
        System.out.println("Address: "+this.address+ " floor:" +  this.floor + " area: "this.area + " Has elevator: ",this.has_elevator+ " year of contruction: " + this.yearOfConstruction);
    }

    Apartment compareApartments(Apartment other){

    }






}
