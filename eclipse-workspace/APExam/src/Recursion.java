
public class Recursion {
	public static void main (String[] args) {
		showMe(0);
		
	}
	public static void showMe(int a) {
		if(a<10) {
			showMe(a+1);
		}else {
			System.out.println(a+ " ");
		}
	}
}
