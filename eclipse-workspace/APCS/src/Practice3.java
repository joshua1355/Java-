import java.util.Scanner;

public class Practice3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you grade");
		int a = sc.nextInt();
		String answer = "";
		
		for(int i =0; i<answer.length(); i++)
			if(a>=100)
			{
				System.out.println("your grade is A");
			}
			else if(a>=90)
			{
				System.out.println("your grdae is B");
			}
			else
			{
				System.out.println("you falled");
			}
	}
}
