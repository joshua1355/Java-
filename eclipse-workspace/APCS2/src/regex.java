import java.util.regex.*;
public class regex {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[xyz]", "xxyyzz"));
		System.out.println(Pattern.matches("[Hi]?", "H "));
		System.out.println(Pattern.matches("[xyz]+", "zyzy"));
		System.out.println(Pattern.matches("{xyz}", "zyxx"));
		System.out.println(Pattern.matches("[X^YZZZA]?", "this"));
		System.out.println(Pattern.matches("(.*)[^g]g[(.*)|g|(.*)[^g]g|g(^g)(.*));"
				+ "
		System.out.println(Pattern.matches("(.*)[^g]g[^g](.*)|g|(.*)[^g]g|g(^g)(.*)");

		
	}

}
