
public class character {
	private String name; 
	private int age;
	private boolean accs;
	private static int numcount =0;

	public character(String name, int age, boolean accs) {
		this.name = name;
		this.age = age;
		this.accs = accs;
		++numcount;
	}
	
	public String toString() {
		return "name" + name + "\tage" + age + "\taccs" + accs + "\tnumcounts" + numcount ;
	}
	public int getAge() {
		return age;
	}
	public boolean getAccs() {
		return accs;
	}
	public static int getNumcount() {
		return numcount;
	}
	public static void main(String[] args) {
		character chars = new character("joshua",12,true);
		System.out.println(chars);
		
		
	}
}
