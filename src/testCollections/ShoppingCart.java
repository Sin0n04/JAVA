package testCollections;
import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
	private String owner;
	private ArrayList<Product> cart;
	
	public ShoppingCart(String owner) {
		this.owner = owner;
		this.cart = new ArrayList<Product>();
		
	}
	
	public void addProduct() {
		
	}
	public double price() {
		Iterator<Product> it = cart.iterator();
		while(it.hasNext()) {
			
		}
	}
	
	public void removeExpensive(double topPrice) {
		
	}
	
	
	public void cleanCart() {//removes elements that its price is negative
		//for removing while iterating --> use iterators remove method
		
		Iterator<Product> it = cart.iterator();
		while(it.hasNext()) {
			Product p = it.next();
			if(p.getAmmount() < 0 || p.getPrice() < 0) {
				it.remove();//deletes the iterators product and resizes automatically...
			}
		}
		
	}
	
	
	public void view() {
		for(Product pr : cart) {
			System.out.println(pr.toString());
		}
	}
	
	//to correct.......#
	public ArrayList<String> boughtProds(){
		ArrayList<String> names =  new ArrayList<String>();
		for(String p : names) {
			p = cart.toString();
		}
		return names;
	}

}
