import java.util.*;
public class Casting {
	public static void main(String[] args) {
	Scanner	sc = new Scanner(System.in);
		System.out.println("Enter movie rating (as a decimal");
		double rating = sc.nextDouble();
		
		rating += 0.5;
		System.out.println("Rating rounded:");
		System.out.println((int)rating);


	}
}
