package testCollections;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		ArrayList<String> list;
		list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		System.out.println(list);
		
		System.out.println(list.indexOf("bbb"));

	}

}
