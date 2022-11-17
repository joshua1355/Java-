
public class quiz {
	public static void main(String[] args) {
		String a = "tanana";
		String repl = "ww";
		String target = "el";
		int count =0; 
		
		String[] add = {"Hi","by","no","Hi"};
			for(int i=0; i<a.length(); i++) {
				if(add[i].indexOf("H")!=-1) {
					System.out.println(add[i]);
				}
			}

		
		
		for(int i=0; i<a.length()-1; i++) {
			if(a.substring(i+i+1).indexOf("a")!=-1) {
				count++;
			}
		}
		System.out.println(count);

		for(int i=0; i<a.length()-1; i++) {
			if(a.substring(i,i+1).equals("n")) {
				a=a.substring(0,i)+a.substring(i+1,i+2)+a.substring(i,i+1)+a.substring(i+2);
			}
			
		}
		System.out.println(a);

		int ab = a.indexOf(target);
		a=a.substring(0,1)+repl+a.substring(a.indexOf(target)+target.length());
	}
}
