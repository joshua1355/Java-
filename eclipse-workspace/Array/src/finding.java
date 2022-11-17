
public class finding {
	public static void main(String[]args) {
		int [] arr = {10,3,4,5,6,24};
		int taget = 24;
			for(int i = 0; i<arr.length; i++) {
				if(taget == arr[i]) {
					System.out.println(i);
				}
			}
			System.out.println(-1);

	}
}
