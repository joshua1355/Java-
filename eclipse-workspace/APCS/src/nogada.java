import java.util.Scanner;

public class nogada{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your pin");
		int p = sc.nextInt();
		System.out.println("Your pin number is "+p);
		
		if(p>=0)
		{
			System.out.println("That's your password");
		}
		else
		{
			System.out.println("That's not your password");
		}
	}
}