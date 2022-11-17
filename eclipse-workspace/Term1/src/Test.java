import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Test {
	public static void main(String[] args)
	{
		double currentSalary;
		double raise = 0;
		double newSalary;
		String rating;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your current salary: ");
		currentSalary = in.nextDouble();
		System.out.println("Enter your performance rating (Excellent, Great, or Good): ");
		rating = in.next();
		
		if(rating.equals("Excellent"))
		{
			raise = 0.06;
		} else if(rating.equals("Great"))
		{
			raise = 0.04;
		} else if(rating.equals("Good"))
		{
			raise = 0.015;
		}
		raise *= currentSalary;
		
		newSalary = currentSalary + raise;
		
		NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println();
		System.out.println("Current salary: " + "\t" + money.format(currentSalary));
		System.out.println("Amount of your raise: " + "\t" + money.format(raise));
		System.out.println("Your new salary: " + "\t" + money.format(newSalary));
	}
}