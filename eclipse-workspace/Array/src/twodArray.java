
public class twodArray {

	public static void main(String[] args) {
		int [][] arr = {{1,4,4,2},{2,2,4,5},{9,67,43,3}};
		System.out.println(contains(arr, 99));
		
		int [] one = {1,2,5,6,7,43,3,4,2,1,2,424,2,4,2,4};
		replace(one, 4, 20);
		for(int i : one)
			System.out.print(i+", ");
	}

	
	public static boolean contains(int[][] arr, int target) {
		for(int i = 0; i<arr.length;i++) {
			for(int j =0; j< arr[0].length;j++) {
				if(arr[i][j]==target) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void replace (int[] arr , int target, int num) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==target) {
				arr[i] = num;
			}
		}
	}
}
