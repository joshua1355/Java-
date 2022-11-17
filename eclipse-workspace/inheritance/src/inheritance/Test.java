package inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.howling();
		cat.howling();
		dog.run();
		cat.run();
		cat.color("yellow");
		cat.color("Yellow");
		System.out.println(dog.color("Dog")); 	
		System.out.println(cat.color("Cat"));
		System.out.println();
	}

}
