import java.util.Scanner; 
public class Name {
	public static void main(String[]args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter you name");
		String a = sc.next();
		System.out.println("please enter you name");
		String b = sc.next();
		System.out.println("please enter you name");
		String c = sc.next();
		String reversedName = reverse(a);
		System.out.println(reversedName);
		reversedName = reverse(b);
		System.out.println(reversedName);
		reversedName = reverse(c);
		System.out.println(reversedName);


		int[][] values =   {{1,2,3},{4,5,6}};
        for(int[] k: values){
            System.out.print(k);
        }
		
	}
	
	private static String reverse(String name) {
		String b = "";
		for(int i=0;i<name.length(); i++) {
			 b = name.substring(i,i+1)+b;
		}
		return b;
	}
	
	
	
	
}
