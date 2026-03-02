package testCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		ArrayList<String> list;
		list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		System.out.println(list);
		
		System.out.println(list.indexOf("bbb"));
		
		list.remove(list.size()-1);
		
		System.out.println(list);
		
		list.add(2,"xxx");
		
		
		//iterate with index and get
		
		String all = "";
		
		for(int i = 0 ; i < list.size(); i++) {
			all = all + list.get(i);
		}
		
		//iterate with iterator // get largest string
		
		String maxstr =""; 
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			
			if(str.length() > maxstr.length()) {
				maxstr = str;
			}
		}
		
		
		// enchanced for
		
		for(String Str: list) {
			
			if(Str.indexOf("*") != -1 || Str.indexOf("?") != -1) {
				
				System.out.println(Str); 
			}
			
		}

	}

}
