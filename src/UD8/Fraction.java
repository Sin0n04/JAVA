package UD8;

public class Fraction {
    protected int numerator,denominator;

    public Fraction() {
        this.denominator = 1;
        this.numerator = 1;
    }

    public Fraction(int numerator, int denominator) throws FractionException {
        if (denominator == 0){
            throw new FractionException("Cannot instantiate a fraction with denominator 0.....");
        }
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public Fraction(String fraction) throws FractionException {
        String[] parts =  fraction.split("/");
        if (parts.length != 2){
            throw new FractionException("Not a valid format...");
        }
        try{
            this.numerator = Integer.parseInt(parts[0]);
            this.denominator =Integer.parseInt(parts[1]);
            if(denominator == 0){
                throw new FractionException("Cannot instantiate a fraction with denominator 0");
            }
        } catch (NumberFormatException e) {
            throw new FractionException("Not a valid format...");
        }
    }

    public Fraction addFraction(Fraction other) throws FractionException {
        Fraction result = new Fraction();
        result.denominator = this.denominator * other.denominator;
        result.numerator = (this.numerator * other.denominator) + (this.denominator * other.numerator);

        return result.simplify();
    }

    public Fraction subtractFraction(Fraction other) throws FractionException {
        Fraction result = new Fraction();
        result.denominator = this.denominator * other.denominator;
        result.numerator = (this.numerator * other.denominator) - (this.denominator * other.numerator);

        return result.simplify();
    }

    public Fraction multiply(Fraction other) throws FractionException {
        Fraction result = new Fraction();
        result.denominator = this.denominator * other.denominator;
        result.numerator = this.numerator * other.numerator;

        return result.simplify();
    }

    public Fraction divide(Fraction other) throws FractionException {
        int den = this.denominator * other.numerator;
        int num= this.numerator * other.denominator;
        if (other.denominator == 0){
            throw new FractionException("The result of this operation is an invalid fraction...");
        }
        Fraction result = new Fraction(num,den);

        return result.simplify();
    }

    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }

    public Fraction simplify() throws FractionException {
        if(this.numerator == 0){
            return new Fraction(0,1);
        }
        int mcd = gcd(this.numerator,this.denominator);
        int num = this.numerator / mcd, den = this.denominator/ mcd ;
        return new Fraction(num,den);
    }



    public static int gcd(int a , int b){
        if(b == 0) {
            return a;
        }
        return gcd(b,a % b);
    }

}
