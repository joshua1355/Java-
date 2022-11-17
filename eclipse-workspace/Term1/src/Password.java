	import java.util.Scanner;

public class Password {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your password");
		int p = sc.nextInt();
		System.out.println("Your password is "+p);
			
		if(p>=0)
		{
			System.out.println("That's your password");
		}
		else if(p<=0)
			System.out.println("That's your password2");
		else
		{
			System.out.println("Wrong");
		}
	}
}
