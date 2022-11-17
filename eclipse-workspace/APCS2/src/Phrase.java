
public class Phrase {
private String currentPhrase;
	
public int findNthOccurrence(String str, int n){
	  int count = 0;
	  int index=0;
	
	  for(int i = 0; i < currentPhrase.length()-1; i++){
	    if(currentPhrase.substring(i,str.length()).equals(str)){
	      index = i;
	      count++;
	
	      if(count == n) {
	          return index;
	      }
	    }    			
	  }    	
	  if(count != n) {
		  return -1;
	  }else {
		  return index;
	  }
}
	public void replceNthOccurrence(String str,int n, String repl) {
		int a = findNthOccurrence(str,n);
		currentPhrase = currentPhrase.substring(0,a)+repl+currentPhrase.substring(a+repl.length());
	}
	public int findLastOccurrence(String str) {
		int n = 1; 
		int result = -1;
		while(findNthOccurrence(str,n)!=-1) {
			result = findNthOccurrence(str,n);
			n++;
		}
		return result;
	}
	public String toString() {
		return currentPhrase;
		
	}
	public static void main(String[] args) {
		Phrase a1 = new Phrase();
		System.out.println(a1.findLastOccurrence("Hi"));
	}
}
