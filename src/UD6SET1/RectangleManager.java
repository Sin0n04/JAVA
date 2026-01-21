package UD6SET1;

public class RectangleManager {
    private Rectangle[] arr;

    RectangleManager(){

    }

    RectangleManager(int sizeofarray){
        this.arr = new Rectangle[sizeofarray];
        System.out.println("Creating Rectangle Manager....");
        for(int i = 0 ; i < sizeofarray ; i++){
            arr[i] = new Rectangle();
        }
        System.out.println("Done.");
    }

    public double[] areas(){
        double[] areas = new double[this.arr.length];
        System.out.println("Resolving areas....");
        for (int i = 0 ; i < areas.length ; i++){
            if (arr[i] != null)
                areas[i] = arr[i].areaR();
        }
        System.out.println("Done.");
        return areas;
    }

    public void viewSquares(){
        for (int i = 0; i < arr.length; i++){
            if(arr[i].getSide1() == arr[i].getSide2()){
                System.out.println(arr[i].toString() + " | ");
            }
        }
    }

    //exercise half done...
}
