package packhouses;

public class House {
    int area;
    String address;
    char type;

    void show(){
        System.out.println();
        switch (this.type){
            case 'f':
                System.out.println("Flat at " + this.address + " Area: "+ this.area + "m2");
                break;
            case 'd':
                System.out.println("Detached House at " + this.address + " Area: "+ this.area + "m2");
                break;
        }
    }


    double giveMeTax(){
        double tax = 0;
        if (this.area <= 60){
            return tax;
        }
        if(this.area > 60 && this.area < 80){
            tax = this.area*4.5;
            return tax;
        }
         tax = this.area * 5.5;
        return  tax;

    }


    boolean canBeSold(){
        if(this.type == 'd'){
            return true;
        }
        return (this.type == 'f' && this.area >100);
    }


}
