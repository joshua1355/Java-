
public class Practice1 {
	public static void main(String[] args) {
		String ab= "tanava";
		String ai = "Hello my name is your mom";
		String a = "Hello a is a be aa";
		int count=0;
		String word = "Hi";
		
		String[] arr = {"ab","ba","ar","ae"};
		int [] arr1= {2,43,4,5,6,4444,3,332,33};
		
		System.out.println(count);

		System.out.println(word.substring(word.length()-1));

		for(int i =0; i<word.length()-1; i++) {
			System.out.println(word);
		}

		
		
		
		
		//finding sum 
		int sum = 0; 
		for(int i =0; i<arr1.length; i++) {
			sum+=arr1[i];
		}
		System.out.println(sum);
		
		//counting how mnay a's
		for(int i =0; i<a.length(); i++) {
			if(a.substring(i,i+1).indexOf("a")!=-1) {
				count++;
			}
		}
		
		String repl = "ass";
		String target = "your";
			ai =ai.substring(0,ai.indexOf(target))+repl+ai.substring(ai.indexOf(target)+target.length());
		
//		for(int i =0; i<ab.length()-1; i++) {
//			if(ab.substring(i,i+1).equals("a")) {
//				ab=ab.substring(0,i)+ab.substring(i+1,i+2)+ab.substring(i,i+1)+ab.substring(i+2);
//			}
//				
//		}
//		System.out.println(ab);
	}
}
