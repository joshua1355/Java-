import java.util.regex.*;

public class StringMethod {

	public static void main(String[] args) {
		String a = "hello world";
		System.out.println("$Hello$World");
		String b = "bitch";
		System.out.println("%3$s");;
		StringMethod a1 = new StringMethod();
		a1.xyBalance("HI");
		System.out.println(a.startsWith("he"));
	    System.out.println(3<2? 5: "false");
	    
        System.out.println((int) (Math.random() *36)+25);

	}
	public boolean xyBalance(String str) {

		return str.matches("(^$)|([^Xx]*)|(.*[Xx].*[Yy][^Xx]*)");
		}
	
}
