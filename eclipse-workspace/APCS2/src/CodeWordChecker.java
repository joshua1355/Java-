
public class CodeWordChecker {
	private int min;
	private int max;
	private String word;

	public CodeWordChecker(int min, int max, String word) {
		this.min = min;
		this.max = max;
		this.word = word;
	}
	public CodeWordChecker(String word) {
		this.min = 6;
		this.max = 20;
		this.word = word;
	}
	public boolean isValid(String vaild){       
	   if(vaild.length() >= min && vaild.length() <= max && vaild.indexOf(word)==-1) {
		   return true;
	   }
		return false; 
	}
	public static void main(String[] arga) {
		CodeWordChecker sc2 = new CodeWordChecker(3,6,"pass");
		sc2.isValid("happy");
		System.out.println(sc2.isValid("capass"));
	}
}
