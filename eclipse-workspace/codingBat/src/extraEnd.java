
public class extraEnd {

	public static void main(String[] args) {
		String a = "Hello";
		int alen =a.length();
		String ad =a.substring(1);
		System.out.println(ad);
		for(int i = 0; i<a.length(); i++) {
			if(a.length()%2==0) {
				System.out.println(i);
			}
		}
		System.out.println(a.lastIndexOf(3)!=0);
		System.out.println(a.length()<5 ? "FUCK SOMEONE" : "FUCK MY ASS");
	}
	public boolean endOther(String a, String b) {
		  return a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase());
		}
	
	 
}
