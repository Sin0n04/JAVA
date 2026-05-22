package Company;

import UD8.Console;

import java.io.*;

public class Main {
    public static void main(String[] args){
        System.out.println("input file name: ");
        String fileString = Console.readString();

       saveSalesMen(fileString);

    }

    public static boolean evaluateSalesMen(SalesMan salesman) throws ErrorSalesManException{
        boolean valid = true;
        if(salesman.salary < 0){
            throw new ErrorSalesManException();
        }
        if (salesman.phone == null){
            throw new ErrorSalesManException();
        }

        for (int i = 0; i < salesman.phone.number.length(); i++) {
            try{
                Integer.parseInt(salesman.phone.number.substring(i,i+1));
            } catch (NumberFormatException e) {
                throw new ErrorSalesManException();
            }
        }
        return valid;
    }

    public static void saveSalesMen(String filename) {
        boolean next = true;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));) {
            do {
                System.out.println("Input name: ");
                String name = Console.readString();
                System.out.println("Input salary: ");
                double salary = Console.readDouble();
                System.out.println("Input phone number");
                String phone = Console.readString();
                System.out.println("input Phone balance: ");
                double balance = Console.readDouble();

                SalesMan toAdd = new SalesMan(name, salary, new Mobilephone(phone, balance));
                if (evaluateSalesMen(toAdd)){
                    oos.writeObject(toAdd);
                }

                System.out.println("Do you want to continue?(YES or NO): ");
                String response = Console.readString().toUpperCase();
                if (response.equals("NO")) {
                    next = false;
                }
            } while (next);
        } catch (IOException | ErrorSalesManException e) {
            e.printStackTrace();
        }
    }
}
