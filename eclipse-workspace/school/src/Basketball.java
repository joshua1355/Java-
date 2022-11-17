import java.util.Scanner;
public class Basketball {

	public static void main(String[] args) {
		int a,b,c,d; 
		boolean ponts = false,rebounds = false;
		boolean assists = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many points did you score?");
		a = sc.nextInt();
		System.out.println(a);
		System.out.println("How many rebounds did you get?");
		b = sc.nextInt();
		System.out.println(b);
		System.out.println("How many assists did you have?");
		c = sc.nextInt();
		System.out.println(c);
		
		System.out.println("You got" + a + "or more points:"+ ponts);
		
		

	}
}
