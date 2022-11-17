package chooseokProject;

public class review {
	public static void main(String [] args ) {
		review myjk = new review();
		System.out.println(myjk.commonEnd(1,1));
	}

	int [] a = {1,3,4};
	int [] b = {1,2,4};
		public boolean commonEnd(int i, int j) {
				 if(i == j) {
					    return true;
					 
					  
					}
			
			return false;

	}
		public String lastChars(String a, String b) {
			  if(a.length() == 0){  
			    a = "@";
			  }
			  if(b.length() == 0){
			    b = "@";
			  }
			  return a.substring(0,1) + b.substring(b.length()-1, b.length());
			}


}
