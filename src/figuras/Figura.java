package figuras;


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

        if(this.dim % 2 !=0 ){
            if (this.type == 'c' || this.type == 'C'){
                Bibliofiguras.DrawC(this);
            }
            else {
                Bibliofiguras.DrawT(this);
            }
            return true;
        }
        else{
            return false;
        }


    }
}
