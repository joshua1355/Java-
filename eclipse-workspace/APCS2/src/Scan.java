import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		System.out.println("Enter your age" );

		String a = sc.next();
		int intsc = sc.nextInt();
		System.out.println("This is your name "+ a);
		System.out.println("this your age" +intsc);
		String str = "Seoul, busain, Jaju, gimodie";
		String[]arr1= str.split(",");
		
		for(int i =0; i<arr1.length; i++) {
			System.out.println("(?i)"+arr1[i]);
		}


	}
	public int countYZ(String str) {
		str = str.toLowerCase();
		String[] wordsSet = str.split("[^a-z]");
		int result = 0;
		for (String word : wordsSet) {
		if (word.endsWith("y") || word.endsWith("z")) {
		result++;
		}
		}
		return result;
		}
}
