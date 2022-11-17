
public class Forloop {

	public static void main(String[] args) {
//		String a = "*";
//		for(int j= 0; j<50; j++) {
//			for (int i = 0; i < j+1; i+=2) {
//				System.out.print(a);
//			}
//			System.out.println("");
//		}
		
		int[][] arr = {{2,3,4,1},{4,2,5,4},{4,5,2,1},{3,2,4,3}};
		int max = arr[0][0];
	    for(int r =0; r<arr.length; r++){
	        for(int c =0; c<arr[0].length-1; r++){
	            if(arr[r][c]>max){
	                max = arr[r][c];
	            }
	        }
	    }
		System.out.println(max);

	}
}

//*
//**
//***
//****
//*****
//******
//*******
//for(int v =0; v< i+1; v++)
//	System.out.print("*");
//System.out.println();