package UD6SET3;

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
			
		}
		
		if(this.map.keySet().contains(name)) {
			<z>
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
