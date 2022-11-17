import java.util.Scanner;
public class AddedSuger {
	public static void main(String[] args) {
		int i;
		String a = "Hello";
		int cookingTime = (int)(Math.random()*61);
		for(i =0; i<10; i++) {
		System.out.println(a);	
			
			System.out.println(cookingTime);
	
			if(cookingTime<=20 && cookingTime >15) {
				System.out.println("Perfect cooking time");
			
			} else {
				System.out.println("Your roll wii catch fire");
			}
		}
	}
}
