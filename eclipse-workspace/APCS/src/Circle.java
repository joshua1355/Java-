
public class Circle {
	public static void main(String[] args) {
		String word = "";
		String a = "hello";
		for(int i=0; i<a.length()-2; i++) {
			if(a.substring(i,i+1).equals("e")) {
				word+=a.substring(i+1,i+2)+a.substring(i,i+1);
			}
		}   
		System.out.println(word);
	}
}
