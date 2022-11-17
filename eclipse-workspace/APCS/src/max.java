
public class max {
	public static void main (String[] args) {
		int[] arr = {0,2,3,2,5};
		int a = 0;
		for(int i=0; i<arr.length; i++) {
			a=a+arr[i];
		}
		System.out.println(a/arr.length);
		
		int max = arr[0];
		for(int i =0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=max+arr[i];
			}
		}
		System.out.println(max);
		
		
		
		String ch = "abracadabra";
		for(int i =0; i<ch.length()-1; i++) {
			if(ch.substring(i,i+1).equals("a")) {
				
			}
		}
	}
}



