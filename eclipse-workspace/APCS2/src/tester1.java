import java.util.Scanner;

public class tester1 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter");
		
		int first = input.nextInt();
		int secound = input.nextInt();
		
		for(int i=first; i<=secound; i++) {
			if(i%2 ==0) {
				System.out.println(i++);
			}
		}
	}
}
