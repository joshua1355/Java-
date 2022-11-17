import java.util.Scanner;

public class Mode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		for(int i=first; i<=second; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
