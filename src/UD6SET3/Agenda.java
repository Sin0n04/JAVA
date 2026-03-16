package UD6SET3;

import UD6SET2.Console;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Agenda {
	
	private HashMap<String, int[]>  map;
	private int maxEntries;
	
	public Agenda(int entries) {
		this.maxEntries = entries;
		this.map = new HashMap<String, int[]>(maxEntries);
	}
	
	
	public void addEntry(String name , int[] numbers) {

        Iterator<String> it = this.map.keySet().iterator();

        while(it.hasNext()) {
            if (it.next() != null)
                break;
            else
                if (!it.hasNext()){
                    System.out.println("The map is full, here is the full map..." + this.map.toString());
                }

        }


		if(this.map.containsKey(name)) {
			System.out.println("Your agenda contains these phone number for: " + name);
            for (int i = 0; i < map.get(name).length; i++) {
                System.out.println(map.get(name)[i]);
            }
            System.out.println("Want to replace them by new ones?(Y/N)");
            char ans = Console.readChar();
            switch (ans){
                case 'Y','y':
                    this.map.put(name,numbers);
                    System.out.println("Entry replaced...");
                    return;
                case 'N','n':
                    return;
            }
		}


	}

    public void view(){
        for (String s : this.map.keySet()){
            System.out.println( s +"---> ");
            for (int i = 0; i < this.map.get(s).length; i++) {
                System.out.print(this.map.get(s)[i] + " | ");
            }
        }
    }

    public String searchName(String name){
        if (this.map.containsKey(name)){
            int[] res = this.map.get(name);
            String result = "";
            for (int phone : res){
                result += phone;
            }
            return result;
        }
        return name + " is not in the agenda";
    }

    public int numberOfPhones(int phone){
        int ammount = 0;
        for (String s : this.map.keySet()){
            for (int i = 0; i < this.map.get(s).length; i++) {
                if (phone == this.map.get(s)[i]){
                    ammount++;
                }
            }
        }

        return ammount;
    }

    public HashMap<Integer, ArrayList<String>> phoneMap(){
        HashMap<Integer,ArrayList<String>> result = HashMap.newHashMap(this.map.size());

        for (String s : this.map.keySet()){
            for (int i = 0; i < this.map.get(s).length; i++) {
                if (!result.containsKey(this.map.get(s)[i])){
                    result.put(this.map.get(s)[i],new ArrayList<String>());
                }
                else {
                    result.get(this.map.get(s)[i]).add(s);
                }
            }
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
