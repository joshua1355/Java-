
public class Inhanse {
	private int num;
	
	public static  void sort(int[] data) {
		for(int j=0; j<data.length -1; j++) {
			int m=j;
			for(int k=j+1; k<data.length; k++) {
				if(data[k]<data[m]) {
					m=k;
				}
			}
			int temp =data[m];
			data[m] = data[j];
			data[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		
		Inhanse a1 = new Inhanse();
		sort();
		
		int[][] gradeBook = {{90, 87, 86, 56, 96},
                {65, 76, 87, 84, 93},
                {85, 56, 91, 90, 65},
                {65, 56, 78, 31, 65},
                {85, 56, 71, 80, 39}};
		//일반 row major foorLoop
		for(int r =0; r<gradeBook.length; r++) {
			for(int c=0; c<gradeBook[0].length; c++) {
                System.out.print(gradeBook[r][c]);
			}
            System.out.println();

		}
		
		
		
		//inhanse forLoop row major 
		System.out.println();
        for(int[] r: gradeBook){
            for(int c: r){
                System.out.print(r);
            }
            System.out.println();
        }
        for(int i =0; i<4; i++) {
        	System.out.println(i);
        }
	}

}
