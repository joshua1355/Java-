import java.util.Scanner;
public class rollercoaster {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your hight");
		a = sc.nextInt();
		System.out.println(a);
		System.out.println("enter you age");
		b = sc.nextInt();
		System.out.println(b);

		if(a>42) {
			System.out.println("Welcome aboard");
		
		}
		
		else if(b>9) {
			System.out.println("Welcome aboard");
		}
		else {
			System.out.println("Sorry you are not eligible to ride");
		}
	}

}
