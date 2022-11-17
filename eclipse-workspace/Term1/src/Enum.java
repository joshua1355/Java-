import java.util.*;
public class Enum {
	enum Day {monday, tuesday, wendsday, thursday, friday, sat, sun}
	public static void main(String[] args) {
		Day a;
		a = Day.monday;
		System.out.println("They call it stormy Monday");
		
		a = Day.tuesday;
		System.out.println("But Tuesday's just as bad");
		
		a = Day. wendsday;
		System.out.println("Wendnesday's worse,");
		
		a = Day. thursday;
		System.out.println("And Thursday's oh so sad");
		System.out.println();
		
		a = Day.friday;
		System.out.println("Yes, the eagle flies on Friday's");
		
		a = Day.sat;
		System.out.println("And Saturday I go out to play");
		
		a = Day.sun;
		System.out.println("Sunday's I go to church then kneel down to pray");
		System.out.println();
		
		a = Day.monday;
		System.out.println("They call it stormy Monday. . .");

		


	}
}
