package OOP;

public class Rana {

    String nombre;
    int edad,calorias;
    static final int  w = 5,f = 10,xcal=3000,ycal= 2000;
    static int countYoungfrogs;

    Rana(String nombre,int edad,int calorias){
        this.nombre=nombre;
        this.edad=edad;
        this.calorias=calorias;

        if(this.edad < 18){
            countYoungfrogs++;
        }
    }

    Rana(){
            countYoungfrogs++;
    }

    void Display(){
        System.out.println("nombre: " + this.nombre);
        System.out.println("edad: "+ this.edad);
        System.out.println("calorias: "+ this.calorias);
    }

    void Birthday(){
        this.edad++;
        System.out.println("happy Caroline, You're 16 Now");
        if(this.edad <18){
            countYoungfrogs++;
        }


    }

    void feed(char t,int cant){
        switch (t){
            case 'w','W':
                this.calorias += w * cant;
                break;
            case 'f','F':
                this.calorias += f * cant;
                break;

        }
    }
    Boolean Isfat(){
        if(this.calorias > xcal && this.edad > 18 ){
            return true;
        }

        if(this.calorias > ycal && this.edad < 18 ){
            return true;
        }
            return false;


    }

    void Gotogym(int h){
        int count = 1;

        System.out.println("Dancing");

        if(Isfat()){
            while(count <= h && calorias > 0){

                if(this.calorias >= 100){
                    this.calorias -= 100;
                }

                System.out.print(count);

                count++;

            }

            System.out.print(" Hours");



        }
        else{
            System.out.println("not fat");
        }

    }

    boolean compatibleCon(Rana other){

        if(this.edad == other.edad){
               if(this.calorias-other.calorias >=(-50) && this.calorias-other.calorias <= 50){
                   return true;
               }
               return false;
        }
        return false;
    }

    static boolean tooManyYoungFrogs(){
        return countYoungfrogs > 10;
    }

    static  Rana ranaMasJovenDeDos(Rana r1, Rana other){

        if(r1.edad > other.edad){
            return r1;
        }
        if(other.edad > r1.edad) {
            return other;
        }
        return null;

    }




    public static void main(String[] args){

        //TRY AT HOME NIGGA

    }
}
