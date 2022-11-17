
public class substring {

	public String zipZap(String s) {
		String a = "";
		for(int i=2; i<s.length()-2; i++) {
			if(s.substring(i,i+2).equals("hi")) {
				a += s.substring(i,i+2);
			}
		}
		return a;
	}
	public static void main(String[] args) {
		String a = "Hello World";
		for(int i =0; i<a.length()-2; i++) {
			if(a.substring(i,i+2).equals("hi")) {
				System.out.println(a.substring(i,i+2));
			}
		}
//		substring a1 = new substring();
//		a1.zipZap("hihi");
//		System.out.println(a1);
		
	}

}
