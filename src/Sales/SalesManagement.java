package Sales;

import java.io.*;
import java.util.ArrayList;

public class SalesManagement {
    private String nomfich;


    SalesManagement(String nomfich){
        this.nomfich = nomfich;
    }

    public void saveSalesMen(ArrayList<SalesMan> salesMEN){

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomfich));
            for (SalesMan s : salesMEN){
                oos.writeObject(s);
            }
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException("NO Filename....",e);
        }

    }

    public void viewSalesMen(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.nomfich));
            while (true){
                try {
                    SalesMan s = (SalesMan) ois.readObject();
                    s.view();
                } catch (EOFException e) {
                    break;
                }

            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public SalesMan searchSalesman(String name){
        ArrayList<SalesMan> list = new ArrayList<SalesMan>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.nomfich));
            while (true){
                try {
                    SalesMan s = (SalesMan) ois.readObject();
                    list.add(s);
                } catch (EOFException e) {
                    break;
                }

            }
            ois.close();

            for (SalesMan s : list){
                if (s.getName().equals(name)){
                    return s;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void generateMobilefile(String filename){
        try( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.nomfich))) {
            while(true){
                try {
                    SalesMan s  = (SalesMan)ois.readObject();
                    if(s.getPhone() != null){
                        Mobilephone p = s.getPhone();
                        p.setBalance(10);
                        oos.writeObject(p);
                    }

                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void workAll(){
        String tmp = "temp.dat";
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(tmp));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.nomfich))){
            while(true){
                try {
                   SalesMan s = (SalesMan) ois.readObject();
                   s.work();
                   oos.writeObject(s);
                }
                catch (EOFException e){
                    break;
                }
            }

        } catch (IOException | ClassNotFoundException e ) {
            throw new RuntimeException(e);
        }

        File original = new File(this.nomfich);
        File temp = new File(tmp);

        if(!original.delete() || !temp.renameTo(original)){
            throw new RuntimeException("error replacing file");
        }
    }

    
}
