
public class revers {

	public static void main(String[] args) {
		String a = "apple";
		String b ="";
		for(int i=0; i<a.length(); i++) {
			b+=a.substring(a.length()-i-1, a.length()-i);
		}
		System.out.print(b);
	}

}
