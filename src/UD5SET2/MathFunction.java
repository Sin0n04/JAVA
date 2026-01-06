package UD5SET2;

public class MathFunction {
    private double x;

    MathFunction(double x){
       this.x = x;
    }

    private void evaluate(){
        double result = Math.sqrt(Math.sin(Math.pow(x, 3) + ((2 * x) / 9)) + Math.cos((6 * Math.PI) + Math.tan(Math.exp(Math.pow(x, 3)))));
        System.out.println(result);
    }

    public static void evaluateX(double x){
        double inside = Math.sin(Math.pow(x, 3) + ((2 * x) / 9)) + Math.cos((6 * Math.PI) + Math.tan(Math.exp(Math.pow(x, 3))));
        if(inside <= 0){
            System.out.println("the result inside the root is negative, not posible to compute");
            return;
        }

        double result = Math.sqrt(inside);
        System.out.println("the result of the function is: " + result);
    }

    public static void main(String[] args){
        MathFunction mathFunction = new MathFunction(0.0);
        mathFunction.evaluate();

        evaluateX(1.0);
    }
}
