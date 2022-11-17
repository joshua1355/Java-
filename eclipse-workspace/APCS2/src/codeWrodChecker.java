
public class codeWrodChecker {
	private int min;
	private int max;
	private String word;
	
	public codeWrodChecker(int min, int max, String length) {
		this.min = min;
		this.max = max;
		this.length = length;
	}
	public codeWrodChecker(String len) {
		this.min = 6;
		this.max = 20;
		this.length = len;
	}
}
