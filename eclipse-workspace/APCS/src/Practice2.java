
public class Practice2 {
	public static void main(String agrs[]) {
		 //while(true) {
			// System.out.println((int)(Math.random()*5)+5);
		int a = ((int)(Math.random()*10)+5);
		//average
		int[] arr = {1,3,2,4,5,4};
		
		String repl = "zzzz";
		
		String target = "lo";
		String b = "Hello World";
		
		b=b.substring(0,b.indexOf(target))+ repl+ b.substring(b.indexOf(target)+target.length());
		System.out.println(b);
		
		for(int i=0; i<b.length()-1; i++) {
			if(b.substring(i,i+1).equals("o")) {
				b= b.substring(0,i)+b.substring(i+1,i+2)+b.substring(i,i+1)+b.substring(i+2);
			}
		}
		System.out.println(b);
		//min
		int min1 = arr[0];
		for(int i =0; i<arr.length; i++) {
			if(min1>arr[i]) {
				min1=arr[i];
			}
		}
		System.out.println(min1);
		
		// average
		//int sum =0;
//		for(int i=0; i<arr.length; i++) {
//			sum= sum+arr[i];
//		}
//		double average = (double)sum/arr.length;
	//	System.out.println(average);

		
		//min
		int min = arr[0];
		for(int i =0; i<arr.length; i++) {
			if(min>arr[i] ) {
				min=arr[i];
			}
		}
		System.out.println(min);
		//sum
		int sum1 = 0;
		for(int i=0; i<arr.length; i++) {
			sum1+=arr[i];
		}
		System.out.println(sum1);
		//max
		int max = arr[0];

		for(int i =0; i<arr.length; i++) {
			if(max<arr[i] ) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
} 

