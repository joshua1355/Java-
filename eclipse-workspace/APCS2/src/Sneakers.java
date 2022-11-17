
public class Sneakers {
// Instance 
	String name;
	String color;
	int size;
	int cost;

	public Sneakers(String sName, String sColor, int sSize, int sCost) {
		super();
		name = sName;
		color = sColor;
		size = sSize;
		cost = sCost;
	}
	
	public void changeSize() {
		size += 10;
	}
	public void showSnekaer() {
		System.out.println("This sneaker is " + name + "the show size is" + size+ "the color is"+ color+ "and the size is" + size);
		
	}
	public String sneakerColor(String sColor) {
		return color;
	}
}

