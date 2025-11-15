package packhouses2;

public class House {
    double area;
    String address;
    char type;
    int inst_house = 0;

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

    House(double a, String add, char t){
        this.area = a;
        this.address = add;
        this.type = t;
        inst_house++;
        System.out.println("House "+ inst_house + " Instantiated");
    }


    double giveMeTax(){
        double tax = 0;
        if (this.area <= 60){
            return tax;
        }
        if(this.area < 80){
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

    boolean isSimilar(packhouses.House other){
        return (this.type == other.area&& (this.area- other.area >(-10)&& this.area- other.area < 10));

    }

    public static void main(String[] args){

        House h1,h2,h3;

        h1 = new House(65,"C/ Rioja, 18", 'f');
        h2 = new House(150,"C/ Alava, 5", 'd');
        h3 = new House(105,"C/ Gorbea, 23", 'f');

//        packhouses.House h1,h2,h3;
//
//        h1 = new packhouses.House();
//        h1.area = 65;
//        h1.type = 'f';
//        h1.address = " C/ Rioja, 18 ";
//
//        h2 = new packhouses.House();
//        h2.address = " C/ Alava, 5 ";
//        h2.area = 150;
//        h2.type = 'd';
//
//        h3 = new packhouses.House();
//        h3.address = " C/ Gorbea, 23 ";
//        h3.area = 105.5;
//        h3.type = 'f';
//
//        h1.show();
//        h2.show();
//        h3.show();
//
//        h2.area -= 5;
//
//
//        h1.show();
//        h1.giveMeTax();
//        h2.show();
//        h2.giveMeTax();
//        h3.show();
//        h3.giveMeTax();
//
//        System.out.println("is house 1 able to be sold?: " + h1.canBeSold());
//        System.out.println("is house 2 able to be sold?: " + h2.canBeSold());
//        System.out.println("is house 3 able to be sold?: " + h3.canBeSold());
//
//        System.out.println(" is h2 similar to h3?: " + h2.isSimilar(h3));
//        System.out.println(" is h1 similar to h3?: " + h1.isSimilar(h3));
//
//        h1.area += 35;
//
//        System.out.println("is H1 similar to h3 now?: " + h1.isSimilar(h3));




    }
}
