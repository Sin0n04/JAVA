package UD8;

import java.io.IOException;

public class DivideByZero {
    public static void main(String[] args){
        int x , y;


       try {
           System.out.println("Input first number: ");
           x =Console.readInt();

           System.out.println("Input second number: ");
           y = Console.readInt();

           double result = x / y;
           System.out.println("result:" + result);
       }
       catch (ArithmeticException e ){
           System.out.println("Error: divison by zero...");
       } catch (IOException e) {
           System.out.println("INput error....");
       }
    }
}
