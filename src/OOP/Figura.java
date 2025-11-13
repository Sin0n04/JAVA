package OOP;

public class Figura {

    int dim;
    char type;

    Figura(int d, char t){
        this.dim = d;
        this.type = t;
    }

    Figura(){

    }
    public boolean draw(){
        int count = 1;

        while(count <= this.dim){

            count++;
        }
    }
}
