package Ships;

public class Point3D extends Point {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(String input){
        super(Double.parseDouble(input.split("-")[0]),Double.parseDouble(input.split("-")[1]));

        String[] parts = input.split("-");
        if (parts.length != 3){
            System.out.println("Wrong format");
            return;
        }

        this.z = Double.parseDouble(parts[2]);


    }

    public  String toString(){
        return this.getX() + " , " + this.getY() + " , " + this.z;
    }
}
