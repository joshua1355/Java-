
public class Test1 {
	private String[][] arr = {{"-","-","-"},{"-","-","-",},{"-","-","-"}};
	public String[][] getSRR() {
		return arr;
	}
	public static void main(String[] args) {
		//array 에서 2 3 움기기
		int sum1 =0;
		int[][] arr = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};


				for (int[] x : arr)

				{

				for (int y = 0; y < x.length - 1; y++)

				{

				sum1 += x[y];

				}

				}
				System.out.println(sum1);
		}
	String[] aniumals = { "horse", "cow", "goat", "dog", "cat", "mouse"};
    for (int i = 0; i <= animals.length; i++){
        
    }
		int arr
		int[] arr = {30,20,1,40};
		int temp = arr[1];
		arr[1]= arr[2];
		arr[2] = temp;
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);

		}
		for(int i =0; i<arr.length; i++) {
			
		}
		//String array 원하는 String 찾아서 카운트 하기 
		String[] strArr = {"AB","CD","AA"};
		int count = 0;
			for(int i =0; i<strArr.length; i++) {
				if(strArr[i].indexOf("A")!=-1) {
					count++;
				}
			}
		System.out.println(count);
		
		// Replace하느방법 
		String a = "Hello World";
		String repl = "zzzzz";
		String target = "llo";
		a=a.substring(0,a.indexOf(target))+repl+a.substring(a.indexOf(target)+target.length());
		System.out.println(a);
		
		//String AB BA로 바꾸는방법
		String b = "TANAVA";
			for(int i =0; i<b.length()-1; i++) {
				if(b.substring(i,i+1).equals("A")) {
					b=b.substring(0,i)+b.substring(i+1,i+2)+b.substring(i,i+1)+b.substring(i+2);
				}
			}
			System.out.println(b);
		
		//Array max찾는법 
		int max= arr[0];
			for(int i =0; i<arr.length; i++) {
				if(max<arr[i]) {
					max= arr[i];
				}
			}
			System.out.println(max);
			
			
		//2d array 만들어서 major row 불러오기
			int max1 =0;
			int arr2[][] = {{3,2,4,5},{4,5,2,5},{3,4,5,1},{4,2,3,4}};
				
				for(int r =0; r<arr2.length; r++) {
					System.out.println();
					for(int c=0; c<arr2[0].length; c++) {
						System.out.print(arr2[r][c]);
					}
				}


		//2d array 만들어서 major row 불러오기
	        int[][] array = {{32, 4, 14, 65, 23, 6},
	                        {4, 2, 53, 31, 765, 34},
	                        {64235, 23, 522, 124, 42, 64}};
	        String[][] arrr = new String[3][3];

	        
	    
	    
	    public static int sumRow(int[][] array, int row)
	    {
	    	int sum =0;
	    	for(int r=0; r<array.length; r++) {
	    		for(int c=0; r<array[0].length; c++) {
	    			sum+=array[r][c];
	    		}
	    	}
    		return sum;
    	public static void printBoard(String[][] array1) {
    		for(String[] row2: array1) {
    			for(String play : row2) {
    				System.out.print(play+"");
    			}
    			System.out.println();
    		}
    	}
	}

}
