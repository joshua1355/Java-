
public class Array {

	public static void main(String[] args) {
		Array[] arry = new Array[10];
		//arry[1] = 1;
		int [] std = {10,4,5,6,4};
		int temp = std[2];
		std[2] = std[0];
		std[0] = temp;
		for(int aa: std) {
			System.out.println(aa);
		}
		for(int i =0; i<std.length; i++) {
			System.out.println(i + ":"+ std[i]);
		}
		int [] add = {10,4,3,5,22,34,3};
		
		for(int i =0; i<add.length; i++) {	
			System.out.println(add[i]);
		}
		String [] adhd = {"I love", "Kevin", "Rick", "kiss "};
		
		/*for(int score : add) {
			System.out.println(score);
		}
		double[] aga = new double[3];
		aga[0] = 10.30;
		for(int i = 0; i<add.length-1; i++) {
			System.out.println(add[i]);

		}
		
//	int gg = dat[1];
//	dat[1] = dat[0];
//		dat[0] = gg;
//		System.out.println(dat[1]);
//		String [] std = new String[9];	
//		std[0] = "Hello"; 
//		std[1] = "I am";
//		std[2] = "Joshua";
//		std[3] = "bb";
//		std[4] = "18";
//		System.out.println(std[0]+" "+std[1]);
//		
//		int [] adhd = new int[5];
//		adhd[0] = 100;
//		adhd[1] = 1220;
//		System.out.println(adhd[0]+" "+adhd[1]);
//		for(int i=0; i<adhd.length; i++) {
//			System.out.println(adhd[i]);
//		int [] hpv = new int[5];
//		hpv[0] = 0;
//		System.out.println("Hello");
//		char ab = 'a';
//		System.out.println(ab);
		*/
	}
}
