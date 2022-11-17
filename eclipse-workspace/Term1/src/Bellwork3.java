import java.util.Scanner;
public class Bellwork3 {
	public static void main(String args[]) {
		double dinner;
		double minigolf;
		double dessert;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How much did dinner cost?");
		dinner = sc.nextDouble();
		System.out.println("How much did minigolf cost?");
		minigolf = sc.nextDouble();
		System.out.println("How much did dessert cost?");
		dessert = sc.nextDouble();
		
		System.out.println("Dinner:" + dinner);
		System.out.println("minigol:" + minigolf);
		System.out.println("dessert:" + dessert);
		System.out.println("Totoal:" + (minigolf+dinner+dessert));

	}
}
