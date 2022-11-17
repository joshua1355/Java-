package inheritance;
//Superclass
abstract class Animal {
	String colors;
	abstract void howling();
	abstract String color(String species);
	String animal;
	public void run() {
		System.out.println("running!!");
		
		}

}
//subclass
class Dog extends Animal{
	
	@Override
	void howling() {
		// TODO Auto-generated method stub
		System.out.print("월월월");
	}
	public String color(String species) {
		if(species == "Dog") {
			return "Black";
		}else {
			return "White";
		}
	}
	
	
//	@Override 
//	//String color() {
//		return null;
//	}
	
	@Override
	public void run() {
		System.out.println("runrunrun!!!");
	}
}
//Subclass 
class Cat extends Animal{
	//Override 
	@Override
	void howling() {
		// TODO Auto-generated method stub
			System.out.print("Meow");
		}

	@Override
	String color(String species) {
		// TODO Auto-generated method stub
		return "yellow";
	}

}