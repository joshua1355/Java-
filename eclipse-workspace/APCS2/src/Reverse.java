
public class Reverse {

	public static void main(String[] args) {
		int reverse =0;
		String a = "Anne Pro";
		for(int i=0; i<a.length(); i++) {
			if(a.substring(i,i+2).equals("e")) {
				reverse++;

			}
			
			
		}
		System.out.println(reverse);

		
	}

}
