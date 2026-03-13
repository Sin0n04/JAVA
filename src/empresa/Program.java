package empresa;

public class Program {
    public static void main(String[] args){

        Worker w1 = new Worker("03227110A","juanito",2,90,20000,new MobilePhone("613837680",20));

        System.out.println(w1.toString());
        w1.work();
        w1.work();
        System.out.println(w1.toString());
    }
}
