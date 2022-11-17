
public class StringLoop {

	public static void main(String[] args) {
		String quote = "I have never let my schooling interfere with my education.";
		int count = 0;
		for(int i = 0; i<quote.length(); i++) {
			String part = quote.substring(i,i+1);
			if(part.equals("a")) {
				count++;
				System.out.println(count);
			}
		}
	}

}
