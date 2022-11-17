
public class Cafe {
	//constant
	final int SANDWICH_PRICE = 3500;
	final int COKE_PRICE = 1400;
	
	//instance variable
	private int sandwich;
	int price;
	
	//constructor 
	public Cafe(int sandwich, int price) {
		this.sandwich = sandwich;
		this.price = price;
		
	}
	//mehhod
	public int totalPrice(String name, String a) {
		int total = 0;
		total += sandwich * SANDWICH_PRICE;
		return total;
	}
	//getter mathod
	public int getSandwich() {
		return sandwich;
	}
	public void showPrice() {
		System.out.println("total is "+ totalPrice("Name","name"));
		
	}
	
	public void additionalOrder(int sand) {
		sandwich += sand;
	}
	public String toString() {
		return "cafe";
		
	}
}
