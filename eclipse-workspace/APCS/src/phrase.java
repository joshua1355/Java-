
public class phrase {
private String currentPhrase;
public phrase(String p) {
	currentPhrase =p;
}
	public int findNthOccurrence(String str,int n) {
		if(n==0) {
			return -1;
		}
		return n;
	}
	public void replaceNthOccurrence(String str, int n, String repl) {
		  int index = findNthOccurrence(str, n);
		  if(index != 1) {
			  currentPhrase = currentPhrase.substring(0, index) + repl +
				        currentPhrase.substring(index + str.length());
		  }
	}
	
}
