
public class xyz {
	public boolean xyzThere(String str) {
		  for(int i = 0; i < str.length() - 2; i++) {
		    if(str.charAt(i) == '.') {
		    	
		    }
		    else if(str.substring(i, i+3).equals("xyz")){
		          return true;
		    }

		  }
		  return false;
		
	}
	public boolean xyBalance(String str) {
		  return str.matches("(^$)|([^Xx]*)|(.*[Xx].*[Yy][^Xx]*)");
		}

}
