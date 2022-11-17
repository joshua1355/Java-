import java.util.ArrayList;
import java.util.Scanner;

public class bellWork {

	public static void main(String[]args) {
	ArrayList<Integer> nums = new ArrayList<>();

	String a;
	int b = 0;
	int valueAdded;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Would you like to enter in numbers to the list?");
	a =sc.next();
	System.out.println("Enter the number you wish to add");
	
	while(true) {
		System.out.println("Enter the number you wish to add");
		String respond = sc.next();
	if(respond.equals("no")) {
		System.out.println("Enter the number you wish to add");
		valueAdded = sc.nextInt();
		nums.add(valueAdded);
		
	}else if(respound.equals("np")) {
		ans = false;
	}
	}
		
	}
	
}
