package ex_3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Console {

	
	public static byte readByte() {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		byte x = 0;
		try {
			x = Byte.valueOf(in.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return x;

	}

	public static short readShort() {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		short x = 0;
		try {
			x = Short.valueOf(in.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return x;

	}
	
	public static int readInt() {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		try {
			x = Integer.valueOf(in.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return x;

	}
	
	public static long readLong() {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		long x = 0;
		try {
			x = Long.valueOf(in.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return x;

	}
	

	public static float readFloat() {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		float x = 0;
		try {
			x = Float.valueOf(in.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return x;

	}

	public static double readDouble() {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		double x = 0;
		try {
			x = Double.valueOf(in.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return x;

	}
	
	public static char readChar(){
		
		char car = 0;
		java.io.BufferedInputStream b = new BufferedInputStream(System.in);
		 try {
			car=(char)b.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return car;
		 
	}

	public static String readString() {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			str = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;

	}
	
	
}
