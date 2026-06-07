package UD9SET2;

public class QuadraticSolution{
    protected float posValue, negValue;

    public QuadraticSolution(){

    }

    public QuadraticSolution(float solu1, float negValue){
        this.posValue = solu1;
        this.negValue = negValue;
    }

    public void setPosValue(float posValue) {
        this.posValue = posValue;
    }

    public void setNegValue(float negValue) {
        this.negValue = negValue;
    }
}
