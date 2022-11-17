
public class Change {
//	private String name;
//	public void replace(String str) {
//		name = name.substring(0,)
//	}
	public static void main(String[]args) {
		String b ="";
		String a = "anggiogidg";
		String repl = "zzz";
		a =a.substring(0,6)+repl+ a.substring(6+"Wor".length());
		System.out.println(a);
		
		for(int i=0; i<a.length()-1; i++) {
			if(a.substring(i,i+1).equals("g"))
			b+=a.substring(i+1,i+2)+a.substring(i,i+1);
		}
		System.out.println(b);

		
//		System.out.println(a.substring(0,2)+repl+a.substring(2+repl.length()));
//		for(int i = 0; i<a.length()-1; i++) {
//			if(a.substring(i,i+1).equals("e")&&!a.substring(i+1,i+2).equals("e")) {
//				b+=a.substring(i+1,i+2)+a.substring(i,i+1);
//				
//			}
//			System.out.println(b);
//		}
	}
}
