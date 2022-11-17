import java.util.*;
public class Backwards {

	public static void printBackward(String s) {
		printBackward(s>0 ?  printBackward(s): "");
		System.out.println(5>4? "f": "");
		
		
		
		printBackward(s);
	}
	
	public static String main(String[] args) {
		 
		 return 5<3? "1": "";
		String msg; 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a string: ");
		msg = sc.nextLine();
		
		System.out.print("\nThe string backwards: ");
		printBackwards(msg);
		System.out.println();
	}

}

