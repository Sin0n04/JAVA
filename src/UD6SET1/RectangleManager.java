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

			

		public int howManyFitInside(Rectangle r1){
		
			double area1 = r1.areaR();
			int count = 0;
		
			for(int i = 0 ; i < this.arr.length ; i++){

					if(area1 >= arr[i].areaR())
							count++;
			}
			return count;
		}

    //exercise half done...


    public Rectangle[] fusionArray(RectangleManager other){

        Rectangle[] fusion = new Rectangle[this.arr.length + other.arr.length];
            int z = 0;
            int j = 0;

            for(int i = 0 ; i < fusion.length ; i++){

                if(i % 2 == 0 && j < other.arr.length){
                    fusion[i] = other.arr[j];
                    j++;
                }
                if(i % 2 != 0 && this.arr.length > z){
                    fusion[i] = this.arr[z];
                    z++;
                }
            }
            return fusion;

    }
}
 